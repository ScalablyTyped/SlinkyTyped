package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metaline is a list of properties that are displayed along with the search
  * result to provide context.
  */
@js.native
trait SchemaMetaline extends js.Object {
  /**
    * The list of displayed properties for the metaline.
    */
  var properties: js.UndefOr[js.Array[SchemaDisplayedProperty]] = js.native
}

object SchemaMetaline {
  @scala.inline
  def apply(): SchemaMetaline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetaline]
  }
  @scala.inline
  implicit class SchemaMetalineOps[Self <: SchemaMetaline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: js.Array[SchemaDisplayedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

