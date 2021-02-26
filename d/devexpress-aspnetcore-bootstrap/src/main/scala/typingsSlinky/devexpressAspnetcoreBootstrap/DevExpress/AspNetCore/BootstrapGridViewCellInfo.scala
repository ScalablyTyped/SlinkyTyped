package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapGridViewCellInfo extends StObject {
  
  val instance: js.Any = js.native
  
  val rowVisibleIndex: Double = js.native
}
object BootstrapGridViewCellInfo {
  
  @scala.inline
  def apply(instance: js.Any, rowVisibleIndex: Double): BootstrapGridViewCellInfo = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], rowVisibleIndex = rowVisibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapGridViewCellInfo]
  }
  
  @scala.inline
  implicit class BootstrapGridViewCellInfoMutableBuilder[Self <: BootstrapGridViewCellInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowVisibleIndex(value: Double): Self = StObject.set(x, "rowVisibleIndex", value.asInstanceOf[js.Any])
  }
}
