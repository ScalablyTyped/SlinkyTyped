package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupplementaryFeature extends StObject {
  
  /**
    * The name of the feature. This must be "holiday".
    */
  var Name: typingsSlinky.awsSdk.forecastserviceMod.Name = js.native
  
  /**
    * One of the following 2 letter country codes:   "AL" - ALBANIA   "AR" - ARGENTINA   "AT" - AUSTRIA   "AU" - AUSTRALIA   "BA" - BOSNIA HERZEGOVINA   "BE" - BELGIUM   "BG" - BULGARIA   "BO" - BOLIVIA   "BR" - BRAZIL   "BY" - BELARUS   "CA" - CANADA   "CL" - CHILE   "CO" - COLOMBIA   "CR" - COSTA RICA   "HR" - CROATIA   "CZ" - CZECH REPUBLIC   "DK" - DENMARK   "EC" - ECUADOR   "EE" - ESTONIA   "ET" - ETHIOPIA   "FI" - FINLAND   "FR" - FRANCE   "DE" - GERMANY   "GR" - GREECE   "HU" - HUNGARY   "IS" - ICELAND   "IN" - INDIA   "IE" - IRELAND   "IT" - ITALY   "JP" - JAPAN   "KZ" - KAZAKHSTAN   "KR" - KOREA   "LV" - LATVIA   "LI" - LIECHTENSTEIN   "LT" - LITHUANIA   "LU" - LUXEMBOURG   "MK" - MACEDONIA   "MT" - MALTA   "MX" - MEXICO   "MD" - MOLDOVA   "ME" - MONTENEGRO   "NL" - NETHERLANDS   "NZ" - NEW ZEALAND   "NI" - NICARAGUA   "NG" - NIGERIA   "NO" - NORWAY   "PA" - PANAMA   "PY" - PARAGUAY   "PE" - PERU   "PL" - POLAND   "PT" - PORTUGAL   "RO" - ROMANIA   "RU" - RUSSIA   "RS" - SERBIA   "SK" - SLOVAKIA   "SI" - SLOVENIA   "ZA" - SOUTH AFRICA   "ES" - SPAIN   "SE" - SWEDEN   "CH" - SWITZERLAND   "UA" - UKRAINE   "AE" - UNITED ARAB EMIRATES   "US" - UNITED STATES   "UK" - UNITED KINGDOM   "UY" - URUGUAY   "VE" - VENEZUELA  
    */
  var Value: typingsSlinky.awsSdk.forecastserviceMod.Value = js.native
}
object SupplementaryFeature {
  
  @scala.inline
  def apply(Name: Name, Value: Value): SupplementaryFeature = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupplementaryFeature]
  }
  
  @scala.inline
  implicit class SupplementaryFeatureMutableBuilder[Self <: SupplementaryFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
