package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapResultAxisOptions
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Optional="false" the count of the $.ig.OlapResultAxisMember objects of each tuple.
  	 */
  var tupleSize: js.UndefOr[Double] = js.native
  /**
  	 * Optional="false" array of $.ig.OlapResultTuple objects which form the axis.
  	 */
  var tuples: js.UndefOr[js.Array[_]] = js.native
}

object OlapResultAxisOptions {
  @scala.inline
  def apply(): OlapResultAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapResultAxisOptions]
  }
  @scala.inline
  implicit class OlapResultAxisOptionsOps[Self <: OlapResultAxisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTupleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tupleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTupleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tupleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTuples(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tuples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTuples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tuples")(js.undefined)
        ret
    }
  }
  
}

