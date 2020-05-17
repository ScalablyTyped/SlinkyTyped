package typingsSlinky.cathoQuantum.components

import slinky.core.ReactComponentClass
import typingsSlinky.cathoQuantum.anon.ThemeSpacingObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardFooter {
  object ComponentClass {
    @JSImport("@catho/quantum/Card", "default.Footer")
    @js.native
    object component extends js.Object
    
    def withProps(p: ReactComponentClass[ThemeSpacingObject]): SharedBuilder_ComponentType467443597 = new SharedBuilder_ComponentType467443597(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: ComponentClass.type): SharedBuilder_ComponentType467443597 = new SharedBuilder_ComponentType467443597(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object FunctionComponent {
    @JSImport("@catho/quantum/Card", "default.Footer")
    @js.native
    object component extends js.Object
    
    def withProps(p: ReactComponentClass[ThemeSpacingObject]): SharedBuilder_ComponentType467443597 = new SharedBuilder_ComponentType467443597(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: FunctionComponent.type): SharedBuilder_ComponentType467443597 = new SharedBuilder_ComponentType467443597(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

