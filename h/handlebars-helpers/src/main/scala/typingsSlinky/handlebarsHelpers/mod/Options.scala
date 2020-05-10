package typingsSlinky.handlebarsHelpers.mod

import typingsSlinky.handlebarsHelpers.TypeofHandlebars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var handlebars: js.UndefOr[TypeofHandlebars] = js.native
  var hbs: js.UndefOr[TypeofHandlebars] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlebars(value: TypeofHandlebars): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlebars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlebars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlebars")(js.undefined)
        ret
    }
    @scala.inline
    def withHbs(value: TypeofHandlebars): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hbs")(js.undefined)
        ret
    }
  }
  
}

