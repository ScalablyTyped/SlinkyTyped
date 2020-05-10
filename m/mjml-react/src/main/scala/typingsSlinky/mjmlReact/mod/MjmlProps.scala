package typingsSlinky.mjmlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlProps extends js.Object {
  var lang: js.UndefOr[String] = js.native
  var owa: js.UndefOr[String] = js.native
}

object MjmlProps {
  @scala.inline
  def apply(): MjmlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlProps]
  }
  @scala.inline
  implicit class MjmlPropsOps[Self <: MjmlProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withOwa(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owa")(js.undefined)
        ret
    }
  }
  
}

