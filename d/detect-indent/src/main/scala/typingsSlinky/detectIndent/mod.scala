package typingsSlinky.detectIndent

import typingsSlinky.detectIndent.detectIndentStrings.space
import typingsSlinky.detectIndent.detectIndentStrings.tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Detect the indentation of code.
  @param string - A string of any kind of text.
  @example
  ```
  import * as fs from 'fs';
  import detectIndent = require('detect-indent');
  // {
  //     "ilove": "pizza"
  // }
  const file = fs.readFileSync('foo.json', 'utf8');
  // Tries to detect the indentation and falls back to a default if it can't
  const indent = detectIndent(file).indent || '    ';
  const json = JSON.parse(file);
  json.ilove = 'unicorns';
  fs.writeFileSync('foo.json', JSON.stringify(json, null, indent));
  // {
  //     "ilove": "unicorns"
  // }
  ```
  */
  @JSImport("detect-indent", JSImport.Namespace)
  @js.native
  def apply(string: String): Indent = js.native
  
  @js.native
  trait Indent extends StObject {
    
    /**
    		Amount of indentation, for example `2`.
    		*/
    var amount: Double = js.native
    
    /**
    		Actual indentation.
    		*/
    var indent: String = js.native
    
    /**
    		Type of indentation. Is `undefined` if no indentation is detected.
    		*/
    var `type`: js.UndefOr[tab | space] = js.native
  }
  object Indent {
    
    @scala.inline
    def apply(amount: Double, indent: String): Indent = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Indent]
    }
    
    @scala.inline
    implicit class IndentMutableBuilder[Self <: Indent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: tab | space): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
