package typingsSlinky.reactAlbus.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactAlbus.mod.WizardContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WithWizard {
  object Children {
    @JSImport("react-albus", "WithWizard")
    @js.native
    object component extends js.Object
    
    def withProps(p: typingsSlinky.reactAlbus.anon.Children): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(children: WizardContext => ReactElement): Default[tag.type, js.Object] = {
        val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactAlbus.anon.Children]))
    }
  }
  
  object Render {
    @JSImport("react-albus", "WithWizard")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def render(value: /* wizard */ WizardContext => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
    }
    
    def withProps(p: typingsSlinky.reactAlbus.anon.Render): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Render.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

