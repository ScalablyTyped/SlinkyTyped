package typingsSlinky.jupyterlabObservables.observablejsonMod

import typingsSlinky.jupyterlabObservables.observablejsonMod.ObservableJSON.IOptions
import typingsSlinky.jupyterlabObservables.observablemapMod.ObservableMap
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/observablejson", "ObservableJSON")
@js.native
/**
  * Construct a new observable JSON object.
  */
class ObservableJSON_ () extends ObservableMap[JSONValue] {
  def this(options: IOptions) = this()
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): JSONObject = js.native
}

