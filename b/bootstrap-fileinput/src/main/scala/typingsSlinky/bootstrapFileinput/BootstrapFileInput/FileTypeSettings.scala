package typingsSlinky.bootstrapFileinput.BootstrapFileInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTypeSettings extends js.Object {
  def audio(vType: String, vName: String): Boolean = js.native
  def flash(vType: String, vName: String): Boolean = js.native
  def html(vType: String, vName: String): Boolean = js.native
  def image(vType: String, vName: String): Boolean = js.native
  def `object`(vType: String, vName: String): Boolean = js.native
  def other(vType: String, vName: String): Boolean = js.native
  def text(vType: String, vName: String): Boolean = js.native
  def video(vType: String, vName: String): Boolean = js.native
}

object FileTypeSettings {
  @scala.inline
  def apply(
    audio: (String, String) => Boolean,
    flash: (String, String) => Boolean,
    html: (String, String) => Boolean,
    image: (String, String) => Boolean,
    `object`: (String, String) => Boolean,
    other: (String, String) => Boolean,
    text: (String, String) => Boolean,
    video: (String, String) => Boolean
  ): FileTypeSettings = {
    val __obj = js.Dynamic.literal(audio = js.Any.fromFunction2(audio), flash = js.Any.fromFunction2(flash), html = js.Any.fromFunction2(html), image = js.Any.fromFunction2(image), other = js.Any.fromFunction2(other), text = js.Any.fromFunction2(text), video = js.Any.fromFunction2(video))
    __obj.updateDynamic("object")(js.Any.fromFunction2(`object`))
    __obj.asInstanceOf[FileTypeSettings]
  }
  @scala.inline
  implicit class FileTypeSettingsOps[Self <: FileTypeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFlash(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHtml(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withImage(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withObject(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOther(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withText(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVideo(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

