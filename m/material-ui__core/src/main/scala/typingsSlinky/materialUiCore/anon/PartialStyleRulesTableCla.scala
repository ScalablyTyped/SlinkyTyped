package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Table.TableClassKey>> */
@js.native
trait PartialStyleRulesTableCla extends StObject {
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesTableCla {
  
  @scala.inline
  def apply(): PartialStyleRulesTableCla = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTableCla]
  }
  
  @scala.inline
  implicit class PartialStyleRulesTableClaMutableBuilder[Self <: PartialStyleRulesTableCla] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
