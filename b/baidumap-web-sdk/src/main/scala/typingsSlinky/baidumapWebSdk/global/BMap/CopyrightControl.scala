package typingsSlinky.baidumapWebSdk.global.BMap

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.baidumapWebSdk.BMap.ControlAnchor
import typingsSlinky.baidumapWebSdk.BMap.Copyright
import typingsSlinky.baidumapWebSdk.BMap.CopyrightControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.CopyrightControl")
@js.native
class CopyrightControl ()
  extends typingsSlinky.baidumapWebSdk.BMap.CopyrightControl {
  def this(opts: CopyrightControlOptions) = this()
  /* CompleteClass */
  override var defaultAnchor: ControlAnchor = js.native
  /* CompleteClass */
  override var defaultOffset: typingsSlinky.baidumapWebSdk.BMap.Size = js.native
  /* CompleteClass */
  override def addCopyright(copyright: Copyright): Unit = js.native
  /* CompleteClass */
  override def getAnchor(): ControlAnchor = js.native
  /** 自定义Control在add之后立马能读取到Container, 内置Control不能 */
  /* CompleteClass */
  override def getContainer(): js.UndefOr[HTMLElement] = js.native
  /* CompleteClass */
  override def getCopyright(id: Double): Copyright = js.native
  /* CompleteClass */
  override def getCopyrightCollection(): js.Array[Copyright] = js.native
  /* CompleteClass */
  override def getOffset(): typingsSlinky.baidumapWebSdk.BMap.Size = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def initialize(map: typingsSlinky.baidumapWebSdk.BMap.Map): HTMLElement = js.native
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  /* CompleteClass */
  override def removeCopyright(id: Double): Unit = js.native
  /* CompleteClass */
  override def setAnchor(anchor: ControlAnchor): Unit = js.native
  /* CompleteClass */
  override def setOffset(offset: typingsSlinky.baidumapWebSdk.BMap.Size): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
}

