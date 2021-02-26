package typingsSlinky.phaser.anon

import typingsSlinky.phaser.spine.PowOut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSwirlEffect extends StObject {
  
  /* static member */
  var interpolation: PowOut = js.native
}
object TypeofSwirlEffect {
  
  @scala.inline
  def apply(interpolation: PowOut): TypeofSwirlEffect = {
    val __obj = js.Dynamic.literal(interpolation = interpolation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSwirlEffect]
  }
  
  @scala.inline
  implicit class TypeofSwirlEffectMutableBuilder[Self <: TypeofSwirlEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterpolation(value: PowOut): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
  }
}
