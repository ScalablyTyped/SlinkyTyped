package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.IndexItem
import typingsSlinky.primereact.menuItemMod.MenuItem
import typingsSlinky.primereact.stepsMod.StepsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Steps {
  
  @JSImport("primereact/steps", "Steps")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactStepsMod.Steps] {
    
    @scala.inline
    def activeIndex(value: Double): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSelect(value: /* e */ IndexItem => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(model: js.Array[MenuItem]): Builder = {
    val __props = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StepsProps]))
  }
}
