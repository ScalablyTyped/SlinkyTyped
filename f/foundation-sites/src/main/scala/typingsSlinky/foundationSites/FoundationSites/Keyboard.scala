package typingsSlinky.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keyboard extends StObject {
  
  def findFocusable($element: js.Object): js.Object = js.native
  
  def handleKey(event: js.Any, component: js.Any, functions: js.Any): Unit = js.native
  
  def parseKey(event: js.Any): String = js.native
}
object Keyboard {
  
  @scala.inline
  def apply(
    findFocusable: js.Object => js.Object,
    handleKey: (js.Any, js.Any, js.Any) => Unit,
    parseKey: js.Any => String
  ): Keyboard = {
    val __obj = js.Dynamic.literal(findFocusable = js.Any.fromFunction1(findFocusable), handleKey = js.Any.fromFunction3(handleKey), parseKey = js.Any.fromFunction1(parseKey))
    __obj.asInstanceOf[Keyboard]
  }
  
  @scala.inline
  implicit class KeyboardMutableBuilder[Self <: Keyboard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindFocusable(value: js.Object => js.Object): Self = StObject.set(x, "findFocusable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleKey(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "handleKey", js.Any.fromFunction3(value))
    
    @scala.inline
    def setParseKey(value: js.Any => String): Self = StObject.set(x, "parseKey", js.Any.fromFunction1(value))
  }
}
