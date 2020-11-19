package typingsSlinky.jupyterlabObservables.observablejsonMod

import typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap
import typingsSlinky.luminoCoreutils.jsonMod.PartialJSONObject
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservableJSON
  extends IObservableMap[js.UndefOr[ReadonlyPartialJSONValue]] {
  
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): PartialJSONObject = js.native
}
@JSImport("@jupyterlab/observables/lib/observablejson", "IObservableJSON")
@js.native
object IObservableJSON extends js.Object {
  
  /**
    * A type alias for observable JSON changed args.
    */
  type IChangedArgs = typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs[ReadonlyPartialJSONValue]
}
