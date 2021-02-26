package typingsSlinky.pathParser

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rulesMod extends Shortcut {
  
  @JSImport("path-parser/dist/rules", JSImport.Default)
  @js.native
  val default: js.Array[IRule] = js.native
  
  @JSImport("path-parser/dist/rules", "defaultOrConstrained")
  @js.native
  def defaultOrConstrained(`match`: String): String = js.native
  
  @js.native
  trait IRule extends StObject {
    
    var name: String = js.native
    
    var pattern: js.RegExp = js.native
    
    var regex: js.UndefOr[js.RegExp | RegExpFactory] = js.native
  }
  object IRule {
    
    @scala.inline
    def apply(name: String, pattern: js.RegExp): IRule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRule]
    }
    
    @scala.inline
    implicit class IRuleMutableBuilder[Self <: IRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: js.RegExp | RegExpFactory): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexFunction1(value: /* match */ js.Any => js.RegExp): Self = StObject.set(x, "regex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegexRegExp(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  type RegExpFactory = js.Function1[/* match */ js.Any, js.RegExp]
  
  type _To = js.Array[IRule]
  
  /* This means you don't have to write `default`, but can instead just say `rulesMod.foo` */
  override def _to: js.Array[IRule] = default
}
