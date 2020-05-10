package typingsSlinky.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nightwatch extends js.Object {
  var api: NightwatchAPI = js.native
  var assert: NightwatchAssertions = js.native
  var client: NightwatchClient = js.native
  var expect: Expect = js.native
  var verify: NightwatchAssertions = js.native
}

object Nightwatch {
  @scala.inline
  def apply(
    api: NightwatchAPI,
    assert: NightwatchAssertions,
    client: NightwatchClient,
    expect: Expect,
    verify: NightwatchAssertions
  ): Nightwatch = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], assert = assert.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], expect = expect.asInstanceOf[js.Any], verify = verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nightwatch]
  }
  @scala.inline
  implicit class NightwatchOps[Self <: Nightwatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: NightwatchAPI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssert(value: NightwatchAssertions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient(value: NightwatchClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpect(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerify(value: NightwatchAssertions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

