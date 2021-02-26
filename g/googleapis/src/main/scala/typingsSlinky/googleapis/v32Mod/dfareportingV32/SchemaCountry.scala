package typingsSlinky.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a country that can be targeted by ads.
  */
@js.native
trait SchemaCountry extends StObject {
  
  /**
    * Country code.
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * DART ID of this country. This is the ID used for targeting and generating
    * reports.
    */
  var dartId: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#country&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this country.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Whether ad serving supports secure servers in this country.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.native
}
object SchemaCountry {
  
  @scala.inline
  def apply(): SchemaCountry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCountry]
  }
  
  @scala.inline
  implicit class SchemaCountryMutableBuilder[Self <: SchemaCountry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setDartId(value: String): Self = StObject.set(x, "dartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDartIdUndefined: Self = StObject.set(x, "dartId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
  }
}
