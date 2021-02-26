package typingsSlinky.materialUi.MaterialUI

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.materialUi.materialUiStrings.auto
import typingsSlinky.materialUi.materialUiStrings.bottom
import typingsSlinky.materialUi.materialUiStrings.left
import typingsSlinky.materialUi.materialUiStrings.right
import typingsSlinky.materialUi.materialUiStrings.top
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridList {
  
  type GridList = ReactComponentClass[GridListProps]
  
  @js.native
  trait GridListProps extends StObject {
    
    var cellHeight: js.UndefOr[Double | auto] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
    var padding: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object GridListProps {
    
    @scala.inline
    def apply(): GridListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridListProps]
    }
    
    @scala.inline
    implicit class GridListPropsMutableBuilder[Self <: GridListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellHeight(value: Double | auto): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type GridTile = ReactComponentClass[GridTileProps]
  
  @js.native
  trait GridTileProps extends StObject {
    
    var actionIcon: js.UndefOr[ReactElement] = js.native
    
    var actionPosition: js.UndefOr[left | right] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
    var containerElement: js.UndefOr[String | ReactElement | ReactComponentClass[_]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var subtitle: js.UndefOr[ReactElement] = js.native
    
    var subtitleStyle: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
    
    var titleBackground: js.UndefOr[String] = js.native
    
    var titlePosition: js.UndefOr[top | bottom] = js.native
    
    var titleStyle: js.UndefOr[CSSProperties] = js.native
  }
  object GridTileProps {
    
    @scala.inline
    def apply(): GridTileProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridTileProps]
    }
    
    @scala.inline
    implicit class GridTilePropsMutableBuilder[Self <: GridTileProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionIcon(value: ReactElement): Self = StObject.set(x, "actionIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionIconUndefined: Self = StObject.set(x, "actionIcon", js.undefined)
      
      @scala.inline
      def setActionPosition(value: left | right): Self = StObject.set(x, "actionPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionPositionUndefined: Self = StObject.set(x, "actionPosition", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setContainerElement(value: String | ReactElement | ReactComponentClass[_]): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerElementComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerElementReactElement(value: ReactElement): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[js.Object] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubtitle(value: ReactElement): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleReactElement(value: ReactElement): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleStyle(value: CSSProperties): Self = StObject.set(x, "subtitleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleStyleUndefined: Self = StObject.set(x, "subtitleStyle", js.undefined)
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBackground(value: String): Self = StObject.set(x, "titleBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBackgroundUndefined: Self = StObject.set(x, "titleBackground", js.undefined)
      
      @scala.inline
      def setTitlePosition(value: top | bottom): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
