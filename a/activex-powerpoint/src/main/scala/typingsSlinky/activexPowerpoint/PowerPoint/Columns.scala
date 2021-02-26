package typingsSlinky.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Columns extends StObject {
  
  /** @param number [BeforeColumn=-1] */
  def Add(): Column = js.native
  def Add(BeforeColumn: Double): Column = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): Column = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Columns_typekey")
  var PowerPointDotColumns_typekey: Columns = js.native
}
