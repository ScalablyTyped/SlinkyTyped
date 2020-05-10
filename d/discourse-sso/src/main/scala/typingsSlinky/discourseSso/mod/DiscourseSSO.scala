package typingsSlinky.discourseSso.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscourseSSO extends js.Object {
  def buildLoginString(params: UserParams): String = js.native
  def getNonce(payload: String): String = js.native
  def validate(payload: String, sig: String): Boolean = js.native
}

object DiscourseSSO {
  @scala.inline
  def apply(
    buildLoginString: UserParams => String,
    getNonce: String => String,
    validate: (String, String) => Boolean
  ): DiscourseSSO = {
    val __obj = js.Dynamic.literal(buildLoginString = js.Any.fromFunction1(buildLoginString), getNonce = js.Any.fromFunction1(getNonce), validate = js.Any.fromFunction2(validate))
    __obj.asInstanceOf[DiscourseSSO]
  }
  @scala.inline
  implicit class DiscourseSSOOps[Self <: DiscourseSSO] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildLoginString(value: UserParams => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildLoginString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNonce(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNonce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidate(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

