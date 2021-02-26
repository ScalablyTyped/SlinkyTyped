package typingsSlinky.antd.components

import typingsSlinky.antd.errorBoundaryMod.ErrorBoundaryProps
import typingsSlinky.antd.errorBoundaryMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorBoundary {
  
  @JSImport("antd/lib/alert/ErrorBoundary", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ErrorBoundary.type): SharedBuilder_ErrorBoundaryProps_1809267820[default] = new SharedBuilder_ErrorBoundaryProps_1809267820[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ErrorBoundaryProps): SharedBuilder_ErrorBoundaryProps_1809267820[default] = new SharedBuilder_ErrorBoundaryProps_1809267820[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
