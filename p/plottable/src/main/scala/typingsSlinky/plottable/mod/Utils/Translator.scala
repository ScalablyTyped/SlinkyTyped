package typingsSlinky.plottable.mod.Utils

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.plottable.componentMod.Component
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def isEventInside(component: Component, e: Event_): Boolean = js.native
}

