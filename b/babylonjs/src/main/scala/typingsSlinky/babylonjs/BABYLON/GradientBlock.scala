package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradientBlock extends NodeMaterialBlock {
  
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
