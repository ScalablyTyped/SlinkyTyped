package typingsSlinky.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatOptions extends js.Object {
  def atom(): typingsSlinky.jodata.jo = js.native
  def custom(value: String): typingsSlinky.jodata.jo = js.native
  def json(): typingsSlinky.jodata.jo = js.native
  def xml(): typingsSlinky.jodata.jo = js.native
}

object FormatOptions {
  @scala.inline
  def apply(
    atom: () => typingsSlinky.jodata.jo,
    custom: String => typingsSlinky.jodata.jo,
    json: () => typingsSlinky.jodata.jo,
    xml: () => typingsSlinky.jodata.jo
  ): FormatOptions = {
    val __obj = js.Dynamic.literal(atom = js.Any.fromFunction0(atom), custom = js.Any.fromFunction1(custom), json = js.Any.fromFunction0(json), xml = js.Any.fromFunction0(xml))
    __obj.asInstanceOf[FormatOptions]
  }
  @scala.inline
  implicit class FormatOptionsOps[Self <: FormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtom(value: () => typingsSlinky.jodata.jo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCustom(value: String => typingsSlinky.jodata.jo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJson(value: () => typingsSlinky.jodata.jo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withXml(value: () => typingsSlinky.jodata.jo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

