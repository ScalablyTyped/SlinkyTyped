package typingsSlinky.reactTabsRedux.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTabsRedux.tabLinkMod.TabLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabLink {
  @JSImport("react-tabs-redux", "TabLink")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactTabsRedux.mod.TabLink] {
    @scala.inline
    def activeClassName(value: String): this.type = set("activeClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def activeStyle(value: js.Object): this.type = set("activeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def default(value: Boolean): this.type = set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def disableInlineStyles(value: Boolean): this.type = set("disableInlineStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def handleSelect(value: (/* tab */ String, /* name */ String) => Unit): this.type = set("handleSelect", js.Any.fromFunction2(value))
    @scala.inline
    def isActive(value: Boolean): this.type = set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def namespace(value: String): this.type = set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* event */ Event => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabLinkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(to: Double | String): Builder = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabLinkProps]))
  }
}

