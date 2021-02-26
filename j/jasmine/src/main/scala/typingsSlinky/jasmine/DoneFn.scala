package typingsSlinky.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Action method that should be called when the async work is complete.
  */
@js.native
trait DoneFn
  extends js.Function {
  
  def apply(): Unit = js.native
  
  /** fails the spec and indicates that it has completed. If the message is an Error, Error.message is used */
  def fail(): Unit = js.native
  def fail(message: String): Unit = js.native
  def fail(message: js.Error): Unit = js.native
}
