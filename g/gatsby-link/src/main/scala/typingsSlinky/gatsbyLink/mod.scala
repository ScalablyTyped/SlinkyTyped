package typingsSlinky.gatsbyLink

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reachRouter.mod.LinkProps
import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gatsby-link", JSImport.Default)
  @js.native
  class default[TState] ()
    extends Component[GatsbyLinkProps[TState], js.Any, js.Any]
  
  @JSImport("gatsby-link", "navigate")
  @js.native
  val navigate: NavigateFn = js.native
  
  @JSImport("gatsby-link", "navigateTo")
  @js.native
  def navigateTo(to: String): Unit = js.native
  
  @JSImport("gatsby-link", "push")
  @js.native
  def push(to: String): Unit = js.native
  
  @JSImport("gatsby-link", "replace")
  @js.native
  def replace(to: String): Unit = js.native
  
  @JSImport("gatsby-link", "withAssetPrefix")
  @js.native
  def withAssetPrefix(path: String): String = js.native
  
  @JSImport("gatsby-link", "withPrefix")
  @js.native
  def withPrefix(path: String): String = js.native
  
  type GatsbyLink[TState] = ReactComponentClass[GatsbyLinkProps[TState]]
  
  @js.native
  trait GatsbyLinkProps[TState] extends LinkProps[TState] {
    
    /** A class to apply when this Link is active */
    var activeClassName: js.UndefOr[String] = js.native
    
    /** Inline styles for when this Link is active */
    var activeStyle: js.UndefOr[js.Object] = js.native
    
    @JSName("onClick")
    var onClick_GatsbyLinkProps: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLAnchorElement], Unit]] = js.native
    
    /** Class the link as highlighted if there is a partial match via a the `to` being prefixed to the current url */
    var partiallyActive: js.UndefOr[Boolean] = js.native
  }
  object GatsbyLinkProps {
    
    @scala.inline
    def apply[TState](to: String): GatsbyLinkProps[TState] = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatsbyLinkProps[TState]]
    }
    
    @scala.inline
    implicit class GatsbyLinkPropsMutableBuilder[Self <: GatsbyLinkProps[_], TState] (val x: Self with GatsbyLinkProps[TState]) extends AnyVal {
      
      @scala.inline
      def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      @scala.inline
      def setActiveStyle(value: js.Object): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ SyntheticMouseEvent[HTMLAnchorElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPartiallyActive(value: Boolean): Self = StObject.set(x, "partiallyActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartiallyActiveUndefined: Self = StObject.set(x, "partiallyActive", js.undefined)
    }
  }
}
