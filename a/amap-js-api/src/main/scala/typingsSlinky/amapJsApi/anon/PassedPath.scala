package typingsSlinky.amapJsApi.anon

import typingsSlinky.amapJsApi.AMap.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassedPath extends StObject {
  
  var passedPath: js.Array[LngLat] = js.native
}
object PassedPath {
  
  @scala.inline
  def apply(passedPath: js.Array[LngLat]): PassedPath = {
    val __obj = js.Dynamic.literal(passedPath = passedPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassedPath]
  }
  
  @scala.inline
  implicit class PassedPathMutableBuilder[Self <: PassedPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassedPath(value: js.Array[LngLat]): Self = StObject.set(x, "passedPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassedPathVarargs(value: LngLat*): Self = StObject.set(x, "passedPath", js.Array(value :_*))
  }
}
