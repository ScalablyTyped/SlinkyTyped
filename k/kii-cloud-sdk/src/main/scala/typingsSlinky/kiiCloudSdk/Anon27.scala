package typingsSlinky.kiiCloudSdk

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiSocialNetworkName
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon27 extends js.Object {
  def failure(user: KiiUser, network: KiiSocialNetworkName, anErrorString: String): js.Any = js.native
  def success(user: KiiUser, network: KiiSocialNetworkName): js.Any = js.native
}

object Anon27 {
  @scala.inline
  def apply(
    failure: (KiiUser, KiiSocialNetworkName, String) => js.Any,
    success: (KiiUser, KiiSocialNetworkName) => js.Any
  ): Anon27 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction3(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[Anon27]
  }
  @scala.inline
  implicit class Anon27Ops[Self <: Anon27] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailure(value: (KiiUser, KiiSocialNetworkName, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSuccess(value: (KiiUser, KiiSocialNetworkName) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

