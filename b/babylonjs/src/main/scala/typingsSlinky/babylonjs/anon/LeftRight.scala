package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.AbstractMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeftRight extends StObject {
  
  var left: AbstractMesh = js.native
  
  var right: AbstractMesh = js.native
}
object LeftRight {
  
  @scala.inline
  def apply(left: AbstractMesh, right: AbstractMesh): LeftRight = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftRight]
  }
  
  @scala.inline
  implicit class LeftRightMutableBuilder[Self <: LeftRight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: AbstractMesh): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: AbstractMesh): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
