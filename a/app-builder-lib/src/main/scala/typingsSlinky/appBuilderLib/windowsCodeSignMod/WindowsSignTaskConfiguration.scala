package typingsSlinky.appBuilderLib.windowsCodeSignMod

import typingsSlinky.appBuilderLib.winOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsSignTaskConfiguration extends WindowsSignOptions {
  var hash: String = js.native
  var isNest: Boolean = js.native
  var resultOutputPath: js.UndefOr[String] = js.native
}

object WindowsSignTaskConfiguration {
  @scala.inline
  def apply(hash: String, isNest: Boolean, options: WindowsConfiguration, path: String): WindowsSignTaskConfiguration = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], isNest = isNest.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsSignTaskConfiguration]
  }
  @scala.inline
  implicit class WindowsSignTaskConfigurationOps[Self <: WindowsSignTaskConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultOutputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultOutputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultOutputPath")(js.undefined)
        ret
    }
  }
  
}

