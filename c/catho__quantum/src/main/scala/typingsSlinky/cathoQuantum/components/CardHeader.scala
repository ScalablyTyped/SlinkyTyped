package typingsSlinky.cathoQuantum.components

import slinky.core.ReactComponentClass
import typingsSlinky.cathoQuantum.AnonThemeAnonSpacingObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardHeader {
  object ComponentClass {
    @JSImport("@catho/quantum/Card", "default.Header")
    @js.native
    object component extends js.Object
    
    def withProps(p: ReactComponentClass[AnonThemeAnonSpacingObject]): SharedBuilder_ComponentType_410571564 = new SharedBuilder_ComponentType_410571564(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: ComponentClass.type): SharedBuilder_ComponentType_410571564 = new SharedBuilder_ComponentType_410571564(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object FunctionComponent {
    @JSImport("@catho/quantum/Card", "default.Header")
    @js.native
    object component extends js.Object
    
    def withProps(p: ReactComponentClass[AnonThemeAnonSpacingObject]): SharedBuilder_ComponentType_410571564 = new SharedBuilder_ComponentType_410571564(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: FunctionComponent.type): SharedBuilder_ComponentType_410571564 = new SharedBuilder_ComponentType_410571564(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

