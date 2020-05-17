package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.search
import typingsSlinky.baseui.baseuiStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  @JSName("$error")
  var $error: Boolean = js.native
  @JSName("$isLoading")
  var $isLoading: Boolean = js.native
  @JSName("$multi")
  var $multi: Boolean = js.native
  @JSName("$required")
  var $required: Boolean = js.native
  @JSName("$searchable")
  var $searchable: Boolean = js.native
  @JSName("$size")
  var $size: mini | default_ | compact | large_ = js.native
  @JSName("$type")
  var $type: select | search = js.native
  @JSName("$width")
  var $width: Double = js.native
}

object Error {
  @scala.inline
  def apply(
    $error: Boolean,
    $isLoading: Boolean,
    $multi: Boolean,
    $required: Boolean,
    $searchable: Boolean,
    $size: mini | default_ | compact | large_,
    $type: select | search,
    $width: Double
  ): Error = {
    val __obj = js.Dynamic.literal($error = $error.asInstanceOf[js.Any], $isLoading = $isLoading.asInstanceOf[js.Any], $multi = $multi.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $searchable = $searchable.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$error(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$multi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$required(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$searchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$size(value: mini | default_ | compact | large_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$type(value: select | search): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

