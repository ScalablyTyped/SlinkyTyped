package typingsSlinky.kendoUi.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.kendoUi.kendo.ui.editor.Toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofeditor extends StObject {
  
  var Toolbar: Instantiable0[typingsSlinky.kendoUi.kendo.ui.editor.Toolbar] = js.native
}
object Typeofeditor {
  
  @scala.inline
  def apply(Toolbar: Instantiable0[Toolbar]): Typeofeditor = {
    val __obj = js.Dynamic.literal(Toolbar = Toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofeditor]
  }
  
  @scala.inline
  implicit class TypeofeditorMutableBuilder[Self <: Typeofeditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToolbar(value: Instantiable0[Toolbar]): Self = StObject.set(x, "Toolbar", value.asInstanceOf[js.Any])
  }
}
