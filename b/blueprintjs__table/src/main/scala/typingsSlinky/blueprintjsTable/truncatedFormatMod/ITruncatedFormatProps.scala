package typingsSlinky.blueprintjsTable.truncatedFormatMod

import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITruncatedFormatProps extends IProps {
  var children: js.UndefOr[String] = js.native
  /**
    * Should the component keep track of the truncation state of the string content. If true, the
    * value of `truncateLength` is ignored. When combined with a `showPopover` value of
    * `WHEN_TRUNCATED`, popovers will only render when necessary.
    * @default false;
    */
  var detectTruncation: js.UndefOr[Boolean] = js.native
  /**
    * Values to use for character width, line height, cell padding, and buffer lines desired, when using approximate truncation.
    * These values are used to guess at the size of the text and determine if the popover should be drawn. They should work well
    * enough for default table styles, but may need to be overridden for more accuracy if the default styles or font size, etc
    * are changed.
    */
  var measureByApproxOptions: js.UndefOr[ITrucatedFormateMeasureByApproximateOptions] = js.native
  /**
    * Height of the parent cell. Used by shouldComponentUpdate only
    */
  var parentCellHeight: js.UndefOr[Double] = js.native
  /**
    * Width of the parent cell. Used by shouldComponentUpdate only
    */
  var parentCellWidth: js.UndefOr[Double] = js.native
  /**
    * Sets the popover content style to `white-space: pre` if `true` or
    * `white-space: normal` if `false`.
    * @default false
    */
  var preformatted: js.UndefOr[Boolean] = js.native
  /**
    * Configures when the popover is shown with the `TruncatedPopoverMode` enum.
    *
    * The enum values are:
    * - `ALWAYS`: show the popover.
    * - `NEVER`: don't show the popover.
    * - `WHEN_TRUNCATED`: show the popover only when the text is truncated (default).
    * - `WHEN_TRUNCATED_APPROX`: show the popover only when the text is trunctated, but use
    *   a formula to calculate this based on text length, which is faster but less accurate.
    * @default WHEN_TRUNCATED
    */
  var showPopover: js.UndefOr[TruncatedPopoverMode] = js.native
  /**
    * Number of characters that are displayed before being truncated and appended with the
    * `truncationSuffix` prop. A value of 0 will disable truncation. This prop is ignored if
    * `detectTruncation` is `true`.
    * @default 2000
    */
  var truncateLength: js.UndefOr[Double] = js.native
  /**
    * The string that is appended to the display string if it is truncated.
    * @default "..."
    */
  var truncationSuffix: js.UndefOr[String] = js.native
}

object ITruncatedFormatProps {
  @scala.inline
  def apply(): ITruncatedFormatProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITruncatedFormatProps]
  }
  @scala.inline
  implicit class ITruncatedFormatPropsOps[Self <: ITruncatedFormatProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectTruncation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectTruncation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectTruncation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectTruncation")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureByApproxOptions(value: ITrucatedFormateMeasureByApproximateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureByApproxOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureByApproxOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureByApproxOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withParentCellHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCellHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentCellHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCellHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withParentCellWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCellWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentCellWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCellWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPreformatted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preformatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreformatted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preformatted")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPopover(value: TruncatedPopoverMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPopover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopover")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncateLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncateLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncationSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncationSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncationSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncationSuffix")(js.undefined)
        ret
    }
  }
  
}

