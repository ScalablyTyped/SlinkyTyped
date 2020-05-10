package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSourceCredentialsOutput extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the token. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
}

object DeleteSourceCredentialsOutput {
  @scala.inline
  def apply(): DeleteSourceCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSourceCredentialsOutput]
  }
  @scala.inline
  implicit class DeleteSourceCredentialsOutputOps[Self <: DeleteSourceCredentialsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
  }
  
}

