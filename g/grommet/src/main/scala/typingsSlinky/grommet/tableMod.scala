package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLTableElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.TableHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("grommet/components/Table", "Table")
  @js.native
  val Table: ReactComponentClass[
    TableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
  ] = js.native
  
  @js.native
  trait TableProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var caption: js.UndefOr[String] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
  }
  object TableProps {
    
    @scala.inline
    def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit class TablePropsMutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    }
  }
}
