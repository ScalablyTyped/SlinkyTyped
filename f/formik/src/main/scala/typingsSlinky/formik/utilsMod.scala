package typingsSlinky.formik

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("formik/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def getActiveElement(): Element | Null = js.native
  def getActiveElement(doc: Document): Element | Null = js.native
  
  def getIn(obj: js.Any, key: String): js.Any = js.native
  def getIn(obj: js.Any, key: String, `def`: js.UndefOr[scala.Nothing], p: Double): js.Any = js.native
  def getIn(obj: js.Any, key: String, `def`: js.Any): js.Any = js.native
  def getIn(obj: js.Any, key: String, `def`: js.Any, p: Double): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String]): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.UndefOr[scala.Nothing], p: Double): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[String], `def`: js.Any, p: Double): js.Any = js.native
  
  def isEmptyArray(): Boolean = js.native
  def isEmptyArray(value: js.Any): Boolean = js.native
  
  def isEmptyChildren(children: js.Any): Boolean = js.native
  
  def isFunction(obj: js.Any): /* is std.Function */ Boolean = js.native
  
  def isInputEvent(value: js.Any): /* is react.react.SyntheticEvent<any, std.Event> */ Boolean = js.native
  
  def isInteger(obj: js.Any): Boolean = js.native
  
  def isNaN(obj: js.Any): Boolean = js.native
  
  def isObject(obj: js.Any): /* is std.Object */ Boolean = js.native
  
  def isPromise(value: js.Any): /* is std.PromiseLike<any> */ Boolean = js.native
  
  def isString(obj: js.Any): /* is string */ Boolean = js.native
  
  def setIn(obj: js.Any, path: String, value: js.Any): js.Any = js.native
  
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.UndefOr[scala.Nothing], response: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any, response: js.Any): T = js.native
}
