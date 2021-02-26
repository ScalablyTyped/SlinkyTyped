package typingsSlinky.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionRunAsConfig extends StObject {
  
  /**
    * The group ID whose permissions are used to run a Lambda function.
    */
  var Gid: js.UndefOr[integer] = js.native
  
  /**
    * The user ID whose permissions are used to run a Lambda function.
    */
  var Uid: js.UndefOr[integer] = js.native
}
object FunctionRunAsConfig {
  
  @scala.inline
  def apply(): FunctionRunAsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionRunAsConfig]
  }
  
  @scala.inline
  implicit class FunctionRunAsConfigMutableBuilder[Self <: FunctionRunAsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGid(value: integer): Self = StObject.set(x, "Gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGidUndefined: Self = StObject.set(x, "Gid", js.undefined)
    
    @scala.inline
    def setUid(value: integer): Self = StObject.set(x, "Uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "Uid", js.undefined)
  }
}
