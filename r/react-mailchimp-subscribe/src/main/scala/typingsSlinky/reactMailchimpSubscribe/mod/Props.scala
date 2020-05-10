package typingsSlinky.reactMailchimpSubscribe.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props[FormFields] extends js.Object {
  var render: js.UndefOr[js.Function1[/* hooks */ FormHooks[FormFields], TagMod[Any]]] = js.native
  var url: String = js.native
}

object Props {
  @scala.inline
  def apply[FormFields](url: String): Props[FormFields] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[FormFields]]
  }
  @scala.inline
  implicit class PropsOps[Self[formfields] <: Props[formfields], FormFields] (val x: Self[FormFields]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FormFields] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FormFields]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[FormFields] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[FormFields] with Other]
    @scala.inline
    def withUrl(value: String): Self[FormFields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: /* hooks */ FormHooks[FormFields] => TagMod[Any]): Self[FormFields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self[FormFields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
  }
  
}

