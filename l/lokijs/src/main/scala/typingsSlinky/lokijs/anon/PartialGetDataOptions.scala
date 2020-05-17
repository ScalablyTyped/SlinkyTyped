package typingsSlinky.lokijs.anon

import typingsSlinky.lokijs.lokijsStrings.`jquery-extend-deep`
import typingsSlinky.lokijs.lokijsStrings.`parse-stringify`
import typingsSlinky.lokijs.lokijsStrings.`shallow-assign`
import typingsSlinky.lokijs.lokijsStrings.`shallow-recurse-objects`
import typingsSlinky.lokijs.lokijsStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.GetDataOptions> */
@js.native
trait PartialGetDataOptions extends js.Object {
  var forceCloneMethod: js.UndefOr[
    `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
  ] = js.native
  var forceClones: js.UndefOr[Boolean] = js.native
  var removeMeta: js.UndefOr[Boolean] = js.native
}

object PartialGetDataOptions {
  @scala.inline
  def apply(): PartialGetDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGetDataOptions]
  }
  @scala.inline
  implicit class PartialGetDataOptionsOps[Self <: PartialGetDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceCloneMethod(
      value: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceCloneMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceCloneMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceCloneMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withForceClones(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceClones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceClones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceClones")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveMeta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMeta")(js.undefined)
        ret
    }
  }
  
}

