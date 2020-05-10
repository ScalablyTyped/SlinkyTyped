package typingsSlinky.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxSlide extends FancyBoxGroupItemWithFilledProps {
  @JSName("$content")
  var $content: js.UndefOr[JQuery] = js.native
  @JSName("$iframe")
  var $iframe: js.UndefOr[JQuery] = js.native
  @JSName("$image")
  var $image: js.UndefOr[JQuery] = js.native
  @JSName("$slide")
  var $slide: js.UndefOr[JQuery] = js.native
  @JSName("$spinner")
  var $spinner: js.UndefOr[JQuery] = js.native
  var contentSource: js.UndefOr[String] = js.native
  var forcedDuration: js.UndefOr[Double] = js.native
  var height: Double = js.native
  var isComplete: Boolean = js.native
  var isLoaded: Boolean = js.native
  var isLoading: Boolean = js.native
  var isRevealed: Boolean = js.native
  var pos: Double = js.native
  var width: Double = js.native
}

object FancyBoxSlide {
  @scala.inline
  def apply(
    height: Double,
    isComplete: Boolean,
    isLoaded: Boolean,
    isLoading: Boolean,
    isRevealed: Boolean,
    pos: Double,
    src: String,
    width: Double
  ): FancyBoxSlide = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isRevealed = isRevealed.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxSlide]
  }
  @scala.inline
  implicit class FancyBoxSlideOps[Self <: FancyBoxSlide] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRevealed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRevealed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$content(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$content: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$content")(js.undefined)
        ret
    }
    @scala.inline
    def with$iframe(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$iframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$iframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$iframe")(js.undefined)
        ret
    }
    @scala.inline
    def with$image(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$image: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$image")(js.undefined)
        ret
    }
    @scala.inline
    def with$slide(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$slide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$slide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$slide")(js.undefined)
        ret
    }
    @scala.inline
    def with$spinner(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$spinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$spinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$spinner")(js.undefined)
        ret
    }
    @scala.inline
    def withContentSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSource")(js.undefined)
        ret
    }
    @scala.inline
    def withForcedDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcedDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForcedDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcedDuration")(js.undefined)
        ret
    }
  }
  
}

