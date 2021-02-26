package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `27` extends StObject {
  
  def failure(error: js.Error): js.Any = js.native
  
  def success(thing: KiiThing, group: KiiUser): js.Any = js.native
}
object `27` {
  
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiThing, KiiUser) => js.Any): `27` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`27`]
  }
  
  @scala.inline
  implicit class `27MutableBuilder`[Self <: `27`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: js.Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: (KiiThing, KiiUser) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
