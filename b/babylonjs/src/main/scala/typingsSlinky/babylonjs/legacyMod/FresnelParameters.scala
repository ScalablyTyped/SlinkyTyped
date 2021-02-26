package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.fresnelParametersMod.IFresnelParametersCreationOptions
import typingsSlinky.babylonjs.fresnelParametersMod.IFresnelParametersSerialized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "FresnelParameters")
@js.native
/**
  * Creates a new FresnelParameters object.
  *
  * @param options provide your own settings to optionally to override defaults
  */
class FresnelParameters ()
  extends typingsSlinky.babylonjs.indexMod.FresnelParameters {
  def this(options: IFresnelParametersCreationOptions) = this()
}
/* static members */
object FresnelParameters {
  
  /**
    * Parse a JSON object and deserialize it to a new Fresnel parameter object.
    * @param parsedFresnelParameters Define the JSON representation
    * @returns the parsed parameters
    */
  @JSImport("babylonjs/Legacy/legacy", "FresnelParameters.Parse")
  @js.native
  def Parse(parsedFresnelParameters: IFresnelParametersSerialized): typingsSlinky.babylonjs.fresnelParametersMod.FresnelParameters = js.native
}
