package typingsSlinky.imageSize.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISizeCalculationResult extends ISize {
  var images: js.UndefOr[js.Array[ISize]] = js.native
}

object ISizeCalculationResult {
  @scala.inline
  def apply(): ISizeCalculationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISizeCalculationResult]
  }
  @scala.inline
  implicit class ISizeCalculationResultOps[Self <: ISizeCalculationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImages(value: js.Array[ISize]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
  }
  
}

