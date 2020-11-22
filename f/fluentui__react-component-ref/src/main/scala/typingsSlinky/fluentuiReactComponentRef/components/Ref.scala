package typingsSlinky.fluentuiReactComponentRef.components

import typingsSlinky.fluentuiReactComponentRef.utilsMod.RefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ref {
  
  @JSImport("@fluentui/react-component-ref", "Ref")
  @js.native
  object component extends js.Object
  
  def withProps(p: RefProps): SharedBuilder_RefProps762588771[js.Object] = new SharedBuilder_RefProps762588771[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Ref.type): SharedBuilder_RefProps762588771[js.Object] = new SharedBuilder_RefProps762588771[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
