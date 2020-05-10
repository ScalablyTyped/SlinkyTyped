package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.UserIdentityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLongIdentifier extends js.Object {
  var longIdentifier: js.UndefOr[Double] = js.native
  var stringIdentifier: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[UserIdentityType] = js.native
}

object AnonLongIdentifier {
  @scala.inline
  def apply(): AnonLongIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLongIdentifier]
  }
  @scala.inline
  implicit class AnonLongIdentifierOps[Self <: AnonLongIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLongIdentifier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withStringIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: UserIdentityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

