package typingsSlinky.openfin.windowWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowInfo extends js.Object {
  var canNavigateBack: Boolean = js.native
  var canNavigateForward: Boolean = js.native
  var preloadScripts: js.Array[_] = js.native
  var title: String = js.native
  var url: String = js.native
}

object WindowInfo {
  @scala.inline
  def apply(
    canNavigateBack: Boolean,
    canNavigateForward: Boolean,
    preloadScripts: js.Array[_],
    title: String,
    url: String
  ): WindowInfo = {
    val __obj = js.Dynamic.literal(canNavigateBack = canNavigateBack.asInstanceOf[js.Any], canNavigateForward = canNavigateForward.asInstanceOf[js.Any], preloadScripts = preloadScripts.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowInfo]
  }
  @scala.inline
  implicit class WindowInfoOps[Self <: WindowInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanNavigateBack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canNavigateBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanNavigateForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canNavigateForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreloadScripts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

