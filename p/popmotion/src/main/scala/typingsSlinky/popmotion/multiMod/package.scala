package typingsSlinky.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object multiMod {
  type ActionStarter[I] = js.Function2[
    /* action */ typingsSlinky.popmotion.actionMod.Action, 
    /* key */ I, 
    typingsSlinky.popmotion.typesMod.ColdSubscription
  ]
}
