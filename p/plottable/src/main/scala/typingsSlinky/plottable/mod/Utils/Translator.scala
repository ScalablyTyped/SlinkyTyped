package typingsSlinky.plottable.mod.Utils

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.plottable.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable", "Utils.Translator")
@js.native
class Translator protected ()
  extends typingsSlinky.plottable.utilsMod.Translator {
  def this(_rootElement: HTMLElement) = this()
}
/* static members */
@JSImport("plottable", "Utils.Translator")
@js.native
object Translator extends js.Object {
  
  /**
    * Is the event's target part of the given component's DOM tree?
    */
  def isEventInside(component: Component, e: Event): Boolean = js.native
}
