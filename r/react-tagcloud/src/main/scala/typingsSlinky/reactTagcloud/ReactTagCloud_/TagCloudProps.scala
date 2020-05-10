package typingsSlinky.reactTagcloud.ReactTagCloud_

import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagCloudProps extends Props[Unit] {
  var className: js.UndefOr[String] = js.native
  var colorOptions: js.UndefOr[js.Object] = js.native
  var disableRandomColor: js.UndefOr[Boolean] = js.native
  var maxSize: Double = js.native
  var minSize: Double = js.native
  var onClick: js.UndefOr[js.Function] = js.native
  var renderer: js.UndefOr[js.Function] = js.native
  var shuffle: js.UndefOr[Boolean] = js.native
  var tags: js.Array[_] = js.native
}

object TagCloudProps {
  @scala.inline
  def apply(maxSize: Double, minSize: Double, tags: js.Array[_]): TagCloudProps = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagCloudProps]
  }
  @scala.inline
  implicit class TagCloudPropsOps[Self <: TagCloudProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColorOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableRandomColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRandomColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableRandomColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRandomColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withShuffle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShuffle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(js.undefined)
        ret
    }
  }
  
}

