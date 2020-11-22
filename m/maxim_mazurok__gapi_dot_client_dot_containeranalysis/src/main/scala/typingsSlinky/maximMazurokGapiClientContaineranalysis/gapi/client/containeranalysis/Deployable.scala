package typingsSlinky.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deployable extends js.Object {
  
  /** Required. Resource URI for the artifact being deployed. */
  var resourceUri: js.UndefOr[js.Array[String]] = js.native
}
object Deployable {
  
  @scala.inline
  def apply(): Deployable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployable]
  }
  
  @scala.inline
  implicit class DeployableOps[Self <: Deployable] (val x: Self) extends AnyVal {
    
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
    def setResourceUriVarargs(value: String*): Self = this.set("resourceUri", js.Array(value :_*))
    
    @scala.inline
    def setResourceUri(value: js.Array[String]): Self = this.set("resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUri: Self = this.set("resourceUri", js.undefined)
  }
}
