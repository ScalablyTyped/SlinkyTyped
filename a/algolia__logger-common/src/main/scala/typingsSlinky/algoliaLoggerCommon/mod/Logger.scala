package typingsSlinky.algoliaLoggerCommon.mod

import typingsSlinky.algoliaLoggerCommon.anon.ReadonlyPromisevoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends js.Object {
  
  /**
    * Logs debug messages.
    */
  def debug(message: String): ReadonlyPromisevoid = js.native
  def debug(message: String, args: js.Any): ReadonlyPromisevoid = js.native
  
  /**
    * Logs error messages.
    */
  def error(message: String): ReadonlyPromisevoid = js.native
  def error(message: String, args: js.Any): ReadonlyPromisevoid = js.native
  
  /**
    * Logs info messages.
    */
  def info(message: String): ReadonlyPromisevoid = js.native
  def info(message: String, args: js.Any): ReadonlyPromisevoid = js.native
}
