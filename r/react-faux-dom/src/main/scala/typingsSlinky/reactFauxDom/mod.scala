package typingsSlinky.reactFauxDom

import org.scalajs.dom.raw.CSSStyleDeclaration
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.std.Exclude
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.HTMLSlotElement
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-faux-dom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Element protected () extends HTMLElement {
    def this(nodeName: String) = this()
    def this(nodeName: String, parentNode: Element) = this()
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    /* CompleteClass */
    override var contentEditable: String = js.native
    /* CompleteClass */
    override var innerHTML: String = js.native
    /* CompleteClass */
    override var inputMode: String = js.native
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val nextElementSibling: org.scalajs.dom.raw.Element | Null = js.native
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val previousElementSibling: org.scalajs.dom.raw.Element | Null = js.native
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
    def toReact(): ReactElement = js.native
  }
  
  @js.native
  trait ReactFauxDomProps extends js.Object {
    def animateFauxDOM(duration: Double): Unit = js.native
    def connectFauxDOM(node: String, name: String): Element = js.native
    def connectFauxDOM(node: String, name: String, discardNode: js.Any): Element = js.native
    def drawFauxDOM(): Unit = js.native
    def isAnimatingFauxDOM(): Boolean = js.native
    def stopAnimatingFauxDOM(): Unit = js.native
  }
  
  def compareDocumentPosition(): Double = js.native
  def createElement(nodeName: String): Element = js.native
  def createElementNS(namespace: String, nodeName: String): Element = js.native
  def withFauxDOM[P](WrappedComponent: ReactComponentClass[P]): ReactComponentClass[Pick[P, Exclude[String, String]]] = js.native
  @js.native
  object defaultView extends js.Object {
    def getComputedStyle(node: Element): AnonGetPropertyValue = js.native
  }
  
}

