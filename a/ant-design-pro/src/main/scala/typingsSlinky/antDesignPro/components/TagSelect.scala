package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.AnonCollapseText
import typingsSlinky.antDesignPro.tagSelectMod.TagSelectProps
import typingsSlinky.antDesignPro.tagSelectMod.default
import typingsSlinky.antDesignPro.tagSelectOptionMod.TagSelectOptionProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TagSelect {
  @JSImport("ant-design-pro/lib/TagSelect", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def actionsText(value: AnonCollapseText): this.type = set("actionsText", value.asInstanceOf[js.Any])
    @scala.inline
    def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    @scala.inline
    def hideCheckAll(value: Boolean): this.type = set("hideCheckAll", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* value */ js.Array[String] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Array[Double | String]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TagSelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(Option: TagSelectOptionProps, className: String): Builder = {
    val __props = js.Dynamic.literal(Option = Option.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TagSelectProps]))
  }
}

