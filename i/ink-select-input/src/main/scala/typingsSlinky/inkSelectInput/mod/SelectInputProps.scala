package typingsSlinky.inkSelectInput.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInputProps[T /* <: ItemOfSelectInput */] extends js.Object {
  var focus: js.UndefOr[Boolean] = js.undefined
  var indicatorComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.undefined
  var initialIndex: js.UndefOr[Double] = js.undefined
  var itemComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.undefined
  var items: js.UndefOr[js.Array[T]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.undefined
}

object SelectInputProps {
  @scala.inline
  def apply[T](
    focus: js.UndefOr[Boolean] = js.undefined,
    indicatorComponent: ReactComponentClass[js.Object] = null,
    initialIndex: js.UndefOr[Double] = js.undefined,
    itemComponent: ReactComponentClass[js.Object] = null,
    items: js.Array[T] = null,
    limit: js.UndefOr[Double] = js.undefined,
    onSelect: /* item */ T => Unit = null
  ): SelectInputProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.get.asInstanceOf[js.Any])
    if (indicatorComponent != null) __obj.updateDynamic("indicatorComponent")(indicatorComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(initialIndex)) __obj.updateDynamic("initialIndex")(initialIndex.get.asInstanceOf[js.Any])
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[SelectInputProps[T]]
  }
}

