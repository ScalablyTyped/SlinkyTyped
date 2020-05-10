package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSourceSettings extends js.Object {
  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  var Convert608To708: js.UndefOr[FileSourceConvert608To708] = js.native
  /**
    * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl', 'srt', 'xml', and 'smi'.
    */
  var SourceFile: js.UndefOr[
    stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMI
  ] = js.native
  /**
    * Specifies a time delta in seconds to offset the captions from the source file.
    */
  var TimeDelta: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.native
}

object FileSourceSettings {
  @scala.inline
  def apply(): FileSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSourceSettings]
  }
  @scala.inline
  implicit class FileSourceSettingsOps[Self <: FileSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvert608To708(value: FileSourceConvert608To708): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Convert608To708")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvert608To708: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Convert608To708")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFile(
      value: stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMI
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFile")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeDelta(value: integerMinNegative2147483648Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeDelta")(js.undefined)
        ret
    }
  }
  
}

