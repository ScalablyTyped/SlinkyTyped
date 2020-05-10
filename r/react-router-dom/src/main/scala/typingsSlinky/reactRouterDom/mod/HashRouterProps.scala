package typingsSlinky.reactRouterDom.mod

import typingsSlinky.reactRouterDom.reactRouterDomStrings.hashbang
import typingsSlinky.reactRouterDom.reactRouterDomStrings.noslash
import typingsSlinky.reactRouterDom.reactRouterDomStrings.slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashRouterProps extends js.Object {
  var basename: js.UndefOr[String] = js.native
  var getUserConfirmation: js.UndefOr[
    js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
  ] = js.native
  var hashType: js.UndefOr[slash | noslash | hashbang] = js.native
}

object HashRouterProps {
  @scala.inline
  def apply(): HashRouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashRouterProps]
  }
  @scala.inline
  implicit class HashRouterPropsOps[Self <: HashRouterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basename")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserConfirmation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetUserConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserConfirmation")(js.undefined)
        ret
    }
    @scala.inline
    def withHashType(value: slash | noslash | hashbang): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashType")(js.undefined)
        ret
    }
  }
  
}

