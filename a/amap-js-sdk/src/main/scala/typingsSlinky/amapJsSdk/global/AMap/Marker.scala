package typingsSlinky.amapJsSdk.global.AMap

import typingsSlinky.amapJsSdk.AMap.EventCallback
import typingsSlinky.amapJsSdk.AMap.MarkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 点标记。
  */
@JSGlobal("AMap.Marker")
@js.native
class Marker ()
  extends typingsSlinky.amapJsSdk.AMap.Marker {
  def this(options: MarkerOptions) = this()
  /* CompleteClass */
  override def off(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: EventCallback): Unit = js.native
}

