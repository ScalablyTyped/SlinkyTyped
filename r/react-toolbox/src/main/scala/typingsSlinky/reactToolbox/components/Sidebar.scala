package typingsSlinky.reactToolbox.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactToolbox.reactToolboxStrings.left
import typingsSlinky.reactToolbox.reactToolboxStrings.lg
import typingsSlinky.reactToolbox.reactToolboxStrings.lgTablet
import typingsSlinky.reactToolbox.reactToolboxStrings.md
import typingsSlinky.reactToolbox.reactToolboxStrings.right
import typingsSlinky.reactToolbox.reactToolboxStrings.sm
import typingsSlinky.reactToolbox.reactToolboxStrings.smTablet
import typingsSlinky.reactToolbox.reactToolboxStrings.xl
import typingsSlinky.reactToolbox.reactToolboxStrings.xxl
import typingsSlinky.reactToolbox.reactToolboxStrings.xxxl
import typingsSlinky.reactToolbox.sidebarMod.SidebarProps
import typingsSlinky.reactToolbox.sidebarMod.SidebarTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sidebar {
  @JSImport("react-toolbox/components/layout", "Sidebar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactToolbox.layoutMod.Sidebar] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def clipped(value: Boolean): this.type = set("clipped", value.asInstanceOf[js.Any])
    @scala.inline
    def insideTree(value: Boolean): this.type = set("insideTree", value.asInstanceOf[js.Any])
    @scala.inline
    def onOverlayClick(value: js.Function): this.type = set("onOverlayClick", value.asInstanceOf[js.Any])
    @scala.inline
    def permanentAt(value: sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl): this.type = set("permanentAt", value.asInstanceOf[js.Any])
    @scala.inline
    def pinned(value: Boolean): this.type = set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: SidebarTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: left | right): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def withOverlay(value: Boolean): this.type = set("withOverlay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SidebarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Sidebar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

