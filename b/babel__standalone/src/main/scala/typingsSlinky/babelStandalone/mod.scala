package typingsSlinky.babelStandalone

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCollection
import typingsSlinky.babelCore.mod.BabelFileResult
import typingsSlinky.babelCore.mod.FileResultCallback
import typingsSlinky.babelCore.mod.TransformOptions
import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/standalone", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val availablePlugins: Record[String, js.Object | js.Function0[Unit]] = js.native
  
  val availablePresets: Record[String, js.Object | js.Function0[Unit]] = js.native
  
  def disableScriptTags(): Unit = js.native
  
  def registerPlugin(name: String, plugin: js.Function0[Unit]): Unit = js.native
  def registerPlugin(name: String, plugin: js.Object): Unit = js.native
  
  def registerPlugins(newPlugins: StringDictionary[js.Object | js.Function0[Unit]]): Unit = js.native
  
  def registerPreset(name: String, preset: js.Function0[Unit]): Unit = js.native
  def registerPreset(name: String, preset: js.Object): Unit = js.native
  
  def registerPresets(newPresets: StringDictionary[js.Object | js.Function0[Unit]]): Unit = js.native
  
  def transform(code: String, options: TransformOptions): BabelFileResult = js.native
  
  def transformFromAst(ast: Node): Unit = js.native
  def transformFromAst(
    ast: Node,
    code: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAst(ast: Node, code: js.UndefOr[scala.Nothing], opts: TransformOptions): Unit = js.native
  def transformFromAst(ast: Node, code: js.UndefOr[scala.Nothing], opts: TransformOptions, callback: FileResultCallback): Unit = js.native
  def transformFromAst(ast: Node, code: String): Unit = js.native
  def transformFromAst(ast: Node, code: String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def transformFromAst(ast: Node, code: String, opts: TransformOptions): Unit = js.native
  def transformFromAst(ast: Node, code: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
  
  def transformScriptTags(): Unit = js.native
  def transformScriptTags(scriptTags: HTMLCollection): Unit = js.native
}
