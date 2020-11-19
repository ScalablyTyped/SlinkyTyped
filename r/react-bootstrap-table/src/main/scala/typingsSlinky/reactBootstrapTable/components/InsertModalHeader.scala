package typingsSlinky.reactBootstrapTable.components

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTable.mod.BootstrapVersion
import typingsSlinky.reactBootstrapTable.mod.InsertModalHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InsertModalHeader {
  
  @JSImport("react-bootstrap-table", "InsertModalHeader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrapTable.mod.InsertModalHeader] {
    
    @scala.inline
    def beforeClose(value: /* e */ SyntheticEvent[Event, _] => Unit): this.type = set("beforeClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideClose(value: Boolean): this.type = set("hideClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onModalClose(value: /* closeModal */ js.Function0[Unit] => Unit): this.type = set("onModalClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def version(value: BootstrapVersion): this.type = set("version", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InsertModalHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: InsertModalHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
