package typingsSlinky.rmcCalendar.anon

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnFinish extends js.Object {
  
  def onFinish(): Unit = js.native
  
  def onTouchCancel(): Unit = js.native
  
  def onTouchEnd(): Unit = js.native
  
  def onTouchMove(evt: SyntheticTouchEvent[HTMLDivElement]): Unit = js.native
  
  def onTouchStart(evt: SyntheticTouchEvent[HTMLDivElement]): Unit = js.native
}
object OnFinish {
  
  @scala.inline
  def apply(
    onFinish: () => Unit,
    onTouchCancel: () => Unit,
    onTouchEnd: () => Unit,
    onTouchMove: SyntheticTouchEvent[HTMLDivElement] => Unit,
    onTouchStart: SyntheticTouchEvent[HTMLDivElement] => Unit
  ): OnFinish = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), onTouchCancel = js.Any.fromFunction0(onTouchCancel), onTouchEnd = js.Any.fromFunction0(onTouchEnd), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart))
    __obj.asInstanceOf[OnFinish]
  }
  
  @scala.inline
  implicit class OnFinishOps[Self <: OnFinish] (val x: Self) extends AnyVal {
    
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
    def setOnFinish(value: () => Unit): Self = this.set("onFinish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTouchCancel(value: () => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTouchEnd(value: () => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTouchMove(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
  }
}
