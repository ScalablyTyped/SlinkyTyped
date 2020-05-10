package typingsSlinky.awsSdkTypes.marshallerMod

import typingsSlinky.awsSdkTypes.protocolMod.Member
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodySerializerBuildOptions extends js.Object {
  /**
    * Whether the operation input contains a payload member.
    */
  var hasPayload: js.UndefOr[Boolean] = js.native
  /**
    * The value to convert.
    */
  var input: js.Any = js.native
  /**
    * The root input member of the operation used to serialize the body.
    * Should be either operation input or the input payload member.
    * Defaults to operation.input.
    */
  var member: js.UndefOr[Member] = js.native
  /**
    * Location name for the member.
    */
  var memberName: js.UndefOr[String] = js.native
  /**
    * The operation model to which the input should be converted.
    */
  var operation: OperationModel = js.native
}

object BodySerializerBuildOptions {
  @scala.inline
  def apply(input: js.Any, operation: OperationModel): BodySerializerBuildOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySerializerBuildOptions]
  }
  @scala.inline
  implicit class BodySerializerBuildOptionsOps[Self <: BodySerializerBuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: OperationModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPayload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withMember(value: Member): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("member")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("member")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberName")(js.undefined)
        ret
    }
  }
  
}

