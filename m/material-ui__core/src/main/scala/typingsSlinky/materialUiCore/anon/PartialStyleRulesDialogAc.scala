package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/DialogActions.DialogActionsClassKey>> */
@js.native
trait PartialStyleRulesDialogAc extends StObject {
  
  var action: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesDialogAc {
  
  @scala.inline
  def apply(): PartialStyleRulesDialogAc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesDialogAc]
  }
  
  @scala.inline
  implicit class PartialStyleRulesDialogAcMutableBuilder[Self <: PartialStyleRulesDialogAc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: CSSProperties): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
