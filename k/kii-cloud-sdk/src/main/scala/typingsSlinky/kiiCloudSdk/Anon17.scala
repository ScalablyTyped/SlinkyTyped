package typingsSlinky.kiiCloudSdk

import org.scalajs.dom.raw.Blob
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon17 extends js.Object {
  def failure(obj: KiiObject, anErrorString: String): js.Any = js.native
  def success(obj: KiiObject, bodyBlob: Blob): js.Any = js.native
}

object Anon17 {
  @scala.inline
  def apply(failure: (KiiObject, String) => js.Any, success: (KiiObject, Blob) => js.Any): Anon17 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[Anon17]
  }
  @scala.inline
  implicit class Anon17Ops[Self <: Anon17] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailure(value: (KiiObject, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSuccess(value: (KiiObject, Blob) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

