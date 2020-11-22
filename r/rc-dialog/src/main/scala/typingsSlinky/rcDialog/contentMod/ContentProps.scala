package typingsSlinky.rcDialog.contentMod

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcDialog.dialogMod.IDialogChildProps
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentProps extends IDialogChildProps {
  
  var ariaId: String = js.native
  
  var motionName: String = js.native
  
  var onClick: MouseEventHandler[Element] = js.native
  
  def onVisibleChanged(visible: Boolean): Unit = js.native
}
object ContentProps {
  
  @scala.inline
  def apply(
    ariaId: String,
    getOpenCount: () => Double,
    motionName: String,
    onClick: SyntheticMouseEvent[Element] => Unit,
    onVisibleChanged: Boolean => Unit
  ): ContentProps = {
    val __obj = js.Dynamic.literal(ariaId = ariaId.asInstanceOf[js.Any], getOpenCount = js.Any.fromFunction0(getOpenCount), motionName = motionName.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onVisibleChanged = js.Any.fromFunction1(onVisibleChanged))
    __obj.asInstanceOf[ContentProps]
  }
  
  @scala.inline
  implicit class ContentPropsOps[Self <: ContentProps] (val x: Self) extends AnyVal {
    
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
    def setAriaId(value: String): Self = this.set("ariaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionName(value: String): Self = this.set("motionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVisibleChanged(value: Boolean => Unit): Self = this.set("onVisibleChanged", js.Any.fromFunction1(value))
  }
}
