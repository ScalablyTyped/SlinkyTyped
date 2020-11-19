package typingsSlinky.nextServer.libUtilsMod

import slinky.core.facade.ReactElement
import typingsSlinky.nextServer.nextServerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderPageResult extends js.Object {
  
  var dataOnly: js.UndefOr[`true`] = js.native
  
  var head: js.UndefOr[js.Array[ReactElement | Null]] = js.native
  
  var html: String = js.native
}
object RenderPageResult {
  
  @scala.inline
  def apply(html: String): RenderPageResult = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderPageResult]
  }
  
  @scala.inline
  implicit class RenderPageResultOps[Self <: RenderPageResult] (val x: Self) extends AnyVal {
    
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
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataOnly(value: `true`): Self = this.set("dataOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataOnly: Self = this.set("dataOnly", js.undefined)
    
    @scala.inline
    def setHeadVarargs(value: (ReactElement | Null)*): Self = this.set("head", js.Array(value :_*))
    
    @scala.inline
    def setHead(value: js.Array[ReactElement | Null]): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
  }
}
