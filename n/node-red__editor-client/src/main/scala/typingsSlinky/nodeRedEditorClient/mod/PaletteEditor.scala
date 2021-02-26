package typingsSlinky.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaletteEditor extends StObject {
  
  def init(): Unit = js.native
  
  def install(entry: js.Object, container: js.Object, done: js.Function1[/* ret */ js.Error | js.Object, Unit]): Unit = js.native
}
object PaletteEditor {
  
  @scala.inline
  def apply(
    init: () => Unit,
    install: (js.Object, js.Object, js.Function1[/* ret */ js.Error | js.Object, Unit]) => Unit
  ): PaletteEditor = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), install = js.Any.fromFunction3(install))
    __obj.asInstanceOf[PaletteEditor]
  }
  
  @scala.inline
  implicit class PaletteEditorMutableBuilder[Self <: PaletteEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstall(value: (js.Object, js.Object, js.Function1[/* ret */ js.Error | js.Object, Unit]) => Unit): Self = StObject.set(x, "install", js.Any.fromFunction3(value))
  }
}
