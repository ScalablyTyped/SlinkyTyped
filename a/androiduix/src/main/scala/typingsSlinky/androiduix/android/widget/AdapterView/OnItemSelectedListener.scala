package typingsSlinky.androiduix.android.widget.AdapterView

import typingsSlinky.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnItemSelectedListener extends js.Object {
  
  def onItemSelected(
    parent: typingsSlinky.androiduix.android.widget.AdapterView[_],
    view: View,
    position: Double,
    id: Double
  ): Unit = js.native
  
  def onNothingSelected(parent: typingsSlinky.androiduix.android.widget.AdapterView[_]): Unit = js.native
}
object OnItemSelectedListener {
  
  @scala.inline
  def apply(
    onItemSelected: (typingsSlinky.androiduix.android.widget.AdapterView[_], View, Double, Double) => Unit,
    onNothingSelected: typingsSlinky.androiduix.android.widget.AdapterView[_] => Unit
  ): OnItemSelectedListener = {
    val __obj = js.Dynamic.literal(onItemSelected = js.Any.fromFunction4(onItemSelected), onNothingSelected = js.Any.fromFunction1(onNothingSelected))
    __obj.asInstanceOf[OnItemSelectedListener]
  }
  
  @scala.inline
  implicit class OnItemSelectedListenerOps[Self <: OnItemSelectedListener] (val x: Self) extends AnyVal {
    
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
    def setOnItemSelected(value: (typingsSlinky.androiduix.android.widget.AdapterView[_], View, Double, Double) => Unit): Self = this.set("onItemSelected", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnNothingSelected(value: typingsSlinky.androiduix.android.widget.AdapterView[_] => Unit): Self = this.set("onNothingSelected", js.Any.fromFunction1(value))
  }
}
