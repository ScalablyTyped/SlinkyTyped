package typingsSlinky.reactDraggable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDraggable.PartialDraggableCoreProps
import typingsSlinky.reactDraggable.mod.DraggableData
import typingsSlinky.reactDraggable.mod.DraggableEvent
import typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DraggableCore
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDraggable.mod.DraggableCore] {
  @JSImport("react-draggable", "DraggableCore")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    allowAnyClick: js.UndefOr[Boolean] = js.undefined,
    cancel: String = null,
    enableUserSelectHack: js.UndefOr[Boolean] = js.undefined,
    grid: js.Tuple2[Double, Double] = null,
    handle: String = null,
    offsetParent: HTMLElement = null,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    onMouseDown: /* e */ MouseEvent => Unit = null,
    onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    scale: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDraggable.mod.DraggableCore] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAnyClick)) __obj.updateDynamic("allowAnyClick")(allowAnyClick.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUserSelectHack)) __obj.updateDynamic("enableUserSelectHack")(enableUserSelectHack.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (offsetParent != null) __obj.updateDynamic("offsetParent")(offsetParent.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction2(onDrag))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction2(onStop))
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDraggable.mod.DraggableCore] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDraggable.mod.DraggableCore](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PartialDraggableCoreProps
}

