package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable3
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.form.HorizontalSlider.Mover
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHorizontalSlider extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/HorizontalSlider._Mover.html
    *
    * 
    * @param node a node (or node's id) to be moved     
    * @param e a mouse event, which started the move;only pageX and pageY properties are used     
    * @param host       Optionalobject which implements the functionality of the move,and defines proper events (onMoveStart and onMoveStop)     
    */
  var _Mover: Instantiable3[/* node */ HTMLElement, /* e */ Event_, js.UndefOr[/* host */ js.Object], Mover] = js.native
}

object TypeofHorizontalSlider {
  @scala.inline
  def apply(
    _Mover: Instantiable3[/* node */ HTMLElement, /* e */ Event_, js.UndefOr[/* host */ js.Object], Mover]
  ): TypeofHorizontalSlider = {
    val __obj = js.Dynamic.literal(_Mover = _Mover.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofHorizontalSlider]
  }
  @scala.inline
  implicit class TypeofHorizontalSliderOps[Self <: TypeofHorizontalSlider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_Mover(
      value: Instantiable3[/* node */ HTMLElement, /* e */ Event_, js.UndefOr[/* host */ js.Object], Mover]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Mover")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

