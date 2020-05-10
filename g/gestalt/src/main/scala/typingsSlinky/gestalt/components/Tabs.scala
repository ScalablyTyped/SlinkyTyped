package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.AnonActiveTabIndex
import typingsSlinky.gestalt.AnonHref
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.mod.TabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs {
  @JSImport("gestalt", "Tabs")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Tabs] {
    @scala.inline
    def size(value: md | lg): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(activeTabIndex: Double, onChange: AnonActiveTabIndex => Unit, tabs: js.Array[AnonHref]): Builder = {
    val __props = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), tabs = tabs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabsProps]))
  }
}

