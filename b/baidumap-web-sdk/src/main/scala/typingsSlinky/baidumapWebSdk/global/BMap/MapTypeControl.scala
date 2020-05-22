package typingsSlinky.baidumapWebSdk.global.BMap

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.baidumapWebSdk.BMap.ControlAnchor
import typingsSlinky.baidumapWebSdk.BMap.MapTypeControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.MapTypeControl")
@js.native
class MapTypeControl ()
  extends typingsSlinky.baidumapWebSdk.BMap.Control {
  def this(opts: MapTypeControlOptions) = this()
  /* CompleteClass */
  override var defaultAnchor: ControlAnchor = js.native
  /* CompleteClass */
  override var defaultOffset: typingsSlinky.baidumapWebSdk.BMap.Size = js.native
  /* CompleteClass */
  override def getAnchor(): ControlAnchor = js.native
  /** 自定义Control在add之后立马能读取到Container, 内置Control不能 */
  /* CompleteClass */
  override def getContainer(): js.UndefOr[HTMLElement] = js.native
  /* CompleteClass */
  override def getOffset(): typingsSlinky.baidumapWebSdk.BMap.Size = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def initialize(map: typingsSlinky.baidumapWebSdk.BMap.Map): HTMLElement = js.native
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  /* CompleteClass */
  override def setAnchor(anchor: ControlAnchor): Unit = js.native
  /* CompleteClass */
  override def setOffset(offset: typingsSlinky.baidumapWebSdk.BMap.Size): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
}

