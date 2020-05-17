package typingsSlinky.jquerySortable.JQuerySortable

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import typingsSlinky.jquerySortable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupOptions extends js.Object {
  var afterMove: js.UndefOr[
    js.Function3[
      /* $placeholder */ JQuery, 
      /* container */ Container, 
      /* $closestItemOrContainer */ JQuery, 
      Unit
    ]
  ] = js.native
  var containerPath: js.UndefOr[String] = js.native
  var containerSelector: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double] = js.native
  var distance: js.UndefOr[Double] = js.native
  var handle: js.UndefOr[String] = js.native
  var isValidTarget: js.UndefOr[js.Function2[/* $item */ JQuery, /* container */ Container, Boolean]] = js.native
  var itemPath: js.UndefOr[String] = js.native
  var itemSelector: js.UndefOr[String] = js.native
  var onCancel: js.UndefOr[OnCancelHandler] = js.native
  var onDrag: js.UndefOr[OnDragEventHandler] = js.native
  var onDragStart: js.UndefOr[GenericEventHandler] = js.native
  var onDrop: js.UndefOr[GenericEventHandler] = js.native
  var onMousedown: js.UndefOr[OnMousedownHandler] = js.native
  var placeholder: js.UndefOr[JQuery | js.Array[_] | Element | String] = js.native
  var pullPlaceholder: js.UndefOr[Boolean] = js.native
  var serialize: js.UndefOr[SerializeFunc] = js.native
  var tolerance: js.UndefOr[Double] = js.native
}

object GroupOptions {
  @scala.inline
  def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  @scala.inline
  implicit class GroupOptionsOps[Self <: GroupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterMove(
      value: (/* $placeholder */ JQuery, /* container */ Container, /* $closestItemOrContainer */ JQuery) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMove")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMove")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPath")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValidTarget(value: (/* $item */ JQuery, /* container */ Container) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidTarget")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsValidTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withItemPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemPath")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCancel(
      value: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnCancelHandler */ js.Object
        ], /* event */ js.UndefOr[Event]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(
      value: (/* $item */ js.UndefOr[JQuery], /* position */ js.UndefOr[Position], /* _super */ js.UndefOr[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnDragEventHandler */ js.Object
        ], /* event */ js.UndefOr[Event]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(
      value: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
        ], /* event */ js.UndefOr[Event]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(
      value: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
        ], /* event */ js.UndefOr[Event]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMousedown(
      value: (/* $item */ js.UndefOr[JQuery], /* _super */ js.UndefOr[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnMousedownHandler */ js.Object
        ], /* event */ js.UndefOr[Event]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousedown")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMousedown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousedown")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: JQuery | js.Array[_] | Element | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPullPlaceholder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: (/* $parent */ JQuery, /* $children */ js.Any, /* parentIsContainer */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(js.undefined)
        ret
    }
  }
  
}

