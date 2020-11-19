package typingsSlinky.koaHelmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KoaHelmetContentSecurityPolicyConfiguration extends js.Object {
  
  var browserSniff: js.UndefOr[Boolean] = js.native
  
  var directives: js.UndefOr[KoaHelmetContentSecurityPolicyDirectives] = js.native
  
  var disableAndroid: js.UndefOr[Boolean] = js.native
  
  var reportOnly: js.UndefOr[Boolean] = js.native
  
  var setAllHeaders: js.UndefOr[Boolean] = js.native
}
object KoaHelmetContentSecurityPolicyConfiguration {
  
  @scala.inline
  def apply(): KoaHelmetContentSecurityPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KoaHelmetContentSecurityPolicyConfiguration]
  }
  
  @scala.inline
  implicit class KoaHelmetContentSecurityPolicyConfigurationOps[Self <: KoaHelmetContentSecurityPolicyConfiguration] (val x: Self) extends AnyVal {
    
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
    def setBrowserSniff(value: Boolean): Self = this.set("browserSniff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserSniff: Self = this.set("browserSniff", js.undefined)
    
    @scala.inline
    def setDirectives(value: KoaHelmetContentSecurityPolicyDirectives): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    
    @scala.inline
    def setDisableAndroid(value: Boolean): Self = this.set("disableAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAndroid: Self = this.set("disableAndroid", js.undefined)
    
    @scala.inline
    def setReportOnly(value: Boolean): Self = this.set("reportOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportOnly: Self = this.set("reportOnly", js.undefined)
    
    @scala.inline
    def setSetAllHeaders(value: Boolean): Self = this.set("setAllHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetAllHeaders: Self = this.set("setAllHeaders", js.undefined)
  }
}
