package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishObject extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var FileName: String = js.native
  var HTMLVersion: PpHTMLVersion = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.PublishObject_typekey")
  var PowerPointDotPublishObject_typekey: PublishObject = js.native
  var RangeEnd: Double = js.native
  var RangeStart: Double = js.native
  var SlideShowName: String = js.native
  var SourceType: PpPublishSourceType = js.native
  var SpeakerNotes: MsoTriState = js.native
  def Publish(): Unit = js.native
}

object PublishObject {
  @scala.inline
  def apply(
    Application: Application,
    FileName: String,
    HTMLVersion: PpHTMLVersion,
    Parent: js.Any,
    PowerPointDotPublishObject_typekey: PublishObject,
    Publish: () => Unit,
    RangeEnd: Double,
    RangeStart: Double,
    SlideShowName: String,
    SourceType: PpPublishSourceType,
    SpeakerNotes: MsoTriState
  ): PublishObject = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], HTMLVersion = HTMLVersion.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Publish = js.Any.fromFunction0(Publish), RangeEnd = RangeEnd.asInstanceOf[js.Any], RangeStart = RangeStart.asInstanceOf[js.Any], SlideShowName = SlideShowName.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any], SpeakerNotes = SpeakerNotes.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PublishObject_typekey")(PowerPointDotPublishObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishObject]
  }
  @scala.inline
  implicit class PublishObjectOps[Self <: PublishObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTMLVersion(value: PpHTMLVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotPublishObject_typekey(value: PublishObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.PublishObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublish(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Publish")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRangeEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideShowName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideShowName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceType(value: PpPublishSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeakerNotes(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpeakerNotes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

