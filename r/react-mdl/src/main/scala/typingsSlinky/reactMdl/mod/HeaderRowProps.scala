package typingsSlinky.reactMdl.mod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderRowProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
   // string | JSX.Element
  var hideSpacer: js.UndefOr[Boolean] = js.native
  @JSName("title")
  var title_HeaderRowProps: js.UndefOr[js.Any] = js.native
}

object HeaderRowProps {
  @scala.inline
  def apply(): HeaderRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderRowProps]
  }
  @scala.inline
  implicit class HeaderRowPropsOps[Self <: HeaderRowProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideSpacer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSpacer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSpacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSpacer")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

