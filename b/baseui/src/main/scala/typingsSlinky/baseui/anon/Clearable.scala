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
trait Clearable extends js.Object {
  @JSName("$clearable")
  var $clearable: Boolean = js.native
  @JSName("$creatable")
  var $creatable: Boolean = js.native
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  @JSName("$error")
  var $error: Boolean = js.native
  @JSName("$isFocused")
  var $isFocused: Boolean = js.native
  @JSName("$isLoading")
  var $isLoading: Boolean = js.native
  @JSName("$isOpen")
  var $isOpen: Boolean = js.native
  @JSName("$isPseudoFocused")
  var $isPseudoFocused: Boolean = js.native
  @JSName("$multi")
  var $multi: Boolean = js.native
  @JSName("$positive")
  var $positive: Boolean = js.native
  @JSName("$required")
  var $required: Boolean = js.native
  @JSName("$searchable")
  var $searchable: Boolean = js.native
  @JSName("$size")
  var $size: mini | default_ | compact | large_ = js.native
  @JSName("$type")
  var $type: select | search = js.native
}

object Clearable {
  @scala.inline
  def apply(
    $clearable: Boolean,
    $creatable: Boolean,
    $disabled: Boolean,
    $error: Boolean,
    $isFocused: Boolean,
    $isLoading: Boolean,
    $isOpen: Boolean,
    $isPseudoFocused: Boolean,
    $multi: Boolean,
    $positive: Boolean,
    $required: Boolean,
    $searchable: Boolean,
    $size: mini | default_ | compact | large_,
    $type: select | search
  ): Clearable = {
    val __obj = js.Dynamic.literal($clearable = $clearable.asInstanceOf[js.Any], $creatable = $creatable.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $error = $error.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any], $isLoading = $isLoading.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $isPseudoFocused = $isPseudoFocused.asInstanceOf[js.Any], $multi = $multi.asInstanceOf[js.Any], $positive = $positive.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $searchable = $searchable.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clearable]
  }
  @scala.inline
  implicit class ClearableOps[Self <: Clearable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$clearable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$clearable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$creatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$creatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$disabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$error(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isPseudoFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isPseudoFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$multi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$positive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$positive")(value.asInstanceOf[js.Any])
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
  }
  
}

