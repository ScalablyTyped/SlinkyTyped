package typingsSlinky.activexPowerpoint.global.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexPowerpoint.PowerPoint.PpHTMLVersion
import typingsSlinky.activexPowerpoint.PowerPoint.PpPublishSourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PublishObject")
@js.native
class PublishObject protected ()
  extends typingsSlinky.activexPowerpoint.PowerPoint.PublishObject {
  /* CompleteClass */
  override val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var FileName: String = js.native
  /* CompleteClass */
  override var HTMLVersion: PpHTMLVersion = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.PublishObject_typekey")
  override var PowerPointDotPublishObject_typekey: typingsSlinky.activexPowerpoint.PowerPoint.PublishObject = js.native
  /* CompleteClass */
  override var RangeEnd: Double = js.native
  /* CompleteClass */
  override var RangeStart: Double = js.native
  /* CompleteClass */
  override var SlideShowName: String = js.native
  /* CompleteClass */
  override var SourceType: PpPublishSourceType = js.native
  /* CompleteClass */
  override var SpeakerNotes: MsoTriState = js.native
  /* CompleteClass */
  override def Publish(): Unit = js.native
}

