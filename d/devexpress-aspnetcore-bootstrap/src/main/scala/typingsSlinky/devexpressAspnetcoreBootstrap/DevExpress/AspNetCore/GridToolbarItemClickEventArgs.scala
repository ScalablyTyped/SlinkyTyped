package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridToolbarItemClickEventArgs extends ProcessingModeEventArgs {
  
  val item: BootstrapMenuItem = js.native
  
  val toolbarIndex: Double = js.native
  
  val toolbarName: String = js.native
  
  var usePostBack: Boolean = js.native
}
object GridToolbarItemClickEventArgs {
  
  @scala.inline
  def apply(
    item: BootstrapMenuItem,
    processOnServer: Boolean,
    sender: Control,
    toolbarIndex: Double,
    toolbarName: String,
    usePostBack: Boolean
  ): GridToolbarItemClickEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], toolbarIndex = toolbarIndex.asInstanceOf[js.Any], toolbarName = toolbarName.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridToolbarItemClickEventArgs]
  }
  
  @scala.inline
  implicit class GridToolbarItemClickEventArgsMutableBuilder[Self <: GridToolbarItemClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: BootstrapMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarIndex(value: Double): Self = StObject.set(x, "toolbarIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarName(value: String): Self = StObject.set(x, "toolbarName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePostBack(value: Boolean): Self = StObject.set(x, "usePostBack", value.asInstanceOf[js.Any])
  }
}
