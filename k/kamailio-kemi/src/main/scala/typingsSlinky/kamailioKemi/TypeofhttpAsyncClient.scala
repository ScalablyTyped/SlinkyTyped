package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofhttpAsyncClient extends js.Object {
  def query(sdata: String, rn: String): Double = js.native
}

object TypeofhttpAsyncClient {
  @scala.inline
  def apply(query: (String, String) => Double): TypeofhttpAsyncClient = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction2(query))
    __obj.asInstanceOf[TypeofhttpAsyncClient]
  }
  @scala.inline
  implicit class TypeofhttpAsyncClientOps[Self <: TypeofhttpAsyncClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

