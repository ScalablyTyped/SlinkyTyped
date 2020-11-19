package typingsSlinky.atlassianConnectJs.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.auto
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.error
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.info
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.manual
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.success
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  title :string,   body :string,   type :'info' | 'success' | 'warning' | 'error',   close :'manual' | 'auto',   actions :{[key: string] : string}}> */
@js.native
trait Partialtitlestringbodystr extends js.Object {
  
  var actions: js.UndefOr[StringDictionary[String]] = js.native
  
  var body: js.UndefOr[String] = js.native
  
  var close: js.UndefOr[manual | auto] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[info | success | warning | error] = js.native
}
object Partialtitlestringbodystr {
  
  @scala.inline
  def apply(): Partialtitlestringbodystr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialtitlestringbodystr]
  }
  
  @scala.inline
  implicit class PartialtitlestringbodystrOps[Self <: Partialtitlestringbodystr] (val x: Self) extends AnyVal {
    
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
    def setActions(value: StringDictionary[String]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setClose(value: manual | auto): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: info | success | warning | error): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
