package typingsSlinky.emberTestHelpers

import typingsSlinky.emberApplication.resolverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResolver extends js.Object {
  var resolver: js.UndefOr[default] = js.native
}

object AnonResolver {
  @scala.inline
  def apply(): AnonResolver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonResolver]
  }
  @scala.inline
  implicit class AnonResolverOps[Self <: AnonResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolver(value: default): Self = {
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

