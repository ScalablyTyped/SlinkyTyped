package typingsSlinky.jquerySortable.JQuerySortable

import typingsSlinky.jquerySortable.AnonBottom
import typingsSlinky.jquerySortable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerGroup extends js.Object {
  @JSName("$document")
  var $document: JQuery = js.native
  var containerDimensions: js.Array[Dimensions] = js.native
  var containers: js.Array[Container] = js.native
  var delayMet: Boolean = js.native
  var dragInitDone: Boolean = js.native
  var dragProxy: js.Any = js.native
  var dragging: Boolean = js.native
  var dropProxy: js.Any = js.native
  var item: JQuery = js.native
  var itemContainer: Container = js.native
  var lastAppendedItem: JQuery = js.native
  var lastPointer: Position = js.native
  var lastRelativePointer: Position = js.native
  var offsetParent: JQuery = js.native
  var options: Options = js.native
  var placeholder: JQuery = js.native
  var pointer: Position = js.native
  var relativePointer: Position = js.native
  var sameResultBox: AnonBottom = js.native
  var scrollProxy: js.Any = js.native
}

object ContainerGroup {
  @scala.inline
  def apply(
    $document: JQuery,
    containerDimensions: js.Array[Dimensions],
    containers: js.Array[Container],
    delayMet: Boolean,
    dragInitDone: Boolean,
    dragProxy: js.Any,
    dragging: Boolean,
    dropProxy: js.Any,
    item: JQuery,
    itemContainer: Container,
    lastAppendedItem: JQuery,
    lastPointer: Position,
    lastRelativePointer: Position,
    offsetParent: JQuery,
    options: Options,
    placeholder: JQuery,
    pointer: Position,
    relativePointer: Position,
    sameResultBox: AnonBottom,
    scrollProxy: js.Any
  ): ContainerGroup = {
    val __obj = js.Dynamic.literal($document = $document.asInstanceOf[js.Any], containerDimensions = containerDimensions.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], delayMet = delayMet.asInstanceOf[js.Any], dragInitDone = dragInitDone.asInstanceOf[js.Any], dragProxy = dragProxy.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dropProxy = dropProxy.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemContainer = itemContainer.asInstanceOf[js.Any], lastAppendedItem = lastAppendedItem.asInstanceOf[js.Any], lastPointer = lastPointer.asInstanceOf[js.Any], lastRelativePointer = lastRelativePointer.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], relativePointer = relativePointer.asInstanceOf[js.Any], sameResultBox = sameResultBox.asInstanceOf[js.Any], scrollProxy = scrollProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerGroup]
  }
  @scala.inline
  implicit class ContainerGroupOps[Self <: ContainerGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$document(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerDimensions(value: js.Array[Dimensions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainers(value: js.Array[Container]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelayMet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayMet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragInitDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragInitDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragProxy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropProxy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemContainer(value: Container): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastAppendedItem(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAppendedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastPointer(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastRelativePointer(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRelativePointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetParent(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointer(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativePointer(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSameResultBox(value: AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameResultBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollProxy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollProxy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

