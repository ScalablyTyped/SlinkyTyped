package typingsSlinky.antd.anchorAnchorMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntAnchor extends js.Object {
  var activeLink: String | Null = js.native
  var onClick: js.UndefOr[
    js.Function2[/* e */ SyntheticMouseEvent[HTMLElement], /* link */ AnonHref, Unit]
  ] = js.native
  def registerLink(link: String): Unit = js.native
  def scrollTo(link: String): Unit = js.native
  def unregisterLink(link: String): Unit = js.native
}

object AntAnchor {
  @scala.inline
  def apply(registerLink: String => Unit, scrollTo: String => Unit, unregisterLink: String => Unit): AntAnchor = {
    val __obj = js.Dynamic.literal(registerLink = js.Any.fromFunction1(registerLink), scrollTo = js.Any.fromFunction1(scrollTo), unregisterLink = js.Any.fromFunction1(unregisterLink))
    __obj.asInstanceOf[AntAnchor]
  }
  @scala.inline
  implicit class AntAnchorOps[Self <: AntAnchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisterLink(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScrollTo(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnregisterLink(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregisterLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withActiveLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveLinkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLink")(null)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* e */ SyntheticMouseEvent[HTMLElement], /* link */ AnonHref) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
  }
  
}

