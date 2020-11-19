package typingsSlinky.leafletEditable.mod

import typingsSlinky.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polygon
  extends PolygonEditor
     with EditableMixin
object Polygon {
  
  @scala.inline
  def apply(
    disable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    disableEdit: () => Unit,
    editEnabled: () => Boolean,
    enable: () => MarkerEditor | PolylineEditor | PolygonEditor,
    enableEdit: () => js.Any,
    newHole: LatLng_ => Unit,
    reset: () => Unit,
    toggleEdit: () => Unit
  ): Polygon = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), disableEdit = js.Any.fromFunction0(disableEdit), editEnabled = js.Any.fromFunction0(editEnabled), enable = js.Any.fromFunction0(enable), enableEdit = js.Any.fromFunction0(enableEdit), newHole = js.Any.fromFunction1(newHole), reset = js.Any.fromFunction0(reset), toggleEdit = js.Any.fromFunction0(toggleEdit))
    __obj.asInstanceOf[Polygon]
  }
}
