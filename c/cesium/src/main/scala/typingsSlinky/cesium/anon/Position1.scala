package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Position1 extends StObject {
  
  var position1: Cartesian2 = js.native
  
  var position2: Cartesian2 = js.native
}
object Position1 {
  
  @scala.inline
  def apply(position1: Cartesian2, position2: Cartesian2): Position1 = {
    val __obj = js.Dynamic.literal(position1 = position1.asInstanceOf[js.Any], position2 = position2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position1]
  }
  
  @scala.inline
  implicit class Position1MutableBuilder[Self <: Position1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition1(value: Cartesian2): Self = StObject.set(x, "position1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition2(value: Cartesian2): Self = StObject.set(x, "position2", value.asInstanceOf[js.Any])
  }
}
