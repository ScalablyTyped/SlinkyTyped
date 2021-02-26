package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `26` extends StObject {
  
  def failure(error: js.Error): js.Any = js.native
  
  def success(thing: KiiThing, user: KiiGroup, isOwner: Boolean): js.Any = js.native
}
object `26` {
  
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiThing, KiiGroup, Boolean) => js.Any): `26` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit class `26MutableBuilder`[Self <: `26`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: js.Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: (KiiThing, KiiGroup, Boolean) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
  }
}
