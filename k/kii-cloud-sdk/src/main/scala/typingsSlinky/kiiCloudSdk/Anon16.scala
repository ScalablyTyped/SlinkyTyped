package typingsSlinky.kiiCloudSdk

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon16 extends js.Object {
  def failure(theSrcObject: KiiObject, theTgtObjectUri: String, anErrorString: String): js.Any = js.native
  def success(theSrcObject: KiiObject, theTgtObjectUri: String): js.Any = js.native
}

object Anon16 {
  @scala.inline
  def apply(failure: (KiiObject, String, String) => js.Any, success: (KiiObject, String) => js.Any): Anon16 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction3(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[Anon16]
  }
  @scala.inline
  implicit class Anon16Ops[Self <: Anon16] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailure(value: (KiiObject, String, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSuccess(value: (KiiObject, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

