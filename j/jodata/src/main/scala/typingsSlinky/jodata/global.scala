package typingsSlinky.jodata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class jo protected ()
    extends typingsSlinky.jodata.jo {
    def this(baseUri: String) = this()
  }
  /* static members */
  @js.native
  object jo extends js.Object {
    
    def datetime(stringLiteral: String): String = js.native
    
    def decimal(stringLiteral: Double): String = js.native
    
    def double(stringLiteral: Double): String = js.native
    
    def guid(stringLiteral: String): String = js.native
    
    // Casts
    def literal(stringLiteral: String): String = js.native
    
    def loadLocal(): typingsSlinky.jodata.jo = js.native
    def loadLocal(key: String): typingsSlinky.jodata.jo = js.native
    
    def single(stringLiteral: Double): String = js.native
    
    @js.native
    class Concat protected ()
      extends typingsSlinky.jodata.jo.Concat {
      def this(value1: String, value2: String) = this()
      def this(value1: String, value2: typingsSlinky.jodata.jo.Concat) = this()
      def this(value1: typingsSlinky.jodata.jo.Concat, value2: String) = this()
      def this(value1: typingsSlinky.jodata.jo.Concat, value2: typingsSlinky.jodata.jo.Concat) = this()
    }
    
    @js.native
    class FilterClause ()
      extends typingsSlinky.jodata.jo.FilterClause {
      def this(property: String) = this()
    }
    
    @js.native
    class PrecedenceGroup protected ()
      extends typingsSlinky.jodata.jo.PrecedenceGroup {
      def this(filterClause: typingsSlinky.jodata.jo.FilterClause) = this()
    }
  }
}
