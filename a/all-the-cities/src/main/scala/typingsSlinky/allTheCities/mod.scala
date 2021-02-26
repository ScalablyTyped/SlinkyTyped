package typingsSlinky.allTheCities

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.allTheCities.allTheCitiesStrings.PPL
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLA
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLA2
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLA3
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLA4
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLA5
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLC
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLCH
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLF
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLG
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLH
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLL
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLQ
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLR
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLS
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLW
import typingsSlinky.allTheCities.allTheCitiesStrings.PPLX
import typingsSlinky.allTheCities.allTheCitiesStrings.STLMT
import typingsSlinky.allTheCities.anon.Coordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("all-the-cities", JSImport.Namespace)
  @js.native
  val ^ : js.Array[AllTheCitiesCity] = js.native
  
  @js.native
  trait AllTheCitiesCity extends StObject {
    
    var adminCode: String = js.native
    
    var altName: String = js.native
    
    var cityId: Double = js.native
    
    var country: String = js.native
    
    var featureCode: PPL | PPLA | PPLC | PPLA2 | PPLW | PPLA3 | PPLX | PPLA4 | PPLL | PPLS | PPLQ | PPLF | PPLG | PPLH | PPLCH | PPLA5 | PPLR | STLMT = js.native
    
    var loc: Coordinates = js.native
    
    var name: String = js.native
    
    var population: Double = js.native
  }
  object AllTheCitiesCity {
    
    @scala.inline
    def apply(
      adminCode: String,
      altName: String,
      cityId: Double,
      country: String,
      featureCode: PPL | PPLA | PPLC | PPLA2 | PPLW | PPLA3 | PPLX | PPLA4 | PPLL | PPLS | PPLQ | PPLF | PPLG | PPLH | PPLCH | PPLA5 | PPLR | STLMT,
      loc: Coordinates,
      name: String,
      population: Double
    ): AllTheCitiesCity = {
      val __obj = js.Dynamic.literal(adminCode = adminCode.asInstanceOf[js.Any], altName = altName.asInstanceOf[js.Any], cityId = cityId.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], featureCode = featureCode.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], population = population.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllTheCitiesCity]
    }
    
    @scala.inline
    implicit class AllTheCitiesCityMutableBuilder[Self <: AllTheCitiesCity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdminCode(value: String): Self = StObject.set(x, "adminCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltName(value: String): Self = StObject.set(x, "altName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityId(value: Double): Self = StObject.set(x, "cityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureCode(
        value: PPL | PPLA | PPLC | PPLA2 | PPLW | PPLA3 | PPLX | PPLA4 | PPLL | PPLS | PPLQ | PPLF | PPLG | PPLH | PPLCH | PPLA5 | PPLR | STLMT
      ): Self = StObject.set(x, "featureCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc(value: Coordinates): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopulation(value: Double): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    }
  }
  
  type City = AllTheCitiesCity
  
  type _To = js.Array[AllTheCitiesCity]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Array[AllTheCitiesCity] = ^
}
