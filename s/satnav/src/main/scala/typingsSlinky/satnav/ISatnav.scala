package typingsSlinky.satnav

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISatnav extends js.Object {
  def change(onChange: js.Function3[/* hash */ String, /* params */ js.Any, /* old */ js.Any, _]): ISatnav = js.native
  def go(): ISatnav = js.native
  def navigate(navigationOptions: INavigationOptions): ISatnav = js.native
  def otherwise(route: String): ISatnav = js.native
}

object ISatnav {
  @scala.inline
  def apply(
    change: js.Function3[/* hash */ String, /* params */ js.Any, /* old */ js.Any, _] => ISatnav,
    go: () => ISatnav,
    navigate: INavigationOptions => ISatnav,
    otherwise: String => ISatnav
  ): ISatnav = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction1(change), go = js.Any.fromFunction0(go), navigate = js.Any.fromFunction1(navigate), otherwise = js.Any.fromFunction1(otherwise))
    __obj.asInstanceOf[ISatnav]
  }
  @scala.inline
  implicit class ISatnavOps[Self <: ISatnav] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: js.Function3[/* hash */ String, /* params */ js.Any, /* old */ js.Any, _] => ISatnav): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGo(value: () => ISatnav): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("go")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNavigate(value: INavigationOptions => ISatnav): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOtherwise(value: String => ISatnav): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherwise")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

