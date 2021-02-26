package typingsSlinky.ansiRegex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Regular expression for matching ANSI escape codes.
  @example
  ```
  import ansiRegex = require('ansi-regex');
  ansiRegex().test('\\u001B[4mcake\\u001B[0m');
  //=> true
  ansiRegex().test('cake');
  //=> false
  '\\u001B[4mcake\\u001B[0m'.match(ansiRegex());
  //=> ['\\u001B[4m', '\\u001B[0m']
  '\\u001B[4mcake\\u001B[0m'.match(ansiRegex({onlyFirst: true}));
  //=> ['\\u001B[4m']
  '\\u001B]8;;https://github.com\\u0007click\\u001B]8;;\\u0007'.match(ansiRegex());
  //=> ['\\u001B]8;;https://github.com\\u0007', '\\u001B]8;;\\u0007']
  ```
  */
  @JSImport("ansi-regex", JSImport.Namespace)
  @js.native
  def apply(): js.RegExp = js.native
  @JSImport("ansi-regex", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.RegExp = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Match only the first ANSI escape.
    		@default false
    		*/
    var onlyFirst: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(onlyFirst: Boolean): Options = {
      val __obj = js.Dynamic.literal(onlyFirst = onlyFirst.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnlyFirst(value: Boolean): Self = StObject.set(x, "onlyFirst", value.asInstanceOf[js.Any])
    }
  }
}
