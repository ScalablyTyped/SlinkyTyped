package typingsSlinky.azdata.mod.nb

import typingsSlinky.azdata.mod.IConnectionProfile
import typingsSlinky.vscode.mod.ViewColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookShowOptions extends js.Object {
  /**
  			 * Optional profile indicating the initial connection to use for this editor
  			 */
  var connectionProfile: js.UndefOr[IConnectionProfile] = js.native
  /**
  			 * Default kernel for notebook
  			 */
  var defaultKernel: js.UndefOr[IKernelSpec] = js.native
  /**
  			 * Optional content used to give an initial notebook state
  			 */
  var initialContent: js.UndefOr[INotebookContents | String] = js.native
  /**
  			 * A optional boolean value indicating the dirty state after the initial content is loaded, default value is true
  			 */
  var initialDirtyState: js.UndefOr[Boolean] = js.native
  /**
  			 * An optional flag that when `true` will stop the [editor](#NotebookEditor) from taking focus.
  			 */
  var preserveFocus: js.UndefOr[Boolean] = js.native
  /**
  			 * An optional flag that controls if an [editor](#NotebookEditor)-tab will be replaced
  			 * with the next editor or if it will be kept.
  			 */
  var preview: js.UndefOr[Boolean] = js.native
  /**
  			 * An optional string indicating which notebook provider to initially use
  			 */
  var providerId: js.UndefOr[String] = js.native
  /**
  			 * An optional view column in which the [editor](#NotebookEditor) should be shown.
  			 * The default is the [active](#ViewColumn.Active), other values are adjusted to
  			 * be `Min(column, columnCount + 1)`, the [active](#ViewColumn.Active)-column is
  			 * not adjusted. Use [`ViewColumn.Beside`](#ViewColumn.Beside) to open the
  			 * editor to the side of the currently active one.
  			 */
  var viewColumn: js.UndefOr[ViewColumn] = js.native
}

object NotebookShowOptions {
  @scala.inline
  def apply(): NotebookShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookShowOptions]
  }
  @scala.inline
  implicit class NotebookShowOptionsOps[Self <: NotebookShowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionProfile(value: IConnectionProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultKernel(value: IKernelSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKernel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultKernel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKernel")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialContent(value: INotebookContents | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialContent")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDirtyState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDirtyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDirtyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDirtyState")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(js.undefined)
        ret
    }
    @scala.inline
    def withViewColumn(value: ViewColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewColumn")(js.undefined)
        ret
    }
  }
  
}

