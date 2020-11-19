package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStandaloneDiffEditor extends IDiffEditor {
  
  def addAction(descriptor: IActionDescriptor): IDisposable = js.native
  
  def addCommand(keybinding: Double, handler: ICommandHandler): String | Null = js.native
  def addCommand(keybinding: Double, handler: ICommandHandler, context: String): String | Null = js.native
  
  def createContextKey[T](key: String, defaultValue: T): IContextKey[T] = js.native
}
