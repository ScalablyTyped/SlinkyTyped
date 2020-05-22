package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.EventSyntheticEvent
import typingsSlinky.baseui.sideNavigationMod.Item
import typingsSlinky.baseui.sideNavigationMod.NavigationOverrides
import typingsSlinky.baseui.sideNavigationMod.NavigationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Navigation {
  @JSImport("baseui/side-navigation", "Navigation")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.sideNavigationMod.Navigation] {
    @scala.inline
    def activePredicate(value: (/* item */ js.Any, /* activeItemId */ String) => Boolean): this.type = set("activePredicate", js.Any.fromFunction2(value))
    @scala.inline
    def items(value: js.Array[Item]): this.type = set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def mapItem(value: /* item */ Item => Item): this.type = set("mapItem", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: /* args */ EventSyntheticEvent => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: NavigationOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NavigationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(activeItemId: String): Builder = {
    val __props = js.Dynamic.literal(activeItemId = activeItemId.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NavigationProps]))
  }
}

