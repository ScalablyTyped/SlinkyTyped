package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableBody.TableBodyClassKey>> */
@js.native
trait PartialStyleRulesTableBod extends js.Object {
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesTableBod {
  
  @scala.inline
  def apply(): PartialStyleRulesTableBod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTableBod]
  }
  
  @scala.inline
  implicit class PartialStyleRulesTableBodOps[Self <: PartialStyleRulesTableBod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
