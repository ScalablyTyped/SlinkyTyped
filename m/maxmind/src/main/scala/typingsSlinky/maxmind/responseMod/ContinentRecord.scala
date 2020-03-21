package typingsSlinky.maxmind.responseMod

import typingsSlinky.maxmind.maxmindStrings.AF
import typingsSlinky.maxmind.maxmindStrings.AN
import typingsSlinky.maxmind.maxmindStrings.AS
import typingsSlinky.maxmind.maxmindStrings.EU
import typingsSlinky.maxmind.maxmindStrings.NA
import typingsSlinky.maxmind.maxmindStrings.OC
import typingsSlinky.maxmind.maxmindStrings.SA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinentRecord extends js.Object {
  val code: AF | AN | AS | EU | NA | OC | SA
  val geoname_id: Double
  val names: Names
}

object ContinentRecord {
  @scala.inline
  def apply(code: AF | AN | AS | EU | NA | OC | SA, geoname_id: Double, names: Names): ContinentRecord = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], geoname_id = geoname_id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContinentRecord]
  }
}

