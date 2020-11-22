package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClosePointInTime[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
}
object ClosePointInTime {
  
  @scala.inline
  def apply[T](): ClosePointInTime[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosePointInTime[T]]
  }
  
  @scala.inline
  implicit class ClosePointInTimeOps[Self <: ClosePointInTime[_], T] (val x: Self with ClosePointInTime[T]) extends AnyVal {
    
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
}
