package typingsSlinky.antd.components

import typingsSlinky.antd.errorBoundaryMod.ErrorBoundaryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AlertErrorBoundary {
  @JSImport("antd", "Alert.ErrorBoundary")
  @js.native
  object component extends js.Object
  
  def withProps(p: ErrorBoundaryProps): SharedBuilder_ErrorBoundaryProps_1809267820[typingsSlinky.antd.mod.Alert.ErrorBoundary] = new SharedBuilder_ErrorBoundaryProps_1809267820[typingsSlinky.antd.mod.Alert.ErrorBoundary](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AlertErrorBoundary.type): SharedBuilder_ErrorBoundaryProps_1809267820[typingsSlinky.antd.mod.Alert.ErrorBoundary] = new SharedBuilder_ErrorBoundaryProps_1809267820[typingsSlinky.antd.mod.Alert.ErrorBoundary](js.Array(this.component, js.Dictionary.empty))()
}

