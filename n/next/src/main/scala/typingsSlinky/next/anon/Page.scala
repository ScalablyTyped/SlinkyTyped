package typingsSlinky.next.anon

import typingsSlinky.next.nextBooleans.`false`
import typingsSlinky.next.serverRouterMod.RouteMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page extends js.Object {
  
  var `match`: RouteMatch = js.native
  
  var page: String = js.native
}
object Page {
  
  @scala.inline
  def apply(
    `match`: /* pathname */ js.UndefOr[String | Null] => `false` | typingsSlinky.next.serverRouterMod.Params,
    page: String
  ): Page = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    
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
    def setMatch(
      value: /* pathname */ js.UndefOr[String | Null] => `false` | typingsSlinky.next.serverRouterMod.Params
    ): Self = this.set("match", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
  }
}
