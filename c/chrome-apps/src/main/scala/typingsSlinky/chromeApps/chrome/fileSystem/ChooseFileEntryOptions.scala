package typingsSlinky.chromeApps.chrome.fileSystem

import typingsSlinky.chromeApps.chromeAppsBooleans.`false`
import typingsSlinky.chromeApps.chromeAppsStrings.openFile
import typingsSlinky.chromeApps.chromeAppsStrings.openWritableFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.chromeApps.chrome.fileSystem.ChooseEntryOptions because Already inherited */ @js.native
trait ChooseFileEntryOptions extends ChooseEntryOptionsBase {
  /**
    * Whether to accept multiple files. This is only supported for openFile and openWritableFile.
    * The callback to chooseEntry will be called with a list of entries if this is set to true.
    * Otherwise it will be called with a single Entry.
    * @default false
    * @since Chrome 30.
    */
  var acceptsMultiple: js.UndefOr[`false`] = js.native
  var `type`: openFile | openWritableFile = js.native
}

object ChooseFileEntryOptions {
  @scala.inline
  def apply(`type`: openFile | openWritableFile): ChooseFileEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseFileEntryOptions]
  }
  @scala.inline
  implicit class ChooseFileEntryOptionsOps[Self <: ChooseFileEntryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: openFile | openWritableFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceptsMultiple(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptsMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptsMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptsMultiple")(js.undefined)
        ret
    }
  }
  
}

