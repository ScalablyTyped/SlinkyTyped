package typingsSlinky.ckeditor.CKEDITOR.plugins.balloontoolbar

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.dom.elementPath
import typingsSlinky.ckeditor.CKEDITOR.dom.selection
import typingsSlinky.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait contextDefinition extends js.Object {
  var cssSelector: js.UndefOr[String] = js.native
  var priority: js.UndefOr[Double] = js.native
  var refresh: js.UndefOr[
    js.Function3[/* editor */ editor, /* path */ elementPath, /* selection */ selection, element]
  ] = js.native
  var widgets: js.UndefOr[js.Array[String] | String] = js.native
}

object contextDefinition {
  @scala.inline
  def apply(): contextDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[contextDefinition]
  }
  @scala.inline
  implicit class contextDefinitionOps[Self <: contextDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh(value: (/* editor */ editor, /* path */ elementPath, /* selection */ selection) => element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.undefined)
        ret
    }
    @scala.inline
    def withWidgets(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidgets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(js.undefined)
        ret
    }
  }
  
}

