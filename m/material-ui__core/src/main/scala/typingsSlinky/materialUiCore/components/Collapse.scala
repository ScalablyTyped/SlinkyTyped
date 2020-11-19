package typingsSlinky.materialUiCore.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.anon.PartialClassNameMapCollap
import typingsSlinky.materialUiCore.collapseCollapseMod.CollapseProps
import typingsSlinky.materialUiCore.createMuiThemeMod.Theme
import typingsSlinky.materialUiCore.materialUiCoreStrings.auto
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactType
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapse {
  
  @JSImport("@material-ui/core", "Collapse")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def addEndListener(value: js.Any): this.type = set("addEndListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classes(value: PartialClassNameMapCollap): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsedHeight(value: String): this.type = set("collapsedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[CollapseProps]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[CollapseProps]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: ReactType[CollapseProps]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def in(value: js.Any): this.type = set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefRefObject(value: ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def innerRef(value: Ref[_] | ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    
    @scala.inline
    def mountOnEnter(value: js.Any): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEnter(value: js.Any): this.type = set("onEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEntered(value: js.Any): this.type = set("onEntered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEntering(value: js.Any): this.type = set("onEntering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onExit(value: js.Any): this.type = set("onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onExited(value: js.Any): this.type = set("onExited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onExiting(value: js.Any): this.type = set("onExiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeout(value: js.Any | auto): this.type = set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unmountOnExit(value: js.Any): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CollapseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Collapse.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
