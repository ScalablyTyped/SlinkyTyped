package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionFormat extends js.Object {
  /**
    * The encryption settings, if any, that you want Elastic Transcoder to apply to your caption formats.
    */
  var Encryption: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Encryption] = js.native
  /**
    * The format you specify determines whether Elastic Transcoder generates an embedded or sidecar caption for this output.    Valid Embedded Caption Formats:     for FLAC: None    For MP3: None    For MP4: mov-text    For MPEG-TS: None    For ogg: None    For webm: None      Valid Sidecar Caption Formats: Elastic Transcoder supports dfxp (first div element only), scc, srt, and webvtt. If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.    For FMP4: dfxp    Non-FMP4 outputs: All sidecar types    fmp4 captions have an extension of .ismt   
    */
  var Format: js.UndefOr[CaptionFormatFormat] = js.native
  /**
    * The prefix for caption filenames, in the form description-{language}, where:    description is a description of the video.    {language} is a literal value that Elastic Transcoder replaces with the two- or three-letter code for the language of the caption in the output file names.   If you don't include {language} in the file name pattern, Elastic Transcoder automatically appends "{language}" to the value that you specify for the description. In addition, Elastic Transcoder automatically appends the count to the end of the segment files. For example, suppose you're transcoding into srt format. When you enter "Sydney-{language}-sunrise", and the language of the captions is English (en), the name of the first caption file is be Sydney-en-sunrise00000.srt.
    */
  var Pattern: js.UndefOr[CaptionFormatPattern] = js.native
}

object CaptionFormat {
  @scala.inline
  def apply(): CaptionFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionFormat]
  }
  @scala.inline
  implicit class CaptionFormatOps[Self <: CaptionFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryption(value: Encryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: CaptionFormatFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: CaptionFormatPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(js.undefined)
        ret
    }
  }
  
}

