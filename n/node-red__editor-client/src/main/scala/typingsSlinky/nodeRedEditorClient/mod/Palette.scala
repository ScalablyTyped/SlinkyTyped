package typingsSlinky.nodeRedEditorClient.mod

import typingsSlinky.nodeRedEditorClient.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Palette extends StObject {
  
  def add(nt: String, `def`: js.Object): Unit = js.native
  
  var editor: PaletteEditor = js.native
  
  def getCategories(): js.Array[Label] = js.native
  
  def hide(nt: String): Unit = js.native
  
  def init(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def remove(nt: String): Unit = js.native
  
  def show(nt: String): Unit = js.native
}
object Palette {
  
  @scala.inline
  def apply(
    add: (String, js.Object) => Unit,
    editor: PaletteEditor,
    getCategories: () => js.Array[Label],
    hide: String => Unit,
    init: () => Unit,
    refresh: () => Unit,
    remove: String => Unit,
    show: String => Unit
  ): Palette = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), editor = editor.asInstanceOf[js.Any], getCategories = js.Any.fromFunction0(getCategories), hide = js.Any.fromFunction1(hide), init = js.Any.fromFunction0(init), refresh = js.Any.fromFunction0(refresh), remove = js.Any.fromFunction1(remove), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[Palette]
  }
  
  @scala.inline
  implicit class PaletteMutableBuilder[Self <: Palette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, js.Object) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEditor(value: PaletteEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCategories(value: () => js.Array[Label]): Self = StObject.set(x, "getCategories", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: String => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: String => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
