package typingsSlinky.keycloakConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SpecHandler = js.Function3[
    /* token */ typingsSlinky.keycloakConnect.mod.Token, 
    /* request */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* response */ typingsSlinky.express.mod.Response_, 
    scala.Boolean
  ]
}
