package typingsSlinky.next.anon

import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fallback[P /* <: ParsedUrlQuery */] extends js.Object {
  
  var fallback: Boolean = js.native
  
  var paths: js.Array[String | Params[P]] = js.native
}
object Fallback {
  
  @scala.inline
  def apply[P /* <: ParsedUrlQuery */](fallback: Boolean, paths: js.Array[String | Params[P]]): Fallback[P] = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fallback[P]]
  }
  
  @scala.inline
  implicit class FallbackOps[Self <: Fallback[_], P /* <: ParsedUrlQuery */] (val x: Self with Fallback[P]) extends AnyVal {
    
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
    def setFallback(value: Boolean): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsVarargs(value: (String | Params[P])*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String | Params[P]]): Self = this.set("paths", value.asInstanceOf[js.Any])
  }
}
