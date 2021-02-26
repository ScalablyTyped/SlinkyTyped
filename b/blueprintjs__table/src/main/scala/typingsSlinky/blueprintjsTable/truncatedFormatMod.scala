package typingsSlinky.blueprintjsTable

import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object truncatedFormatMod {
  
  @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat", "TruncatedFormat")
  @js.native
  class TruncatedFormat protected ()
    extends PureComponent[ITruncatedFormatProps, ITruncatedFormatState, js.Any] {
    def this(props: ITruncatedFormatProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ITruncatedFormatProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MTruncatedFormat(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTruncatedFormat(): Unit = js.native
    
    var contentDiv: js.Any = js.native
    
    var handleContentDivRef: js.Any = js.native
    
    var handlePopoverClose: js.Any = js.native
    
    var handlePopoverOpen: js.Any = js.native
    
    var renderPopover: js.Any = js.native
    
    var setTruncationState: js.Any = js.native
    
    var shouldShowPopover: js.Any = js.native
  }
  /* static members */
  object TruncatedFormat {
    
    @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat", "TruncatedFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat", "TruncatedFormat.defaultProps")
    @js.native
    def defaultProps: ITruncatedFormatProps = js.native
    @scala.inline
    def defaultProps_=(x: ITruncatedFormatProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat", "TruncatedFormat.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait TruncatedPopoverMode extends StObject
  @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat", "TruncatedPopoverMode")
  @js.native
  object TruncatedPopoverMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TruncatedPopoverMode with String] = js.native
    
    @js.native
    sealed trait ALWAYS extends TruncatedPopoverMode
    /* "always" */ val ALWAYS: typingsSlinky.blueprintjsTable.truncatedFormatMod.TruncatedPopoverMode.ALWAYS with String = js.native
    
    @js.native
    sealed trait NEVER extends TruncatedPopoverMode
    /* "never" */ val NEVER: typingsSlinky.blueprintjsTable.truncatedFormatMod.TruncatedPopoverMode.NEVER with String = js.native
    
    @js.native
    sealed trait WHEN_TRUNCATED extends TruncatedPopoverMode
    /* "when-truncated" */ val WHEN_TRUNCATED: typingsSlinky.blueprintjsTable.truncatedFormatMod.TruncatedPopoverMode.WHEN_TRUNCATED with String = js.native
    
    @js.native
    sealed trait WHEN_TRUNCATED_APPROX extends TruncatedPopoverMode
    /* "when-truncated-approx" */ val WHEN_TRUNCATED_APPROX: typingsSlinky.blueprintjsTable.truncatedFormatMod.TruncatedPopoverMode.WHEN_TRUNCATED_APPROX with String = js.native
  }
  
  @js.native
  trait ITrucatedFormateMeasureByApproximateOptions extends StObject {
    
    /**
      * Approximate character width (in pixels), used to determine whether to display the popover in approx truncation mode.
      * The default value should work for normal table styles,
      * but should be changed as necessary if the fonts or styles are changed significantly.
      * @default 8
      */
    var approximateCharWidth: Double = js.native
    
    /**
      * Approximate line height (in pixels), used to determine whether to display the popover in approx truncation mode.
      * The default value should work for normal table styles, but should be changed if the fonts or styles are changed significantly.
      * @default 18
      */
    var approximateLineHeight: Double = js.native
    
    /**
      * Total horizonal cell padding (both sides), used to determine whether to display the popover in approx truncation mode.
      * The default value should work for normal table styles,
      * but should be changed as necessary if the fonts or styles are changed significantly.
      * @default 20
      */
    var cellHorizontalPadding: Double = js.native
    
    /**
      * Number of buffer lines desired, used to determine whether to display the popover in approx truncation mode.
      * Buffer lines are extra lines at the bottom of the cell that space is made for, to make sure that the cell text will fit
      * after the math calculates how many lines the text is expected to take.
      * The default value should work for normal table styles,
      * but should be changed as necessary if the fonts or styles are changed significantly.
      * @default 0
      */
    var numBufferLines: Double = js.native
  }
  object ITrucatedFormateMeasureByApproximateOptions {
    
    @scala.inline
    def apply(
      approximateCharWidth: Double,
      approximateLineHeight: Double,
      cellHorizontalPadding: Double,
      numBufferLines: Double
    ): ITrucatedFormateMeasureByApproximateOptions = {
      val __obj = js.Dynamic.literal(approximateCharWidth = approximateCharWidth.asInstanceOf[js.Any], approximateLineHeight = approximateLineHeight.asInstanceOf[js.Any], cellHorizontalPadding = cellHorizontalPadding.asInstanceOf[js.Any], numBufferLines = numBufferLines.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITrucatedFormateMeasureByApproximateOptions]
    }
    
    @scala.inline
    implicit class ITrucatedFormateMeasureByApproximateOptionsMutableBuilder[Self <: ITrucatedFormateMeasureByApproximateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApproximateCharWidth(value: Double): Self = StObject.set(x, "approximateCharWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApproximateLineHeight(value: Double): Self = StObject.set(x, "approximateLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellHorizontalPadding(value: Double): Self = StObject.set(x, "cellHorizontalPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumBufferLines(value: Double): Self = StObject.set(x, "numBufferLines", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class ITruncatedFormatPropsMutableBuilder[Self <: ITruncatedFormatProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDetectTruncation(value: Boolean): Self = StObject.set(x, "detectTruncation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectTruncationUndefined: Self = StObject.set(x, "detectTruncation", js.undefined)
      
      @scala.inline
      def setMeasureByApproxOptions(value: ITrucatedFormateMeasureByApproximateOptions): Self = StObject.set(x, "measureByApproxOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasureByApproxOptionsUndefined: Self = StObject.set(x, "measureByApproxOptions", js.undefined)
      
      @scala.inline
      def setParentCellHeight(value: Double): Self = StObject.set(x, "parentCellHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentCellHeightUndefined: Self = StObject.set(x, "parentCellHeight", js.undefined)
      
      @scala.inline
      def setParentCellWidth(value: Double): Self = StObject.set(x, "parentCellWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentCellWidthUndefined: Self = StObject.set(x, "parentCellWidth", js.undefined)
      
      @scala.inline
      def setPreformatted(value: Boolean): Self = StObject.set(x, "preformatted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreformattedUndefined: Self = StObject.set(x, "preformatted", js.undefined)
      
      @scala.inline
      def setShowPopover(value: TruncatedPopoverMode): Self = StObject.set(x, "showPopover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPopoverUndefined: Self = StObject.set(x, "showPopover", js.undefined)
      
      @scala.inline
      def setTruncateLength(value: Double): Self = StObject.set(x, "truncateLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateLengthUndefined: Self = StObject.set(x, "truncateLength", js.undefined)
      
      @scala.inline
      def setTruncationSuffix(value: String): Self = StObject.set(x, "truncationSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncationSuffixUndefined: Self = StObject.set(x, "truncationSuffix", js.undefined)
    }
  }
  
  @js.native
  trait ITruncatedFormatState extends StObject {
    
    var isPopoverOpen: js.UndefOr[Boolean] = js.native
    
    var isTruncated: js.UndefOr[Boolean] = js.native
  }
  object ITruncatedFormatState {
    
    @scala.inline
    def apply(): ITruncatedFormatState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITruncatedFormatState]
    }
    
    @scala.inline
    implicit class ITruncatedFormatStateMutableBuilder[Self <: ITruncatedFormatState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsPopoverOpen(value: Boolean): Self = StObject.set(x, "isPopoverOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPopoverOpenUndefined: Self = StObject.set(x, "isPopoverOpen", js.undefined)
      
      @scala.inline
      def setIsTruncated(value: Boolean): Self = StObject.set(x, "isTruncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTruncatedUndefined: Self = StObject.set(x, "isTruncated", js.undefined)
    }
  }
}
