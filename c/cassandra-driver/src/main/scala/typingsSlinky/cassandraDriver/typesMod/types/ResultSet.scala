package typingsSlinky.cassandraDriver.typesMod.types

import typingsSlinky.cassandraDriver.anon.AchievedConsistency
import typingsSlinky.cassandraDriver.anon.Type
import typingsSlinky.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSet
  extends Iterator[Row, js.Any, js.UndefOr[scala.Nothing]] {
  
  var columns: js.Array[Type] = js.native
  
  def first(): Row = js.native
  
  var info: AchievedConsistency = js.native
  
  var nextPage: js.Function0[Unit] | Null = js.native
  
  var pageState: String = js.native
  
  var rowLength: Double = js.native
  
  var rows: js.Array[Row] = js.native
  
  def wasApplied(): Boolean = js.native
}
