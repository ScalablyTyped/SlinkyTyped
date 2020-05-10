package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkColorFilterFactory extends js.Object {
  def MakeBlend(color: SkColor, blendMode: SkBlendMode): SkColorFilter = js.native
  def MakeCompose(first: SkColorFilter, second: SkColorFilter): SkColorFilter = js.native
  def MakeLerp(lerp: Double, first: SkColorFilter, second: SkColorFilter): SkColorFilter = js.native
  def MakeLinearToSRGBGamma(): SkColorFilter = js.native
  def MakeMatrix(matrix: SkMatrix): SkColorFilter = js.native
  def MakeSRGBToLinearGamma(): SkColorFilter = js.native
}

object SkColorFilterFactory {
  @scala.inline
  def apply(
    MakeBlend: (SkColor, SkBlendMode) => SkColorFilter,
    MakeCompose: (SkColorFilter, SkColorFilter) => SkColorFilter,
    MakeLerp: (Double, SkColorFilter, SkColorFilter) => SkColorFilter,
    MakeLinearToSRGBGamma: () => SkColorFilter,
    MakeMatrix: SkMatrix => SkColorFilter,
    MakeSRGBToLinearGamma: () => SkColorFilter
  ): SkColorFilterFactory = {
    val __obj = js.Dynamic.literal(MakeBlend = js.Any.fromFunction2(MakeBlend), MakeCompose = js.Any.fromFunction2(MakeCompose), MakeLerp = js.Any.fromFunction3(MakeLerp), MakeLinearToSRGBGamma = js.Any.fromFunction0(MakeLinearToSRGBGamma), MakeMatrix = js.Any.fromFunction1(MakeMatrix), MakeSRGBToLinearGamma = js.Any.fromFunction0(MakeSRGBToLinearGamma))
    __obj.asInstanceOf[SkColorFilterFactory]
  }
  @scala.inline
  implicit class SkColorFilterFactoryOps[Self <: SkColorFilterFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMakeBlend(value: (SkColor, SkBlendMode) => SkColorFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MakeBlend")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMakeCompose(value: (SkColorFilter, SkColorFilter) => SkColorFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MakeCompose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMakeLerp(value: (Double, SkColorFilter, SkColorFilter) => SkColorFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MakeLerp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMakeLinearToSRGBGamma(value: () => SkColorFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MakeLinearToSRGBGamma")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMakeMatrix(value: SkMatrix => SkColorFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MakeMatrix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMakeSRGBToLinearGamma(value: () => SkColorFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MakeSRGBToLinearGamma")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

