package typingsSlinky.reactScroll

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactScroll.linkMod.ReactScrollLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("react-scroll/modules/components/Button", JSImport.Default)
  @js.native
  class default ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  type Button = ReactComponentClass[ButtonProps]
  
  type ButtonProps = ReactScrollLinkProps with HTMLProps[HTMLButtonElement]
}
