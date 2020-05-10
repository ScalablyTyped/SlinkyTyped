package typingsSlinky.jquerySortable.JQuerySortable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquerySortable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var el: JQuery = js.native
  var group: ContainerGroup = js.native
  var handle: String = js.native
  var itemDimensions: js.Array[Dimensions] = js.native
  var items: js.Array[HTMLElement] = js.native
  var options: Options = js.native
  var rootGroup: ContainerGroup = js.native
  var target: JQuery = js.native
}

object Container {
  @scala.inline
  def apply(
    el: JQuery,
    group: ContainerGroup,
    handle: String,
    itemDimensions: js.Array[Dimensions],
    items: js.Array[HTMLElement],
    options: Options,
    rootGroup: ContainerGroup,
    target: JQuery
  ): Container = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], itemDimensions = itemDimensions.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rootGroup = rootGroup.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEl(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: ContainerGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemDimensions(value: js.Array[Dimensions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootGroup(value: ContainerGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

