package typingsSlinky.handlebars.Handlebars

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.handlebars.HandlebarsTemplateDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvePartialOptions extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var decorators: js.UndefOr[StringDictionary[js.Function]] = js.native
  var helpers: js.UndefOr[StringDictionary[js.Function]] = js.native
  var name: String = js.native
  var partials: js.UndefOr[StringDictionary[HandlebarsTemplateDelegate[_]]] = js.native
}

object ResolvePartialOptions {
  @scala.inline
  def apply(name: String): ResolvePartialOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvePartialOptions]
  }
  @scala.inline
  implicit class ResolvePartialOptionsOps[Self <: ResolvePartialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDecorators(value: StringDictionary[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecorators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpers(value: StringDictionary[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(js.undefined)
        ret
    }
    @scala.inline
    def withPartials(value: StringDictionary[HandlebarsTemplateDelegate[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partials")(js.undefined)
        ret
    }
  }
  
}

