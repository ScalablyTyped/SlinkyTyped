package typingsSlinky.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleLayout
  extends Layout
     with _AnyLayout {
  
  var `circle-sort-key`: js.UndefOr[Double | Expression] = js.native
}
object CircleLayout {
  
  @scala.inline
  def apply(): CircleLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleLayout]
  }
  
  @scala.inline
  implicit class CircleLayoutMutableBuilder[Self <: CircleLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setCircle-sort-key`(value: Double | Expression): Self = StObject.set(x, "circle-sort-key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCircle-sort-keyUndefined`: Self = StObject.set(x, "circle-sort-key", js.undefined)
  }
}
