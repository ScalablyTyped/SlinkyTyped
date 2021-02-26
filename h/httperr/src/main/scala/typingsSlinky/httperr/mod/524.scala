package typingsSlinky.httperr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("httperr", "524")
@js.native
/**
  *  Creates an Error object. The new keyword is optional.
  * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
  *                                           If config is an Error object, it will be treated as config.cause.
  */
class `524` () extends HttpError {
  def this(config: String) = this()
  def this(config: js.Error) = this()
  def this(config: Config) = this()
}
