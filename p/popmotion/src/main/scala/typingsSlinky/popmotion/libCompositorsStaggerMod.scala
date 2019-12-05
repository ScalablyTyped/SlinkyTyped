package typingsSlinky.popmotion

import typingsSlinky.popmotion.libActionMod.Action
import typingsSlinky.popmotion.libCompositorsStaggerMod.Interval
import typingsSlinky.popmotion.libCompositorsStaggerMod.IntervalCalc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/compositors/stagger", JSImport.Namespace)
@js.native
object libCompositorsStaggerMod extends js.Object {
  def default(actions: js.Array[Action], interval: Interval): Action = js.native
  type Interval = Double | IntervalCalc
  type IntervalCalc = js.Function1[/* i */ Double, Double]
}

