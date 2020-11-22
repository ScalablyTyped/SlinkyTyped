package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.pulumiAwsStrings.application
import typingsSlinky.pulumiAws.pulumiAwsStrings.dualstack
import typingsSlinky.pulumiAws.pulumiAwsStrings.ipv4
import typingsSlinky.pulumiAws.pulumiAwsStrings.network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/types/enums/alb", JSImport.Namespace)
@js.native
object enumsAlbMod extends js.Object {
  
  /* Inlined { readonly Ipv4 :'ipv4',  readonly Dualstack :'dualstack'}[keyof { readonly Ipv4 :'ipv4',  readonly Dualstack :'dualstack'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pulumiAws.pulumiAwsStrings.ipv4
    - typingsSlinky.pulumiAws.pulumiAwsStrings.dualstack
  */
  trait IpAddressType extends js.Object
  @js.native
  object IpAddressType extends js.Object {
    
    val Dualstack: dualstack = js.native
    
    val Ipv4: ipv4 = js.native
  }
  
  /* Inlined { readonly Application :'application',  readonly Network :'network'}[keyof { readonly Application :'application',  readonly Network :'network'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pulumiAws.pulumiAwsStrings.application
    - typingsSlinky.pulumiAws.pulumiAwsStrings.network
  */
  trait LoadBalancerType extends js.Object
  @js.native
  object LoadBalancerType extends js.Object {
    
    val Application: application = js.native
    
    val Network: network = js.native
  }
}
