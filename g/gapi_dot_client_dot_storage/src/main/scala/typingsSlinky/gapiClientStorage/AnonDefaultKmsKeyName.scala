package typingsSlinky.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultKmsKeyName extends js.Object {
  var defaultKmsKeyName: js.UndefOr[String] = js.native
}

object AnonDefaultKmsKeyName {
  @scala.inline
  def apply(): AnonDefaultKmsKeyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDefaultKmsKeyName]
  }
  @scala.inline
  implicit class AnonDefaultKmsKeyNameOps[Self <: AnonDefaultKmsKeyName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultKmsKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKmsKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultKmsKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKmsKeyName")(js.undefined)
        ret
    }
  }
  
}

