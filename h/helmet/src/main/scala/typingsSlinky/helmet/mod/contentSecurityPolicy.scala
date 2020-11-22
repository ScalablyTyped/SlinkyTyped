package typingsSlinky.helmet.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.helmet.anon.ReadonlyContentSecurityPo
import typingsSlinky.helmet.contentSecurityPolicyMod.ContentSecurityPolicyDirectiveValue
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("helmet/dist", "contentSecurityPolicy")
@js.native
object contentSecurityPolicy extends js.Object {
  
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
  
  def getDefaultDirectives(): StringDictionary[js.Iterable[ContentSecurityPolicyDirectiveValue]] = js.native
  @JSName("getDefaultDirectives")
  var getDefaultDirectives_Original: js.Function0[StringDictionary[js.Iterable[ContentSecurityPolicyDirectiveValue]]] = js.native
}
