package typingsSlinky.jupyterlabObservables.observablejsonMod

import typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableJSON extends IObservableMap[JSONValue] {
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): JSONObject = js.native
}

@JSImport("@jupyterlab/observables/lib/observablejson", "IObservableJSON")
@js.native
object IObservableJSON extends js.Object {
  /**
    * A type alias for observable JSON changed args.
    */
  type IChangedArgs = typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs[JSONValue]
}

