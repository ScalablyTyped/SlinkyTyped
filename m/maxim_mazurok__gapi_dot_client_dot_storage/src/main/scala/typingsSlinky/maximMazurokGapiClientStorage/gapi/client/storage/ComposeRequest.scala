package typingsSlinky.maximMazurokGapiClientStorage.gapi.client.storage

import typingsSlinky.maximMazurokGapiClientStorage.anon.Generation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComposeRequest extends js.Object {
  
  /** Properties of the resulting object. */
  // tslint:disable-next-line:ban-types
  var destination: js.UndefOr[Object] = js.native
  
  /** The kind of item this is. */
  var kind: js.UndefOr[String] = js.native
  
  /** The list of source objects that will be concatenated into a single object. */
  var sourceObjects: js.UndefOr[js.Array[Generation]] = js.native
}
object ComposeRequest {
  
  @scala.inline
  def apply(): ComposeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposeRequest]
  }
  
  @scala.inline
  implicit class ComposeRequestOps[Self <: ComposeRequest] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: Object): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSourceObjectsVarargs(value: Generation*): Self = this.set("sourceObjects", js.Array(value :_*))
    
    @scala.inline
    def setSourceObjects(value: js.Array[Generation]): Self = this.set("sourceObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceObjects: Self = this.set("sourceObjects", js.undefined)
  }
}
