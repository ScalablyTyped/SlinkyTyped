package typingsSlinky.rcMotion

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.rcMotion.anon.CSSMotionPropsrefRefanyun
import typingsSlinky.rcMotion.cssmotionlistMod.CSSMotionListProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-motion", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CSSMotionPropsrefRefanyun] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-motion", "CSSMotionList")
  @js.native
  class CSSMotionList protected ()
    extends Component[CSSMotionListProps, js.Any, js.Any] {
    def this(props: CSSMotionListProps) = this()
    def this(props: CSSMotionListProps, context: js.Any) = this()
  }
  @JSImport("rc-motion", "CSSMotionList")
  @js.native
  val CSSMotionList: ReactComponentClass[CSSMotionListProps] = js.native
  
  type _To = ForwardRefExoticComponent[CSSMotionPropsrefRefanyun]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[CSSMotionPropsrefRefanyun] = default
}
