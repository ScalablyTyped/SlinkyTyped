package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the size of the creative.
  */
@js.native
trait SchemaCreativeSize extends js.Object {
  /**
    * What formats are allowed by the publisher. If this repeated field is
    * empty then all formats are allowed. For example, if this field contains
    * AllowedFormatType.AUDIO then the publisher only allows an audio ad
    * (without any video).
    */
  var allowedFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * For video creatives specifies the sizes of companion ads (if present).
    * Companion sizes may be filled in only when creative_size_type = VIDEO
    */
  var companionSizes: js.UndefOr[js.Array[SchemaSize]] = js.native
  /**
    * The creative size type.
    */
  var creativeSizeType: js.UndefOr[String] = js.native
  /**
    * The native template for this creative. It will have a value only if
    * creative_size_type = CreativeSizeType.NATIVE. @OutputOnly
    */
  var nativeTemplate: js.UndefOr[String] = js.native
  /**
    * For regular or video creative size type, specifies the size of the
    * creative
    */
  var size: js.UndefOr[SchemaSize] = js.native
  /**
    * The type of skippable ad for this creative. It will have a value only if
    * creative_size_type = CreativeSizeType.VIDEO.
    */
  var skippableAdType: js.UndefOr[String] = js.native
}

object SchemaCreativeSize {
  @scala.inline
  def apply(): SchemaCreativeSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeSize]
  }
  @scala.inline
  implicit class SchemaCreativeSizeOps[Self <: SchemaCreativeSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedFormats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanionSizes(value: js.Array[SchemaSize]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanionSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeSizeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeSizeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeSizeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeSizeType")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeTemplate")(js.undefined)
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
    def withSkippableAdType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippableAdType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkippableAdType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippableAdType")(js.undefined)
        ret
    }
  }
  
}

