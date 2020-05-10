package typingsSlinky.phaser.Phaser.Types.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesConfig extends js.Object {
  /**
    * URL to use for the 'default' texture.
    */
  var default: js.UndefOr[String] = js.native
  /**
    * URL to use for the 'missing' texture.
    */
  var missing: js.UndefOr[String] = js.native
}

object ImagesConfig {
  @scala.inline
  def apply(): ImagesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagesConfig]
  }
  @scala.inline
  implicit class ImagesConfigOps[Self <: ImagesConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withMissing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(js.undefined)
        ret
    }
  }
  
}

