package typingsSlinky.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes HTTPSTrigger, could be used to connect web hooks to function.
  */
@js.native
trait SchemaHTTPSTrigger extends js.Object {
  
  /**
    * Output only. The deployed url for the function.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaHTTPSTrigger {
  
  @scala.inline
  def apply(): SchemaHTTPSTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHTTPSTrigger]
  }
  
  @scala.inline
  implicit class SchemaHTTPSTriggerOps[Self <: SchemaHTTPSTrigger] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
