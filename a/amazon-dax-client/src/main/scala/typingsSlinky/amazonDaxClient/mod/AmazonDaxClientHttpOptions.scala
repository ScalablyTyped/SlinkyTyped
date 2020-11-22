package typingsSlinky.amazonDaxClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmazonDaxClientHttpOptions extends js.Object {
  
  var agent: js.UndefOr[js.Any] = js.native
  
  var connectTimeout: js.UndefOr[Double] = js.native
  
  var proxy: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var xhrAsync: js.UndefOr[Boolean] = js.native
  
  var xhrWithCredentials: js.UndefOr[Boolean] = js.native
}
object AmazonDaxClientHttpOptions {
  
  @scala.inline
  def apply(): AmazonDaxClientHttpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonDaxClientHttpOptions]
  }
  
  @scala.inline
  implicit class AmazonDaxClientHttpOptionsOps[Self <: AmazonDaxClientHttpOptions] (val x: Self) extends AnyVal {
    
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
    def setAgent(value: js.Any): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setXhrAsync(value: Boolean): Self = this.set("xhrAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhrAsync: Self = this.set("xhrAsync", js.undefined)
    
    @scala.inline
    def setXhrWithCredentials(value: Boolean): Self = this.set("xhrWithCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhrWithCredentials: Self = this.set("xhrWithCredentials", js.undefined)
  }
}
