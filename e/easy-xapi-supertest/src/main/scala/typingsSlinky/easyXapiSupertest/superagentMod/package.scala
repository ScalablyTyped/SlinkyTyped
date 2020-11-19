package typingsSlinky.easyXapiSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object superagentMod {
  
  type CallbackHandler = (js.Function2[
    /* err */ js.Any, 
    /* res */ typingsSlinky.easyXapiSupertest.superagentMod.Response, 
    scala.Unit
  ]) | (js.Function1[/* res */ typingsSlinky.easyXapiSupertest.superagentMod.Response, scala.Unit])
  
  type SuperAgentRequest = typingsSlinky.easyXapiSupertest.superagentMod.Request[
    typingsSlinky.easyXapiSupertest.superagentMod.Request[
      typingsSlinky.easyXapiSupertest.superagentMod.Request[typingsSlinky.easyXapiSupertest.superagentMod.Request[js.Any]]
    ]
  ]
}
