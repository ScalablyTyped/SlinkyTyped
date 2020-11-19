package typingsSlinky.materialUiCore.components

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.anon.PartialClassNameMapGridLiActionIcon
import typingsSlinky.materialUiCore.gridListTileBarGridListTileBarMod.GridListTileBarProps
import typingsSlinky.materialUiCore.materialUiCoreStrings.bottom
import typingsSlinky.materialUiCore.materialUiCoreStrings.left
import typingsSlinky.materialUiCore.materialUiCoreStrings.right
import typingsSlinky.materialUiCore.materialUiCoreStrings.top
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridListTileBar {
  
  @JSImport("@material-ui/core", "GridListTileBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def actionIconReactElement(value: ReactElement): this.type = set("actionIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionIcon(value: ReactElement): this.type = set("actionIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionPosition(value: left | right): this.type = set("actionPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classes(value: PartialClassNameMapGridLiActionIcon): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefRefObject(value: ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def innerRef(value: Ref[_] | ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subtitleReactElement(value: ReactElement): this.type = set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subtitle(value: ReactElement): this.type = set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titlePosition(value: top | bottom): this.type = set("titlePosition", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GridListTileBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: GridListTileBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
