package typingsSlinky.reactAlbus.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactAlbus.mod.WizardContext
import typingsSlinky.reactAlbus.mod.WizardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wizard {
  
  @JSImport("react-albus", "Wizard")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def basename(value: String): this.type = set("basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def history(value: History[LocationState]): this.type = set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onNext(value: /* wizard */ WizardContext => Unit): this.type = set("onNext", js.Any.fromFunction1(value))
    
    @scala.inline
    def render(value: /* wizard */ WizardContext => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: Wizard.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WizardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
