package typingsSlinky.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCompositorsMultiMod {
  import typingsSlinky.popmotion.libActionMod.Action
  import typingsSlinky.popmotion.libActionTypesMod.ColdSubscription

  type ActionStarter[I] = js.Function2[/* action */ Action, /* key */ I, ColdSubscription]
}
