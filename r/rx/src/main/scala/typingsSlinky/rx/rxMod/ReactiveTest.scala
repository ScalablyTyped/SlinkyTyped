package typingsSlinky.rx.rxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "ReactiveTest")
@js.native
object ReactiveTest extends js.Object {
  var created: Double = js.native
  var disposed: Double = js.native
  var subscribed: Double = js.native
  def onCompleted(ticks: Double): typingsSlinky.rxDashLiteDashTesting.Rx.Recorded = js.native
  def onError(ticks: Double, exception: js.Any): typingsSlinky.rxDashLiteDashTesting.Rx.Recorded = js.native
  def onNext(ticks: Double, value: js.Any): typingsSlinky.rxDashLiteDashTesting.Rx.Recorded = js.native
  def subscribe(subscribeAt: Double): typingsSlinky.rxDashLiteDashTesting.Rx.Subscription = js.native
  def subscribe(subscribeAt: Double, unsubscribeAt: Double): typingsSlinky.rxDashLiteDashTesting.Rx.Subscription = js.native
}

