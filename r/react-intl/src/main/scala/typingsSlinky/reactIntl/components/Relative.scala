package typingsSlinky.reactIntl.components

import typingsSlinky.reactIntl.componentsRelativeMod.Props
import typingsSlinky.reactIntl.componentsRelativeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Relative {
  
  @JSImport("react-intl/src/components/relative", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1583170838[default] = new SharedBuilder_Props1583170838[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Relative.type): SharedBuilder_Props1583170838[default] = new SharedBuilder_Props1583170838[default](js.Array(this.component, js.Dictionary.empty))()
}
