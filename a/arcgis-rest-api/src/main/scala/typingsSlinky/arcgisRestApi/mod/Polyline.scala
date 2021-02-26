package typingsSlinky.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline
  extends HasZM
     with Geometry {
  
  var paths: js.Array[js.Array[Position]] = js.native
}
object Polyline {
  
  @scala.inline
  def apply(paths: js.Array[js.Array[Position]]): Polyline = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polyline]
  }
  
  @scala.inline
  implicit class PolylineMutableBuilder[Self <: Polyline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaths(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsVarargs(value: js.Array[Position]*): Self = StObject.set(x, "paths", js.Array(value :_*))
  }
}
