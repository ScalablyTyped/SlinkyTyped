package typingsSlinky.reactAlbus.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactAlbus.mod.WithWizard_
import typingsSlinky.reactAlbus.mod.WizardContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WithWizard {
  object AnonChildren {
    @JSImport("react-albus", "WithWizard")
    @js.native
    object component extends js.Object
    
    def withProps(p: typingsSlinky.reactAlbus.AnonChildren): Default[tag.type, WithWizard_] = new Default[tag.type, WithWizard_](js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: AnonChildren.type): Default[tag.type, WithWizard_] = new Default[tag.type, WithWizard_](js.Array(this.component, js.Dictionary.empty))()
  }
  
  object AnonRender {
    @JSImport("react-albus", "WithWizard")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, WithWizard_] {
      @scala.inline
      def render(value: /* wizard */ WizardContext => TagMod[Any]): this.type = set("render", js.Any.fromFunction1(value))
    }
    
    def withProps(p: typingsSlinky.reactAlbus.AnonRender): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: AnonRender.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

