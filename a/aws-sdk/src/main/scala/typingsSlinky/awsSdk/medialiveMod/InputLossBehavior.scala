package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputLossBehavior extends js.Object {
  /**
    * Documentation update needed
    */
  var BlackFrameMsec: js.UndefOr[integerMin0Max1000000] = js.native
  /**
    * When input loss image type is "color" this field specifies the color to use. Value: 6 hex characters representing the values of RGB.
    */
  var InputLossImageColor: js.UndefOr[stringMin6Max6] = js.native
  /**
    * When input loss image type is "slate" these fields specify the parameters for accessing the slate.
    */
  var InputLossImageSlate: js.UndefOr[InputLocation] = js.native
  /**
    * Indicates whether to substitute a solid color or a slate into the output after input loss exceeds blackFrameMsec.
    */
  var InputLossImageType: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.InputLossImageType] = js.native
  /**
    * Documentation update needed
    */
  var RepeatFrameMsec: js.UndefOr[integerMin0Max1000000] = js.native
}

object InputLossBehavior {
  @scala.inline
  def apply(): InputLossBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLossBehavior]
  }
  @scala.inline
  implicit class InputLossBehaviorOps[Self <: InputLossBehavior] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlackFrameMsec(value: integerMin0Max1000000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlackFrameMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlackFrameMsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlackFrameMsec")(js.undefined)
        ret
    }
    @scala.inline
    def withInputLossImageColor(value: stringMin6Max6): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossImageColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputLossImageColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossImageColor")(js.undefined)
        ret
    }
    @scala.inline
    def withInputLossImageSlate(value: InputLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossImageSlate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputLossImageSlate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossImageSlate")(js.undefined)
        ret
    }
    @scala.inline
    def withInputLossImageType(value: InputLossImageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossImageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputLossImageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossImageType")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatFrameMsec(value: integerMin0Max1000000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepeatFrameMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatFrameMsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepeatFrameMsec")(js.undefined)
        ret
    }
  }
  
}

