package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSourceCredentialsOutput extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the token. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
}

object ImportSourceCredentialsOutput {
  @scala.inline
  def apply(): ImportSourceCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSourceCredentialsOutput]
  }
  @scala.inline
  implicit class ImportSourceCredentialsOutputOps[Self <: ImportSourceCredentialsOutput] (val x: Self) extends AnyVal {
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

