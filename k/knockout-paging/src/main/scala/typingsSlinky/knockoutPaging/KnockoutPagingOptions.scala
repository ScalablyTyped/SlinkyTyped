package typingsSlinky.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutPagingOptions extends js.Object {
  var defaults: KnockoutPagingDefaultOptions = js.native
  var generators: AnonDictname = js.native
}

object KnockoutPagingOptions {
  @scala.inline
  def apply(defaults: KnockoutPagingDefaultOptions, generators: AnonDictname): KnockoutPagingOptions = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], generators = generators.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutPagingOptions]
  }
  @scala.inline
  implicit class KnockoutPagingOptionsOps[Self <: KnockoutPagingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: KnockoutPagingDefaultOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerators(value: AnonDictname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generators")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

