package typingsSlinky.jsSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIndexStrategy extends js.Object {
  def expandToken(token: String): js.Array[String] = js.native
}

object IIndexStrategy {
  @scala.inline
  def apply(expandToken: String => js.Array[String]): IIndexStrategy = {
    val __obj = js.Dynamic.literal(expandToken = js.Any.fromFunction1(expandToken))
    __obj.asInstanceOf[IIndexStrategy]
  }
  @scala.inline
  implicit class IIndexStrategyOps[Self <: IIndexStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandToken(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandToken")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

