package typingsSlinky.nodeEasyCert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertManagerOptions extends js.Object {
  /** The default attributes of a generated cert, you can change it here */
  var defaultCertAttrs: js.UndefOr[js.Array[CertificateAttribute]] = js.native
  /**
    * Path where certificates should be stored.
    * @default "/{USER_HOME}/{.node_easy_certs}/"
    */
  var rootDirPath: js.UndefOr[String] = js.native
}

object CertManagerOptions {
  @scala.inline
  def apply(): CertManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertManagerOptions]
  }
  @scala.inline
  implicit class CertManagerOptionsOps[Self <: CertManagerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultCertAttrs(value: js.Array[CertificateAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCertAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCertAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCertAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDirPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDirPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirPath")(js.undefined)
        ret
    }
  }
  
}

