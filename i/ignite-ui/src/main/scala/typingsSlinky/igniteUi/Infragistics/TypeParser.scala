package typingsSlinky.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeParser extends StObject {
  
  def empty(): Unit = js.native
  
  def isNullOrUndefined(obj: js.Object): Unit = js.native
  
  def num(): Unit = js.native
  
  def toBool(obj: js.Object): Unit = js.native
  
  /**
    * L.A. 18 June 2012 Fixing bug #113265 Column 'date' shows empty values as 'NaN'
    *
    * @param obj
    */
  def toDate(obj: js.Object): Unit = js.native
  
  def toNumber(obj: js.Object): Unit = js.native
  
  def toStr(obj: js.Object): Unit = js.native
  
  def toTime(obj: js.Object): Unit = js.native
}
object TypeParser {
  
  @scala.inline
  def apply(
    empty: () => Unit,
    isNullOrUndefined: js.Object => Unit,
    num: () => Unit,
    toBool: js.Object => Unit,
    toDate: js.Object => Unit,
    toNumber: js.Object => Unit,
    toStr: js.Object => Unit,
    toTime: js.Object => Unit
  ): TypeParser = {
    val __obj = js.Dynamic.literal(empty = js.Any.fromFunction0(empty), isNullOrUndefined = js.Any.fromFunction1(isNullOrUndefined), num = js.Any.fromFunction0(num), toBool = js.Any.fromFunction1(toBool), toDate = js.Any.fromFunction1(toDate), toNumber = js.Any.fromFunction1(toNumber), toStr = js.Any.fromFunction1(toStr), toTime = js.Any.fromFunction1(toTime))
    __obj.asInstanceOf[TypeParser]
  }
  
  @scala.inline
  implicit class TypeParserMutableBuilder[Self <: TypeParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: () => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNullOrUndefined(value: js.Object => Unit): Self = StObject.set(x, "isNullOrUndefined", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNum(value: () => Unit): Self = StObject.set(x, "num", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBool(value: js.Object => Unit): Self = StObject.set(x, "toBool", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToDate(value: js.Object => Unit): Self = StObject.set(x, "toDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToNumber(value: js.Object => Unit): Self = StObject.set(x, "toNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToStr(value: js.Object => Unit): Self = StObject.set(x, "toStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToTime(value: js.Object => Unit): Self = StObject.set(x, "toTime", js.Any.fromFunction1(value))
  }
}
