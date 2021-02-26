package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.reactMdUtils.anon.AppSizeinitializedboolean
import typingsSlinky.reactMdUtils.appSizeListenerMod.AppSizeListenerProps
import typingsSlinky.reactMdUtils.mediaOnlyMod.MediaOnlyProps
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.max
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.min
import typingsSlinky.reactMdUtils.resizeListenerMod.ResizeListenerProps
import typingsSlinky.reactMdUtils.resizeObserverMod.ResizeObserverProps
import typingsSlinky.reactMdUtils.sizingConstantsMod.QuerySize
import typingsSlinky.reactMdUtils.useAppSizeMediaMod.AppSize
import typingsSlinky.reactMdUtils.useAppSizeMediaMod.AppSizeOptions
import typingsSlinky.reactMdUtils.useEnsuredRefMod.EnsuredRefs
import typingsSlinky.reactMdUtils.useResizeListenerMod.ResizeListenerOptions
import typingsSlinky.reactMdUtils.useResizeObserverMod.OnResizeObserverChange
import typingsSlinky.reactMdUtils.useResizeObserverMod.UseResizeObserverOptions
import typingsSlinky.reactMdUtils.useResizeObserverV1Mod.UseResizeObserverV1Options
import typingsSlinky.reactMdUtils.useWidthMediaQueryMod.WidthMediaQuery
import typingsSlinky.reactMdUtils.useWidthMediaQueryMod.WidthMediaQuerys
import typingsSlinky.std.OrientationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizingMod {
  
  @JSImport("@react-md/utils/types/sizing", "AppSizeContext")
  @js.native
  val AppSizeContext: Context[AppSizeinitializedboolean] = js.native
  
  object AppSizeListener {
    
    @JSImport("@react-md/utils/types/sizing", "AppSizeListener")
    @js.native
    def apply(
      hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeListenerProps
    ): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.defaultSize")
      @js.native
      def defaultSize: js.Any = js.native
      @scala.inline
      def defaultSize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSize")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.desktopLargeMinWidth")
      @js.native
      def desktopLargeMinWidth: js.Any = js.native
      @scala.inline
      def desktopLargeMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopLargeMinWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.desktopMinWidth")
      @js.native
      def desktopMinWidth: js.Any = js.native
      @scala.inline
      def desktopMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopMinWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.onChange")
      @js.native
      def onChange: js.Any = js.native
      @scala.inline
      def onChange_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.phoneMaxWidth")
      @js.native
      def phoneMaxWidth: js.Any = js.native
      @scala.inline
      def phoneMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneMaxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.tabletMaxWidth")
      @js.native
      def tabletMaxWidth: js.Any = js.native
      @scala.inline
      def tabletMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMaxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.tabletMinWidth")
      @js.native
      def tabletMinWidth: js.Any = js.native
      @scala.inline
      def tabletMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMinWidth")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/utils/types/sizing", "DEFAULT_APP_SIZE")
  @js.native
  val DEFAULT_APP_SIZE: AppSize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "DEFAULT_DESKTOP_LARGE_MIN_WIDTH")
  @js.native
  val DEFAULT_DESKTOP_LARGE_MIN_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "DEFAULT_DESKTOP_MIN_WIDTH")
  @js.native
  val DEFAULT_DESKTOP_MIN_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "DEFAULT_PHONE_MAX_WIDTH")
  @js.native
  val DEFAULT_PHONE_MAX_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "DEFAULT_TABLET_MAX_WIDTH")
  @js.native
  val DEFAULT_TABLET_MAX_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "DEFAULT_TABLET_MIN_WIDTH")
  @js.native
  val DEFAULT_TABLET_MIN_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "DesktopOnly")
  @js.native
  val DesktopOnly: ReactComponentClass[MediaOnlyProps] = js.native
  
  @JSImport("@react-md/utils/types/sizing", "MobileOnly")
  @js.native
  val MobileOnly: ReactComponentClass[MediaOnlyProps] = js.native
  
  @JSImport("@react-md/utils/types/sizing", "PhoneOnly")
  @js.native
  val PhoneOnly: ReactComponentClass[MediaOnlyProps] = js.native
  
  object ResizeListener {
    
    @JSImport("@react-md/utils/types/sizing", "ResizeListener")
    @js.native
    def apply(hasOnResizeOptionsImmediate: ResizeListenerProps): Null = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils/types/sizing", "ResizeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils/types/sizing", "ResizeListener.propTypes.immediate")
      @js.native
      def immediate: js.Any = js.native
      @scala.inline
      def immediate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("immediate")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "ResizeListener.propTypes.onResize")
      @js.native
      def onResize: js.Any = js.native
      @scala.inline
      def onResize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResize")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "ResizeListener.propTypes.options")
      @js.native
      def options: js.Any = js.native
      @scala.inline
      def options_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    }
  }
  
  object ResizeObserver {
    
    @JSImport("@react-md/utils/types/sizing", "ResizeObserver")
    @js.native
    def apply(hasDisableHeightDisableWidthClassNameComponentTargetOnResize: ResizeObserverProps): ReactElement | Null = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils/types/sizing", "ResizeObserver.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils/types/sizing", "ResizeObserver.propTypes.className")
      @js.native
      def className: js.Any = js.native
      @scala.inline
      def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "ResizeObserver.propTypes.component")
      @js.native
      def component: js.Any = js.native
      @scala.inline
      def component_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "ResizeObserver.propTypes.disableHeight")
      @js.native
      def disableHeight: js.Any = js.native
      @scala.inline
      def disableHeight_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "ResizeObserver.propTypes.disableWidth")
      @js.native
      def disableWidth: js.Any = js.native
      @scala.inline
      def disableWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "ResizeObserver.propTypes.target")
      @js.native
      def target: js.Any = js.native
      @scala.inline
      def target_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("target")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/utils/types/sizing", "TabletOnly")
  @js.native
  val TabletOnly: ReactComponentClass[MediaOnlyProps] = js.native
  
  @JSImport("@react-md/utils/types/sizing", "getOrientationType")
  @js.native
  def getOrientationType(): OrientationType = js.native
  
  @JSImport("@react-md/utils/types/sizing", "toWidthPart")
  @js.native
  def toWidthPart_max(v: js.UndefOr[QuerySize], prefix: max): String = js.native
  @JSImport("@react-md/utils/types/sizing", "toWidthPart")
  @js.native
  def toWidthPart_min(v: js.UndefOr[QuerySize], prefix: min): String = js.native
  
  @JSImport("@react-md/utils/types/sizing", "useAppSize")
  @js.native
  def useAppSize(): AppSize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "useAppSizeMedia")
  @js.native
  def useAppSizeMedia(): AppSize = js.native
  @JSImport("@react-md/utils/types/sizing", "useAppSizeMedia")
  @js.native
  def useAppSizeMedia(
    hasPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeOptions
  ): AppSize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "useMediaQuery")
  @js.native
  def useMediaQuery(query: String): Boolean = js.native
  @JSImport("@react-md/utils/types/sizing", "useMediaQuery")
  @js.native
  def useMediaQuery(
    query: String,
    defaultValue: js.UndefOr[scala.Nothing],
    disabled: js.UndefOr[scala.Nothing],
    checkImmediately: Boolean
  ): Boolean = js.native
  @JSImport("@react-md/utils/types/sizing", "useMediaQuery")
  @js.native
  def useMediaQuery(query: String, defaultValue: js.UndefOr[scala.Nothing], disabled: Boolean): Boolean = js.native
  @JSImport("@react-md/utils/types/sizing", "useMediaQuery")
  @js.native
  def useMediaQuery(
    query: String,
    defaultValue: js.UndefOr[scala.Nothing],
    disabled: Boolean,
    checkImmediately: Boolean
  ): Boolean = js.native
  @JSImport("@react-md/utils/types/sizing", "useMediaQuery")
  @js.native
  def useMediaQuery(query: String, defaultValue: Boolean): Boolean = js.native
  @JSImport("@react-md/utils/types/sizing", "useMediaQuery")
  @js.native
  def useMediaQuery(
    query: String,
    defaultValue: Boolean,
    disabled: js.UndefOr[scala.Nothing],
    checkImmediately: Boolean
  ): Boolean = js.native
  @JSImport("@react-md/utils/types/sizing", "useMediaQuery")
  @js.native
  def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean): Boolean = js.native
  @JSImport("@react-md/utils/types/sizing", "useMediaQuery")
  @js.native
  def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean, checkImmediately: Boolean): Boolean = js.native
  
  @JSImport("@react-md/utils/types/sizing", "useOrientation")
  @js.native
  def useOrientation(): OrientationType = js.native
  @JSImport("@react-md/utils/types/sizing", "useOrientation")
  @js.native
  def useOrientation(defaultValue: OrientationType): OrientationType = js.native
  
  @JSImport("@react-md/utils/types/sizing", "useResizeListener")
  @js.native
  def useResizeListener(hasOnResizeOptionsImmediateEnabled: ResizeListenerOptions): Unit = js.native
  
  @JSImport("@react-md/utils/types/sizing", "useResizeObserver")
  @js.native
  def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E]): EnsuredRefs[E] = js.native
  @JSImport("@react-md/utils/types/sizing", "useResizeObserver")
  @js.native
  def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E], options: UseResizeObserverOptions[E]): EnsuredRefs[E] = js.native
  @JSImport("@react-md/utils/types/sizing", "useResizeObserver")
  @js.native
  def useResizeObserver[E /* <: HTMLElement */](options: UseResizeObserverV1Options[E]): Unit = js.native
  
  @JSImport("@react-md/utils/types/sizing", "useWidthMediaQuery")
  @js.native
  def useWidthMediaQuery(hasMinMax: WidthMediaQuery with WidthMediaQuerys): Boolean = js.native
}
