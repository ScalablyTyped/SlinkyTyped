package typingsSlinky.graphqlCompose.resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveDebugOpts extends js.Object {
  
  var colors: js.UndefOr[Boolean] = js.native
  
  var depth: js.UndefOr[Double] = js.native
  
  var showHidden: js.UndefOr[Boolean] = js.native
}
object ResolveDebugOpts {
  
  @scala.inline
  def apply(): ResolveDebugOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveDebugOpts]
  }
  
  @scala.inline
  implicit class ResolveDebugOptsOps[Self <: ResolveDebugOpts] (val x: Self) extends AnyVal {
    
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
    def setColors(value: Boolean): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setShowHidden(value: Boolean): Self = this.set("showHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHidden: Self = this.set("showHidden", js.undefined)
  }
}
