package typingsSlinky.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// helpers.Column class;
// API: http://vitaly-t.github.io/pg-promise/helpers.Column.html
@JSImport("pg-promise", "Column")
@js.native
class Column[S] protected () extends StObject {
  def this(col: String) = this()
  def this(col: IColumnConfig[S]) = this()
  
  val cast: String = js.native
  
  val castText: String = js.native
  
  val cnd: Boolean = js.native
  
  val `def`: js.Any = js.native
  
  val escapedName: String = js.native
  
  def init(col: IColumnDescriptor[S]): js.Any = js.native
  
  val mod: FormattingFilter = js.native
  
  // these are all read-only:
  val name: String = js.native
  
  val prop: String = js.native
  
  def skip(col: IColumnDescriptor[S]): Boolean = js.native
  
  def toString(level: Double): String = js.native
}
