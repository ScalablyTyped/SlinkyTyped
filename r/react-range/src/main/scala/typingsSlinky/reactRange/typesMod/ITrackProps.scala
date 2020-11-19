package typingsSlinky.reactRange.typesMod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITrackProps extends js.Object {
  
  def onMouseDown(e: SyntheticMouseEvent[Element]): Unit = js.native
  
  def onTouchStart(e: SyntheticTouchEvent[Element]): Unit = js.native
  
  var ref: ReactRef[_] = js.native
  
  var style: CSSProperties = js.native
}
object ITrackProps {
  
  @scala.inline
  def apply(
    onMouseDown: SyntheticMouseEvent[Element] => Unit,
    onTouchStart: SyntheticTouchEvent[Element] => Unit,
    ref: ReactRef[_],
    style: CSSProperties
  ): ITrackProps = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart), ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrackProps]
  }
  
  @scala.inline
  implicit class ITrackPropsOps[Self <: ITrackProps] (val x: Self) extends AnyVal {
    
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
    def setOnMouseDown(value: SyntheticMouseEvent[Element] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[Element] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: ReactRef[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
