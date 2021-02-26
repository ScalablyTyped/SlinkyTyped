package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeActionList extends IDisposable {
  
  val actions: js.Array[CodeAction] = js.native
}
object CodeActionList {
  
  @scala.inline
  def apply(actions: js.Array[CodeAction], dispose: () => Unit): CodeActionList = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[CodeActionList]
  }
  
  @scala.inline
  implicit class CodeActionListMutableBuilder[Self <: CodeActionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[CodeAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: CodeAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
  }
}
