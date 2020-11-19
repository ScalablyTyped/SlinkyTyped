package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpEndpointConfiguration extends js.Object {
  
  /**
    * The access key required for Kinesis Firehose to authenticate with the HTTP endpoint selected as the destination.
    */
  var AccessKey: js.UndefOr[HttpEndpointAccessKey] = js.native
  
  /**
    * The name of the HTTP endpoint selected as the destination.
    */
  var Name: js.UndefOr[HttpEndpointName] = js.native
  
  /**
    * The URL of the HTTP endpoint selected as the destination.
    */
  var Url: HttpEndpointUrl = js.native
}
object HttpEndpointConfiguration {
  
  @scala.inline
  def apply(Url: HttpEndpointUrl): HttpEndpointConfiguration = {
    val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpEndpointConfiguration]
  }
  
  @scala.inline
  implicit class HttpEndpointConfigurationOps[Self <: HttpEndpointConfiguration] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: HttpEndpointUrl): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKey(value: HttpEndpointAccessKey): Self = this.set("AccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKey: Self = this.set("AccessKey", js.undefined)
    
    @scala.inline
    def setName(value: HttpEndpointName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
