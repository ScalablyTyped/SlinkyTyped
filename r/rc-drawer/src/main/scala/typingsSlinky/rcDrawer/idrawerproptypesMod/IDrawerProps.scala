package typingsSlinky.rcDrawer.idrawerproptypesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcDrawer.rcDrawerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDrawerProps extends IProps {
  var forceRender: js.UndefOr[Boolean] = js.native
  var getContainer: js.UndefOr[IStringOrHtmlElement | js.Function0[IStringOrHtmlElement] | Null | `false`] = js.native
  var wrapperClassName: js.UndefOr[String] = js.native
}

object IDrawerProps {
  @scala.inline
  def apply(): IDrawerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrawerProps]
  }
  @scala.inline
  implicit class IDrawerPropsOps[Self <: IDrawerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRender")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContainerHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContainerFunction0(value: () => IStringOrHtmlElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContainer(value: IStringOrHtmlElement | js.Function0[IStringOrHtmlElement] | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(null)
        ret
    }
    @scala.inline
    def withWrapperClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(js.undefined)
        ret
    }
  }
  
}

