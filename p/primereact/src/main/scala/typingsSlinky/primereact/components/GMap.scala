package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_Map
import typingsSlinky.primereact.componentsGmapGMapMod.GMapProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GMap
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.gmapMod.GMap] {
  @JSImport("primereact/gmap", "GMap")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    onMapClick: /* event */ Event => Unit = null,
    onMapDragEnd: () => Unit = null,
    onMapReady: /* map */ js.Any => Unit = null,
    onOverlayClick: /* e */ Anon_Map => Unit = null,
    onOverlayDrag: /* event */ Event => Unit = null,
    onOverlayDragEnd: /* event */ Event => Unit = null,
    onOverlayDragStart: /* event */ Event => Unit = null,
    onZoomChanged: () => Unit = null,
    options: js.Object = null,
    overlays: js.Array[_] = null,
    style: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.gmapMod.GMap] = {
    val __obj = js.Dynamic.literal()
    if (onMapClick != null) __obj.updateDynamic("onMapClick")(js.Any.fromFunction1(onMapClick))
    if (onMapDragEnd != null) __obj.updateDynamic("onMapDragEnd")(js.Any.fromFunction0(onMapDragEnd))
    if (onMapReady != null) __obj.updateDynamic("onMapReady")(js.Any.fromFunction1(onMapReady))
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(js.Any.fromFunction1(onOverlayClick))
    if (onOverlayDrag != null) __obj.updateDynamic("onOverlayDrag")(js.Any.fromFunction1(onOverlayDrag))
    if (onOverlayDragEnd != null) __obj.updateDynamic("onOverlayDragEnd")(js.Any.fromFunction1(onOverlayDragEnd))
    if (onOverlayDragStart != null) __obj.updateDynamic("onOverlayDragStart")(js.Any.fromFunction1(onOverlayDragStart))
    if (onZoomChanged != null) __obj.updateDynamic("onZoomChanged")(js.Any.fromFunction0(onZoomChanged))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GMapProps
}

