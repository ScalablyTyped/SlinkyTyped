package typingsSlinky.reactBootstrap.responsiveEmbedMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsiveEmbedProps
  extends AllHTMLAttributes[ResponsiveEmbed]
     with ClassAttributes[ResponsiveEmbed] {
  var a16by9: js.UndefOr[Boolean] = js.native
  var a4by3: js.UndefOr[Boolean] = js.native
  var bsClass: js.UndefOr[String] = js.native
}

object ResponsiveEmbedProps {
  @scala.inline
  def apply(): ResponsiveEmbedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveEmbedProps]
  }
  @scala.inline
  implicit class ResponsiveEmbedPropsOps[Self <: ResponsiveEmbedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA16by9(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a16by9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA16by9: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a16by9")(js.undefined)
        ret
    }
    @scala.inline
    def withA4by3(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a4by3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA4by3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a4by3")(js.undefined)
        ret
    }
    @scala.inline
    def withBsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(js.undefined)
        ret
    }
  }
  
}

