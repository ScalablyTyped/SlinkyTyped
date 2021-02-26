package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particleRampGradientBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Particle/particleRampGradientBlock", "ParticleRampGradientBlock")
  @js.native
  class ParticleRampGradientBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new ParticleRampGradientBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the color input component
      */
    def color: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rampColor output component
      */
    def rampColor: NodeMaterialConnectionPoint = js.native
  }
}
