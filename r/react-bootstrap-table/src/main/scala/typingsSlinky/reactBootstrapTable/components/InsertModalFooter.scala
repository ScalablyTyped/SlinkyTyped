package typingsSlinky.reactBootstrapTable.components

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTable.mod.InsertModalFooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InsertModalFooter {
  
  @JSImport("react-bootstrap-table", "InsertModalFooter")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrapTable.mod.InsertModalFooter] {
    
    @scala.inline
    def beforeClose(value: /* e */ SyntheticEvent[Event, _] => Unit): this.type = set("beforeClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def beforeSave(value: /* e */ SyntheticEvent[Event, _] => Unit): this.type = set("beforeSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeBtnClass(value: String): this.type = set("closeBtnClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeBtnContextual(value: String): this.type = set("closeBtnContextual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeBtnText(value: String): this.type = set("closeBtnText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onModalClose(value: /* closeModal */ js.Function0[Unit] => Unit): this.type = set("onModalClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSave(value: /* save */ js.Function0[Unit] => Unit): this.type = set("onSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def saveBtnClass(value: String): this.type = set("saveBtnClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def saveBtnContextual(value: String): this.type = set("saveBtnContextual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def saveBtnText(value: String): this.type = set("saveBtnText", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InsertModalFooterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: InsertModalFooter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
