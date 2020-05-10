package typingsSlinky.blueprintjsCore.htmlTableMod

import org.scalajs.dom.raw.HTMLTableElement
import typingsSlinky.blueprintjsCore.htmlMod.IElementRefProps
import typingsSlinky.react.mod.TableHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLTableProps
  extends TableHTMLAttributes[HTMLTableElement]
     with IElementRefProps[HTMLTableElement] {
  /** Enables borders between rows and cells. */
  var bordered: js.UndefOr[Boolean] = js.native
  /** Use small, condensed appearance. */
  var condensed: js.UndefOr[Boolean] = js.native
  /** Enables hover styles on row. */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
    * Use small, condensed appearance for this element and all child elements.
    * @deprecated
    */
  var small: js.UndefOr[Boolean] = js.native
  /** Use an alternate background color on odd rows. */
  var striped: js.UndefOr[Boolean] = js.native
}

object IHTMLTableProps {
  @scala.inline
  def apply(): IHTMLTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHTMLTableProps]
  }
  @scala.inline
  implicit class IHTMLTablePropsOps[Self <: IHTMLTableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBordered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBordered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(js.undefined)
        ret
    }
    @scala.inline
    def withCondensed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condensed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondensed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condensed")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withSmall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(js.undefined)
        ret
    }
    @scala.inline
    def withStriped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStriped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(js.undefined)
        ret
    }
  }
  
}

