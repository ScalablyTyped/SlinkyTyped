package typingsSlinky.execall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Find multiple RegExp matches in a string.
  @param regexp - Regular expression to match against the `string`.
  @returns The matches.
  @example
  ```
  import execall = require('execall');
  execall(/(\d+)/g, '$200 and $400');
  // [
  // 	{
  // 		match: '200',
  // 		subMatches: ['200'],
  // 		index: 1
  // 	},
  // 	{
  // 		match: '400',
  // 		subMatches: ['400'],
  // 		index: 10
  // 	}
  // ]
  ```
  */
  @JSImport("execall", JSImport.Namespace)
  @js.native
  def apply(regexp: js.RegExp, string: String): js.Array[Match] = js.native
  
  @js.native
  trait Match extends StObject {
    
    var index: Double = js.native
    
    var `match`: String = js.native
    
    var subMatches: js.Array[String] = js.native
  }
  object Match {
    
    @scala.inline
    def apply(index: Double, `match`: String, subMatches: js.Array[String]): Match = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], subMatches = subMatches.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    @scala.inline
    implicit class MatchMutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMatches(value: js.Array[String]): Self = StObject.set(x, "subMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMatchesVarargs(value: String*): Self = StObject.set(x, "subMatches", js.Array(value :_*))
    }
  }
}
