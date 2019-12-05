package typingsSlinky.plottable

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.plottable.buildSrcComponentsComponentMod.Component
import typingsSlinky.plottable.buildSrcCoreInterfacesMod.Point
import typingsSlinky.plottable.buildSrcUtilsTransformAwareTranslatorMod.Translator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/transformAwareTranslator", JSImport.Namespace)
@js.native
object buildSrcUtilsTransformAwareTranslatorMod extends js.Object {
  @js.native
  class Translator protected () extends js.Object {
    def this(_rootElement: HTMLElement) = this()
    var _rootElement: js.Any = js.native
    /**
      * Given `document` client coordinates, computes the position relative to the
      * `Component`'s root element, taking into account the cumulative CSS3
      * transforms of the root element ancestors up to `<body>`.
      *
      * This triggers a layout but doesn't further modify the DOM, so causes a
      * maximum of one layout per frame.
      *
      * Does not support `transform-origin` CSS property other than the default.
      */
    def computePosition(clientX: Double, clientY: Double): Point = js.native
  }
  
  def getTranslator(component: Component): Translator = js.native
  /* static members */
  @js.native
  object Translator extends js.Object {
    /**
      * Is the event's target part of the given component's DOM tree?
      */
    def isEventInside(component: Component, e: Event): Boolean = js.native
  }
  
}

