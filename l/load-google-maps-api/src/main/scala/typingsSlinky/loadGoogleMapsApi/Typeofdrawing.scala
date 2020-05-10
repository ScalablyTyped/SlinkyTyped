package typingsSlinky.loadGoogleMapsApi

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.googlemaps.google.maps.drawing.DrawingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdrawing extends js.Object {
  var DrawingManager: Instantiable0[typingsSlinky.googlemaps.google.maps.drawing.DrawingManager] = js.native
}

object Typeofdrawing {
  @scala.inline
  def apply(DrawingManager: Instantiable0[DrawingManager]): Typeofdrawing = {
    val __obj = js.Dynamic.literal(DrawingManager = DrawingManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdrawing]
  }
  @scala.inline
  implicit class TypeofdrawingOps[Self <: Typeofdrawing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawingManager(value: Instantiable0[DrawingManager]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrawingManager")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

