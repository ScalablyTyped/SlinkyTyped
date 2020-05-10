package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the alt text title and/or description of a page element.
  */
@js.native
trait SchemaUpdatePageElementAltTextRequest extends js.Object {
  /**
    * The updated alt text description of the page element. If unset the
    * existing value will be maintained. The description is exposed to screen
    * readers and other accessibility interfaces. Only use human readable
    * values related to the content of the page element.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The object ID of the page element the updates are applied to.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The updated alt text title of the page element. If unset the existing
    * value will be maintained. The title is exposed to screen readers and
    * other accessibility interfaces. Only use human readable values related to
    * the content of the page element.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaUpdatePageElementAltTextRequest {
  @scala.inline
  def apply(): SchemaUpdatePageElementAltTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePageElementAltTextRequest]
  }
  @scala.inline
  implicit class SchemaUpdatePageElementAltTextRequestOps[Self <: SchemaUpdatePageElementAltTextRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

