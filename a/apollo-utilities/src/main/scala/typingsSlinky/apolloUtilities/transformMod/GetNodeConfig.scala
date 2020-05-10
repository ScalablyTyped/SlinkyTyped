package typingsSlinky.apolloUtilities.transformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNodeConfig[N] extends js.Object {
  var name: js.UndefOr[String] = js.native
  var test: js.UndefOr[js.Function1[/* node */ N, Boolean]] = js.native
}

object GetNodeConfig {
  @scala.inline
  def apply[N](): GetNodeConfig[N] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNodeConfig[N]]
  }
  @scala.inline
  implicit class GetNodeConfigOps[Self[n] <: GetNodeConfig[n], N] (val x: Self[N]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[N] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[N] with Other]
    @scala.inline
    def withName(value: String): Self[N] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[N] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTest(value: /* node */ N => Boolean): Self[N] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTest: Self[N] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
  }
  
}

