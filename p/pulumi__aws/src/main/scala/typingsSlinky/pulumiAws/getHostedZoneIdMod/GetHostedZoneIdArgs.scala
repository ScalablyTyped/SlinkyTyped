package typingsSlinky.pulumiAws.getHostedZoneIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostedZoneIdArgs extends js.Object {
  /**
    * Name of the region whose AWS ELB HostedZoneId is desired.
    * Defaults to the region from the AWS provider configuration.
    */
  val region: js.UndefOr[String] = js.native
}

object GetHostedZoneIdArgs {
  @scala.inline
  def apply(): GetHostedZoneIdArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHostedZoneIdArgs]
  }
  @scala.inline
  implicit class GetHostedZoneIdArgsOps[Self <: GetHostedZoneIdArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
  }
  
}

