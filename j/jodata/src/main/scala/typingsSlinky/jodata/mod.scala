package typingsSlinky.jodata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jodata", JSImport.Namespace)
  @js.native
  class ^ protected () extends jo {
    def this(baseUri: String) = this()
  }
  @JSImport("jodata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jodata", "Concat")
  @js.native
  class Concat protected ()
    extends typingsSlinky.jodata.jo.Concat {
    def this(value1: String, value2: String) = this()
    def this(value1: String, value2: typingsSlinky.jodata.jo.Concat) = this()
    def this(value1: typingsSlinky.jodata.jo.Concat, value2: String) = this()
    def this(value1: typingsSlinky.jodata.jo.Concat, value2: typingsSlinky.jodata.jo.Concat) = this()
  }
  
  @JSImport("jodata", "FilterClause")
  @js.native
  class FilterClause ()
    extends typingsSlinky.jodata.jo.FilterClause {
    def this(property: String) = this()
  }
  
  @JSImport("jodata", "PrecedenceGroup")
  @js.native
  class PrecedenceGroup protected ()
    extends typingsSlinky.jodata.jo.PrecedenceGroup {
    def this(filterClause: typingsSlinky.jodata.jo.FilterClause) = this()
  }
  
  /* static member */
  @JSImport("jodata", "datetime")
  @js.native
  def datetime: js.Function1[/* stringLiteral */ String, String] = js.native
  @scala.inline
  def datetime_=(x: js.Function1[/* stringLiteral */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("datetime")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("jodata", "decimal")
  @js.native
  def decimal: js.Function1[/* stringLiteral */ Double, String] = js.native
  @scala.inline
  def decimal_=(x: js.Function1[/* stringLiteral */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decimal")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("jodata", "double")
  @js.native
  def double: js.Function1[/* stringLiteral */ Double, String] = js.native
  @scala.inline
  def double_=(x: js.Function1[/* stringLiteral */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("double")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("jodata", "guid")
  @js.native
  def guid: js.Function1[/* stringLiteral */ String, String] = js.native
  @scala.inline
  def guid_=(x: js.Function1[/* stringLiteral */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("guid")(x.asInstanceOf[js.Any])
  
  // Casts
  /* static member */
  @JSImport("jodata", "literal")
  @js.native
  def literal: js.Function1[/* stringLiteral */ String, String] = js.native
  @scala.inline
  def literal_=(x: js.Function1[/* stringLiteral */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("literal")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("jodata", "loadLocal")
  @js.native
  def loadLocal: js.Function1[/* key */ js.UndefOr[String], jo] = js.native
  @scala.inline
  def loadLocal_=(x: js.Function1[/* key */ js.UndefOr[String], jo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadLocal")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("jodata", "single")
  @js.native
  def single: js.Function1[/* stringLiteral */ Double, String] = js.native
  @scala.inline
  def single_=(x: js.Function1[/* stringLiteral */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("single")(x.asInstanceOf[js.Any])
}
