package typingsSlinky.knockoutPaging.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clear extends js.Object {
  
  def clear(node: org.scalajs.dom.raw.Element): Boolean = js.native
  
  def get(node: org.scalajs.dom.raw.Element, key: String): js.Any = js.native
  
  def getAll(node: org.scalajs.dom.raw.Element, createIfNotFound: Boolean): js.Any = js.native
  
  def set(node: org.scalajs.dom.raw.Element, key: String, value: js.Any): Unit = js.native
}
object Clear {
  
  @scala.inline
  def apply(
    clear: org.scalajs.dom.raw.Element => Boolean,
    get: (org.scalajs.dom.raw.Element, String) => js.Any,
    getAll: (org.scalajs.dom.raw.Element, Boolean) => js.Any,
    set: (org.scalajs.dom.raw.Element, String, js.Any) => Unit
  ): Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[Clear]
  }
  
  @scala.inline
  implicit class ClearOps[Self <: Clear] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: org.scalajs.dom.raw.Element => Boolean): Self = this.set("clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: (org.scalajs.dom.raw.Element, String) => js.Any): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAll(value: (org.scalajs.dom.raw.Element, Boolean) => js.Any): Self = this.set("getAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: (org.scalajs.dom.raw.Element, String, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction3(value))
  }
}
