package typingsSlinky.gulpUglify.composerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.gulpUglify.anon.FnCall
import typingsSlinky.uglifyJs.mod.MinifyOptions
import typingsSlinky.uglifyJs.mod.MinifyOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uglify extends js.Object {
  
  def minify(files: String): MinifyOutput = js.native
  def minify(files: String, options: MinifyOptions): MinifyOutput = js.native
  def minify(files: js.Array[String]): MinifyOutput = js.native
  def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
  def minify(files: StringDictionary[String]): MinifyOutput = js.native
  def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
  @JSName("minify")
  var minify_Original: FnCall = js.native
}
