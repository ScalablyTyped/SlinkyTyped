package typingsSlinky.distributionsPoissonQuantile.anon

import typingsSlinky.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8
import typingsSlinky.distributionsPoissonQuantile.mod.Data
import typingsSlinky.distributionsPoissonQuantile.mod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype  :'uint8'} */
@js.native
trait Optionsdtypeuint8 extends js.Object {
  /** accessor function for accessing array values */
  var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.native
  /** boolean indicating if the function should return a new data structure, default=true */
  var copy: js.UndefOr[Boolean] = js.native
  /** output data type, default="float64" */
  var dtype: js.UndefOr[DataType with uint8] = js.native
  /** mean parameter, default=1 */
  var lambda: js.UndefOr[Double] = js.native
  /** deep get/set key path */
  var path: js.UndefOr[String] = js.native
  /** deep get/set key path separator, default="." */
  var sep: js.UndefOr[String] = js.native
}

object Optionsdtypeuint8 {
  @scala.inline
  def apply(): Optionsdtypeuint8 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optionsdtypeuint8]
  }
  @scala.inline
  implicit class Optionsdtypeuint8Ops[Self <: Optionsdtypeuint8] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessor(value: (/* d */ Data, /* i */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAccessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessor")(js.undefined)
        ret
    }
    @scala.inline
    def withCopy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withDtype(value: DataType with uint8): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtype")(js.undefined)
        ret
    }
    @scala.inline
    def withLambda(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambda: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sep")(js.undefined)
        ret
    }
  }
  
}

