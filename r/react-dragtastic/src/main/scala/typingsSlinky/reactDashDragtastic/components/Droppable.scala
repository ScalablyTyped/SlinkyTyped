package typingsSlinky.reactDashDragtastic.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.Accepts
import typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.DroppableProps
import typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Droppable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.Droppable] {
  @JSImport("react-dragtastic", "Droppable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onDrop */
  def apply(
    accepts: Accepts = null,
    id: Id = null,
    onDragEnter: () => Unit = null,
    onDragLeave: () => Unit = null,
    subscribeTo: js.Array[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.Droppable] = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction0(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction0(onDragLeave))
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DroppableProps
}

