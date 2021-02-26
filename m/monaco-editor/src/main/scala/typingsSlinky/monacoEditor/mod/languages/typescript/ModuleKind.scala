package typingsSlinky.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleKind extends StObject
@JSImport("monaco-editor", "languages.typescript.ModuleKind")
@js.native
object ModuleKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleKind with Double] = js.native
  
  @js.native
  sealed trait AMD extends ModuleKind
  /* 2 */ val AMD: typingsSlinky.monacoEditor.mod.languages.typescript.ModuleKind.AMD with Double = js.native
  
  @js.native
  sealed trait CommonJS extends ModuleKind
  /* 1 */ val CommonJS: typingsSlinky.monacoEditor.mod.languages.typescript.ModuleKind.CommonJS with Double = js.native
  
  @js.native
  sealed trait ES2015 extends ModuleKind
  /* 5 */ val ES2015: typingsSlinky.monacoEditor.mod.languages.typescript.ModuleKind.ES2015 with Double = js.native
  
  @js.native
  sealed trait ESNext extends ModuleKind
  /* 99 */ val ESNext: typingsSlinky.monacoEditor.mod.languages.typescript.ModuleKind.ESNext with Double = js.native
  
  @js.native
  sealed trait None extends ModuleKind
  /* 0 */ val None: typingsSlinky.monacoEditor.mod.languages.typescript.ModuleKind.None with Double = js.native
  
  @js.native
  sealed trait System extends ModuleKind
  /* 4 */ val System: typingsSlinky.monacoEditor.mod.languages.typescript.ModuleKind.System with Double = js.native
  
  @js.native
  sealed trait UMD extends ModuleKind
  /* 3 */ val UMD: typingsSlinky.monacoEditor.mod.languages.typescript.ModuleKind.UMD with Double = js.native
}
