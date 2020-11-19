package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseSubMesh extends js.Object {
  
  /** @hidden */
  var _materialDefines: Nullable[MaterialDefines] = js.native
  
  /** @hidden */
  var _materialEffect: Nullable[Effect] = js.native
  
  /**
    * Gets associated effect
    */
  def effect: Nullable[Effect] = js.native
  
  /**
    * Gets material defines used by the effect associated to the sub mesh
    */
  def materialDefines: Nullable[MaterialDefines] = js.native
  /**
    * Sets material defines used by the effect associated to the sub mesh
    */
  def materialDefines_=(defines: Nullable[MaterialDefines]): Unit = js.native
  
  /**
    * Sets associated effect (effect used to render this submesh)
    * @param effect defines the effect to associate with
    * @param defines defines the set of defines used to compile this effect
    */
  def setEffect(effect: Nullable[Effect]): Unit = js.native
  def setEffect(effect: Nullable[Effect], defines: Nullable[MaterialDefines]): Unit = js.native
}
