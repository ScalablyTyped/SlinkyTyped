package typingsSlinky.checkError

import typingsSlinky.checkError.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("check-error", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def compatibleConstructor(thrown: js.Error, errorLike: ErrorInstanceOrConstructor): Boolean = js.native
  def compatibleInstance(thrown: js.Error, errorLike: js.Error): Boolean = js.native
  def compatibleMessage(thrown: String, errMatcher: String): Boolean = js.native
  def compatibleMessage(thrown: String, errMatcher: js.RegExp): Boolean = js.native
  def compatibleMessage(thrown: js.Error, errMatcher: String): Boolean = js.native
  def compatibleMessage(thrown: js.Error, errMatcher: js.RegExp): Boolean = js.native
  def getConstructorName(errorLike: ErrorInstanceOrConstructor): String = js.native
  def getMessage(err: String): String = js.native
  def getMessage(err: js.Error): String = js.native
  type ErrorInstanceOrConstructor = js.Error | Instantiable | (js.Function1[/* repeated */ js.Any, js.Error])
}

