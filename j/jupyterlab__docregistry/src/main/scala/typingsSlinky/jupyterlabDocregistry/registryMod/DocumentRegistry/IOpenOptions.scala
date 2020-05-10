package typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry

import typingsSlinky.phosphorWidgets.docklayoutMod.DockLayout.InsertMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to open a widget.
  */
@js.native
trait IOpenOptions extends js.Object {
  /**
    * Whether to activate the widget.  Defaults to `true`.
    */
  var activate: js.UndefOr[Boolean] = js.native
  /**
    * The supported insertion modes.
    *
    * An insert mode is used to specify how a widget should be added
    * to the main area relative to a reference widget.
    */
  var mode: js.UndefOr[InsertMode] = js.native
  /**
    * The rank order of the widget among its siblings.
    *
    * #### Notes
    * This field may be used or ignored depending on shell implementation.
    */
  var rank: js.UndefOr[Double] = js.native
  /**
    * The reference widget id for the insert location.
    *
    * The default is `null`.
    */
  var ref: js.UndefOr[String | Null] = js.native
}

object IOpenOptions {
  @scala.inline
  def apply(): IOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpenOptions]
  }
  @scala.inline
  implicit class IOpenOptionsOps[Self <: IOpenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: InsertMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(null)
        ret
    }
  }
  
}

