package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.fresnelParametersMod.IFresnelParametersCreationOptions
import typingsSlinky.babylonjs.fresnelParametersMod.IFresnelParametersSerialized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "FresnelParameters")
@js.native
/**
  * Creates a new FresnelParameters object.
  *
  * @param options provide your own settings to optionally to override defaults
  */
class FresnelParameters ()
  extends typingsSlinky.babylonjs.legacyMod.FresnelParameters {
  def this(options: IFresnelParametersCreationOptions) = this()
}
/* static members */
@JSImport("babylonjs", "FresnelParameters")
@js.native
object FresnelParameters extends js.Object {
  
  /**
    * Parse a JSON object and deserialize it to a new Fresnel parameter object.
    * @param parsedFresnelParameters Define the JSON representation
    * @returns the parsed parameters
    */
  def Parse(parsedFresnelParameters: IFresnelParametersSerialized): typingsSlinky.babylonjs.fresnelParametersMod.FresnelParameters = js.native
}
