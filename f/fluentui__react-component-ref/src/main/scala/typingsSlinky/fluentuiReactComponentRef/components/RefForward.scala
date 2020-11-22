package typingsSlinky.fluentuiReactComponentRef.components

import typingsSlinky.fluentuiReactComponentRef.utilsMod.RefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RefForward {
  
  @JSImport("@fluentui/react-component-ref", "RefForward")
  @js.native
  object component extends js.Object
  
  def withProps(p: RefProps): SharedBuilder_RefProps762588771[typingsSlinky.fluentuiReactComponentRef.mod.RefForward] = new SharedBuilder_RefProps762588771[typingsSlinky.fluentuiReactComponentRef.mod.RefForward](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RefForward.type): SharedBuilder_RefProps762588771[typingsSlinky.fluentuiReactComponentRef.mod.RefForward] = new SharedBuilder_RefProps762588771[typingsSlinky.fluentuiReactComponentRef.mod.RefForward](js.Array(this.component, js.Dictionary.empty))()
}
