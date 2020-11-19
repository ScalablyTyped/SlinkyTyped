package typingsSlinky.oauth2orize.mod.exchange

import typingsSlinky.oauth2orize.mod.ExchangeDoneFunction
import typingsSlinky.oauth2orize.mod.MiddlewareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oauth2orize", "exchange.clientCredentials")
@js.native
object clientCredentials extends js.Object {
  
  def apply(issue: js.Function2[/* client */ js.Any, /* issued */ ExchangeDoneFunction, Unit]): MiddlewareFunction = js.native
  def apply(
    issue: js.Function3[
      /* client */ js.Any, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 2; issue(client, issued);
  def apply(
    options: Options,
    issue: js.Function2[/* client */ js.Any, /* issued */ ExchangeDoneFunction, Unit]
  ): MiddlewareFunction = js.native
  // arity == 3; issue(client, scope, issued);
  def apply(
    options: Options,
    issue: js.Function3[
      /* client */ js.Any, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 4; issue(client, scope, req.body, issued);
  def apply(
    options: Options,
    issue: js.Function4[
      /* client */ js.Any, 
      /* scope */ js.Array[String], 
      /* body */ js.Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 5; issue(client, scope, req.body, req.authInfo, issued);
  def apply(
    options: Options,
    issue: js.Function5[
      /* client */ js.Any, 
      /* scope */ js.Array[String], 
      /* body */ js.Any, 
      /* authInfo */ js.Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
}
