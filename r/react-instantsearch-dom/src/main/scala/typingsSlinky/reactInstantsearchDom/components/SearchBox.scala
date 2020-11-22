package typingsSlinky.reactInstantsearchDom.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.form.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInstantsearchDom.mod.SearchBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchBox {
  
  @JSImport("react-instantsearch-dom", "SearchBox")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactInstantsearchDom.mod.SearchBox] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultRefinement(value: String): this.type = set("defaultRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusShortcutsVarargs(value: String*): this.type = set("focusShortcuts", js.Array(value :_*))
    
    @scala.inline
    def focusShortcuts(value: js.Array[String]): this.type = set("focusShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingIndicator(value: ReactElement): this.type = set("loadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* event */ SyntheticEvent[Event, HTMLInputElement] => _): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReset(value: /* event */ SyntheticEvent[Event, HTMLFormElement] => _): this.type = set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSubmit(value: /* event */ SyntheticEvent[Event, HTMLFormElement] => _): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def reset(value: ReactElement): this.type = set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchAsYouType(value: Boolean): this.type = set("searchAsYouType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showLoadingIndicator(value: Boolean): this.type = set("showLoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def submit(value: ReactElement): this.type = set("submit", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SearchBoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SearchBox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
