package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Source
import typingsSlinky.primereact.anon.Value
import typingsSlinky.primereact.pickListMod.PickListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickList {
  
  @JSImport("primereact/picklist", "PickList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactPicklistMod.PickList] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemTemplate(value: /* item */ js.Any => js.UndefOr[ReactElement]): this.type = set("itemTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def metaKeySelection(value: Boolean): this.type = set("metaKeySelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* e */ Source => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveAllToSource(value: /* e */ Value => Unit): this.type = set("onMoveAllToSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveAllToTarget(value: /* e */ Value => Unit): this.type = set("onMoveAllToTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveToSource(value: /* e */ Value => Unit): this.type = set("onMoveToSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveToTarget(value: /* e */ Value => Unit): this.type = set("onMoveToTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSourceSelect(value: /* e */ Value => Unit): this.type = set("onSourceSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTargetSelect(value: /* e */ Value => Unit): this.type = set("onTargetSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSourceControls(value: Boolean): this.type = set("showSourceControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTargetControls(value: Boolean): this.type = set("showTargetControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sourceVarargs(value: js.Any*): this.type = set("source", js.Array(value :_*))
    
    @scala.inline
    def source(value: js.Array[_]): this.type = set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sourceHeader(value: js.Any): this.type = set("sourceHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sourceStyle(value: js.Object): this.type = set("sourceStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetVarargs(value: js.Any*): this.type = set("target", js.Array(value :_*))
    
    @scala.inline
    def target(value: js.Array[_]): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetHeader(value: js.Any): this.type = set("targetHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetStyle(value: js.Object): this.type = set("targetStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PickList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
