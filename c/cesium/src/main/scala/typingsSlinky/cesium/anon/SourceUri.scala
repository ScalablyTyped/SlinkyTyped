package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceUri extends js.Object {
  
  var sourceUri: js.UndefOr[String] = js.native
}
object SourceUri {
  
  @scala.inline
  def apply(): SourceUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceUri]
  }
  
  @scala.inline
  implicit class SourceUriOps[Self <: SourceUri] (val x: Self) extends AnyVal {
    
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
    def setSourceUri(value: String): Self = this.set("sourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceUri: Self = this.set("sourceUri", js.undefined)
  }
}
