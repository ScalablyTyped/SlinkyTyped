package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.mathColorMod.Color3
import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import typingsSlinky.babylonjs.observableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gradientBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/gradientBlock", "GradientBlock")
  @js.native
  class GradientBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new GradientBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    var _writeColorConstant: js.Any = js.native
    
    /**
      * Gets or sets the list of color steps
      */
    var colorSteps: js.Array[GradientBlockColorStep] = js.native
    
    /** calls observable when the value is changed*/
    def colorStepsUpdated(): Unit = js.native
    
    /**
      * Gets the gradient input component
      */
    def gradient: NodeMaterialConnectionPoint = js.native
    
    /** Gets an observable raised when the value is changed */
    var onValueChangedObservable: Observable[GradientBlock] = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
  
  @JSImport("babylonjs/Materials/Node/Blocks/gradientBlock", "GradientBlockColorStep")
  @js.native
  class GradientBlockColorStep protected () extends StObject {
    /**
      * Creates a new GradientBlockColorStep
      * @param step defines a value indicating which step this color is associated with (between 0 and 1)
      * @param color defines the color associated with this step
      */
    def this(step: Double, color: Color3) = this()
    
    var _color: js.Any = js.native
    
    var _step: js.Any = js.native
    
    /**
      * Gets the color associated with this step
      */
    def color: Color3 = js.native
    /**
      * Sets the color associated with this step
      */
    def color_=(`val`: Color3): Unit = js.native
    
    /**
      * Gets value indicating which step this color is associated with (between 0 and 1)
      */
    def step: Double = js.native
    /**
      * Sets a value indicating which step this color is associated with (between 0 and 1)
      */
    def step_=(`val`: Double): Unit = js.native
  }
}
