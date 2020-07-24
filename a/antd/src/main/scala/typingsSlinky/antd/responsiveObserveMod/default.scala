package typingsSlinky.antd.responsiveObserveMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.antd.anon.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/_util/responsiveObserve", JSImport.Default)
@js.native
object default extends js.Object {
  var matchHandlers: StringDictionary[Listener] = js.native
  def dispatch(pointMap: ScreenMap): Boolean = js.native
  def register(): Unit = js.native
  def subscribe(func: SubscribeFunc): Double = js.native
  def unregister(): Unit = js.native
  def unsubscribe(token: Double): Unit = js.native
}

