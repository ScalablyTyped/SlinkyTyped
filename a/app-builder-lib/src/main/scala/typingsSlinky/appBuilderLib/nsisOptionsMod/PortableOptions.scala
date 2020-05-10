package typingsSlinky.appBuilderLib.nsisOptionsMod

import typingsSlinky.appBuilderLib.appBuilderLibStrings.admin
import typingsSlinky.appBuilderLib.appBuilderLibStrings.highest
import typingsSlinky.appBuilderLib.appBuilderLibStrings.user
import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortableOptions
  extends TargetSpecificOptions
     with CommonNsisOptions {
  /**
    * The [requested execution level](http://nsis.sourceforge.net/Reference/RequestExecutionLevel) for Windows.
    * @default user
    */
  val requestExecutionLevel: js.UndefOr[user | highest | admin] = js.native
  /**
    * The unpack directory name in [TEMP](https://www.askvg.com/where-does-windows-store-temporary-files-and-how-to-change-temp-folder-location/) directory.
    *
    * Defaults to [uuid](https://github.com/segmentio/ksuid) of build (changed on each build of portable executable).
    */
  val unpackDirName: js.UndefOr[String] = js.native
}

object PortableOptions {
  @scala.inline
  def apply(): PortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortableOptions]
  }
  @scala.inline
  implicit class PortableOptionsOps[Self <: PortableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestExecutionLevel(value: user | highest | admin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestExecutionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestExecutionLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestExecutionLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withUnpackDirName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpackDirName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnpackDirName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpackDirName")(js.undefined)
        ret
    }
  }
  
}

