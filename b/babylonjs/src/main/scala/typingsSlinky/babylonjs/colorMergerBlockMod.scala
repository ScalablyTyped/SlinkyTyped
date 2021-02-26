package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMergerBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/colorMergerBlock", "ColorMergerBlock")
  @js.native
  class ColorMergerBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new ColorMergerBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the a component (input)
      */
    def a: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the b component (input)
      */
    def b: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the g component (input)
      */
    def g: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the r component (input)
      */
    def r: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgb component (output)
      * @deprecated Please use rgbOut instead.
      */
    def rgb: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgb component (input)
      */
    def rgbIn: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgb component (output)
      */
    def rgbOut: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgba component (output)
      */
    def rgba: NodeMaterialConnectionPoint = js.native
  }
}
