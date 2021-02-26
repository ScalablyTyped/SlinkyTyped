package typingsSlinky.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constraints extends StObject {
  
  val horizontal: ConstraintType = js.native
  
  val vertical: ConstraintType = js.native
}
object Constraints {
  
  @scala.inline
  def apply(horizontal: ConstraintType, vertical: ConstraintType): Constraints = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraints]
  }
  
  @scala.inline
  implicit class ConstraintsMutableBuilder[Self <: Constraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: ConstraintType): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: ConstraintType): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
