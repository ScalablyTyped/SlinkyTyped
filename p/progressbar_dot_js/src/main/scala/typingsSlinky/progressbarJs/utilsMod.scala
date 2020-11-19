package typingsSlinky.progressbarJs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("progressbar.js/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def capitalize(text: String): String = js.native
  
  def extend[T, U](target: T, source: U): T with U = js.native
  def extend[T, U](target: T, source: U, recursive: Boolean): T with U = js.native
  
  def floatEquals(a: Double, b: Double): Boolean = js.native
  
  def forEachObject(obj: js.Any, cb: js.Function2[/* val */ js.Any, /* key */ String, Unit]): Unit = js.native
  
  def isArray(obj: js.Any): Boolean = js.native
  
  def isFunction(obj: js.Any): Boolean = js.native
  
  def isObject(obj: js.Any): Boolean = js.native
  
  def isString(obj: js.Any): Boolean = js.native
  
  def removeChildren(el: Element): Unit = js.native
  
  def render(template: String, vars: StringDictionary[js.Any]): String = js.native
  
  def setStyle(element: Element, style: String, value: js.Any): Unit = js.native
  
  def setStyles(element: Element, styles: StringDictionary[js.Any]): Unit = js.native
}
