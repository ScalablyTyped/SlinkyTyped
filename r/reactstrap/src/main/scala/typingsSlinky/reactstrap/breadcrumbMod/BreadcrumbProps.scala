package typingsSlinky.reactstrap.breadcrumbMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadcrumbProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.native
  var listClassName: js.UndefOr[String] = js.native
  var listTag: js.UndefOr[String] = js.native
  var tag: js.UndefOr[String] = js.native
}

object BreadcrumbProps {
  @scala.inline
  def apply(): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbProps]
  }
  @scala.inline
  implicit class BreadcrumbPropsOps[Self <: BreadcrumbProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssModule(value: CSSModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssModule")(js.undefined)
        ret
    }
    @scala.inline
    def withListClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withListTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTag")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

