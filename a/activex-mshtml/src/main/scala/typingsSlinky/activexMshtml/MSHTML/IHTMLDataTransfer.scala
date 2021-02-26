package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLDataTransfer extends StObject {
  
  @JSName("MSHTML.IHTMLDataTransfer_typekey")
  var MSHTMLDotIHTMLDataTransfer_typekey: IHTMLDataTransfer = js.native
  
  def clearData(format: String): Boolean = js.native
  
  var dropEffect: String = js.native
  
  var effectAllowed: String = js.native
  
  def getData(format: String): js.Any = js.native
  
  def setData(format: String, data: js.Any): Boolean = js.native
}
object IHTMLDataTransfer {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLDataTransfer_typekey: IHTMLDataTransfer,
    clearData: String => Boolean,
    dropEffect: String,
    effectAllowed: String,
    getData: String => js.Any,
    setData: (String, js.Any) => Boolean
  ): IHTMLDataTransfer = {
    val __obj = js.Dynamic.literal(clearData = js.Any.fromFunction1(clearData), dropEffect = dropEffect.asInstanceOf[js.Any], effectAllowed = effectAllowed.asInstanceOf[js.Any], getData = js.Any.fromFunction1(getData), setData = js.Any.fromFunction2(setData))
    __obj.updateDynamic("MSHTML.IHTMLDataTransfer_typekey")(MSHTMLDotIHTMLDataTransfer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDataTransfer]
  }
  
  @scala.inline
  implicit class IHTMLDataTransferMutableBuilder[Self <: IHTMLDataTransfer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearData(value: String => Boolean): Self = StObject.set(x, "clearData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropEffect(value: String): Self = StObject.set(x, "dropEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectAllowed(value: String): Self = StObject.set(x, "effectAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetData(value: String => js.Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMSHTMLDotIHTMLDataTransfer_typekey(value: IHTMLDataTransfer): Self = StObject.set(x, "MSHTML.IHTMLDataTransfer_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetData(value: (String, js.Any) => Boolean): Self = StObject.set(x, "setData", js.Any.fromFunction2(value))
  }
}
