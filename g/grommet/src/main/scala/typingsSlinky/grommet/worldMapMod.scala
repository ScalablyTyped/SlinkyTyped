package typingsSlinky.grommet

import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.anon.Dark
import typingsSlinky.grommet.anon.Location
import typingsSlinky.grommet.anon.Name
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.FillType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.SVGProps
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worldMapMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/WorldMap", "WorldMap")
  @js.native
  class WorldMap protected ()
    extends Component[WorldMapProps with (Omit[SVGProps[SVGSVGElement], color]), js.Object, js.Any] {
    def this(props: WorldMapProps with (Omit[SVGProps[SVGSVGElement], color])) = this()
    def this(props: WorldMapProps with (Omit[SVGProps[SVGSVGElement], color]), context: js.Any) = this()
  }
  @JSImport("grommet/components/WorldMap", "WorldMap")
  @js.native
  val WorldMap: ReactComponentClass[WorldMapProps with (Omit[SVGProps[SVGSVGElement], color])] = js.native
  
  @js.native
  trait WorldMapProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var color: js.UndefOr[ColorType] = js.native
    
    var continents: js.UndefOr[js.Array[Name]] = js.native
    
    var fill: js.UndefOr[FillType] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var hoverColor: js.UndefOr[String | Dark] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var onSelectPlace: js.UndefOr[js.Function1[/* place */ js.Array[Double], Unit]] = js.native
    
    var places: js.UndefOr[js.Array[Location]] = js.native
  }
  object WorldMapProps {
    
    @scala.inline
    def apply(): WorldMapProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorldMapProps]
    }
    
    @scala.inline
    implicit class WorldMapPropsMutableBuilder[Self <: WorldMapProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContinents(value: js.Array[Name]): Self = StObject.set(x, "continents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinentsUndefined: Self = StObject.set(x, "continents", js.undefined)
      
      @scala.inline
      def setContinentsVarargs(value: Name*): Self = StObject.set(x, "continents", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: FillType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setHoverColor(value: String | Dark): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnSelectPlace(value: /* place */ js.Array[Double] => Unit): Self = StObject.set(x, "onSelectPlace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectPlaceUndefined: Self = StObject.set(x, "onSelectPlace", js.undefined)
      
      @scala.inline
      def setPlaces(value: js.Array[Location]): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacesUndefined: Self = StObject.set(x, "places", js.undefined)
      
      @scala.inline
      def setPlacesVarargs(value: Location*): Self = StObject.set(x, "places", js.Array(value :_*))
    }
  }
}
