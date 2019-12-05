package typingsSlinky.errorhandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object errorhandlerMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type LoggingCallback = js.Function4[
    /* err */ js.Error, 
    /* str */ String, 
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    Unit
  ]
}
