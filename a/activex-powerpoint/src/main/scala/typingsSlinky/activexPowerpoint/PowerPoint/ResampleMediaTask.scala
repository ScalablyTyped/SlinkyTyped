package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResampleMediaTask extends js.Object {
  val AudioCompressionType: String = js.native
  val AudioSamplingRate: Double = js.native
  val ContainerType: String = js.native
  val IsEmbedded: Boolean = js.native
  val IsLinked: Boolean = js.native
  @JSName("PowerPoint.ResampleMediaTask_typekey")
  var PowerPointDotResampleMediaTask_typekey: ResampleMediaTask = js.native
  val SampleHeight: Double = js.native
  val SampleWidth: Double = js.native
  val Shape: typingsSlinky.activexPowerpoint.PowerPoint.Shape = js.native
  val VideoCompressionType: String = js.native
  val VideoFrameRate: Double = js.native
  val profile: PpResampleMediaProfile = js.native
}

object ResampleMediaTask {
  @scala.inline
  def apply(
    AudioCompressionType: String,
    AudioSamplingRate: Double,
    ContainerType: String,
    IsEmbedded: Boolean,
    IsLinked: Boolean,
    PowerPointDotResampleMediaTask_typekey: ResampleMediaTask,
    SampleHeight: Double,
    SampleWidth: Double,
    Shape: Shape,
    VideoCompressionType: String,
    VideoFrameRate: Double,
    profile: PpResampleMediaProfile
  ): ResampleMediaTask = {
    val __obj = js.Dynamic.literal(AudioCompressionType = AudioCompressionType.asInstanceOf[js.Any], AudioSamplingRate = AudioSamplingRate.asInstanceOf[js.Any], ContainerType = ContainerType.asInstanceOf[js.Any], IsEmbedded = IsEmbedded.asInstanceOf[js.Any], IsLinked = IsLinked.asInstanceOf[js.Any], SampleHeight = SampleHeight.asInstanceOf[js.Any], SampleWidth = SampleWidth.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], VideoCompressionType = VideoCompressionType.asInstanceOf[js.Any], VideoFrameRate = VideoFrameRate.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ResampleMediaTask_typekey")(PowerPointDotResampleMediaTask_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResampleMediaTask]
  }
  @scala.inline
  implicit class ResampleMediaTaskOps[Self <: ResampleMediaTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioCompressionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioCompressionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioSamplingRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioSamplingRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEmbedded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsEmbedded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLinked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLinked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotResampleMediaTask_typekey(value: ResampleMediaTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.ResampleMediaTask_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSampleHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSampleWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoCompressionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoCompressionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoFrameRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoFrameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile(value: PpResampleMediaProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

