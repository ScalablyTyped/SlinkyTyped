package typingsSlinky.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveOptions extends js.Object {
  var hasAudio: js.UndefOr[Boolean] = js.native
  var hasVideo: js.UndefOr[Boolean] = js.native
  var layout: js.UndefOr[ArchiveLayoutOptions] = js.native
  var name: js.UndefOr[String] = js.native
  var outputMode: js.UndefOr[OutputMode] = js.native
}

object ArchiveOptions {
  @scala.inline
  def apply(): ArchiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveOptions]
  }
  @scala.inline
  implicit class ArchiveOptionsOps[Self <: ArchiveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAudio")(js.undefined)
        ret
    }
    @scala.inline
    def withHasVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasVideo")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: ArchiveLayoutOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputMode(value: OutputMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputMode")(js.undefined)
        ret
    }
  }
  
}

