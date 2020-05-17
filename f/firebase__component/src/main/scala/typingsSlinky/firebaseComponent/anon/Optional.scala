package typingsSlinky.firebaseComponent.anon

import typingsSlinky.firebaseComponent.firebaseComponentBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Optional extends js.Object {
  var identifier: js.UndefOr[String] = js.native
  var optional: js.UndefOr[`false`] = js.native
}

object Optional {
  @scala.inline
  def apply(): Optional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optional]
  }
  @scala.inline
  implicit class OptionalOps[Self <: Optional] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withOptional(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
  }
  
}

