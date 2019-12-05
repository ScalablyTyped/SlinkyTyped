package typingsSlinky.atJupyterlabObservables.libObservablejsonMod

import typingsSlinky.atJupyterlabObservables.libObservablemapMod.IObservableMap
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONObject
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableJSON extends IObservableMap[JSONValue] {
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): JSONObject
}

@JSImport("@jupyterlab/observables/lib/observablejson", "IObservableJSON")
@js.native
object IObservableJSON extends js.Object {
  /**
    * A type alias for observable JSON changed args.
    */
  type IChangedArgs = typingsSlinky.atJupyterlabObservables.libObservablemapMod.IObservableMap.IChangedArgs[JSONValue]
}

