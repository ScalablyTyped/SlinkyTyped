package typingsSlinky.awsSdkClientLambdaNode.typesFunctionCodeLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionCodeLocation extends js.Object {
  /**
    * <p>The presigned URL you can use to download the function's .zip file that you previously uploaded. The URL is valid for up to 10 minutes.</p>
    */
  var Location: js.UndefOr[String] = js.native
  /**
    * <p>The repository from which you can download the function.</p>
    */
  var RepositoryType: js.UndefOr[String] = js.native
}

object FunctionCodeLocation {
  @scala.inline
  def apply(): FunctionCodeLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionCodeLocation]
  }
  @scala.inline
  implicit class FunctionCodeLocationOps[Self <: FunctionCodeLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepositoryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepositoryType")(js.undefined)
        ret
    }
  }
  
}

