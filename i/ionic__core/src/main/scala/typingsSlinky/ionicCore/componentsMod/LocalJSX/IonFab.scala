package typingsSlinky.ionicCore.componentsMod.LocalJSX

import typingsSlinky.ionicCore.ionicCoreStrings.bottom
import typingsSlinky.ionicCore.ionicCoreStrings.center
import typingsSlinky.ionicCore.ionicCoreStrings.end
import typingsSlinky.ionicCore.ionicCoreStrings.start
import typingsSlinky.ionicCore.ionicCoreStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonFab extends StObject {
  
  /**
    * If `true`, both the `ion-fab-button` and all `ion-fab-list` inside `ion-fab` will become active. That means `ion-fab-button` will become a `close` icon and `ion-fab-list` will become visible.
    */
  var activated: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the fab will display on the edge of the header if `vertical` is `"top"`, and on the edge of the footer if it is `"bottom"`. Should be used with a `fixed` slot.
    */
  var edge: js.UndefOr[Boolean] = js.native
  
  /**
    * Where to align the fab horizontally in the viewport.
    */
  var horizontal: js.UndefOr[start | end | center] = js.native
  
  /**
    * Where to align the fab vertically in the viewport.
    */
  var vertical: js.UndefOr[top | bottom | center] = js.native
}
object IonFab {
  
  @scala.inline
  def apply(): IonFab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonFab]
  }
  
  @scala.inline
  implicit class IonFabMutableBuilder[Self <: IonFab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
    
    @scala.inline
    def setEdge(value: Boolean): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    @scala.inline
    def setHorizontal(value: start | end | center): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setVertical(value: top | bottom | center): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
