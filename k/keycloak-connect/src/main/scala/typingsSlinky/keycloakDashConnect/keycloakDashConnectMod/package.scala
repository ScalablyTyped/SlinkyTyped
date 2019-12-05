package typingsSlinky.keycloakDashConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keycloakDashConnectMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type SpecHandler = js.Function3[
    /* token */ Token, 
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    Boolean
  ]
}
