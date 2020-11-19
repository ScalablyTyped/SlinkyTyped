package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterElasticIpResult extends js.Object {
  
  /**
    * The Elastic IP address.
    */
  var ElasticIp: js.UndefOr[String] = js.native
}
object RegisterElasticIpResult {
  
  @scala.inline
  def apply(): RegisterElasticIpResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterElasticIpResult]
  }
  
  @scala.inline
  implicit class RegisterElasticIpResultOps[Self <: RegisterElasticIpResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElasticIp(value: String): Self = this.set("ElasticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticIp: Self = this.set("ElasticIp", js.undefined)
  }
}
