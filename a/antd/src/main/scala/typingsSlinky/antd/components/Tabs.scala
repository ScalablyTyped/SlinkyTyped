package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdStrings.add
import typingsSlinky.antd.antdStrings.remove
import typingsSlinky.antd.sizeContextMod.SizeType
import typingsSlinky.antd.tabsMod.TabsProps
import typingsSlinky.antd.tabsMod.TabsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs {
  @JSImport("antd/lib/tabs", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def addIconReactElement(value: ReactElement): this.type = set("addIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def addIcon(value: ReactElement): this.type = set("addIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def hideAdd(value: Boolean): this.type = set("hideAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def onEdit(
      value: (/* e */ SyntheticMouseEvent[org.scalajs.dom.raw.Element] | SyntheticKeyboardEvent[org.scalajs.dom.raw.Element] | String, /* action */ add | remove) => Unit
    ): this.type = set("onEdit", js.Any.fromFunction2(value))
    @scala.inline
    def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: TabsType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

