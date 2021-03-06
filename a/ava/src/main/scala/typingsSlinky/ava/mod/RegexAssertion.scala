package typingsSlinky.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexAssertion extends StObject {
  
  /** Assert that `string` matches the regular expression. */
  def apply(string: String, regex: js.RegExp): Unit = js.native
  def apply(string: String, regex: js.RegExp, message: String): Unit = js.native
  
  /** Skip this assertion. */
  def skip(string: String, regex: js.RegExp): Unit = js.native
  def skip(string: String, regex: js.RegExp, message: String): Unit = js.native
}
