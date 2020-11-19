package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.mathColorMod.Color3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/fresnelParameters", JSImport.Namespace)
@js.native
object fresnelParametersMod extends js.Object {
  
  @js.native
  class FresnelParameters () extends js.Object {
    
    var _isEnabled: js.Any = js.native
    
    /**
      * Define bias applied to computed fresnel term
      */
    var bias: Double = js.native
    
    /**
      * Define if the fresnel effect is enable or not.
      */
    def isEnabled: Boolean = js.native
    def isEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Define the color used on edges (grazing angle)
      */
    var leftColor: Color3 = js.native
    
    /**
      * Defined the power exponent applied to fresnel term
      */
    var power: Double = js.native
    
    /**
      * Define the color used on center
      */
    var rightColor: Color3 = js.native
    
    /**
      * Serializes the current fresnel parameters to a JSON representation.
      * @return the JSON serialization
      */
    def serialize(): js.Any = js.native
  }
  /* static members */
  @js.native
  object FresnelParameters extends js.Object {
    
    /**
      * Parse a JSON object and deserialize it to a new Fresnel parameter object.
      * @param parsedFresnelParameters Define the JSON representation
      * @returns the parsed parameters
      */
    def Parse(parsedFresnelParameters: js.Any): FresnelParameters = js.native
  }
}
