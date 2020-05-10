package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common properties for a page element.  Note: When you initially create a
  * PageElement, the API may modify the values of both `size` and `transform`,
  * but the visual size will be unchanged.
  */
@js.native
trait SchemaPageElementProperties extends js.Object {
  /**
    * The object ID of the page where the element is located.
    */
  var pageObjectId: js.UndefOr[String] = js.native
  /**
    * The size of the element.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  /**
    * The transform for the element.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.native
}

object SchemaPageElementProperties {
  @scala.inline
  def apply(): SchemaPageElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageElementProperties]
  }
  @scala.inline
  implicit class SchemaPageElementPropertiesOps[Self <: SchemaPageElementProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: SchemaSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: SchemaAffineTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

