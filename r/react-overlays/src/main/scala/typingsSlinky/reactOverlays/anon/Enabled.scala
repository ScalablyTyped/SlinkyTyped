package typingsSlinky.reactOverlays.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Enabled extends js.Object {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var modifiers: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react-overlays.react-overlays/esm/usePopper.Options['modifiers'] */ js.Any
  ] = js.native
  
  var placement: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react-overlays.react-overlays/esm/usePopper.Options['placement'] */ js.Any
  ] = js.native
  
  var strategy: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react-overlays.react-overlays/esm/usePopper.Options['strategy'] */ js.Any
  ] = js.native
}
object Enabled {
  
  @scala.inline
  def apply(): Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabled]
  }
  
  @scala.inline
  implicit class EnabledOps[Self <: Enabled] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setModifiers(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react-overlays.react-overlays/esm/usePopper.Options['modifiers'] */ js.Any
    ): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setPlacement(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react-overlays.react-overlays/esm/usePopper.Options['placement'] */ js.Any
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setStrategy(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react-overlays.react-overlays/esm/usePopper.Options['strategy'] */ js.Any
    ): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
}
