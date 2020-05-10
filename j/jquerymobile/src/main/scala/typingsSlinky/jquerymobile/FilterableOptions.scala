package typingsSlinky.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableOptions extends js.Object {
  var children: js.UndefOr[js.Any] = js.native
  var defaults: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var enhanced: js.UndefOr[Boolean] = js.native
  var filterCallback: js.UndefOr[js.Function2[/* index */ Double, /* searchValue */ js.UndefOr[String], Boolean]] = js.native
  var filterPlaceholder: js.UndefOr[String] = js.native
  var filterReveal: js.UndefOr[Boolean] = js.native
  var filterTheme: js.UndefOr[String] = js.native
  var input: js.Any = js.native
}

object FilterableOptions {
  @scala.inline
  def apply(input: js.Any): FilterableOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterableOptions]
  }
  @scala.inline
  implicit class FilterableOptionsOps[Self <: FilterableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnhanced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhanced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhanced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhanced")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterCallback(value: (/* index */ Double, /* searchValue */ js.UndefOr[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterReveal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterReveal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterReveal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterReveal")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTheme")(js.undefined)
        ret
    }
  }
  
}

