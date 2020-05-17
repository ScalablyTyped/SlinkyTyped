package typingsSlinky.firebaseDatabase.anon

import typingsSlinky.firebaseDatabase.queryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTESTACCESS extends js.Object {
  def forceRestClient(forceRestClient: Boolean): Unit = js.native
  def hijackHash(newHash: js.Function0[String]): js.Function0[Unit] = js.native
  def queryIdentifier(query: Query): String = js.native
}

object TypeofTESTACCESS {
  @scala.inline
  def apply(
    forceRestClient: Boolean => Unit,
    hijackHash: js.Function0[String] => js.Function0[Unit],
    queryIdentifier: Query => String
  ): TypeofTESTACCESS = {
    val __obj = js.Dynamic.literal(forceRestClient = js.Any.fromFunction1(forceRestClient), hijackHash = js.Any.fromFunction1(hijackHash), queryIdentifier = js.Any.fromFunction1(queryIdentifier))
    __obj.asInstanceOf[TypeofTESTACCESS]
  }
  @scala.inline
  implicit class TypeofTESTACCESSOps[Self <: TypeofTESTACCESS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceRestClient(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRestClient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHijackHash(value: js.Function0[String] => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hijackHash")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueryIdentifier(value: Query => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryIdentifier")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

