package typingsSlinky.ionicCore.componentsMod.Components

import typingsSlinky.ionicCore.ionicCoreStrings.bottom
import typingsSlinky.ionicCore.ionicCoreStrings.end
import typingsSlinky.ionicCore.ionicCoreStrings.start
import typingsSlinky.ionicCore.ionicCoreStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonFabList extends StObject {
  
  /**
    * If `true`, the fab list will show all fab buttons in the list.
    */
  var activated: Boolean = js.native
  
  /**
    * The side the fab list will show on relative to the main fab button.
    */
  var side: start | end | top | bottom = js.native
}
object IonFabList {
  
  @scala.inline
  def apply(activated: Boolean, side: start | end | top | bottom): IonFabList = {
    val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonFabList]
  }
  
  @scala.inline
  implicit class IonFabListMutableBuilder[Self <: IonFabList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSide(value: start | end | top | bottom): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
