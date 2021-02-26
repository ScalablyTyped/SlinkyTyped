package typingsSlinky.reactTextareaAutosize

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.UIEvent
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.useComposedRef.mod.UserRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-textarea-autosize/dist/declarations/src/hooks", "useComposedRef")
  @js.native
  def useComposedRef[T /* <: HTMLElement */](libRef: MutableRefObject[T | Null], userRef: UserRef[T]): js.Function1[/* instance */ T | Null, Unit] = js.native
  
  @JSImport("react-textarea-autosize/dist/declarations/src/hooks", "useWindowResizeListener")
  @js.native
  def useWindowResizeListener(listener: js.Function1[/* event */ UIEvent, _]): Unit = js.native
}
