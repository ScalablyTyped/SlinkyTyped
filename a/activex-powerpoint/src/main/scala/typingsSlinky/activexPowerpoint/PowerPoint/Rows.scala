package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rows extends js.Object {
  
  /** @param number [BeforeRow=-1] */
  def Add(): Row = js.native
  def Add(BeforeRow: Double): Row = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): Row = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Rows_typekey")
  var PowerPointDotRows_typekey: Rows = js.native
}
