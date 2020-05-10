package typingsSlinky.emberQunit.mod

import typingsSlinky.ember.mod.default.Resolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetupTestOptions extends js.Object {
  /**
    * The resolver to use when instantiating container-managed entities in the test.
    */
  var resolver: js.UndefOr[Resolver] = js.native
}

object SetupTestOptions {
  @scala.inline
  def apply(): SetupTestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetupTestOptions]
  }
  @scala.inline
  implicit class SetupTestOptionsOps[Self <: SetupTestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolver(value: Resolver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(js.undefined)
        ret
    }
  }
  
}

