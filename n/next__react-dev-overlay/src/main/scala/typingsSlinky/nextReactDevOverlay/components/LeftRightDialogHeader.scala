package typingsSlinky.nextReactDevOverlay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nextReactDevOverlay.leftRightDialogHeaderLeftRightDialogHeaderMod.LeftRightDialogHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LeftRightDialogHeader {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/LeftRightDialogHeader", "LeftRightDialogHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def close(value: () => Unit): this.type = set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def next(value: () => Unit): this.type = set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def nextNull: this.type = set("next", null)
    
    @scala.inline
    def previous(value: () => Unit): this.type = set("previous", js.Any.fromFunction0(value))
    
    @scala.inline
    def previousNull: this.type = set("previous", null)
  }
  
  implicit def make(companion: LeftRightDialogHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LeftRightDialogHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
