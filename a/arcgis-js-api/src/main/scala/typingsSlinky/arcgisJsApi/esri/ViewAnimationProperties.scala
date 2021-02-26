package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewAnimationProperties extends StObject {
  
  /**
    * The target of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#target)
    */
  var target: js.UndefOr[ViewpointProperties] = js.native
}
object ViewAnimationProperties {
  
  @scala.inline
  def apply(): ViewAnimationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewAnimationProperties]
  }
  
  @scala.inline
  implicit class ViewAnimationPropertiesMutableBuilder[Self <: ViewAnimationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: ViewpointProperties): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
