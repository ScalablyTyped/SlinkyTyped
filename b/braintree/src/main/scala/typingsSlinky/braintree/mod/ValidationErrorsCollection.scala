package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationErrorsCollection extends js.Object {
  def deepErrors(): js.Array[ValidationError] = js.native
  def `for`(name: String): ValidationErrorsCollection = js.native
  def forIndex(index: Double): ValidationErrorsCollection = js.native
  def on(name: String): ValidationError = js.native
}

object ValidationErrorsCollection {
  @scala.inline
  def apply(
    deepErrors: () => js.Array[ValidationError],
    `for`: String => ValidationErrorsCollection,
    forIndex: Double => ValidationErrorsCollection,
    on: String => ValidationError
  ): ValidationErrorsCollection = {
    val __obj = js.Dynamic.literal(deepErrors = js.Any.fromFunction0(deepErrors), forIndex = js.Any.fromFunction1(forIndex), on = js.Any.fromFunction1(on))
    __obj.updateDynamic("for")(js.Any.fromFunction1(`for`))
    __obj.asInstanceOf[ValidationErrorsCollection]
  }
  @scala.inline
  implicit class ValidationErrorsCollectionOps[Self <: ValidationErrorsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeepErrors(value: () => js.Array[ValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFor(value: String => ValidationErrorsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForIndex(value: Double => ValidationErrorsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOn(value: String => ValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

