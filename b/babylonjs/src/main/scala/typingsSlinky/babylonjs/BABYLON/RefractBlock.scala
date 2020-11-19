package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefractBlock extends NodeMaterialBlock {
  
  /**
    * Gets the incident component
    */
  def incident: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the index of refraction component
    */
  def ior: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the normal component
    */
  def normal: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
}
