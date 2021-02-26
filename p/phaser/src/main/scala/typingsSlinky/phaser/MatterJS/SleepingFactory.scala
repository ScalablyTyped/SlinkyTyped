package typingsSlinky.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SleepingFactory extends StObject {
  
  def set(body: BodyType, isSleeping: Boolean): Unit = js.native
}
object SleepingFactory {
  
  @scala.inline
  def apply(set: (BodyType, Boolean) => Unit): SleepingFactory = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[SleepingFactory]
  }
  
  @scala.inline
  implicit class SleepingFactoryMutableBuilder[Self <: SleepingFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSet(value: (BodyType, Boolean) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
