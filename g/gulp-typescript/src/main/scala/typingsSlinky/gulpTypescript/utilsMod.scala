package typingsSlinky.gulpTypescript

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.gulpTypescript.anon.Typeofts
import typingsSlinky.gulpTypescript.inputMod.File
import typingsSlinky.gulpTypescript.reporterMod.TypeScriptError
import typingsSlinky.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gulp-typescript/release/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def deprecate(title: String, alternative: String): Unit = js.native
  def deprecate(title: String, alternative: String, description: String): Unit = js.native
  
  def forwardSlashes(fileName: String): String = js.native
  
  def getCommonBasePath(a: String, b: String): String = js.native
  
  def getCommonBasePathOfArray(paths: js.Array[String]): String = js.native
  
  def getError(info: Diagnostic, typescript: Typeofts): TypeScriptError = js.native
  def getError(info: Diagnostic, typescript: Typeofts, file: File): TypeScriptError = js.native
  
  def message(title: String, alternative: String): Unit = js.native
  def message(title: String, alternative: String, description: String): Unit = js.native
  
  def normalizePath(caseSensitive: Boolean, pathString: String): String = js.native
  
  def splitExtension(fileName: String): js.Tuple2[String, String] = js.native
  def splitExtension(fileName: String, knownExtensions: js.Array[String]): js.Tuple2[String, String] = js.native
  
  type Map[T] = StringDictionary[T]
}
