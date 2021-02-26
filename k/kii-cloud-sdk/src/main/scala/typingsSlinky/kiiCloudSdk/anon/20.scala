package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiBucket
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiPushSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `20` extends StObject {
  
  def failure(error: js.Error): js.Any = js.native
  
  def success(subscription: KiiPushSubscription, topic: KiiBucket): js.Any = js.native
}
object `20` {
  
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiPushSubscription, KiiBucket) => js.Any): `20` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit class `20MutableBuilder`[Self <: `20`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: js.Error => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: (KiiPushSubscription, KiiBucket) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
