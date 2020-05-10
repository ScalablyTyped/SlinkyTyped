package typingsSlinky.enhancedResolve.concordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcordContext extends js.Object {
  var environments: js.UndefOr[js.Array[String]] = js.native
  var referrer: js.UndefOr[String] = js.native
  var supportedResourceTypes: js.UndefOr[js.Array[String]] = js.native
}

object ConcordContext {
  @scala.inline
  def apply(): ConcordContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcordContext]
  }
  @scala.inline
  implicit class ConcordContextOps[Self <: ConcordContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(js.undefined)
        ret
    }
    @scala.inline
    def withReferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedResourceTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedResourceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedResourceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedResourceTypes")(js.undefined)
        ret
    }
  }
  
}

