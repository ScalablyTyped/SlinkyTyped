package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object replMod {
  import typingsSlinky.node.vmMod.Context

  type REPLCommandAction = js.ThisFunction1[/* this */ REPLServer, /* text */ String, Unit]
  type REPLEval = js.ThisFunction4[
    /* this */ REPLServer, 
    /* evalCmd */ String, 
    /* context */ Context, 
    /* file */ String, 
    /* cb */ js.Function2[/* err */ js.Error | Null, /* result */ js.Any, Unit], 
    Unit
  ]
  type REPLWriter = js.ThisFunction1[/* this */ REPLServer, /* obj */ js.Any, String]
}
