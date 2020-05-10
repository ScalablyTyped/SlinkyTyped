package typingsSlinky.openjscad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICenter extends js.Object {
  def center(cAxes: js.Array[String]): CxG = js.native
}

object ICenter {
  @scala.inline
  def apply(center: js.Array[String] => CxG): ICenter = {
    val __obj = js.Dynamic.literal(center = js.Any.fromFunction1(center))
    __obj.asInstanceOf[ICenter]
  }
  @scala.inline
  implicit class ICenterOps[Self <: ICenter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: js.Array[String] => CxG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

