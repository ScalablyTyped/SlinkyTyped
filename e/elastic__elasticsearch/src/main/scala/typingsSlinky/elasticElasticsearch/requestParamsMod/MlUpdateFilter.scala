package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlUpdateFilter[T] extends Generic {
  
  var body: T = js.native
  
  var filter_id: String = js.native
}
object MlUpdateFilter {
  
  @scala.inline
  def apply[T](body: T, filter_id: String): MlUpdateFilter[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filter_id = filter_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateFilter[T]]
  }
  
  @scala.inline
  implicit class MlUpdateFilterOps[Self <: MlUpdateFilter[_], T] (val x: Self with MlUpdateFilter[T]) extends AnyVal {
    
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
    def setFilter_id(value: String): Self = this.set("filter_id", value.asInstanceOf[js.Any])
  }
}
