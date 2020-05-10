package typingsSlinky.agGrid.tabbedLayoutMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabbedItem extends js.Object {
  var afterAttachedCallback: js.UndefOr[js.Function] = js.native
  var bodyPromise: Promise[HTMLElement] = js.native
  var name: String = js.native
  var title: Element = js.native
}

object TabbedItem {
  @scala.inline
  def apply(bodyPromise: Promise[HTMLElement], name: String, title: Element): TabbedItem = {
    val __obj = js.Dynamic.literal(bodyPromise = bodyPromise.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedItem]
  }
  @scala.inline
  implicit class TabbedItemOps[Self <: TabbedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyPromise(value: Promise[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterAttachedCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAttachedCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterAttachedCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAttachedCallback")(js.undefined)
        ret
    }
  }
  
}

