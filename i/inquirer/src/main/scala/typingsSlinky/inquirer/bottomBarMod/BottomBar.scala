package typingsSlinky.inquirer.bottomBarMod

import typingsSlinky.through.mod.ThroughStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the bottom-bar UI.
  */
@js.native
trait BottomBar
  extends typingsSlinky.inquirer.baseUIMod.^ {
  
  /**
    * Clean the bottom bar.
    */
  /* protected */ def clean(): this.type = js.native
  
  /**
    * Fixes the new-line characters of the specified `text`.
    *
    * @param text
    * The text to process.
    */
  /* protected */ def enforceLF(text: String): String = js.native
  
  /**
    * Gets or sets a stream to write logs to.
    */
  var log: ThroughStream = js.native
  
  /**
    * Renders the bottom bar.
    */
  /* protected */ def render(): this.type = js.native
  
  /**
    * Renders the specified `text` to the bottom bar.
    *
    * @param text
    * The text to print to the bottom bar.
    */
  def updateBottomBar(text: String): this.type = js.native
  
  /**
    * Writes a message to the bottom bar.
    *
    * @param message
    * The message to write.
    */
  /* protected */ def write(message: String): Unit = js.native
  
  /**
    * Writes the specified `data` to the log-zone.
    *
    * @param data
    * The data to write to the log-zone.
    */
  /* protected */ def writeLog(data: js.Any): this.type = js.native
}
