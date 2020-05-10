package typingsSlinky.phaser.Phaser.Types.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BannerConfig extends js.Object {
  /**
    * The background colors of the banner.
    */
  var background: js.UndefOr[js.Array[String]] = js.native
  /**
    * Omit Phaser's name and version from the banner.
    */
  var hidePhaser: js.UndefOr[Boolean] = js.native
  /**
    * The color of the banner text.
    */
  var text: js.UndefOr[String] = js.native
}

object BannerConfig {
  @scala.inline
  def apply(): BannerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BannerConfig]
  }
  @scala.inline
  implicit class BannerConfigOps[Self <: BannerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withHidePhaser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePhaser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePhaser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePhaser")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

