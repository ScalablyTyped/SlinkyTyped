package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.clickAwayListenerMod.ClickAwayListenerProps
import typingsSlinky.materialUi.clickAwayListenerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClickAwayListener {
  
  @JSImport("material-ui/internal/ClickAwayListener", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def onClickAway(value: js.Any): this.type = set("onClickAway", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ClickAwayListener.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ClickAwayListenerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
