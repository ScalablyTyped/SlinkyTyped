package typingsSlinky.plottable

import typingsSlinky.plottable.componentMod.Component
import typingsSlinky.plottable.scaleMod.Scale
import typingsSlinky.plottable.scalesMod.Color
import typingsSlinky.plottable.scalesMod.InterpolatedColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("plottable/build/src/components", "AxisLabel")
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  class AxisLabel ()
    extends typingsSlinky.plottable.labelMod.AxisLabel {
    def this(text: String) = this()
    def this(text: js.UndefOr[scala.Nothing], angle: Double) = this()
    def this(text: String, angle: Double) = this()
  }
  /* static members */
  object AxisLabel {
    
    @JSImport("plottable/build/src/components", "AxisLabel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components", "AxisLabel.AXIS_LABEL_CLASS")
    @js.native
    def AXIS_LABEL_CLASS: String = js.native
    @scala.inline
    def AXIS_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AXIS_LABEL_CLASS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/components", "DragBoxLayer")
  @js.native
  /**
    * Constructs a DragBoxLayer.
    *
    * A DragBoxLayer is a SelectionBoxLayer with a built-in Drag Interaction.
    * A drag gesture will set the Bounds of the box.
    * If resizing is enabled using resizable(true), the edges of box can be repositioned.
    *
    * @constructor
    */
  class DragBoxLayer ()
    extends typingsSlinky.plottable.dragBoxLayerMod.DragBoxLayer
  
  @JSImport("plottable/build/src/components", "DragLineLayer")
  @js.native
  class DragLineLayer[D] protected ()
    extends typingsSlinky.plottable.dragLineLayerMod.DragLineLayer[D] {
    def this(orientation: String) = this()
  }
  
  @JSImport("plottable/build/src/components", "Gridlines")
  @js.native
  /**
    * @constructor
    * @param {Scale} xScale The scale to base the x gridlines on. Pass null if no gridlines are desired.
    * @param {Scale} yScale The scale to base the y gridlines on. Pass null if no gridlines are desired.
    */
  class Gridlines ()
    extends typingsSlinky.plottable.gridlinesMod.Gridlines {
    def this(xScale: Scale[_, _]) = this()
    def this(xScale: Null, yScale: Scale[_, _]) = this()
    def this(xScale: Scale[_, _], yScale: Scale[_, _]) = this()
  }
  
  @JSImport("plottable/build/src/components", "Group")
  @js.native
  /**
    * Constructs a Group.
    *
    * A Group contains Components that will be rendered on top of each other.
    * Components added later will be rendered above Components already in the Group.
    *
    * @constructor
    * @param {Component[]} [components=[]] Components to be added to the Group.
    */
  class Group ()
    extends typingsSlinky.plottable.groupMod.Group {
    def this(components: js.Array[Component]) = this()
  }
  
  @JSImport("plottable/build/src/components", "GuideLineLayer")
  @js.native
  class GuideLineLayer[D] protected ()
    extends typingsSlinky.plottable.guideLineLayerMod.GuideLineLayer[D] {
    def this(orientation: String) = this()
  }
  /* static members */
  object GuideLineLayer {
    
    @JSImport("plottable/build/src/components", "GuideLineLayer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components", "GuideLineLayer.ORIENTATION_HORIZONTAL")
    @js.native
    def ORIENTATION_HORIZONTAL: String = js.native
    @scala.inline
    def ORIENTATION_HORIZONTAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIENTATION_HORIZONTAL")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components", "GuideLineLayer.ORIENTATION_VERTICAL")
    @js.native
    def ORIENTATION_VERTICAL: String = js.native
    @scala.inline
    def ORIENTATION_VERTICAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIENTATION_VERTICAL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/components", "InterpolatedColorLegend")
  @js.native
  class InterpolatedColorLegend protected ()
    extends typingsSlinky.plottable.interpolatedColorLegendMod.InterpolatedColorLegend {
    /**
      * Creates an InterpolatedColorLegend.
      *
      * The InterpolatedColorLegend consists of a sequence of swatches that show the
      * associated InterpolatedColor Scale sampled at various points.
      * Two labels show the maximum and minimum values of the InterpolatedColor Scale.
      *
      * @constructor
      * @param {Scales.InterpolatedColor} interpolatedColorScale
      */
    def this(interpolatedColorScale: InterpolatedColor) = this()
  }
  /* static members */
  object InterpolatedColorLegend {
    
    @JSImport("plottable/build/src/components", "InterpolatedColorLegend")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The css class applied to the legend labels.
      */
    @JSImport("plottable/build/src/components", "InterpolatedColorLegend.LEGEND_LABEL_CLASS")
    @js.native
    def LEGEND_LABEL_CLASS: String = js.native
    @scala.inline
    def LEGEND_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_LABEL_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components", "InterpolatedColorLegend._DEFAULT_NUM_SWATCHES")
    @js.native
    def _DEFAULT_NUM_SWATCHES: js.Any = js.native
    @scala.inline
    def _DEFAULT_NUM_SWATCHES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_NUM_SWATCHES")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/components", "InterpolatedColorLegend._ensureOrientation")
    @js.native
    def _ensureOrientation(orientation: js.Any): js.Any = js.native
  }
  
  @JSImport("plottable/build/src/components", "Label")
  @js.native
  /**
    * A Label is a Component that displays a single line of text.
    *
    * @constructor
    * @param {string} [displayText=""] The text of the Label.
    * @param {number} [angle=0] The angle of the Label in degrees (-90/0/90). 0 is horizontal.
    */
  class Label ()
    extends typingsSlinky.plottable.labelMod.Label {
    def this(displayText: String) = this()
    def this(displayText: js.UndefOr[scala.Nothing], angle: Double) = this()
    def this(displayText: String, angle: Double) = this()
  }
  
  @JSImport("plottable/build/src/components", "Legend")
  @js.native
  class Legend protected ()
    extends typingsSlinky.plottable.legendMod.Legend {
    /**
      * The Legend consists of a series of entries, each with a color and label taken from the Color Scale.
      *
      * @constructor
      * @param {Scale.Color} scale
      */
    def this(colorScale: Color) = this()
  }
  /* static members */
  object Legend {
    
    @JSImport("plottable/build/src/components", "Legend")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The css class applied to each legend entry
      */
    @JSImport("plottable/build/src/components", "Legend.LEGEND_ENTRY_CLASS")
    @js.native
    def LEGEND_ENTRY_CLASS: String = js.native
    @scala.inline
    def LEGEND_ENTRY_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_ENTRY_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each legend row
      */
    @JSImport("plottable/build/src/components", "Legend.LEGEND_ROW_CLASS")
    @js.native
    def LEGEND_ROW_CLASS: String = js.native
    @scala.inline
    def LEGEND_ROW_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_ROW_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each legend symbol
      */
    @JSImport("plottable/build/src/components", "Legend.LEGEND_SYMBOL_CLASS")
    @js.native
    def LEGEND_SYMBOL_CLASS: String = js.native
    @scala.inline
    def LEGEND_SYMBOL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGEND_SYMBOL_CLASS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/components", "PlotGroup")
  @js.native
  /**
    * Constructs a Group.
    *
    * A Group contains Components that will be rendered on top of each other.
    * Components added later will be rendered above Components already in the Group.
    *
    * @constructor
    * @param {Component[]} [components=[]] Components to be added to the Group.
    */
  class PlotGroup ()
    extends typingsSlinky.plottable.plotGroupMod.PlotGroup {
    def this(components: js.Array[Component]) = this()
  }
  
  @JSImport("plottable/build/src/components", "PropertyMode")
  @js.native
  object PropertyMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.plottable.selectionBoxLayerMod.PropertyMode with Double] = js.native
    
    /* 1 */ val PIXEL: typingsSlinky.plottable.selectionBoxLayerMod.PropertyMode.PIXEL with Double = js.native
    
    /* 0 */ val VALUE: typingsSlinky.plottable.selectionBoxLayerMod.PropertyMode.VALUE with Double = js.native
  }
  
  @JSImport("plottable/build/src/components", "SelectionBoxLayer")
  @js.native
  class SelectionBoxLayer ()
    extends typingsSlinky.plottable.selectionBoxLayerMod.SelectionBoxLayer
  
  @JSImport("plottable/build/src/components", "Table")
  @js.native
  /**
    * A Table combines Components in the form of a grid. A
    * common case is combining a y-axis, x-axis, and the plotted data via
    * ```typescript
    * new Table([[yAxis, plot],
    *            [null,  xAxis]]);
    * ```
    *
    * @constructor
    * @param {(Component|null|undefined)[][]} [rows=[]] A 2-D array of Components to be added to the Table.
    *   null can be used if a cell is empty.
    */
  class Table ()
    extends typingsSlinky.plottable.tableMod.Table {
    def this(rows: js.Array[js.Array[js.UndefOr[Component | Null]]]) = this()
  }
  /* static members */
  object Table {
    
    @JSImport("plottable/build/src/components", "Table._calcComponentWeights")
    @js.native
    def _calcComponentWeights(setWeights: js.Any, componentGroups: js.Any, fixityAccessor: js.Any): js.Any = js.native
    
    @JSImport("plottable/build/src/components", "Table._calcProportionalSpace")
    @js.native
    def _calcProportionalSpace(weights: js.Any, freeSpace: js.Any): js.Any = js.native
    
    @JSImport("plottable/build/src/components", "Table._fixedSpace")
    @js.native
    def _fixedSpace(componentGroup: js.Any, fixityAccessor: js.Any): js.Any = js.native
  }
  
  @JSImport("plottable/build/src/components", "TitleLabel")
  @js.native
  /**
    * @constructor
    * @param {string} [text]
    * @param {number} [angle] One of -90/0/90. 0 is horizontal.
    */
  class TitleLabel ()
    extends typingsSlinky.plottable.labelMod.TitleLabel {
    def this(text: String) = this()
    def this(text: js.UndefOr[scala.Nothing], angle: Double) = this()
    def this(text: String, angle: Double) = this()
  }
  /* static members */
  object TitleLabel {
    
    @JSImport("plottable/build/src/components", "TitleLabel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/components", "TitleLabel.TITLE_LABEL_CLASS")
    @js.native
    def TITLE_LABEL_CLASS: String = js.native
    @scala.inline
    def TITLE_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TITLE_LABEL_CLASS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/components", "WrappedLabel")
  @js.native
  /**
    * A Label is a Component that displays a single line of text.
    *
    * @constructor
    * @param {string} [displayText=""] The text of the Label.
    * @param {number} [angle=0] The angle of the Label in degrees (-90/0/90). 0 is horizontal.
    */
  class WrappedLabel ()
    extends typingsSlinky.plottable.wrappedLabelMod.WrappedLabel {
    def this(displayText: String) = this()
    def this(displayText: js.UndefOr[scala.Nothing], angle: Double) = this()
    def this(displayText: String, angle: Double) = this()
  }
  
  @JSImport("plottable/build/src/components", "XDragBoxLayer")
  @js.native
  /**
    * An XDragBoxLayer is a DragBoxLayer whose size can only be set in the X-direction.
    * The y-values of the bounds() are always set to 0 and the height() of the XDragBoxLayer.
    *
    * @constructor
    */
  class XDragBoxLayer ()
    extends typingsSlinky.plottable.xDragBoxLayerMod.XDragBoxLayer
  
  @JSImport("plottable/build/src/components", "YDragBoxLayer")
  @js.native
  /**
    * A YDragBoxLayer is a DragBoxLayer whose size can only be set in the Y-direction.
    * The x-values of the bounds() are always set to 0 and the width() of the YDragBoxLayer.
    *
    * @constructor
    */
  class YDragBoxLayer ()
    extends typingsSlinky.plottable.yDragBoxLayerMod.YDragBoxLayer
}
