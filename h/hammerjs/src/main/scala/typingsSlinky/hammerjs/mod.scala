package typingsSlinky.hammerjs

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", JSImport.Namespace)
  @js.native
  class ^ protected () extends HammerManager {
    def this(element: HTMLElement) = this()
    def this(element: SVGElement) = this()
    def this(element: HTMLElement, options: HammerOptions) = this()
    def this(element: SVGElement, options: HammerOptions) = this()
  }
  @JSImport("hammerjs", JSImport.Namespace)
  @js.native
  val ^ : HammerStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Manager")
  @js.native
  class Manager protected () extends HammerManager {
    def this(element: EventTarget) = this()
    def this(element: EventTarget, options: HammerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Pan")
  @js.native
  class Pan () extends AttrRecognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Pinch")
  @js.native
  class Pinch () extends AttrRecognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Press")
  @js.native
  class Press () extends AttrRecognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Recognizer")
  @js.native
  class Recognizer ()
    extends typingsSlinky.hammerjs.Recognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Rotate")
  @js.native
  class Rotate () extends AttrRecognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Swipe")
  @js.native
  class Swipe () extends AttrRecognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hammerjs", "Tap")
  @js.native
  class Tap () extends AttrRecognizer {
    def this(options: RecognizerOptions) = this()
  }
  
  type _To = HammerStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HammerStatic = ^
}
