package typingsSlinky.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopImageBuilderResult extends StObject {
  
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.ImageBuilder] = js.native
}
object StopImageBuilderResult {
  
  @scala.inline
  def apply(): StopImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopImageBuilderResult]
  }
  
  @scala.inline
  implicit class StopImageBuilderResultMutableBuilder[Self <: StopImageBuilderResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageBuilder(value: ImageBuilder): Self = StObject.set(x, "ImageBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBuilderUndefined: Self = StObject.set(x, "ImageBuilder", js.undefined)
  }
}
