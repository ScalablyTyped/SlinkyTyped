package typingsSlinky.ckeditor.anon

import typingsSlinky.ckeditor.CKEDITOR.dom.elementPath
import typingsSlinky.ckeditor.CKEDITOR.editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exec extends StObject {
  
  def exec(editor: editor): Boolean = js.native
  
  def refresh(editor: editor, path: elementPath): Double = js.native
}
object Exec {
  
  @scala.inline
  def apply(exec: editor => Boolean, refresh: (editor, elementPath) => Double): Exec = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), refresh = js.Any.fromFunction2(refresh))
    __obj.asInstanceOf[Exec]
  }
  
  @scala.inline
  implicit class ExecMutableBuilder[Self <: Exec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExec(value: editor => Boolean): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefresh(value: (editor, elementPath) => Double): Self = StObject.set(x, "refresh", js.Any.fromFunction2(value))
  }
}
