package typingsSlinky.reactMathjax

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactMathjax.anon.Children
import typingsSlinky.reactMathjax.anon.Formula
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-mathjax", "default.Node")
    @js.native
    class Node ()
      extends PureComponent[Formula, js.Object, js.Any]
    
    @JSImport("react-mathjax", "default.Provider")
    @js.native
    class Provider ()
      extends Component[Children, MathJaxContextValue, js.Any]
  }
  
  object MathJax {
    
    type Node = ReactComponentClass[Formula]
    
    type Provider = ReactComponentClass[Children]
  }
  
  @js.native
  trait MathJaxContextValue extends StObject {
    
    var MathJax: js.UndefOr[js.Object] = js.native
    
    def registerNode(): Unit = js.native
  }
  object MathJaxContextValue {
    
    @scala.inline
    def apply(registerNode: () => Unit): MathJaxContextValue = {
      val __obj = js.Dynamic.literal(registerNode = js.Any.fromFunction0(registerNode))
      __obj.asInstanceOf[MathJaxContextValue]
    }
    
    @scala.inline
    implicit class MathJaxContextValueMutableBuilder[Self <: MathJaxContextValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMathJax(value: js.Object): Self = StObject.set(x, "MathJax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMathJaxUndefined: Self = StObject.set(x, "MathJax", js.undefined)
      
      @scala.inline
      def setRegisterNode(value: () => Unit): Self = StObject.set(x, "registerNode", js.Any.fromFunction0(value))
    }
  }
}
