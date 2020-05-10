package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResultDisplayMetadata extends js.Object {
  /**
    * The metalines content to be displayed with the result.
    */
  var metalines: js.UndefOr[js.Array[SchemaResultDisplayLine]] = js.native
  /**
    * The display label for the object.
    */
  var objectTypeLabel: js.UndefOr[String] = js.native
}

object SchemaResultDisplayMetadata {
  @scala.inline
  def apply(): SchemaResultDisplayMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDisplayMetadata]
  }
  @scala.inline
  implicit class SchemaResultDisplayMetadataOps[Self <: SchemaResultDisplayMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetalines(value: js.Array[SchemaResultDisplayLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metalines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetalines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metalines")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectTypeLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectTypeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectTypeLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectTypeLabel")(js.undefined)
        ret
    }
  }
  
}

