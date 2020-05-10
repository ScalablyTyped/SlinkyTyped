package typingsSlinky.encodingJapanese.mod

import typingsSlinky.encodingJapanese.encodingJapaneseStrings.array
import typingsSlinky.encodingJapanese.encodingJapaneseStrings.arraybuffer
import typingsSlinky.encodingJapanese.encodingJapaneseStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvertOptions extends js.Object {
  var bom: js.UndefOr[Boolean | String] = js.native
  var from: js.UndefOr[Encoding] = js.native
  var to: Encoding = js.native
  var `type`: js.UndefOr[string | arraybuffer | array] = js.native
}

object ConvertOptions {
  @scala.inline
  def apply(to: Encoding): ConvertOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
  @scala.inline
  implicit class ConvertOptionsOps[Self <: ConvertOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTo(value: Encoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBom(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bom")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Encoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: string | arraybuffer | array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

