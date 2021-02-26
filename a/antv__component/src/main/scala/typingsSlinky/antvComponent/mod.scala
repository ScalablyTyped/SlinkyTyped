package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.componentMod.default
import typingsSlinky.antvComponent.typesMod.AxisBaseCfg
import typingsSlinky.antvComponent.typesMod.ComponentCfg
import typingsSlinky.antvComponent.typesMod.CrosshairBaseCfg
import typingsSlinky.antvComponent.typesMod.GroupComponentCfg
import typingsSlinky.antvComponent.typesMod.HtmlCrossHairCfg
import typingsSlinky.antvComponent.typesMod.LegendBaseCfg
import typingsSlinky.antvComponent.typesMod.TooltipCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Annotation {
    
    @JSImport("@antv/component", "Annotation.Arc")
    @js.native
    class Arc ()
      extends typingsSlinky.antvComponent.annotationMod.Arc
    
    @JSImport("@antv/component", "Annotation.DataMarker")
    @js.native
    class DataMarker ()
      extends typingsSlinky.antvComponent.annotationMod.DataMarker
    
    @JSImport("@antv/component", "Annotation.DataRegion")
    @js.native
    class DataRegion ()
      extends typingsSlinky.antvComponent.annotationMod.DataRegion
    
    @JSImport("@antv/component", "Annotation.Html")
    @js.native
    class Html ()
      extends typingsSlinky.antvComponent.annotationMod.Html
    
    @JSImport("@antv/component", "Annotation.Image")
    @js.native
    class Image ()
      extends typingsSlinky.antvComponent.annotationMod.Image
    
    @JSImport("@antv/component", "Annotation.Line")
    @js.native
    class Line ()
      extends typingsSlinky.antvComponent.annotationMod.Line
    
    @JSImport("@antv/component", "Annotation.Region")
    @js.native
    class Region ()
      extends typingsSlinky.antvComponent.annotationMod.Region
    
    @JSImport("@antv/component", "Annotation.RegionFilter")
    @js.native
    class RegionFilter ()
      extends typingsSlinky.antvComponent.annotationMod.RegionFilter
    
    @JSImport("@antv/component", "Annotation.Shape")
    @js.native
    class Shape ()
      extends typingsSlinky.antvComponent.annotationMod.Shape
    
    @JSImport("@antv/component", "Annotation.Text")
    @js.native
    class Text ()
      extends typingsSlinky.antvComponent.annotationMod.Text
  }
  
  object Axis {
    
    @JSImport("@antv/component", "Axis.Base")
    @js.native
    abstract class Base[T /* <: AxisBaseCfg */] ()
      extends typingsSlinky.antvComponent.axisMod.Base[T]
    
    @JSImport("@antv/component", "Axis.Circle")
    @js.native
    class Circle ()
      extends typingsSlinky.antvComponent.axisMod.Circle
    
    @JSImport("@antv/component", "Axis.Line")
    @js.native
    class Line ()
      extends typingsSlinky.antvComponent.axisMod.Line
  }
  
  @JSImport("@antv/component", "Component")
  @js.native
  abstract class Component[T /* <: ComponentCfg */] protected () extends default[T] {
    def this(cfg: T) = this()
  }
  
  object Crosshair {
    
    @JSImport("@antv/component", "Crosshair.Base")
    @js.native
    abstract class Base[T /* <: CrosshairBaseCfg */] ()
      extends typingsSlinky.antvComponent.crosshairMod.Base[T]
    
    @JSImport("@antv/component", "Crosshair.Circle")
    @js.native
    class Circle ()
      extends typingsSlinky.antvComponent.crosshairMod.Circle
    
    @JSImport("@antv/component", "Crosshair.Html")
    @js.native
    class Html[T /* <: HtmlCrossHairCfg */] ()
      extends typingsSlinky.antvComponent.crosshairMod.Html[T]
    
    @JSImport("@antv/component", "Crosshair.Line")
    @js.native
    class Line ()
      extends typingsSlinky.antvComponent.crosshairMod.Line
  }
  
  object Grid {
    
    @JSImport("@antv/component", "Grid.Base")
    @js.native
    abstract class Base[T /* <: GroupComponentCfg */] ()
      extends typingsSlinky.antvComponent.gridMod.Base[T]
    
    @JSImport("@antv/component", "Grid.Circle")
    @js.native
    class Circle ()
      extends typingsSlinky.antvComponent.gridMod.Circle
    
    @JSImport("@antv/component", "Grid.Line")
    @js.native
    class Line ()
      extends typingsSlinky.antvComponent.gridMod.Line
  }
  
  @JSImport("@antv/component", "GroupComponent")
  @js.native
  abstract class GroupComponent[T /* <: GroupComponentCfg */] ()
    extends typingsSlinky.antvComponent.groupComponentMod.default[T]
  
  @JSImport("@antv/component", "HtmlComponent")
  @js.native
  abstract class HtmlComponent[T /* <: ComponentCfg */] ()
    extends typingsSlinky.antvComponent.htmlComponentMod.default[T]
  
  object Legend {
    
    @JSImport("@antv/component", "Legend.Base")
    @js.native
    abstract class Base[T /* <: LegendBaseCfg */] ()
      extends typingsSlinky.antvComponent.legendMod.Base[T]
    
    @JSImport("@antv/component", "Legend.Category")
    @js.native
    class Category ()
      extends typingsSlinky.antvComponent.legendMod.Category
    
    @JSImport("@antv/component", "Legend.Continuous")
    @js.native
    class Continuous ()
      extends typingsSlinky.antvComponent.legendMod.Continuous
  }
  
  @JSImport("@antv/component", "Scrollbar")
  @js.native
  class Scrollbar ()
    extends typingsSlinky.antvComponent.scrollbarMod.Scrollbar
  
  @JSImport("@antv/component", "Slider")
  @js.native
  class Slider ()
    extends typingsSlinky.antvComponent.sliderMod.Slider
  
  object Tooltip {
    
    @JSImport("@antv/component", "Tooltip.Html")
    @js.native
    class Html[T /* <: TooltipCfg */] ()
      extends typingsSlinky.antvComponent.tooltipMod.Html[T]
  }
}
