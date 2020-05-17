package typingsSlinky.fhirJsClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Any extends js.Object {
  /**
    * Returns the valueQuantity value as number. (As it is)
    */
  def any(valueQuantity: js.Any): Double = js.native
  /**
    * Converts the valueQuantity passed into cm based on the code
    */
  def cm(valueQuantity: js.Any): Double = js.native
  /**
    * Converts the valueQuantity passed into kg based on the code
    */
  def kg(valueQuantity: js.Any): Double = js.native
}

object Any {
  @scala.inline
  def apply(any: js.Any => Double, cm: js.Any => Double, kg: js.Any => Double): Any = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), cm = js.Any.fromFunction1(cm), kg = js.Any.fromFunction1(kg))
    __obj.asInstanceOf[Any]
  }
  @scala.inline
  implicit class AnyOps[Self <: Any] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAny(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCm(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKg(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kg")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

