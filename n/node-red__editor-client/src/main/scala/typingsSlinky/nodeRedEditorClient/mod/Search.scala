package typingsSlinky.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Search extends StObject {
  
  def hide(): Unit = js.native
  
  def init(): Unit = js.native
  
  def search(`val`: String): js.Array[js.Object] = js.native
  
  def show(v: String): Unit = js.native
}
object Search {
  
  @scala.inline
  def apply(hide: () => Unit, init: () => Unit, search: String => js.Array[js.Object], show: String => Unit): Search = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), search = js.Any.fromFunction1(search), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[Search]
  }
  
  @scala.inline
  implicit class SearchMutableBuilder[Self <: Search] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSearch(value: String => js.Array[js.Object]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: String => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
