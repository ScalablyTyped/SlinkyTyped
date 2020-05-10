package typingsSlinky.keystonejsApolloHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeystoneMutationTypeProps extends js.Object {
  var invalidatesTypes: js.UndefOr[Boolean] = js.native
  var mutation: String = js.native
}

object KeystoneMutationTypeProps {
  @scala.inline
  def apply(mutation: String): KeystoneMutationTypeProps = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystoneMutationTypeProps]
  }
  @scala.inline
  implicit class KeystoneMutationTypePropsOps[Self <: KeystoneMutationTypeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMutation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidatesTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidatesTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidatesTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidatesTypes")(js.undefined)
        ret
    }
  }
  
}

