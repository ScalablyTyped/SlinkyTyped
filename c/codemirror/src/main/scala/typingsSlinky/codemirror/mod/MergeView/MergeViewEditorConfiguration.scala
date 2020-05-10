package typingsSlinky.codemirror.mod.MergeView

import typingsSlinky.codemirror.mod.EditorConfiguration
import typingsSlinky.codemirror.mod.TextMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options available to MergeView.
  */
@js.native
trait MergeViewEditorConfiguration extends EditorConfiguration {
  /**
    * Determines whether the original editor allows editing. Defaults to false.
    */
  var allowEditingOriginals: js.UndefOr[Boolean] = js.native
  /**
    * When true stretches of unchanged text will be collapsed. When a number is given, this indicates the amount
    * of lines to leave visible around such stretches (which defaults to 2). Defaults to false.
    */
  var collapseIdentical: js.UndefOr[Boolean | Double] = js.native
  /**
    * Sets the style used to connect changed chunks of code. By default, connectors are drawn. When this is set to "align",
    * the smaller chunk is padded to align with the bigger chunk instead.
    */
  var connect: js.UndefOr[String] = js.native
  /**
    * Callback for when stretches of unchanged text are collapsed.
    */
  var onCollapse: js.UndefOr[
    js.Function4[
      /* mergeView */ MergeViewEditor, 
      /* line */ Double, 
      /* size */ Double, 
      /* mark */ TextMarker, 
      Unit
    ]
  ] = js.native
  /**
    * Provides original version of the document to be shown on the right of the editor.
    */
  var orig: js.Any = js.native
  /**
    * Provides original version of the document to be shown on the left of the editor.
    * To create a 2-way (as opposed to 3-way) merge view, provide only one of origLeft and origRight.
    */
  var origLeft: js.UndefOr[js.Any] = js.native
  /**
    * Provides original version of document to be shown on the right of the editor.
    * To create a 2-way (as opposed to 3-way) merge view, provide only one of origLeft and origRight.
    */
  var origRight: js.UndefOr[js.Any] = js.native
  /**
    * Determines whether buttons that allow the user to revert changes are shown. Defaults to true.
    */
  var revertButtons: js.UndefOr[Boolean] = js.native
  /**
    * When true, changed pieces of text are highlighted. Defaults to true.
    */
  var showDifferences: js.UndefOr[Boolean] = js.native
}

object MergeViewEditorConfiguration {
  @scala.inline
  def apply(orig: js.Any): MergeViewEditorConfiguration = {
    val __obj = js.Dynamic.literal(orig = orig.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeViewEditorConfiguration]
  }
  @scala.inline
  implicit class MergeViewEditorConfigurationOps[Self <: MergeViewEditorConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowEditingOriginals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditingOriginals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEditingOriginals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditingOriginals")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseIdentical(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseIdentical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseIdentical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseIdentical")(js.undefined)
        ret
    }
    @scala.inline
    def withConnect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCollapse(
      value: (/* mergeView */ MergeViewEditor, /* line */ Double, /* size */ Double, /* mark */ TextMarker) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigLeft(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigRight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origRight")(js.undefined)
        ret
    }
    @scala.inline
    def withRevertButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevertButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDifferences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDifferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDifferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDifferences")(js.undefined)
        ret
    }
  }
  
}

