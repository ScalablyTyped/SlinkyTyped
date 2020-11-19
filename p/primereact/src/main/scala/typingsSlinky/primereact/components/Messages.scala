package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.messagesMod.MessagesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Messages {
  
  @JSImport("primereact/messages", "Messages")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactMessagesMod.Messages] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* message */ typingsSlinky.primereact.messagesMod.Message => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRemove(value: /* message */ typingsSlinky.primereact.messagesMod.Message => Unit): this.type = set("onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MessagesProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Messages.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
