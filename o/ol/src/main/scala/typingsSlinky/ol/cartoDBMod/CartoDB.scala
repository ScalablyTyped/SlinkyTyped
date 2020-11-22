package typingsSlinky.ol.cartoDBMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CartoDB
  extends typingsSlinky.ol.xyzMod.default {
  
  /**
    * Returns the current config.
    */
  def getConfig(): js.Any = js.native
  
  /**
    * Sets the CartoDB config
    */
  def setConfig(config: js.Any): Unit = js.native
  
  /**
    * Updates the carto db config.
    */
  def updateConfig(config: js.Any): Unit = js.native
}
