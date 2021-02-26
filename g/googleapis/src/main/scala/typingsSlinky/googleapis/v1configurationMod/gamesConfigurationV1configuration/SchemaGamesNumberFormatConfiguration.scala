package typingsSlinky.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a number format resource.
  */
@js.native
trait SchemaGamesNumberFormatConfiguration extends StObject {
  
  /**
    * The curreny code string. Only used for CURRENCY format type.
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * The number of decimal places for number. Only used for NUMERIC format
    * type.
    */
  var numDecimalPlaces: js.UndefOr[Double] = js.native
  
  /**
    * The formatting for the number. Possible values are:   -
    * &quot;NUMERIC&quot; - Numbers are formatted to have no digits or a fixed
    * number of digits after the decimal point according to locale. An optional
    * custom unit can be added. - &quot;TIME_DURATION&quot; - Numbers are
    * formatted to hours, minutes and seconds. - &quot;CURRENCY&quot; - Numbers
    * are formatted to currency according to locale.
    */
  var numberFormatType: js.UndefOr[String] = js.native
  
  /**
    * An optional suffix for the NUMERIC format type. These strings follow the
    * same  plural rules as all Android string resources.
    */
  var suffix: js.UndefOr[SchemaGamesNumberAffixConfiguration] = js.native
}
object SchemaGamesNumberFormatConfiguration {
  
  @scala.inline
  def apply(): SchemaGamesNumberFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesNumberFormatConfiguration]
  }
  
  @scala.inline
  implicit class SchemaGamesNumberFormatConfigurationMutableBuilder[Self <: SchemaGamesNumberFormatConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setNumDecimalPlaces(value: Double): Self = StObject.set(x, "numDecimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumDecimalPlacesUndefined: Self = StObject.set(x, "numDecimalPlaces", js.undefined)
    
    @scala.inline
    def setNumberFormatType(value: String): Self = StObject.set(x, "numberFormatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatTypeUndefined: Self = StObject.set(x, "numberFormatType", js.undefined)
    
    @scala.inline
    def setSuffix(value: SchemaGamesNumberAffixConfiguration): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
