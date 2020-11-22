package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslPoliciesListAvailableFeaturesResponse extends js.Object {
  
  var features: js.UndefOr[js.Array[String]] = js.native
}
object SslPoliciesListAvailableFeaturesResponse {
  
  @scala.inline
  def apply(): SslPoliciesListAvailableFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslPoliciesListAvailableFeaturesResponse]
  }
  
  @scala.inline
  implicit class SslPoliciesListAvailableFeaturesResponseOps[Self <: SslPoliciesListAvailableFeaturesResponse] (val x: Self) extends AnyVal {
    
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
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
  }
}
