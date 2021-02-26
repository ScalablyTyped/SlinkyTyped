package typingsSlinky.reactScroll

import slinky.core.ReactComponentClass
import typingsSlinky.reactScroll.anon.Container
import typingsSlinky.reactScroll.linkMod.ReactScrollLinkProps
import typingsSlinky.reactScroll.scrollerMod.Scroller
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollLinkMod {
  
  @JSImport("react-scroll/modules/mixins/scroll-link", JSImport.Default)
  @js.native
  def default[P](component: ReactComponentClass[P]): ReactComponentClass[ScrollLinkProps[P]] = js.native
  @JSImport("react-scroll/modules/mixins/scroll-link", JSImport.Default)
  @js.native
  def default[P](component: ReactComponentClass[P], customScroller: Scroller): ReactComponentClass[ScrollLinkProps[P]] = js.native
  
  type ScrollLinkProps[P] = ReactScrollLinkProps with P with Container
}
