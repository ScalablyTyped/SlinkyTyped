package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgBrowseButton
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  var autoselect: js.UndefOr[Boolean] = js.native
  /**
  	 * M.H. 13 Feb 2014 Fix for bug #164347: Move input  from document body to the upload container
  	 */
  var container: js.UndefOr[js.Any] = js.native
  var multipleFiles: js.UndefOr[Boolean] = js.native
}

object IgBrowseButton {
  @scala.inline
  def apply(): IgBrowseButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgBrowseButton]
  }
  @scala.inline
  implicit class IgBrowseButtonOps[Self <: IgBrowseButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoselect")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleFiles")(js.undefined)
        ret
    }
  }
  
}

