package typingsSlinky.mssql.mod

import typingsSlinky.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRecordSet[T] extends Array[T] {
  
  var columns: IColumnMetadata = js.native
  
  def toTable(): Table = js.native
  def toTable(name: String): Table = js.native
}
