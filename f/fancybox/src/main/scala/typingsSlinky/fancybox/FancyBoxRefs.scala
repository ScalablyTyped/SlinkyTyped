package typingsSlinky.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxRefs extends js.Object {
  var bg: JQuery = js.native
  var caption: JQuery = js.native
  var container: JQuery = js.native
  var infobar: JQuery = js.native
  var inner: JQuery = js.native
  var navigation: JQuery = js.native
  var stage: JQuery = js.native
  var toolbar: JQuery = js.native
}

object FancyBoxRefs {
  @scala.inline
  def apply(
    bg: JQuery,
    caption: JQuery,
    container: JQuery,
    infobar: JQuery,
    inner: JQuery,
    navigation: JQuery,
    stage: JQuery,
    toolbar: JQuery
  ): FancyBoxRefs = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], infobar = infobar.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxRefs]
  }
  @scala.inline
  implicit class FancyBoxRefsOps[Self <: FancyBoxRefs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBg(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfobar(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infobar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInner(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigation(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStage(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbar(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

