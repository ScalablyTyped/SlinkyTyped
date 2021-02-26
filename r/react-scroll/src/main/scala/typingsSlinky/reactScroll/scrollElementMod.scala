package typingsSlinky.reactScroll

import slinky.core.ReactComponentClass
import typingsSlinky.reactScroll.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollElementMod {
  
  @JSImport("react-scroll/modules/mixins/scroll-element", JSImport.Default)
  @js.native
  def default[P](component: ReactComponentClass[P]): ReactComponentClass[ScrollElementProps[P]] = js.native
  
  type ScrollElementProps[P] = P with Id
}
