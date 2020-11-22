package typingsSlinky.antd.operationMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.configProviderContextMod.DirectionType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferOperationProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[DirectionType] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var leftActive: js.UndefOr[Boolean] = js.native
  
  var leftArrowText: js.UndefOr[String] = js.native
  
  var moveToLeft: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var moveToRight: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var oneWay: js.UndefOr[Boolean] = js.native
  
  var rightActive: js.UndefOr[Boolean] = js.native
  
  var rightArrowText: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object TransferOperationProps {
  
  @scala.inline
  def apply(): TransferOperationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOperationProps]
  }
  
  @scala.inline
  implicit class TransferOperationPropsOps[Self <: TransferOperationProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDirection(value: DirectionType): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setLeftActive(value: Boolean): Self = this.set("leftActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftActive: Self = this.set("leftActive", js.undefined)
    
    @scala.inline
    def setLeftArrowText(value: String): Self = this.set("leftArrowText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftArrowText: Self = this.set("leftArrowText", js.undefined)
    
    @scala.inline
    def setMoveToLeft(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = this.set("moveToLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMoveToLeft: Self = this.set("moveToLeft", js.undefined)
    
    @scala.inline
    def setMoveToRight(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = this.set("moveToRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMoveToRight: Self = this.set("moveToRight", js.undefined)
    
    @scala.inline
    def setOneWay(value: Boolean): Self = this.set("oneWay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneWay: Self = this.set("oneWay", js.undefined)
    
    @scala.inline
    def setRightActive(value: Boolean): Self = this.set("rightActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightActive: Self = this.set("rightActive", js.undefined)
    
    @scala.inline
    def setRightArrowText(value: String): Self = this.set("rightArrowText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightArrowText: Self = this.set("rightArrowText", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
