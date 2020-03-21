package typingsSlinky.oauth2orize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DecisionParseFunction = js.Function2[
    /* req */ typingsSlinky.oauth2orize.mod.MiddlewareRequest, 
    /* done */ js.Function2[/* err */ js.Error | scala.Null, /* params */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type DeserializeClientDoneFunction = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* client */ js.UndefOr[js.Any | scala.Boolean], 
    scala.Unit
  ]
  type DeserializeClientFunction = js.Function2[
    /* id */ java.lang.String, 
    /* done */ typingsSlinky.oauth2orize.mod.DeserializeClientDoneFunction, 
    scala.Unit
  ]
  type ExchangeDoneFunction = js.Function4[
    /* err */ js.Error | scala.Null, 
    /* accessToken */ js.UndefOr[java.lang.String | scala.Boolean], 
    /* refreshToken */ js.UndefOr[java.lang.String], 
    /* params */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type ImmediateFunction = js.Function6[
    /* client */ js.Any, 
    /* user */ js.Any, 
    /* scope */ js.Array[java.lang.String], 
    /* type */ java.lang.String, 
    /* areq */ js.Any, 
    /* done */ js.Function4[
      /* err */ js.Error | scala.Null, 
      /* allow */ scala.Boolean, 
      /* info */ js.Any, 
      /* locals */ js.Any, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type IssueExchangeCodeFunction = js.Function4[
    /* client */ js.Any, 
    /* code */ java.lang.String, 
    /* redirectURI */ java.lang.String, 
    /* issued */ typingsSlinky.oauth2orize.mod.ExchangeDoneFunction, 
    scala.Unit
  ]
  type IssueGrantCodeFunction = js.Function5[
    /* client */ js.Any, 
    /* redirectUri */ java.lang.String, 
    /* user */ js.Any, 
    /* res */ js.Any, 
    /* issued */ js.Function2[/* err */ js.Error | scala.Null, /* code */ js.UndefOr[java.lang.String], scala.Unit], 
    scala.Unit
  ]
  type IssueGrantTokenFunction = js.Function4[
    /* client */ js.Any, 
    /* user */ js.Any, 
    /* ares */ js.Any, 
    /* issued */ js.Function3[
      /* err */ js.Error | scala.Null, 
      /* code */ js.UndefOr[java.lang.String], 
      /* params */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type MiddlewareErrorFunction = js.Function4[
    /* err */ js.Error, 
    /* req */ typingsSlinky.oauth2orize.mod.MiddlewareRequest, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    /* next */ typingsSlinky.oauth2orize.mod.MiddlewareNextFunction, 
    scala.Unit
  ]
  type MiddlewareFunction = js.Function3[
    /* req */ typingsSlinky.oauth2orize.mod.MiddlewareRequest, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    /* next */ typingsSlinky.oauth2orize.mod.MiddlewareNextFunction, 
    scala.Unit
  ]
  type MiddlewareNextFunction = js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]
  type SerializeClientDoneFunction = js.Function2[/* err */ js.Error | scala.Null, /* id */ java.lang.String, scala.Unit]
  type SerializeClientFunction = js.Function2[
    /* client */ js.Any, 
    /* done */ typingsSlinky.oauth2orize.mod.SerializeClientDoneFunction, 
    scala.Unit
  ]
  type ValidateFunction = js.Function3[
    /* clientId */ java.lang.String, 
    /* redirectURI */ java.lang.String, 
    /* validated */ js.Function3[
      /* err */ js.Error | scala.Null, 
      /* client */ js.UndefOr[js.Any], 
      /* redirectURI */ js.UndefOr[java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
