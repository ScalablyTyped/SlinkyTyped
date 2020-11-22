package typingsSlinky.reactNativeScreens.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenStackProps extends ViewProps {
  
  /**
    * @description A callback that gets called when the current screen finishes its transition.
    */
  var onFinishTransitioning: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
}
object ScreenStackProps {
  
  @scala.inline
  def apply(): ScreenStackProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenStackProps]
  }
  
  @scala.inline
  implicit class ScreenStackPropsOps[Self <: ScreenStackProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnFinishTransitioning(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onFinishTransitioning", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFinishTransitioning: Self = this.set("onFinishTransitioning", js.undefined)
  }
}
