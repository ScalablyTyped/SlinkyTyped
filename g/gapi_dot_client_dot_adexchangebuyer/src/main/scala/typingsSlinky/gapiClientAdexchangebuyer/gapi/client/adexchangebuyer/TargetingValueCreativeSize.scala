package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetingValueCreativeSize extends js.Object {
  /** For video size type, the list of companion sizes. */
  var companionSizes: js.UndefOr[js.Array[TargetingValueSize]] = js.native
  /** The Creative size type. */
  var creativeSizeType: js.UndefOr[String] = js.native
  /** The native template for native ad. */
  var nativeTemplate: js.UndefOr[String] = js.native
  /** For regular or video creative size type, specifies the size of the creative. */
  var size: js.UndefOr[TargetingValueSize] = js.native
  /** The skippable ad type for video size. */
  var skippableAdType: js.UndefOr[String] = js.native
}

object TargetingValueCreativeSize {
  @scala.inline
  def apply(): TargetingValueCreativeSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueCreativeSize]
  }
  @scala.inline
  implicit class TargetingValueCreativeSizeOps[Self <: TargetingValueCreativeSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanionSizes(value: js.Array[TargetingValueSize]): Self = {
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
    def withSize(value: TargetingValueSize): Self = {
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

