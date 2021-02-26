package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualServiceSpec extends StObject {
  
  /**
    * The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual node or virtual router.
    */
  var provider: js.UndefOr[Input[VirtualServiceSpecProvider]] = js.native
}
object VirtualServiceSpec {
  
  @scala.inline
  def apply(): VirtualServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualServiceSpec]
  }
  
  @scala.inline
  implicit class VirtualServiceSpecMutableBuilder[Self <: VirtualServiceSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvider(value: Input[VirtualServiceSpecProvider]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
