package typingsSlinky.reactFauxDom

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactFauxDom.reactFauxDomStrings.animateFauxDOM
import typingsSlinky.reactFauxDom.reactFauxDomStrings.connectFauxDOM
import typingsSlinky.reactFauxDom.reactFauxDomStrings.drawFauxDOM
import typingsSlinky.reactFauxDom.reactFauxDomStrings.isAnimatingFauxDOM
import typingsSlinky.reactFauxDom.reactFauxDomStrings.stopAnimatingFauxDOM
import typingsSlinky.std.Exclude
import typingsSlinky.std.HTMLElement
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
  def withFauxDOM[P](WrappedComponent: ReactComponentClass[P]): ReactComponentClass[
    Pick[
      P, 
      Exclude[
        /* keyof P */ String, 
        /* keyof react-faux-dom.react-faux-dom.ReactFauxDomProps */ connectFauxDOM | drawFauxDOM | animateFauxDOM | stopAnimatingFauxDOM | isAnimatingFauxDOM
      ]
    ]
  ] = js.native
  @js.native
  object defaultView extends js.Object {
    def getComputedStyle(node: Element): AnonGetPropertyValue = js.native
  }
  
}

