package typingsSlinky.plottable.utilsMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.plottable.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils", "Translator")
@js.native
class Translator protected ()
  extends typingsSlinky.plottable.transformAwareTranslatorMod.Translator {
  def this(_rootElement: HTMLElement) = this()
}

/* static members */
@JSImport("plottable/build/src/utils", "Translator")
@js.native
object Translator extends js.Object {
  /**
    * Is the event's target part of the given component's DOM tree?
    */
  def isEventInside(component: Component, e: Event): Boolean = js.native
}

