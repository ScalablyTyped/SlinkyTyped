package typingsSlinky.cssFontLoadingModule.mod

import typingsSlinky.cssFontLoadingModule.mod._Global_.FontFaceSetLoadEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFaceSetEventMap extends js.Object {
  def loading(event: FontFaceSetLoadEvent): js.Any = js.native
  def loadingdone(event: FontFaceSetLoadEvent): js.Any = js.native
  def loadingerror(event: FontFaceSetLoadEvent): js.Any = js.native
}

object FontFaceSetEventMap {
  @scala.inline
  def apply(
    loading: FontFaceSetLoadEvent => js.Any,
    loadingdone: FontFaceSetLoadEvent => js.Any,
    loadingerror: FontFaceSetLoadEvent => js.Any
  ): FontFaceSetEventMap = {
    val __obj = js.Dynamic.literal(loading = js.Any.fromFunction1(loading), loadingdone = js.Any.fromFunction1(loadingdone), loadingerror = js.Any.fromFunction1(loadingerror))
    __obj.asInstanceOf[FontFaceSetEventMap]
  }
  @scala.inline
  implicit class FontFaceSetEventMapOps[Self <: FontFaceSetEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoading(value: FontFaceSetLoadEvent => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadingdone(value: FontFaceSetLoadEvent => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingdone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadingerror(value: FontFaceSetLoadEvent => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingerror")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

