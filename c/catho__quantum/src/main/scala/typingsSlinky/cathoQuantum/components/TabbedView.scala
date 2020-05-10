package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.AnonComponentsSpacing
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.tabbedViewMod.TabbedViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabbedView {
  @JSImport("@catho/quantum/TabbedView", "TabbedView")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.cathoQuantum.tabbedViewMod.TabbedView] {
    @scala.inline
    def activeTab(value: String): this.type = set("activeTab", value.asInstanceOf[js.Any])
    @scala.inline
    def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def skin(value: neutral | primary): this.type = set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: AnonComponentsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabbedViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabbedView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

