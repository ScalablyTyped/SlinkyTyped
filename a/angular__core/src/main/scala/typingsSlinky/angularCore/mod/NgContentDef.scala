package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgContentDef extends StObject {
  
  /**
    * this index is checked against NodeDef.ngContentIndex to find the nodes
    * that are matched by this ng-content.
    * Note that a NodeDef with an ng-content can be reprojected, i.e.
    * have a ngContentIndex on its own.
    */
  var index: Double = js.native
}
object NgContentDef {
  
  @scala.inline
  def apply(index: Double): NgContentDef = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgContentDef]
  }
  
  @scala.inline
  implicit class NgContentDefMutableBuilder[Self <: NgContentDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
