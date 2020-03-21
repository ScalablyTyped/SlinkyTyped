package typingsSlinky.plaidLink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Plaid {
  type OnEvent = js.Function2[
    /* eventName */ typingsSlinky.plaidLink.mod.Plaid.EventName, 
    /* metadata */ typingsSlinky.plaidLink.mod.Plaid.OnEventMetaData, 
    scala.Unit
  ]
  type OnExit = js.Function2[
    /* error */ typingsSlinky.plaidLink.mod.Plaid.Error | scala.Null, 
    /* metadata */ typingsSlinky.plaidLink.mod.Plaid.OnExitMetaData, 
    scala.Unit
  ]
  type OnLoad = js.Function0[scala.Unit]
  type OnSuccess = js.Function2[
    /* public_token */ java.lang.String, 
    /* metadata */ typingsSlinky.plaidLink.mod.Plaid.OnSuccessMetaData, 
    scala.Unit
  ]
}
