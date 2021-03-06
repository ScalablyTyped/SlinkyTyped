package typingsSlinky.ckeditor.CKEDITOR.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait list extends StObject {
  
  def arrayToList(listArray: js.Any, database: js.Any, paragraphMode: js.Any, dir: js.Any): Unit = js.native
  
  def listToArray(
    listNode: js.Any,
    database: js.Any,
    baseArray: js.Any,
    baseIndentLevel: js.Any,
    grandparentNode: js.Any
  ): Unit = js.native
}
object list {
  
  @scala.inline
  def apply(
    arrayToList: (js.Any, js.Any, js.Any, js.Any) => Unit,
    listToArray: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit
  ): list = {
    val __obj = js.Dynamic.literal(arrayToList = js.Any.fromFunction4(arrayToList), listToArray = js.Any.fromFunction5(listToArray))
    __obj.asInstanceOf[list]
  }
  
  @scala.inline
  implicit class listMutableBuilder[Self <: list] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayToList(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "arrayToList", js.Any.fromFunction4(value))
    
    @scala.inline
    def setListToArray(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "listToArray", js.Any.fromFunction5(value))
  }
}
