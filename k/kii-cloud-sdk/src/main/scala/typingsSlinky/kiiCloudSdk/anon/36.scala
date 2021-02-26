package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiSocialNetworkName
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `36` extends StObject {
  
  def failure(user: KiiUser, network: KiiSocialNetworkName, anErrorString: String): js.Any = js.native
  
  def success(user: KiiUser, network: KiiSocialNetworkName): js.Any = js.native
}
object `36` {
  
  @scala.inline
  def apply(
    failure: (KiiUser, KiiSocialNetworkName, String) => js.Any,
    success: (KiiUser, KiiSocialNetworkName) => js.Any
  ): `36` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction3(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`36`]
  }
  
  @scala.inline
  implicit class `36MutableBuilder`[Self <: `36`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: (KiiUser, KiiSocialNetworkName, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSuccess(value: (KiiUser, KiiSocialNetworkName) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
