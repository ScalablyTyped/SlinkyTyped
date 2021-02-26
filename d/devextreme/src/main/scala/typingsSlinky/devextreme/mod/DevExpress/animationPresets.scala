package typingsSlinky.devextreme.mod.DevExpress

import typingsSlinky.devextreme.anon.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait animationPresets extends StObject {
  
  /**
    * [descr:animationPresets.applyChanges()]
    */
  def applyChanges(): Unit = js.native
  
  /**
    * [descr:animationPresets.clear()]
    */
  def clear(): Unit = js.native
  /**
    * [descr:animationPresets.clear(name)]
    */
  def clear(name: String): Unit = js.native
  
  /**
    * [descr:animationPresets.getPreset(name)]
    */
  def getPreset(name: String): js.Any = js.native
  
  /**
    * [descr:animationPresets.registerDefaultPresets()]
    */
  def registerDefaultPresets(): Unit = js.native
  
  /**
    * [descr:animationPresets.registerPreset(name, config)]
    */
  def registerPreset(name: String, config: Animation): Unit = js.native
  
  /**
    * [descr:animationPresets.resetToDefaults()]
    */
  def resetToDefaults(): Unit = js.native
}
