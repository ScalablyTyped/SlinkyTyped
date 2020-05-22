package typingsSlinky.baidumapWebSdk.global.BMap

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.baidumapWebSdk.BMap.Callback
import typingsSlinky.baidumapWebSdk.BMap.LabelOptions
import typingsSlinky.baidumapWebSdk.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Label")
@js.native
class Label protected ()
  extends typingsSlinky.baidumapWebSdk.BMap.Label {
  def this(content: String) = this()
  def this(content: String, opts: LabelOptions) = this()
  /* CompleteClass */
  override def addEventListener(event: String, handler: Callback): Unit = js.native
  /* CompleteClass */
  override def disableMassClear(): Unit = js.native
  /* CompleteClass */
  override def enableMassClear(): Unit = js.native
  /* CompleteClass */
  override def getMap(): typingsSlinky.baidumapWebSdk.BMap.Map = js.native
  /* CompleteClass */
  override def getOffset(): typingsSlinky.baidumapWebSdk.BMap.Size = js.native
  /* CompleteClass */
  override def getPosition(): typingsSlinky.baidumapWebSdk.BMap.Point = js.native
  /* CompleteClass */
  override def getTitle(): String = js.native
  /* CompleteClass */
  override def onclick(event: Target): Unit = js.native
  /* CompleteClass */
  override def ondblclick(event: Target): Unit = js.native
  /* CompleteClass */
  override def onmousedown(event: Target): Unit = js.native
  /* CompleteClass */
  override def onmouseout(event: Target): Unit = js.native
  /* CompleteClass */
  override def onmouseover(event: Target): Unit = js.native
  /* CompleteClass */
  override def onmouseup(event: Target): Unit = js.native
  /* CompleteClass */
  override def onremove(event: Target): Unit = js.native
  /* CompleteClass */
  override def onrightclick(event: Target): Unit = js.native
  /* CompleteClass */
  override def removeEventListener(event: String, handler: Callback): Unit = js.native
  /* CompleteClass */
  override def setContent(content: String): Unit = js.native
  /* CompleteClass */
  override def setOffset(offset: typingsSlinky.baidumapWebSdk.BMap.Size): Unit = js.native
  /* CompleteClass */
  override def setPosition(position: typingsSlinky.baidumapWebSdk.BMap.Point): Unit = js.native
  /* CompleteClass */
  override def setStyle(styles: StringDictionary[String | Double]): Unit = js.native
  /* CompleteClass */
  override def setTitle(title: String): Unit = js.native
  /* CompleteClass */
  override def setZIndex(zIndex: Double): Unit = js.native
}

