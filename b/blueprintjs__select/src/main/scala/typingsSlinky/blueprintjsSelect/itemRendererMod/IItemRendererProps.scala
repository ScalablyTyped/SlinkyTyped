package typingsSlinky.blueprintjsSelect.itemRendererMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IItemRendererProps extends js.Object {
  /** Click event handler to select this item. */
  var handleClick: MouseEventHandler[HTMLElement] = js.native
  var index: js.UndefOr[Double] = js.native
  /** Modifiers that describe how to render this item, such as `active` or `disabled`. */
  var modifiers: IItemModifiers = js.native
  /** The current query string used to filter the items. */
  var query: String = js.native
}

object IItemRendererProps {
  @scala.inline
  def apply(handleClick: SyntheticMouseEvent[HTMLElement] => Unit, modifiers: IItemModifiers, query: String): IItemRendererProps = {
    val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction1(handleClick), modifiers = modifiers.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemRendererProps]
  }
  @scala.inline
  implicit class IItemRendererPropsOps[Self <: IItemRendererProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withModifiers(value: IItemModifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

