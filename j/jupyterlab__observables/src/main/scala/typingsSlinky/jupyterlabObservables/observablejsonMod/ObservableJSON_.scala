package typingsSlinky.jupyterlabObservables.observablejsonMod

import typingsSlinky.jupyterlabObservables.observablejsonMod.ObservableJSON.IOptions
import typingsSlinky.jupyterlabObservables.observablemapMod.ObservableMap
import typingsSlinky.luminoCoreutils.jsonMod.PartialJSONObject
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/observables/lib/observablejson", "ObservableJSON")
@js.native
/**
  * Construct a new observable JSON object.
  */
class ObservableJSON_ () extends ObservableMap[ReadonlyPartialJSONValue] {
  def this(options: IOptions) = this()
  
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): PartialJSONObject = js.native
}
