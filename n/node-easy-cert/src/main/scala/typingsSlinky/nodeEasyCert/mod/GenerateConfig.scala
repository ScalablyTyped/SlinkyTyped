package typingsSlinky.nodeEasyCert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateConfig extends js.Object {
  /** The Common Name for the new certificate. */
  var commonName: String = js.native
  /**
    * Should overwrite any existing file.
    * @default false
    */
  var overwrite: js.UndefOr[Boolean] = js.native
}

object GenerateConfig {
  @scala.inline
  def apply(commonName: String): GenerateConfig = {
    val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateConfig]
  }
  @scala.inline
  implicit class GenerateConfigOps[Self <: GenerateConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
  }
  
}

