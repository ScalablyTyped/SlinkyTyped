package typingsSlinky.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  /** Floating point value. When this is set, other values must not be set. */
  var fpVal: js.UndefOr[Double] = js.native
  /** Integer value. When this is set, other values must not be set. */
  var intVal: js.UndefOr[Double] = js.native
  /**
    * Map value. The valid key space and units for the corresponding value of each entry should be documented as part of the data type definition. Keys
    * should be kept small whenever possible. Data streams with large keys and high data frequency may be down sampled.
    */
  var mapVal: js.UndefOr[js.Array[ValueMapValEntry]] = js.native
  /**
    * String value. When this is set, other values must not be set. Strings should be kept small whenever possible. Data streams with large string values and
    * high data frequency may be down sampled.
    */
  var stringVal: js.UndefOr[String] = js.native
}

object Value {
  @scala.inline
  def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFpVal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fpVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFpVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fpVal")(js.undefined)
        ret
    }
    @scala.inline
    def withIntVal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intVal")(js.undefined)
        ret
    }
    @scala.inline
    def withMapVal(value: js.Array[ValueMapValEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapVal")(js.undefined)
        ret
    }
    @scala.inline
    def withStringVal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringVal")(js.undefined)
        ret
    }
  }
  
}

