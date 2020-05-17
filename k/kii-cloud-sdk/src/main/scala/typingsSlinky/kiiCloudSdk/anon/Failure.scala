package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiACL
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiACLEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Failure extends js.Object {
  def failure(theACL: KiiACL, anErrorString: String): js.Any = js.native
  def success(theACL: KiiACL, theEntries: js.Array[KiiACLEntry]): js.Any = js.native
}

object Failure {
  @scala.inline
  def apply(failure: (KiiACL, String) => js.Any, success: (KiiACL, js.Array[KiiACLEntry]) => js.Any): Failure = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[Failure]
  }
  @scala.inline
  implicit class FailureOps[Self <: Failure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailure(value: (KiiACL, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSuccess(value: (KiiACL, js.Array[KiiACLEntry]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

