package typingsSlinky.closureCompiler

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("closure-compiler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def compile(src: String, callback: Callback): Unit = js.native
  def compile(src: String, options: StringDictionary[String | js.Array[String]], callback: Callback): Unit = js.native
  
  type Callback = js.Function3[/* err */ js.Error, /* stdout */ String, /* stderr */ String, js.Any]
}
