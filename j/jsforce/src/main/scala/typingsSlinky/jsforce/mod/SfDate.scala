package typingsSlinky.jsforce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce", "SfDate")
@js.native
class SfDate ()
  extends typingsSlinky.jsforce.dateMod.SfDate
/* static members */
@JSImport("jsforce", "SfDate")
@js.native
object SfDate extends js.Object {
  
  def parseDate(str: String): js.Date = js.native
  
  def toDateLiteral(date: String): typingsSlinky.jsforce.dateMod.SfDate = js.native
  def toDateLiteral(date: Double): typingsSlinky.jsforce.dateMod.SfDate = js.native
  def toDateLiteral(date: js.Date): typingsSlinky.jsforce.dateMod.SfDate = js.native
  
  def toDateTimeLiteral(date: String): typingsSlinky.jsforce.dateMod.SfDate = js.native
  def toDateTimeLiteral(date: Double): typingsSlinky.jsforce.dateMod.SfDate = js.native
  def toDateTimeLiteral(date: js.Date): typingsSlinky.jsforce.dateMod.SfDate = js.native
}
