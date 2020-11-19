package typingsSlinky.got.mod

import typingsSlinky.got.gotBooleans.`true`
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotFormOptions[E /* <: String | Null */] extends GotOptions[E] {
  
  var body: js.UndefOr[Record[String, _]] = js.native
  
  var form: `true` = js.native
  
  var hooks: js.UndefOr[Hooks[GotFormOptions[E], Record[String, _]]] = js.native
  
  var json: js.UndefOr[Boolean] = js.native
}
object GotFormOptions {
  
  @scala.inline
  def apply[E /* <: String | Null */](form: `true`): GotFormOptions[E] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotFormOptions[E]]
  }
  
  @scala.inline
  implicit class GotFormOptionsOps[Self <: GotFormOptions[_], E /* <: String | Null */] (val x: Self with GotFormOptions[E]) extends AnyVal {
    
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
    def setForm(value: `true`): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: Record[String, _]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHooks(value: Hooks[GotFormOptions[E], Record[String, _]]): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
  }
}
