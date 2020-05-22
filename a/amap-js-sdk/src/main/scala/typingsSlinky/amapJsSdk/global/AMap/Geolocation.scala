package typingsSlinky.amapJsSdk.global.AMap

import typingsSlinky.amapJsSdk.AMap.EventCallback
import typingsSlinky.amapJsSdk.anon.ButtonDom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Geolocation")
@js.native
class Geolocation protected ()
  extends typingsSlinky.amapJsSdk.AMap.Geolocation {
  def this(options: ButtonDom) = this()
  /* CompleteClass */
  override def clearWatch(watchId: Double): Double = js.native
  /* CompleteClass */
  override def getCurrentPosition(): Unit = js.native
  /* CompleteClass */
  override def isSupported(): Boolean = js.native
  /* CompleteClass */
  override def off(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def watchPosition(): Double = js.native
}

