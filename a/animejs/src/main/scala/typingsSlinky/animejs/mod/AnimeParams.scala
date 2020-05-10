package typingsSlinky.animejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.animejs.mod.AnimeCallBack because Already inherited
- typingsSlinky.animejs.mod.AnimeInstanceParams because var conflicts: begin, change, changeBegin, changeComplete, complete, loopBegin, loopComplete, update. Inlined loop, autoplay, direction */ @js.native
trait AnimeParams extends AnimeAnimParams {
  var autoplay: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[DirectionOptions | String] = js.native
  var loop: js.UndefOr[Double | Boolean] = js.native
}

object AnimeParams {
  @scala.inline
  def apply(): AnimeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimeParams]
  }
  @scala.inline
  implicit class AnimeParamsOps[Self <: AnimeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: DirectionOptions | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
  }
  
}

