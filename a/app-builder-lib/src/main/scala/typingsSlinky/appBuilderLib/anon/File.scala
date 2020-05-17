package typingsSlinky.appBuilderLib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var file: String = js.native
  var lang: String = js.native
  var langName: js.Any = js.native
  var langWithRegion: String = js.native
}

object File {
  @scala.inline
  def apply(file: String, lang: String, langName: js.Any, langWithRegion: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], langName = langName.asInstanceOf[js.Any], langWithRegion = langWithRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLangName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLangWithRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langWithRegion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

