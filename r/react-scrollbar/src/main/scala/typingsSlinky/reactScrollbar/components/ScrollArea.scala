package typingsSlinky.reactScrollbar.components

import typingsSlinky.reactScrollbar.ScrollAreaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollArea {
  
  @JSGlobal("ScrollArea")
  @js.native
  object component extends js.Object
  
  def withProps(p: ScrollAreaProps): SharedBuilder_ScrollAreaProps_622662951[typingsSlinky.reactScrollbar.global.ScrollArea] = new SharedBuilder_ScrollAreaProps_622662951[typingsSlinky.reactScrollbar.global.ScrollArea](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ScrollArea.type): SharedBuilder_ScrollAreaProps_622662951[typingsSlinky.reactScrollbar.global.ScrollArea] = new SharedBuilder_ScrollAreaProps_622662951[typingsSlinky.reactScrollbar.global.ScrollArea](js.Array(this.component, js.Dictionary.empty))()
}
