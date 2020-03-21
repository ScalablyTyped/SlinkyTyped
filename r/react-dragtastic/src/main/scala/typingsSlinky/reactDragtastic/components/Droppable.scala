package typingsSlinky.reactDragtastic.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDragtastic.mod.Accepts
import typingsSlinky.reactDragtastic.mod.DroppableProps
import typingsSlinky.reactDragtastic.mod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Droppable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDragtastic.mod.Droppable] {
  @JSImport("react-dragtastic", "Droppable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    accepts: Accepts = null,
    id: Id = null,
    onDragEnter: () => Unit = null,
    onDragLeave: () => Unit = null,
    onDrop: /* data */ js.Any => Unit = null,
    subscribeTo: js.Array[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDragtastic.mod.Droppable] = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction0(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction0(onDragLeave))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDragtastic.mod.Droppable] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDragtastic.mod.Droppable](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DroppableProps
}

