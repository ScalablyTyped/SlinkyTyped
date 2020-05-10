package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to model.simplify()
  */
@js.native
trait ISimplifyOptions extends js.Object {
  /**
    * Optional
    */
  var pointMatchingDistance: js.UndefOr[Double] = js.native
  /**
    * Optional
    */
  var scalarMatchingDistance: js.UndefOr[Double] = js.native
}

object ISimplifyOptions {
  @scala.inline
  def apply(): ISimplifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISimplifyOptions]
  }
  @scala.inline
  implicit class ISimplifyOptionsOps[Self <: ISimplifyOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withScalarMatchingDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalarMatchingDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalarMatchingDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalarMatchingDistance")(js.undefined)
        ret
    }
  }
  
}

