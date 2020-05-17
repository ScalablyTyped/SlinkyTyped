package typingsSlinky.cathoQuantum.accordionMod

import typingsSlinky.cathoQuantum.anon.BaseFontSize
import typingsSlinky.cathoQuantum.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionProps extends js.Object {
  var items: js.Array[Content] = js.native
  var keepOnlyOneOpen: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[BaseFontSize] = js.native
}

object AccordionProps {
  @scala.inline
  def apply(items: js.Array[Content]): AccordionProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionProps]
  }
  @scala.inline
  implicit class AccordionPropsOps[Self <: AccordionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[Content]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepOnlyOneOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOnlyOneOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepOnlyOneOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOnlyOneOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: BaseFontSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

