package typingsSlinky.reactMdUtils

import typingsSlinky.reactMdUtils.sizingConstantsMod.QuerySize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAppSizeMediaMod {
  
  @JSImport("@react-md/utils/types/sizing/useAppSizeMedia", "DEFAULT_APP_SIZE")
  @js.native
  val DEFAULT_APP_SIZE: AppSize = js.native
  
  @JSImport("@react-md/utils/types/sizing/useAppSizeMedia", "useAppSizeMedia")
  @js.native
  def useAppSizeMedia(): AppSize = js.native
  @JSImport("@react-md/utils/types/sizing/useAppSizeMedia", "useAppSizeMedia")
  @js.native
  def useAppSizeMedia(
    hasPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeOptions
  ): AppSize = js.native
  
  @js.native
  trait AppSize extends StObject {
    
    /**
      * Boolean if currently matching a desktop screen by comparing the max width
      * of the device.
      */
    var isDesktop: Boolean = js.native
    
    /**
      * Boolean if the app is considered to be in landscape mode. This will just
      * verify that the window width is greater than the window height.
      *
      * NOTE: This might not be super accurate on Android devices since the soft
      * keyboard will change the dimensions of the viewport when it appears. It is
      * recommended to use the `useOrientation` hook as well if you'd like to get
      * the current orientation type.
      */
    var isLandscape: Boolean = js.native
    
    /**
      * Boolean if currently matching a large desktop screen by comparing the max
      * width of the device.
      */
    var isLargeDesktop: Boolean = js.native
    
    /**
      * Boolean if currently matching a phone by comparing the max width of the
      * device.
      */
    var isPhone: Boolean = js.native
    
    /**
      * Boolean if currently matching a tablet by comparing the max width of the
      * device.
      */
    var isTablet: Boolean = js.native
  }
  object AppSize {
    
    @scala.inline
    def apply(
      isDesktop: Boolean,
      isLandscape: Boolean,
      isLargeDesktop: Boolean,
      isPhone: Boolean,
      isTablet: Boolean
    ): AppSize = {
      val __obj = js.Dynamic.literal(isDesktop = isDesktop.asInstanceOf[js.Any], isLandscape = isLandscape.asInstanceOf[js.Any], isLargeDesktop = isLargeDesktop.asInstanceOf[js.Any], isPhone = isPhone.asInstanceOf[js.Any], isTablet = isTablet.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSize]
    }
    
    @scala.inline
    implicit class AppSizeMutableBuilder[Self <: AppSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDesktop(value: Boolean): Self = StObject.set(x, "isDesktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLargeDesktop(value: Boolean): Self = StObject.set(x, "isLargeDesktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPhone(value: Boolean): Self = StObject.set(x, "isPhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTablet(value: Boolean): Self = StObject.set(x, "isTablet", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AppSizeOptions extends StObject {
    
    /**
      * An optional default size to use for your app. This is really only helpful
      * when trying to do server side rendering or initial page render since the
      * default behavior is to check and update the size once mounted in the DOM.
      */
    var defaultSize: js.UndefOr[AppSize] = js.native
    
    /**
      * The min width for a large desktop screen.
      */
    var desktopLargeMinWidth: js.UndefOr[QuerySize] = js.native
    
    /**
      * The min width for a desktop screen.
      */
    var desktopMinWidth: js.UndefOr[QuerySize] = js.native
    
    /**
      * The max width to use for phones. This one is a max width unline the others
      * since everything from 0 to this value will be considered a phone.
      */
    var phoneMaxWidth: js.UndefOr[QuerySize] = js.native
    
    /**
      * The max width for a tablet device. This should normally be `1px` less than
      * the `desktopMinWidth`, but it can be any value if needed. The tablet has a
      * range of min to max so that you can have a bit more control.
      */
    var tabletMaxWidth: js.UndefOr[QuerySize] = js.native
    
    /**
      * The min width for a tablet device.
      */
    var tabletMinWidth: js.UndefOr[QuerySize] = js.native
  }
  object AppSizeOptions {
    
    @scala.inline
    def apply(): AppSizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppSizeOptions]
    }
    
    @scala.inline
    implicit class AppSizeOptionsMutableBuilder[Self <: AppSizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultSize(value: AppSize): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      @scala.inline
      def setDesktopLargeMinWidth(value: QuerySize): Self = StObject.set(x, "desktopLargeMinWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesktopLargeMinWidthUndefined: Self = StObject.set(x, "desktopLargeMinWidth", js.undefined)
      
      @scala.inline
      def setDesktopMinWidth(value: QuerySize): Self = StObject.set(x, "desktopMinWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesktopMinWidthUndefined: Self = StObject.set(x, "desktopMinWidth", js.undefined)
      
      @scala.inline
      def setPhoneMaxWidth(value: QuerySize): Self = StObject.set(x, "phoneMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneMaxWidthUndefined: Self = StObject.set(x, "phoneMaxWidth", js.undefined)
      
      @scala.inline
      def setTabletMaxWidth(value: QuerySize): Self = StObject.set(x, "tabletMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabletMaxWidthUndefined: Self = StObject.set(x, "tabletMaxWidth", js.undefined)
      
      @scala.inline
      def setTabletMinWidth(value: QuerySize): Self = StObject.set(x, "tabletMinWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabletMinWidthUndefined: Self = StObject.set(x, "tabletMinWidth", js.undefined)
    }
  }
}
