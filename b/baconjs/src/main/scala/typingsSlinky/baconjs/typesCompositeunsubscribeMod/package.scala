package typingsSlinky.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesCompositeunsubscribeMod {
  import typingsSlinky.baconjs.typesTypesMod.Unsub

  type Subscription = js.Function2[/* unsubAll */ Unsub, /* unsubMe */ Unsub, Unsub]
}
