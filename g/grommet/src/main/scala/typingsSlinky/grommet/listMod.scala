package typingsSlinky.grommet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.grommet.anon.Border
import typingsSlinky.grommet.anon.Index
import typingsSlinky.grommet.anon.Light
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/List", "List")
  @js.native
  class List protected ()
    extends Component[
          ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement])) = this()
    def this(
      props: ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/List", "List")
  @js.native
  val List: ReactComponentClass[
    ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement])
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.grommet.listMod.SideType
    - typingsSlinky.grommet.anon.Size
  */
  type BorderType = _BorderType | Boolean
  
  @js.native
  trait ListProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var action: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, Unit]] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var as: js.UndefOr[String] = js.native
    
    var background: js.UndefOr[String | js.Array[String] | Light] = js.native
    
    var border: js.UndefOr[BorderType] = js.native
    
    var data: js.UndefOr[js.Array[js.Object | String]] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var itemProps: js.UndefOr[StringDictionary[Border]] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var onClickItem: js.UndefOr[
        js.Function1[(/* event */ Index) | (/* event */ SyntheticMouseEvent[Element]), Unit]
      ] = js.native
    
    var onMore: js.UndefOr[js.Function0[Unit]] = js.native
    
    var pad: js.UndefOr[PadType] = js.native
    
    var primaryKey: js.UndefOr[String | (js.Function1[/* item */ js.Any, ReactElement])] = js.native
    
    var secondaryKey: js.UndefOr[String | (js.Function1[/* item */ js.Any, ReactElement])] = js.native
    
    var step: js.UndefOr[Double] = js.native
  }
  object ListProps {
    
    @scala.inline
    def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAction(value: (/* item */ js.Any, /* index */ Double) => Unit): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBackground(value: String | js.Array[String] | Light): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBackgroundVarargs(value: String*): Self = StObject.set(x, "background", js.Array(value :_*))
      
      @scala.inline
      def setBorder(value: BorderType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[js.Object | String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: (js.Object | String)*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setItemProps(value: StringDictionary[Border]): Self = StObject.set(x, "itemProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropsUndefined: Self = StObject.set(x, "itemProps", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnClickItem(value: (/* event */ Index) | (/* event */ SyntheticMouseEvent[Element]) => Unit): Self = StObject.set(x, "onClickItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickItemUndefined: Self = StObject.set(x, "onClickItem", js.undefined)
      
      @scala.inline
      def setOnMore(value: () => Unit): Self = StObject.set(x, "onMore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMoreUndefined: Self = StObject.set(x, "onMore", js.undefined)
      
      @scala.inline
      def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      @scala.inline
      def setPrimaryKey(value: String | (js.Function1[/* item */ js.Any, ReactElement])): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryKeyFunction1(value: /* item */ js.Any => ReactElement): Self = StObject.set(x, "primaryKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      @scala.inline
      def setSecondaryKey(value: String | (js.Function1[/* item */ js.Any, ReactElement])): Self = StObject.set(x, "secondaryKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryKeyFunction1(value: /* item */ js.Any => ReactElement): Self = StObject.set(x, "secondaryKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSecondaryKeyUndefined: Self = StObject.set(x, "secondaryKey", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.none
    - typingsSlinky.grommet.grommetStrings.xxsmall
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type PadSizeType = _PadSizeType | String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.listMod.PadSizeType
    - typingsSlinky.grommet.anon.Left
  */
  type PadType = _PadType | String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.top
    - typingsSlinky.grommet.grommetStrings.left
    - typingsSlinky.grommet.grommetStrings.bottom
    - typingsSlinky.grommet.grommetStrings.right
    - typingsSlinky.grommet.grommetStrings.horizontal
    - typingsSlinky.grommet.grommetStrings.vertical
    - typingsSlinky.grommet.grommetStrings.all
  */
  trait SideType extends _BorderType
  object SideType {
    
    @scala.inline
    def all: typingsSlinky.grommet.grommetStrings.all = "all".asInstanceOf[typingsSlinky.grommet.grommetStrings.all]
    
    @scala.inline
    def bottom: typingsSlinky.grommet.grommetStrings.bottom = "bottom".asInstanceOf[typingsSlinky.grommet.grommetStrings.bottom]
    
    @scala.inline
    def horizontal: typingsSlinky.grommet.grommetStrings.horizontal = "horizontal".asInstanceOf[typingsSlinky.grommet.grommetStrings.horizontal]
    
    @scala.inline
    def left: typingsSlinky.grommet.grommetStrings.left = "left".asInstanceOf[typingsSlinky.grommet.grommetStrings.left]
    
    @scala.inline
    def right: typingsSlinky.grommet.grommetStrings.right = "right".asInstanceOf[typingsSlinky.grommet.grommetStrings.right]
    
    @scala.inline
    def top: typingsSlinky.grommet.grommetStrings.top = "top".asInstanceOf[typingsSlinky.grommet.grommetStrings.top]
    
    @scala.inline
    def vertical: typingsSlinky.grommet.grommetStrings.vertical = "vertical".asInstanceOf[typingsSlinky.grommet.grommetStrings.vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.xxsmall
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type SizeType = _SizeType | String
  
  trait _BorderType extends StObject
  
  trait _PadSizeType extends _PadType
  
  trait _PadType extends StObject
  
  trait _SizeType extends StObject
}
