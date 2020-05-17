package typingsSlinky.activexStdole.stdole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StdPicture extends js.Object {
  val Handle: Double = js.native
  val Height: Double = js.native
  val Type: Double = js.native
  val Width: Double = js.native
  val hPal: Double = js.native
  @JSName("stdole.StdPicture_typekey")
  var stdoleDotStdPicture_typekey: StdPicture = js.native
  def Render(
    hdc: Double,
    x: Double,
    y: Double,
    cx: Double,
    cy: Double,
    xSrc: Double,
    ySrc: Double,
    cxSrc: Double,
    cySrc: Double
  ): Unit = js.native
}

object StdPicture {
  @scala.inline
  def apply(
    Handle: Double,
    Height: Double,
    Render: (Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    Type: Double,
    Width: Double,
    hPal: Double,
    stdoleDotStdPicture_typekey: StdPicture
  ): StdPicture = {
    val __obj = js.Dynamic.literal(Handle = Handle.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Render = js.Any.fromFunction9(Render), Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], hPal = hPal.asInstanceOf[js.Any])
    __obj.updateDynamic("stdole.StdPicture_typekey")(stdoleDotStdPicture_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StdPicture]
  }
  @scala.inline
  implicit class StdPictureOps[Self <: StdPicture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: (Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Render")(js.Any.fromFunction9(value))
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHPal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hPal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdoleDotStdPicture_typekey(value: StdPicture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdole.StdPicture_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

