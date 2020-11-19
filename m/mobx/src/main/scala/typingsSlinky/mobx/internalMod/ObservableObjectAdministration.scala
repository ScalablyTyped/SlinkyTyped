package typingsSlinky.mobx.internalMod

import typingsSlinky.mobx.modifiersMod.IEnhancer
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "ObservableObjectAdministration")
@js.native
class ObservableObjectAdministration protected ()
  extends typingsSlinky.mobx.observableobjectMod.ObservableObjectAdministration {
  def this(
    target: js.Any,
    values: Map[String | Double | js.Symbol, ObservableValue[_] | ComputedValue[_]],
    name: String,
    defaultEnhancer: IEnhancer[_]
  ) = this()
}
