package typingsSlinky.micromodal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MicroModal controller
  */
@JSImport("micromodal", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Closes the active modal
    */
  def close(): Unit = js.native
  def close(targetModal: String): Unit = js.native
  
  /**
    * Binds click handlers to all modal triggers
    * @param config configuration options
    */
  def init(): Unit = js.native
  def init(config: MicroModalConfig): Unit = js.native
  
  /**
    * Shows a particular modal
    * @param targetModal The id of the modal to display
    * @param config configuration options
    */
  def show(targetModal: String): Unit = js.native
  def show(targetModal: String, config: MicroModalConfig): Unit = js.native
}
