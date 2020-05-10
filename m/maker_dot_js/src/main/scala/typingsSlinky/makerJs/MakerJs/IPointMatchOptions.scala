package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options when matching points
  */
@js.native
trait IPointMatchOptions extends js.Object {
  /**
    * Max distance to consider two points as the same.
    */
  var pointMatchingDistance: js.UndefOr[Double] = js.native
}

object IPointMatchOptions {
  @scala.inline
  def apply(): IPointMatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPointMatchOptions]
  }
  @scala.inline
  implicit class IPointMatchOptionsOps[Self <: IPointMatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPointMatchingDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointMatchingDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointMatchingDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointMatchingDistance")(js.undefined)
        ret
    }
  }
  
}

