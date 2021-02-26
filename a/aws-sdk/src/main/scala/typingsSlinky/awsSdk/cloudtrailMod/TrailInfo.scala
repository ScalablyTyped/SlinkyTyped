package typingsSlinky.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrailInfo extends StObject {
  
  /**
    * The AWS region in which a trail was created.
    */
  var HomeRegion: js.UndefOr[String] = js.native
  
  /**
    * The name of a trail.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The ARN of a trail.
    */
  var TrailARN: js.UndefOr[String] = js.native
}
object TrailInfo {
  
  @scala.inline
  def apply(): TrailInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrailInfo]
  }
  
  @scala.inline
  implicit class TrailInfoMutableBuilder[Self <: TrailInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHomeRegion(value: String): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeRegionUndefined: Self = StObject.set(x, "HomeRegion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setTrailARN(value: String): Self = StObject.set(x, "TrailARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailARNUndefined: Self = StObject.set(x, "TrailARN", js.undefined)
  }
}
