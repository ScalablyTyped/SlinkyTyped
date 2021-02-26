package typingsSlinky.gsap.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Back extends Ease {
  
  def config(overshoot: Double): Elastic = js.native
}
object Back {
  
  @scala.inline
  def apply(config: Double => Elastic, getRatio: Double => Double): Back = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[Back]
  }
  
  @scala.inline
  implicit class BackMutableBuilder[Self <: Back] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: Double => Elastic): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
  }
}
