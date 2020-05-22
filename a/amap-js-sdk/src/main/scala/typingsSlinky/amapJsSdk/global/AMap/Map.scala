package typingsSlinky.amapJsSdk.global.AMap

import typingsSlinky.amapJsSdk.AMap.EventCallback
import typingsSlinky.amapJsSdk.AMap.MapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Map")
@js.native
class Map protected ()
  extends typingsSlinky.amapJsSdk.AMap.Map {
  def this(mapDiv: String) = this()
  def this(mapDiv: String, opts: MapOptions) = this()
  /* CompleteClass */
  override def off(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: EventCallback): Unit = js.native
}

