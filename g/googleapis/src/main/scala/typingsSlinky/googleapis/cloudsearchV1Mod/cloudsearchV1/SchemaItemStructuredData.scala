package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available structured data fields for the item.
  */
@js.native
trait SchemaItemStructuredData extends js.Object {
  /**
    * Hashing value provided by the API caller. This can be used with the
    * items.push method to calculate modified state. The maximum length is 2048
    * characters.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * The structured data object that should conform to a registered object
    * definition in the schema for the data source.
    */
  var `object`: js.UndefOr[SchemaStructuredDataObject] = js.native
}

object SchemaItemStructuredData {
  @scala.inline
  def apply(): SchemaItemStructuredData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemStructuredData]
  }
  @scala.inline
  implicit class SchemaItemStructuredDataOps[Self <: SchemaItemStructuredData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withObject(value: SchemaStructuredDataObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.undefined)
        ret
    }
  }
  
}

