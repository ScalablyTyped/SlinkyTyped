package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.horizontal
import typingsSlinky.devextreme.devextremeStrings.layered
import typingsSlinky.devextreme.devextremeStrings.off
import typingsSlinky.devextreme.devextremeStrings.tree
import typingsSlinky.devextreme.devextremeStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Orientation extends StObject {
  
  var orientation: js.UndefOr[auto | vertical | horizontal] = js.native
  
  var `type`: js.UndefOr[auto | off | tree | layered] = js.native
}
object Orientation {
  
  @scala.inline
  def apply(): Orientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Orientation]
  }
  
  @scala.inline
  implicit class OrientationMutableBuilder[Self <: Orientation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrientation(value: auto | vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setType(value: auto | off | tree | layered): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
