package typingsSlinky.pulumiAws.wafv2IpSetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpSetArgs extends js.Object {
  
  /**
    * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
    */
  val addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A friendly description of the IP set.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
    */
  val ipAddressVersion: Input[String] = js.native
  
  /**
    * A friendly name of the IP set.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
    */
  val scope: Input[String] = js.native
  
  /**
    * An array of key:value pairs to associate with the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object IpSetArgs {
  
  @scala.inline
  def apply(ipAddressVersion: Input[String], scope: Input[String]): IpSetArgs = {
    val __obj = js.Dynamic.literal(ipAddressVersion = ipAddressVersion.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpSetArgs]
  }
  
  @scala.inline
  implicit class IpSetArgsOps[Self <: IpSetArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIpAddressVersion(value: Input[String]): Self = this.set("ipAddressVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Input[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesVarargs(value: Input[String]*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: Input[js.Array[Input[String]]]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
