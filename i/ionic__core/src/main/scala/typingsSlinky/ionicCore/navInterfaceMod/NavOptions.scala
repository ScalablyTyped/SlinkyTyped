package typingsSlinky.ionicCore.navInterfaceMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavOptions extends RouterOutletOptions {
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  var updateURL: js.UndefOr[Boolean] = js.native
  var viewIsReady: js.UndefOr[js.Function1[/* enteringEl */ HTMLElement, js.Promise[_]]] = js.native
}

object NavOptions {
  @scala.inline
  def apply(): NavOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavOptions]
  }
  @scala.inline
  implicit class NavOptionsOps[Self <: NavOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelegate(value: FrameworkDelegate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateURL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateURL")(js.undefined)
        ret
    }
    @scala.inline
    def withViewIsReady(value: /* enteringEl */ HTMLElement => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewIsReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutViewIsReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewIsReady")(js.undefined)
        ret
    }
  }
  
}

