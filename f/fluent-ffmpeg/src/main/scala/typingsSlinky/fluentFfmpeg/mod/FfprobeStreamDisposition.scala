package typingsSlinky.fluentFfmpeg.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FfprobeStreamDisposition
  extends /* key */ StringDictionary[js.Any] {
  var attached_pic: js.UndefOr[Double] = js.native
  var clean_effects: js.UndefOr[Double] = js.native
  var comment: js.UndefOr[Double] = js.native
  var default: js.UndefOr[Double] = js.native
  var dub: js.UndefOr[Double] = js.native
  var forced: js.UndefOr[Double] = js.native
  var hearing_impaired: js.UndefOr[Double] = js.native
  var karaoke: js.UndefOr[Double] = js.native
  var lyrics: js.UndefOr[Double] = js.native
  var original: js.UndefOr[Double] = js.native
  var timed_thumbnails: js.UndefOr[Double] = js.native
  var visual_impaired: js.UndefOr[Double] = js.native
}

object FfprobeStreamDisposition {
  @scala.inline
  def apply(): FfprobeStreamDisposition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FfprobeStreamDisposition]
  }
  @scala.inline
  implicit class FfprobeStreamDispositionOps[Self <: FfprobeStreamDisposition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttached_pic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached_pic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttached_pic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached_pic")(js.undefined)
        ret
    }
    @scala.inline
    def withClean_effects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean_effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClean_effects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean_effects")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDub(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dub")(js.undefined)
        ret
    }
    @scala.inline
    def withForced(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forced")(js.undefined)
        ret
    }
    @scala.inline
    def withHearing_impaired(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hearing_impaired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHearing_impaired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hearing_impaired")(js.undefined)
        ret
    }
    @scala.inline
    def withKaraoke(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("karaoke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKaraoke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("karaoke")(js.undefined)
        ret
    }
    @scala.inline
    def withLyrics(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lyrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLyrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lyrics")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original")(js.undefined)
        ret
    }
    @scala.inline
    def withTimed_thumbnails(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timed_thumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimed_thumbnails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timed_thumbnails")(js.undefined)
        ret
    }
    @scala.inline
    def withVisual_impaired(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual_impaired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisual_impaired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual_impaired")(js.undefined)
        ret
    }
  }
  
}

