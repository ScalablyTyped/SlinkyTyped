package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Captions extends js.Object {
  /**
    * The array of file formats for the output captions. If you leave this value blank, Elastic Transcoder returns an error.
    */
  var CaptionFormats: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.CaptionFormats] = js.native
  /**
    * Source files for the input sidecar captions used during the transcoding process. To omit all sidecar captions, leave CaptionSources blank.
    */
  var CaptionSources: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.CaptionSources] = js.native
  /**
    * A policy that determines how Elastic Transcoder handles the existence of multiple captions.    MergeOverride: Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the sidecar captions and ignores the embedded captions for that language.    MergeRetain: Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the embedded captions and ignores the sidecar captions for that language. If CaptionSources is empty, Elastic Transcoder omits all sidecar captions from the output files.    Override: Elastic Transcoder transcodes only the sidecar captions that you specify in CaptionSources.    MergePolicy cannot be null.
    */
  var MergePolicy: js.UndefOr[CaptionMergePolicy] = js.native
}

object Captions {
  @scala.inline
  def apply(): Captions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Captions]
  }
  @scala.inline
  implicit class CaptionsOps[Self <: Captions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptionFormats(value: CaptionFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionSources(value: CaptionSources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionSources")(js.undefined)
        ret
    }
    @scala.inline
    def withMergePolicy(value: CaptionMergePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MergePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MergePolicy")(js.undefined)
        ret
    }
  }
  
}

