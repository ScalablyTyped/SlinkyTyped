package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hdr10Metadata extends js.Object {
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var BluePrimaryX: js.UndefOr[integerMin0Max50000] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var BluePrimaryY: js.UndefOr[integerMin0Max50000] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var GreenPrimaryX: js.UndefOr[integerMin0Max50000] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var GreenPrimaryY: js.UndefOr[integerMin0Max50000] = js.native
  /**
    * Maximum light level among all samples in the coded video sequence, in units of candelas per square meter.  This setting doesn't have a default value; you must specify a value that is suitable for the content.
    */
  var MaxContentLightLevel: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * Maximum average light level of any frame in the coded video sequence, in units of candelas per square meter. This setting doesn't have a default value; you must specify a value that is suitable for the content.
    */
  var MaxFrameAverageLightLevel: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * Nominal maximum mastering display luminance in units of of 0.0001 candelas per square meter.
    */
  var MaxLuminance: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * Nominal minimum mastering display luminance in units of of 0.0001 candelas per square meter
    */
  var MinLuminance: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var RedPrimaryX: js.UndefOr[integerMin0Max50000] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var RedPrimaryY: js.UndefOr[integerMin0Max50000] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var WhitePointX: js.UndefOr[integerMin0Max50000] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var WhitePointY: js.UndefOr[integerMin0Max50000] = js.native
}

object Hdr10Metadata {
  @scala.inline
  def apply(): Hdr10Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hdr10Metadata]
  }
  @scala.inline
  implicit class Hdr10MetadataOps[Self <: Hdr10Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBluePrimaryX(value: integerMin0Max50000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BluePrimaryX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluePrimaryX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BluePrimaryX")(js.undefined)
        ret
    }
    @scala.inline
    def withBluePrimaryY(value: integerMin0Max50000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BluePrimaryY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluePrimaryY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BluePrimaryY")(js.undefined)
        ret
    }
    @scala.inline
    def withGreenPrimaryX(value: integerMin0Max50000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreenPrimaryX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreenPrimaryX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreenPrimaryX")(js.undefined)
        ret
    }
    @scala.inline
    def withGreenPrimaryY(value: integerMin0Max50000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreenPrimaryY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreenPrimaryY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreenPrimaryY")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxContentLightLevel(value: integerMin0Max65535): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxContentLightLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxContentLightLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxContentLightLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFrameAverageLightLevel(value: integerMin0Max65535): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFrameAverageLightLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFrameAverageLightLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFrameAverageLightLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLuminance(value: integerMin0Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxLuminance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLuminance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxLuminance")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLuminance(value: integerMin0Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinLuminance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLuminance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinLuminance")(js.undefined)
        ret
    }
    @scala.inline
    def withRedPrimaryX(value: integerMin0Max50000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedPrimaryX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedPrimaryX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedPrimaryX")(js.undefined)
        ret
    }
    @scala.inline
    def withRedPrimaryY(value: integerMin0Max50000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedPrimaryY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedPrimaryY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedPrimaryY")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitePointX(value: integerMin0Max50000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhitePointX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitePointX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhitePointX")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitePointY(value: integerMin0Max50000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhitePointY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitePointY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhitePointY")(js.undefined)
        ret
    }
  }
  
}

