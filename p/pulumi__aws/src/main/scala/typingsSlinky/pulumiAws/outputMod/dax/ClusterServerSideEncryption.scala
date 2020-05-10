package typingsSlinky.pulumiAws.outputMod.dax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterServerSideEncryption extends js.Object {
  /**
    * Whether to enable encryption at rest. Defaults to `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object ClusterServerSideEncryption {
  @scala.inline
  def apply(): ClusterServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterServerSideEncryption]
  }
  @scala.inline
  implicit class ClusterServerSideEncryptionOps[Self <: ClusterServerSideEncryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

