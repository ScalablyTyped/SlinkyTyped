package typingsSlinky.jestMatcherUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaceableMod {
  
  @JSImport("jest-matcher-utils/build/Replaceable", JSImport.Default)
  @js.native
  class default protected () extends Replaceable {
    def this(`object`: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jest-matcher-utils/build/Replaceable", "default.isReplaceable")
    @js.native
    def isReplaceable(obj1: js.Any, obj2: js.Any): Boolean = js.native
  }
  
  @js.native
  trait Replaceable extends StObject {
    
    def forEach(cb: ReplaceableForEachCallBack): Unit = js.native
    
    def get(key: js.Any): js.Any = js.native
    
    var `object`: js.Any = js.native
    
    def set(key: js.Any, value: js.Any): Unit = js.native
    
    var `type`: String = js.native
  }
  object Replaceable {
    
    @scala.inline
    def apply(
      forEach: ReplaceableForEachCallBack => Unit,
      get: js.Any => js.Any,
      `object`: js.Any,
      set: (js.Any, js.Any) => Unit,
      `type`: String
    ): Replaceable = {
      val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Replaceable]
    }
    
    @scala.inline
    implicit class ReplaceableMutableBuilder[Self <: Replaceable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForEach(value: ReplaceableForEachCallBack => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: js.Any => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ReplaceableForEachCallBack = js.Function3[/* value */ js.Any, /* key */ js.Any, /* object */ js.Any, Unit]
}
