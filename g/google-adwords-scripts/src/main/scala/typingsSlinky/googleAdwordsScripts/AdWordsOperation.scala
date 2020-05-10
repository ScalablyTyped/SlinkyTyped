package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsOperation[E] extends js.Object {
  def getErrors(): js.Array[String] = js.native
  def getResult(): E = js.native
  def isSuccessful(): Boolean = js.native
}

object AdWordsOperation {
  @scala.inline
  def apply[E](getErrors: () => js.Array[String], getResult: () => E, isSuccessful: () => Boolean): AdWordsOperation[E] = {
    val __obj = js.Dynamic.literal(getErrors = js.Any.fromFunction0(getErrors), getResult = js.Any.fromFunction0(getResult), isSuccessful = js.Any.fromFunction0(isSuccessful))
    __obj.asInstanceOf[AdWordsOperation[E]]
  }
  @scala.inline
  implicit class AdWordsOperationOps[Self[e] <: AdWordsOperation[e], E] (val x: Self[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[E] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[E] with Other]
    @scala.inline
    def withGetErrors(value: () => js.Array[String]): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetResult(value: () => E): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResult")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSuccessful(value: () => Boolean): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuccessful")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

