package typingsSlinky.gestalt.mod

import slinky.core.TagMod
import typingsSlinky.gestalt.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollageProps extends js.Object {
  var columns: Double = js.native
  var cover: js.UndefOr[Boolean] = js.native
  var gutter: js.UndefOr[Double] = js.native
  var height: Double = js.native
  var layoutKey: js.UndefOr[Double] = js.native
  var width: Double = js.native
  def renderImage(args: AnonHeight): TagMod[Any] = js.native
}

object CollageProps {
  @scala.inline
  def apply(columns: Double, height: Double, renderImage: AnonHeight => TagMod[Any], width: Double): CollageProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], renderImage = js.Any.fromFunction1(renderImage), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollageProps]
  }
  @scala.inline
  implicit class CollagePropsOps[Self <: CollageProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderImage(value: AnonHeight => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover")(js.undefined)
        ret
    }
    @scala.inline
    def withGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutKey")(js.undefined)
        ret
    }
  }
  
}

