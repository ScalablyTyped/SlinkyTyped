package typingsSlinky.mmdbLib.responseMod

import typingsSlinky.mmdbLib.mmdbLibStrings.AF
import typingsSlinky.mmdbLib.mmdbLibStrings.AN
import typingsSlinky.mmdbLib.mmdbLibStrings.AS
import typingsSlinky.mmdbLib.mmdbLibStrings.EU
import typingsSlinky.mmdbLib.mmdbLibStrings.NA
import typingsSlinky.mmdbLib.mmdbLibStrings.OC
import typingsSlinky.mmdbLib.mmdbLibStrings.SA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinentRecord extends StObject {
  
  val code: AF | AN | AS | EU | NA | OC | SA = js.native
  
  val geoname_id: Double = js.native
  
  val names: Names = js.native
}
object ContinentRecord {
  
  @scala.inline
  def apply(code: AF | AN | AS | EU | NA | OC | SA, geoname_id: Double, names: Names): ContinentRecord = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], geoname_id = geoname_id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinentRecord]
  }
  
  @scala.inline
  implicit class ContinentRecordMutableBuilder[Self <: ContinentRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: AF | AN | AS | EU | NA | OC | SA): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoname_id(value: Double): Self = StObject.set(x, "geoname_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: Names): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
