package typingsSlinky.antd.components

import typingsSlinky.antd.errorBoundaryMod.ErrorBoundaryProps
import typingsSlinky.antd.errorBoundaryMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ErrorBoundary {
  @JSImport("antd/lib/alert/ErrorBoundary", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ErrorBoundaryProps): SharedBuilder_ErrorBoundaryProps_1809267820[default] = new SharedBuilder_ErrorBoundaryProps_1809267820[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ErrorBoundary.type): SharedBuilder_ErrorBoundaryProps_1809267820[default] = new SharedBuilder_ErrorBoundaryProps_1809267820[default](js.Array(this.component, js.Dictionary.empty))()
}

