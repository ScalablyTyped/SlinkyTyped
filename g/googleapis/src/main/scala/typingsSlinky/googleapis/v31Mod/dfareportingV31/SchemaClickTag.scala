package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Click Tag.
  */
@js.native
trait SchemaClickTag extends js.Object {
  /**
    * Parameter value for the specified click tag. This field contains a
    * click-through url.
    */
  var clickThroughUrl: js.UndefOr[SchemaCreativeClickThroughUrl] = js.native
  /**
    * Advertiser event name associated with the click tag. This field is used
    * by DISPLAY_IMAGE_GALLERY and HTML5_BANNER creatives. Applicable to
    * DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var eventName: js.UndefOr[String] = js.native
  /**
    * Parameter name for the specified click tag. For DISPLAY_IMAGE_GALLERY
    * creative assets, this field must match the value of the creative
    * asset&#39;s creativeAssetId.name field.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaClickTag {
  @scala.inline
  def apply(): SchemaClickTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClickTag]
  }
  @scala.inline
  implicit class SchemaClickTagOps[Self <: SchemaClickTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickThroughUrl(value: SchemaCreativeClickThroughUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThroughUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

