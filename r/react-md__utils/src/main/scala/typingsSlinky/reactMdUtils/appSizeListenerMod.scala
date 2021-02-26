package typingsSlinky.reactMdUtils

import slinky.core.facade.ReactElement
import typingsSlinky.reactMdUtils.useAppSizeMediaMod.AppSize
import typingsSlinky.reactMdUtils.useAppSizeMediaMod.AppSizeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appSizeListenerMod {
  
  object AppSizeListener {
    
    @JSImport("@react-md/utils/types/sizing/AppSizeListener", "AppSizeListener")
    @js.native
    def apply(
      hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeListenerProps
    ): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils/types/sizing/AppSizeListener", "AppSizeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils/types/sizing/AppSizeListener", "AppSizeListener.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing/AppSizeListener", "AppSizeListener.propTypes.defaultSize")
      @js.native
      def defaultSize: js.Any = js.native
      @scala.inline
      def defaultSize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSize")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing/AppSizeListener", "AppSizeListener.propTypes.desktopLargeMinWidth")
      @js.native
      def desktopLargeMinWidth: js.Any = js.native
      @scala.inline
      def desktopLargeMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopLargeMinWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing/AppSizeListener", "AppSizeListener.propTypes.desktopMinWidth")
      @js.native
      def desktopMinWidth: js.Any = js.native
      @scala.inline
      def desktopMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopMinWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing/AppSizeListener", "AppSizeListener.propTypes.onChange")
      @js.native
      def onChange: js.Any = js.native
      @scala.inline
      def onChange_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing/AppSizeListener", "AppSizeListener.propTypes.phoneMaxWidth")
      @js.native
      def phoneMaxWidth: js.Any = js.native
      @scala.inline
      def phoneMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneMaxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing/AppSizeListener", "AppSizeListener.propTypes.tabletMaxWidth")
      @js.native
      def tabletMaxWidth: js.Any = js.native
      @scala.inline
      def tabletMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMaxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing/AppSizeListener", "AppSizeListener.propTypes.tabletMinWidth")
      @js.native
      def tabletMinWidth: js.Any = js.native
      @scala.inline
      def tabletMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMinWidth")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AppSizeListenerProps extends AppSizeOptions {
    
    var children: ReactElement = js.native
    
    /**
      * An change handler for the app size. This will be called each time the app
      * size changes based on a window resize event and will be provided the next
      * size and the previous size.
      */
    var onChange: js.UndefOr[js.Function2[/* nextSize */ AppSize, /* lastSize */ AppSize, Unit]] = js.native
  }
  object AppSizeListenerProps {
    
    @scala.inline
    def apply(): AppSizeListenerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppSizeListenerProps]
    }
    
    @scala.inline
    implicit class AppSizeListenerPropsMutableBuilder[Self <: AppSizeListenerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* nextSize */ AppSize, /* lastSize */ AppSize) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
