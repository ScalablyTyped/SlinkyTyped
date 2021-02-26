package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.lightMod.Light
import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightInformationBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Vertex/lightInformationBlock", "LightInformationBlock")
  @js.native
  class LightInformationBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new LightInformationBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    var _lightColorUniformName: js.Any = js.native
    
    var _lightDataUniformName: js.Any = js.native
    
    var _lightTypeDefineName: js.Any = js.native
    
    /**
      * Gets the direction output component
      */
    def color: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the direction output component
      */
    def direction: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the direction output component
      */
    def intensity: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets or sets the light associated with this block
      */
    var light: Nullable[Light] = js.native
    
    /**
      * Gets the world position input component
      */
    def worldPosition: NodeMaterialConnectionPoint = js.native
  }
}
