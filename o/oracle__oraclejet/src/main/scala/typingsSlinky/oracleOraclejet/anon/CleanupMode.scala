package typingsSlinky.oracleOraclejet.anon

import org.scalajs.dom.raw.Node
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.onDisconnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CleanupMode extends StObject {
  
  var cleanupMode: js.UndefOr[onDisconnect | none] = js.native
  
  var view: js.Array[Node] = js.native
  
  var viewModel: js.Object | Null = js.native
}
object CleanupMode {
  
  @scala.inline
  def apply(view: js.Array[Node]): CleanupMode = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[CleanupMode]
  }
  
  @scala.inline
  implicit class CleanupModeMutableBuilder[Self <: CleanupMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCleanupMode(value: onDisconnect | none): Self = StObject.set(x, "cleanupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCleanupModeUndefined: Self = StObject.set(x, "cleanupMode", js.undefined)
    
    @scala.inline
    def setView(value: js.Array[Node]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: js.Object): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelNull: Self = StObject.set(x, "viewModel", null)
    
    @scala.inline
    def setViewVarargs(value: Node*): Self = StObject.set(x, "view", js.Array(value :_*))
  }
}
