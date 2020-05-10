package typingsSlinky.makerJs.MakerJs

import typingsSlinky.makerJs.MakerJs.measure.Atlas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to model.combine.
  */
@js.native
trait ICombineOptions extends IPointMatchOptions {
  /**
    * Point which is known to be outside of the model.
    */
  var farPoint: js.UndefOr[IPoint] = js.native
  /**
    * Cached measurements for model A.
    */
  var measureA: js.UndefOr[Atlas] = js.native
  /**
    * Cached measurements for model B.
    */
  var measureB: js.UndefOr[Atlas] = js.native
  /**
    * Flag to remove paths which are not part of a loop.
    */
  var trimDeadEnds: js.UndefOr[Boolean] = js.native
}

object ICombineOptions {
  @scala.inline
  def apply(): ICombineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICombineOptions]
  }
  @scala.inline
  implicit class ICombineOptionsOps[Self <: ICombineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFarPoint(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("farPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFarPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("farPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureA(value: Atlas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureA")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureB(value: Atlas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureB")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimDeadEnds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimDeadEnds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimDeadEnds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimDeadEnds")(js.undefined)
        ret
    }
  }
  
}

