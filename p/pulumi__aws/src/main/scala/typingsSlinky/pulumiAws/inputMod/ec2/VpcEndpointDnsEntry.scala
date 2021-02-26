package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcEndpointDnsEntry extends StObject {
  
  /**
    * The DNS name.
    */
  var dnsName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the private hosted zone.
    */
  var hostedZoneId: js.UndefOr[Input[String]] = js.native
}
object VpcEndpointDnsEntry {
  
  @scala.inline
  def apply(): VpcEndpointDnsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointDnsEntry]
  }
  
  @scala.inline
  implicit class VpcEndpointDnsEntryMutableBuilder[Self <: VpcEndpointDnsEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsName(value: Input[String]): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: Input[String]): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneIdUndefined: Self = StObject.set(x, "hostedZoneId", js.undefined)
  }
}
