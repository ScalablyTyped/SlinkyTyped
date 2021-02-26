package typingsSlinky.ionicAngular

import typingsSlinky.angularCore.mod.NgZone
import typingsSlinky.ionicCore.gestureMod.Gesture
import typingsSlinky.ionicCore.gestureMod.GestureConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureControllerMod {
  
  @JSImport("@ionic/angular/providers/gesture-controller", "GestureController")
  @js.native
  class GestureController protected () extends StObject {
    def this(zone: NgZone) = this()
    
    /**
      * Create a new gesture
      */
    def create(opts: GestureConfig): Gesture = js.native
    def create(opts: GestureConfig, runInsideAngularZone: Boolean): Gesture = js.native
    
    var zone: js.Any = js.native
  }
}
