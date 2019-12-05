package typingsSlinky.atJupyterlabObservables.libObservablejsonMod

import typingsSlinky.atJupyterlabObservables.libObservablejsonMod.ObservableJSON.IOptions
import typingsSlinky.atJupyterlabObservables.libObservablemapMod.ObservableMap
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONObject
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONValue
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

