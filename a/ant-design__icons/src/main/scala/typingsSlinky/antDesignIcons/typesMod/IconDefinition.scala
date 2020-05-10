package typingsSlinky.antDesignIcons.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconDefinition extends js.Object {
  var icon: (js.Function2[/* primaryColor */ String, /* secondaryColor */ String, AbstractNode]) | AbstractNode = js.native
  var name: String = js.native
  var theme: ThemeType = js.native
}

object IconDefinition {
  @scala.inline
  def apply(
    icon: (js.Function2[/* primaryColor */ String, /* secondaryColor */ String, AbstractNode]) | AbstractNode,
    name: String,
    theme: ThemeType
  ): IconDefinition = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconDefinition]
  }
  @scala.inline
  implicit class IconDefinitionOps[Self <: IconDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconFunction2(value: (/* primaryColor */ String, /* secondaryColor */ String) => AbstractNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIcon(
      value: (js.Function2[/* primaryColor */ String, /* secondaryColor */ String, AbstractNode]) | AbstractNode
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: ThemeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

