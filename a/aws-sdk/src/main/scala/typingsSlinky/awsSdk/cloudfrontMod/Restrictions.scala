package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Restrictions extends StObject {
  
  /**
    * A complex type that controls the countries in which your content is distributed. CloudFront determines the location of your users using MaxMind GeoIP databases.
    */
  var GeoRestriction: typingsSlinky.awsSdk.cloudfrontMod.GeoRestriction = js.native
}
object Restrictions {
  
  @scala.inline
  def apply(GeoRestriction: GeoRestriction): Restrictions = {
    val __obj = js.Dynamic.literal(GeoRestriction = GeoRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Restrictions]
  }
  
  @scala.inline
  implicit class RestrictionsMutableBuilder[Self <: Restrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoRestriction(value: GeoRestriction): Self = StObject.set(x, "GeoRestriction", value.asInstanceOf[js.Any])
  }
}
