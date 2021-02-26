package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ChannelSection targeting setting.
  */
@js.native
trait SchemaChannelSectionTargeting extends StObject {
  
  /**
    * The country the channel section is targeting.
    */
  var countries: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The language the channel section is targeting.
    */
  var languages: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The region the channel section is targeting.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
}
object SchemaChannelSectionTargeting {
  
  @scala.inline
  def apply(): SchemaChannelSectionTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSectionTargeting]
  }
  
  @scala.inline
  implicit class SchemaChannelSectionTargetingMutableBuilder[Self <: SchemaChannelSectionTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
    
    @scala.inline
    def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
  }
}
