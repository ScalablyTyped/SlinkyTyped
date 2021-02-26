package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.pulumiAwsStrings.application
import typingsSlinky.pulumiAws.pulumiAwsStrings.dualstack
import typingsSlinky.pulumiAws.pulumiAwsStrings.ipv4
import typingsSlinky.pulumiAws.pulumiAwsStrings.network
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumsApplicationloadbalancingMod {
  
  /* Inlined { readonly Ipv4 :'ipv4',  readonly Dualstack :'dualstack'}[keyof { readonly Ipv4 :'ipv4',  readonly Dualstack :'dualstack'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pulumiAws.pulumiAwsStrings.ipv4
    - typingsSlinky.pulumiAws.pulumiAwsStrings.dualstack
  */
  trait IpAddressType extends StObject
  object IpAddressType {
    
    @JSImport("@pulumi/aws/types/enums/applicationloadbalancing", "IpAddressType.Dualstack")
    @js.native
    val Dualstack: dualstack = js.native
    
    @JSImport("@pulumi/aws/types/enums/applicationloadbalancing", "IpAddressType.Ipv4")
    @js.native
    val Ipv4: ipv4 = js.native
  }
  
  /* Inlined { readonly Application :'application',  readonly Network :'network'}[keyof { readonly Application :'application',  readonly Network :'network'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pulumiAws.pulumiAwsStrings.application
    - typingsSlinky.pulumiAws.pulumiAwsStrings.network
  */
  trait LoadBalancerType extends StObject
  object LoadBalancerType {
    
    @JSImport("@pulumi/aws/types/enums/applicationloadbalancing", "LoadBalancerType.Application")
    @js.native
    val Application: application = js.native
    
    @JSImport("@pulumi/aws/types/enums/applicationloadbalancing", "LoadBalancerType.Network")
    @js.native
    val Network: network = js.native
  }
}
