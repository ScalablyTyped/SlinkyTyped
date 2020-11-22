package typingsSlinky.pulumiAws.enumsMod

import typingsSlinky.pulumiAws.pulumiAwsStrings.application
import typingsSlinky.pulumiAws.pulumiAwsStrings.dualstack
import typingsSlinky.pulumiAws.pulumiAwsStrings.ipv4
import typingsSlinky.pulumiAws.pulumiAwsStrings.network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/types/enums", "applicationloadbalancing")
@js.native
object applicationloadbalancing extends js.Object {
  
  @js.native
  object IpAddressType extends js.Object {
    
    val Dualstack: dualstack = js.native
    
    val Ipv4: ipv4 = js.native
  }
  
  @js.native
  object LoadBalancerType extends js.Object {
    
    val Application: application = js.native
    
    val Network: network = js.native
  }
}
