package typingsSlinky.helmet.contentSecurityPolicyMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.helmet.anon.ReadonlyContentSecurityPo
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("helmet/dist/middlewares/content-security-policy", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
    Unit
  ] = js.native
  def apply(options: ReadonlyContentSecurityPo): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
    Unit
  ] = js.native
  
  var getDefaultDirectives: js.Function0[StringDictionary[js.Iterable[ContentSecurityPolicyDirectiveValue]]] = js.native
}
