package typingsSlinky.googleapis

import typingsSlinky.googleapis.v3Mod.analyticsV3.SchemaAccountRef
import typingsSlinky.googleapis.v3Mod.analyticsV3.SchemaProfileRef
import typingsSlinky.googleapis.v3Mod.analyticsV3.SchemaWebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccountRef extends js.Object {
  var accountRef: js.UndefOr[SchemaAccountRef] = js.native
  var profileRef: js.UndefOr[SchemaProfileRef] = js.native
  var webPropertyRef: js.UndefOr[SchemaWebPropertyRef] = js.native
}

object AnonAccountRef {
  @scala.inline
  def apply(): AnonAccountRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAccountRef]
  }
  @scala.inline
  implicit class AnonAccountRefOps[Self <: AnonAccountRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountRef(value: SchemaAccountRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountRef")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileRef(value: SchemaProfileRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileRef")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyRef(value: SchemaWebPropertyRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyRef")(js.undefined)
        ret
    }
  }
  
}

