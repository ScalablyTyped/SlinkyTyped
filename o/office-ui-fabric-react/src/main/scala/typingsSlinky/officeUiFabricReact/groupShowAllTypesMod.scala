package typingsSlinky.officeUiFabricReact

import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupShowAllTypesMod {
  
  @js.native
  trait IGroupShowAllProps extends IGroupDividerProps {
    
    /**
      * Style function to be passed in to override the themed or default styles
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IGroupShowAllStyleProps, IGroupShowAllStyles]] = js.native
  }
  object IGroupShowAllProps {
    
    @scala.inline
    def apply(): IGroupShowAllProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupShowAllProps]
    }
    
    @scala.inline
    implicit class IGroupShowAllPropsMutableBuilder[Self <: IGroupShowAllProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IGroupShowAllStyleProps, IGroupShowAllStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IGroupShowAllStyleProps => DeepPartial[IGroupShowAllStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupShowAll.types.IGroupShowAllProps, 'theme'>> */
  @js.native
  trait IGroupShowAllStyleProps extends StObject {
    
    var theme: ITheme = js.native
  }
  object IGroupShowAllStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IGroupShowAllStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupShowAllStyleProps]
    }
    
    @scala.inline
    implicit class IGroupShowAllStylePropsMutableBuilder[Self <: IGroupShowAllStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IGroupShowAllStyles extends StObject {
    
    var root: IStyle = js.native
  }
  object IGroupShowAllStyles {
    
    @scala.inline
    def apply(): IGroupShowAllStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupShowAllStyles]
    }
    
    @scala.inline
    implicit class IGroupShowAllStylesMutableBuilder[Self <: IGroupShowAllStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
