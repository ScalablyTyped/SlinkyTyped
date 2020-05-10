package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Next Id: 7
  */
@js.native
trait SchemaTargetingValueCreativeSize extends js.Object {
  /**
    * The formats allowed by the publisher.
    */
  var allowedFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * For video size type, the list of companion sizes.
    */
  var companionSizes: js.UndefOr[js.Array[SchemaTargetingValueSize]] = js.native
  /**
    * The Creative size type.
    */
  var creativeSizeType: js.UndefOr[String] = js.native
  /**
    * The native template for native ad.
    */
  var nativeTemplate: js.UndefOr[String] = js.native
  /**
    * For regular or video creative size type, specifies the size of the
    * creative.
    */
  var size: js.UndefOr[SchemaTargetingValueSize] = js.native
  /**
    * The skippable ad type for video size.
    */
  var skippableAdType: js.UndefOr[String] = js.native
}

object SchemaTargetingValueCreativeSize {
  @scala.inline
  def apply(): SchemaTargetingValueCreativeSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueCreativeSize]
  }
  @scala.inline
  implicit class SchemaTargetingValueCreativeSizeOps[Self <: SchemaTargetingValueCreativeSize] (val x: Self) extends AnyVal {
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
    def withCompanionSizes(value: js.Array[SchemaTargetingValueSize]): Self = {
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
    def withSize(value: SchemaTargetingValueSize): Self = {
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

