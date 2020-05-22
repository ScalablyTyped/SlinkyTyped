package typingsSlinky.jodata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    @js.native
    class Concat protected ()
      extends typingsSlinky.jodata.jo.Concat {
      def this(value1: String, value2: String) = this()
      def this(value1: String, value2: typingsSlinky.jodata.jo.Concat) = this()
      def this(value1: typingsSlinky.jodata.jo.Concat, value2: String) = this()
      def this(value1: typingsSlinky.jodata.jo.Concat, value2: typingsSlinky.jodata.jo.Concat) = this()
      /* CompleteClass */
      override var LeftSide: String | typingsSlinky.jodata.jo.Concat = js.native
      /* CompleteClass */
      override var RightSide: String | typingsSlinky.jodata.jo.Concat = js.native
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
      /* CompleteClass */
      override def andFilter(filterClause: typingsSlinky.jodata.jo.FilterClause): typingsSlinky.jodata.jo.FilterClause = js.native
      /* CompleteClass */
      override def orFilter(filterClause: typingsSlinky.jodata.jo.FilterClause): typingsSlinky.jodata.jo.FilterClause = js.native
    }
    
    def datetime(stringLiteral: String): String = js.native
    def decimal(stringLiteral: Double): String = js.native
    def double(stringLiteral: Double): String = js.native
    def guid(stringLiteral: String): String = js.native
    // Casts
    def literal(stringLiteral: String): String = js.native
    def loadLocal(): typingsSlinky.jodata.jo = js.native
    def loadLocal(key: String): typingsSlinky.jodata.jo = js.native
    def single(stringLiteral: Double): String = js.native
  }
  
}

