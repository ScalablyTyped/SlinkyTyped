package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSource extends js.Object {
  /**
    * The encryption settings, if any, that Elastic Transcoder needs to decyrpt your caption sources, or that you want Elastic Transcoder to apply to your caption sources.
    */
  var Encryption: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Encryption] = js.native
  /**
    * The name of the sidecar caption file that you want Elastic Transcoder to include in the output file.
    */
  var Key: js.UndefOr[LongKey] = js.native
  /**
    * The label of the caption shown in the player when choosing a language. We recommend that you put the caption language name here, in the language of the captions.
    */
  var Label: js.UndefOr[Name] = js.native
  /**
    * A string that specifies the language of the caption. If you specified multiple inputs with captions, the caption language must match in order to be included in the output. Specify this as one of:   2-character ISO 639-1 code   3-character ISO 639-2 code   For more information on ISO language codes and language names, see the List of ISO 639-1 codes.
    */
  var Language: js.UndefOr[Key] = js.native
  /**
    * For clip generation or captions that do not start at the same time as the associated video file, the TimeOffset tells Elastic Transcoder how much of the video to encode before including captions. Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
    */
  var TimeOffset: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.TimeOffset] = js.native
}

object CaptionSource {
  @scala.inline
  def apply(): CaptionSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSource]
  }
  @scala.inline
  implicit class CaptionSourceOps[Self <: CaptionSource] (val x: Self) extends AnyVal {
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
    def withKey(value: LongKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOffset(value: TimeOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeOffset")(js.undefined)
        ret
    }
  }
  
}

