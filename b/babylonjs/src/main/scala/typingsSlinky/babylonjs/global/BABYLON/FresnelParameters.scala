package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IFresnelParametersCreationOptions
import typingsSlinky.babylonjs.BABYLON.IFresnelParametersSerialized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FresnelParameters")
@js.native
/**
  * Creates a new FresnelParameters object.
  *
  * @param options provide your own settings to optionally to override defaults
  */
class FresnelParameters ()
  extends typingsSlinky.babylonjs.BABYLON.FresnelParameters {
  def this(options: IFresnelParametersCreationOptions) = this()
}
/* static members */
@JSGlobal("BABYLON.FresnelParameters")
@js.native
object FresnelParameters extends js.Object {
  
  /**
    * Parse a JSON object and deserialize it to a new Fresnel parameter object.
    * @param parsedFresnelParameters Define the JSON representation
    * @returns the parsed parameters
    */
  def Parse(parsedFresnelParameters: IFresnelParametersSerialized): typingsSlinky.babylonjs.BABYLON.FresnelParameters = js.native
}
