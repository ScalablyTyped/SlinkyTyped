package typingsSlinky.reactFauxDom

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactFauxDom.anon.GetPropertyValue
import typingsSlinky.reactFauxDom.reactFauxDomStrings.animateFauxDOM
import typingsSlinky.reactFauxDom.reactFauxDomStrings.connectFauxDOM
import typingsSlinky.reactFauxDom.reactFauxDomStrings.drawFauxDOM
import typingsSlinky.reactFauxDom.reactFauxDomStrings.isAnimatingFauxDOM
import typingsSlinky.reactFauxDom.reactFauxDomStrings.stopAnimatingFauxDOM
import typingsSlinky.std.Exclude
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-faux-dom", "Element")
  @js.native
  class Element protected () extends HTMLElement {
    def this(nodeName: String) = this()
    def this(nodeName: String, parentNode: Element) = this()
    
    def toReact(): ReactElement = js.native
  }
  
  @JSImport("react-faux-dom", "compareDocumentPosition")
  @js.native
  def compareDocumentPosition(): Double = js.native
  
  @JSImport("react-faux-dom", "createElement")
  @js.native
  def createElement(nodeName: String): Element = js.native
  
  @JSImport("react-faux-dom", "createElementNS")
  @js.native
  def createElementNS(namespace: String, nodeName: String): Element = js.native
  
  object defaultView {
    
    @JSImport("react-faux-dom", "defaultView.getComputedStyle")
    @js.native
    def getComputedStyle(node: Element): GetPropertyValue = js.native
  }
  
  @JSImport("react-faux-dom", "withFauxDOM")
  @js.native
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
  trait ReactFauxDomProps extends StObject {
    
    def animateFauxDOM(duration: Double): Unit = js.native
    
    def connectFauxDOM(node: String, name: String): Element = js.native
    def connectFauxDOM(node: String, name: String, discardNode: js.Any): Element = js.native
    
    def drawFauxDOM(): Unit = js.native
    
    def isAnimatingFauxDOM(): Boolean = js.native
    
    def stopAnimatingFauxDOM(): Unit = js.native
  }
}
