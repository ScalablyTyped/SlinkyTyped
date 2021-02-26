package typingsSlinky.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheFrom extends StObject {
  
  /**
    * An optional list of build stages to use for caching. Each build stage in this list will be built explicitly and
    * pushed to the target repository. A given stage's image will be tagged as "[stage-name]".
    */
  var stages: js.UndefOr[js.Array[String]] = js.native
}
object CacheFrom {
  
  @scala.inline
  def apply(): CacheFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheFrom]
  }
  
  @scala.inline
  implicit class CacheFromMutableBuilder[Self <: CacheFrom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStages(value: js.Array[String]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
    
    @scala.inline
    def setStagesVarargs(value: String*): Self = StObject.set(x, "stages", js.Array(value :_*))
  }
}
