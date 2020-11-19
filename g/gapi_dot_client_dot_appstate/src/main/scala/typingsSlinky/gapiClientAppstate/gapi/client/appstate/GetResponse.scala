package typingsSlinky.gapiClientAppstate.gapi.client.appstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResponse extends js.Object {
  
  /** The current app state version. */
  var currentStateVersion: js.UndefOr[String] = js.native
  
  /** The requested data. */
  var data: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string appstate#getResponse. */
  var kind: js.UndefOr[String] = js.native
  
  /** The key for the data. */
  var stateKey: js.UndefOr[Double] = js.native
}
object GetResponse {
  
  @scala.inline
  def apply(): GetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResponse]
  }
  
  @scala.inline
  implicit class GetResponseOps[Self <: GetResponse] (val x: Self) extends AnyVal {
    
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
    def setCurrentStateVersion(value: String): Self = this.set("currentStateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentStateVersion: Self = this.set("currentStateVersion", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setStateKey(value: Double): Self = this.set("stateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateKey: Self = this.set("stateKey", js.undefined)
  }
}
