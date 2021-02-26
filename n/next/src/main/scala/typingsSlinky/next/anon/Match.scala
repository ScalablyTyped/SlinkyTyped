package typingsSlinky.next.anon

import typingsSlinky.next.nextBooleans.`false`
import typingsSlinky.next.serverRouterMod.RouteMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Match extends StObject {
  
  var `match`: RouteMatch = js.native
  
  var page: String = js.native
}
object Match {
  
  @scala.inline
  def apply(
    `match`: /* pathname */ js.UndefOr[String | Null] => `false` | typingsSlinky.next.serverRouterMod.Params,
    page: String
  ): Match = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Match]
  }
  
  @scala.inline
  implicit class MatchMutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatch(
      value: /* pathname */ js.UndefOr[String | Null] => `false` | typingsSlinky.next.serverRouterMod.Params
    ): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
