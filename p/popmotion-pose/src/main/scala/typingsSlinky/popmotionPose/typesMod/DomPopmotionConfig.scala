package typingsSlinky.popmotionPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomPopmotionConfig
  extends /* key */ StringDictionary[js.Any] {
  var dragBounds: js.UndefOr[DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds])] = js.native
  var draggable: js.UndefOr[Draggable] = js.native
  var hoverable: js.UndefOr[Boolean] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.native
  var onDragStart: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.native
  var onPressEnd: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.native
  var onPressStart: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.native
  var props: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object DomPopmotionConfig {
  @scala.inline
  def apply(): DomPopmotionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomPopmotionConfig]
  }
  @scala.inline
  implicit class DomPopmotionConfigOps[Self <: DomPopmotionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragBoundsFunction1(value: /* props */ ResolverProps => DragBounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragBounds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDragBounds(value: DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Draggable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: /* e */ MouseEvent | TouchEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: /* e */ MouseEvent | TouchEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressEnd(value: /* e */ MouseEvent | TouchEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPressEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressStart(value: /* e */ MouseEvent | TouchEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPressStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressStart")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
  }
  
}

