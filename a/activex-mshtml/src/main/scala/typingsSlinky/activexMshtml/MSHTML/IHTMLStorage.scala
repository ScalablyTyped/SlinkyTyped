package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLStorage extends StObject {
  
  @JSName("MSHTML.IHTMLStorage_typekey")
  var MSHTMLDotIHTMLStorage_typekey: IHTMLStorage = js.native
  
  def clear(): Unit = js.native
  
  def getItem(bstrKey: String): js.Any = js.native
  
  def key(lIndex: Double): String = js.native
  
  val length: Double = js.native
  
  val remainingSpace: Double = js.native
  
  def removeItem(bstrKey: String): Unit = js.native
  
  def setItem(bstrKey: String, bstrValue: String): Unit = js.native
}
object IHTMLStorage {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLStorage_typekey: IHTMLStorage,
    clear: () => Unit,
    getItem: String => js.Any,
    key: Double => String,
    length: Double,
    remainingSpace: Double,
    removeItem: String => Unit,
    setItem: (String, String) => Unit
  ): IHTMLStorage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], remainingSpace = remainingSpace.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.updateDynamic("MSHTML.IHTMLStorage_typekey")(MSHTMLDotIHTMLStorage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLStorage]
  }
  
  @scala.inline
  implicit class IHTMLStorageMutableBuilder[Self <: IHTMLStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: String => js.Any): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKey(value: Double => String): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIHTMLStorage_typekey(value: IHTMLStorage): Self = StObject.set(x, "MSHTML.IHTMLStorage_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingSpace(value: Double): Self = StObject.set(x, "remainingSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItem(value: (String, String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
  }
}
