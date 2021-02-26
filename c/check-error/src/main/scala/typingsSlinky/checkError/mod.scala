package typingsSlinky.checkError

import typingsSlinky.checkError.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("check-error", "compatibleConstructor")
  @js.native
  def compatibleConstructor(thrown: js.Error, errorLike: ErrorInstanceOrConstructor): Boolean = js.native
  
  @JSImport("check-error", "compatibleInstance")
  @js.native
  def compatibleInstance(thrown: js.Error, errorLike: js.Error): Boolean = js.native
  
  @JSImport("check-error", "compatibleMessage")
  @js.native
  def compatibleMessage(thrown: String, errMatcher: String): Boolean = js.native
  @JSImport("check-error", "compatibleMessage")
  @js.native
  def compatibleMessage(thrown: String, errMatcher: js.RegExp): Boolean = js.native
  @JSImport("check-error", "compatibleMessage")
  @js.native
  def compatibleMessage(thrown: js.Error, errMatcher: String): Boolean = js.native
  @JSImport("check-error", "compatibleMessage")
  @js.native
  def compatibleMessage(thrown: js.Error, errMatcher: js.RegExp): Boolean = js.native
  
  @JSImport("check-error", "getConstructorName")
  @js.native
  def getConstructorName(errorLike: ErrorInstanceOrConstructor): String = js.native
  
  @JSImport("check-error", "getMessage")
  @js.native
  def getMessage(err: String): String = js.native
  @JSImport("check-error", "getMessage")
  @js.native
  def getMessage(err: js.Error): String = js.native
  
  type ErrorInstanceOrConstructor = js.Error | Instantiable | (js.Function1[/* repeated */ js.Any, js.Error])
}
