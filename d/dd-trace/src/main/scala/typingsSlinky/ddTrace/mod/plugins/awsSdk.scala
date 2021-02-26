package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [aws-sdk](https://github.com/aws/aws-sdk-js) module.
  */
@js.native
trait awsSdk extends Instrumentation {
  
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[`1`] = js.native
  
  /**
    * Whether to add a suffix to the service name so that each AWS service has its own service name.
    * @default true
    */
  var splitByAwsService: js.UndefOr[Boolean] = js.native
}
object awsSdk {
  
  @scala.inline
  def apply(): awsSdk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[awsSdk]
  }
  
  @scala.inline
  implicit class awsSdkMutableBuilder[Self <: awsSdk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHooks(value: `1`): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setSplitByAwsService(value: Boolean): Self = StObject.set(x, "splitByAwsService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitByAwsServiceUndefined: Self = StObject.set(x, "splitByAwsService", js.undefined)
  }
}
