package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EqlGet extends Generic {
  
  var id: String = js.native
  
  var keep_alive: js.UndefOr[String] = js.native
  
  var wait_for_completion_timeout: js.UndefOr[String] = js.native
}
object EqlGet {
  
  @scala.inline
  def apply(id: String): EqlGet = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqlGet]
  }
  
  @scala.inline
  implicit class EqlGetOps[Self <: EqlGet] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeep_alive(value: String): Self = this.set("keep_alive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep_alive: Self = this.set("keep_alive", js.undefined)
    
    @scala.inline
    def setWait_for_completion_timeout(value: String): Self = this.set("wait_for_completion_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait_for_completion_timeout: Self = this.set("wait_for_completion_timeout", js.undefined)
  }
}
