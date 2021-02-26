package typingsSlinky.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsxEmit extends StObject
@JSImport("monaco-editor", "languages.typescript.JsxEmit")
@js.native
object JsxEmit extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxEmit with Double] = js.native
  
  @js.native
  sealed trait None extends JsxEmit
  /* 0 */ val None: typingsSlinky.monacoEditor.mod.languages.typescript.JsxEmit.None with Double = js.native
  
  @js.native
  sealed trait Preserve extends JsxEmit
  /* 1 */ val Preserve: typingsSlinky.monacoEditor.mod.languages.typescript.JsxEmit.Preserve with Double = js.native
  
  @js.native
  sealed trait React extends JsxEmit
  /* 2 */ val React: typingsSlinky.monacoEditor.mod.languages.typescript.JsxEmit.React with Double = js.native
  
  @js.native
  sealed trait ReactNative extends JsxEmit
  /* 3 */ val ReactNative: typingsSlinky.monacoEditor.mod.languages.typescript.JsxEmit.ReactNative with Double = js.native
}
