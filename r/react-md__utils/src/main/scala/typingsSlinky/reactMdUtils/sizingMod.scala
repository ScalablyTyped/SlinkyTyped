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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/sizing", JSImport.Namespace)
@js.native
object sizingMod extends js.Object {
  
  val AppSizeContext: Context[AppSizeinitializedboolean] = js.native
  
  val DEFAULT_APP_SIZE: AppSize = js.native
  
  val DEFAULT_DESKTOP_LARGE_MIN_WIDTH: QuerySize = js.native
  
  val DEFAULT_DESKTOP_MIN_WIDTH: QuerySize = js.native
  
  val DEFAULT_PHONE_MAX_WIDTH: QuerySize = js.native
  
  val DEFAULT_TABLET_MAX_WIDTH: QuerySize = js.native
  
  val DEFAULT_TABLET_MIN_WIDTH: QuerySize = js.native
  
  val DesktopOnly: ReactComponentClass[MediaOnlyProps] = js.native
  
  val MobileOnly: ReactComponentClass[MediaOnlyProps] = js.native
  
  val PhoneOnly: ReactComponentClass[MediaOnlyProps] = js.native
  
  val TabletOnly: ReactComponentClass[MediaOnlyProps] = js.native
  
  def getOrientationType(): OrientationType = js.native
  
  @JSName("toWidthPart")
  def toWidthPart_max(v: js.UndefOr[QuerySize], prefix: max): String = js.native
  @JSName("toWidthPart")
  def toWidthPart_min(v: js.UndefOr[QuerySize], prefix: min): String = js.native
  
  def useAppSize(): AppSize = js.native
  
  def useAppSizeMedia(): AppSize = js.native
  def useAppSizeMedia(
    hasPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeOptions
  ): AppSize = js.native
  
  def useMediaQuery(query: String): Boolean = js.native
  def useMediaQuery(
    query: String,
    defaultValue: js.UndefOr[scala.Nothing],
    disabled: js.UndefOr[scala.Nothing],
    checkImmediately: Boolean
  ): Boolean = js.native
  def useMediaQuery(query: String, defaultValue: js.UndefOr[scala.Nothing], disabled: Boolean): Boolean = js.native
  def useMediaQuery(
    query: String,
    defaultValue: js.UndefOr[scala.Nothing],
    disabled: Boolean,
    checkImmediately: Boolean
  ): Boolean = js.native
  def useMediaQuery(query: String, defaultValue: Boolean): Boolean = js.native
  def useMediaQuery(
    query: String,
    defaultValue: Boolean,
    disabled: js.UndefOr[scala.Nothing],
    checkImmediately: Boolean
  ): Boolean = js.native
  def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean): Boolean = js.native
  def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean, checkImmediately: Boolean): Boolean = js.native
  
  def useOrientation(): OrientationType = js.native
  def useOrientation(defaultValue: OrientationType): OrientationType = js.native
  
  def useResizeListener(hasOnResizeOptionsImmediateEnabled: ResizeListenerOptions): Unit = js.native
  
  def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E]): EnsuredRefs[E] = js.native
  def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E], options: UseResizeObserverOptions[E]): EnsuredRefs[E] = js.native
  def useResizeObserver[E /* <: HTMLElement */](options: UseResizeObserverV1Options[E]): Unit = js.native
  
  def useWidthMediaQuery(hasMinMax: WidthMediaQuery with WidthMediaQuerys): Boolean = js.native
  
  @js.native
  object AppSizeListener extends js.Object {
    
    def apply(
      hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeListenerProps
    ): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var children: js.Any = js.native
      
      var defaultSize: js.Any = js.native
      
      var desktopLargeMinWidth: js.Any = js.native
      
      var desktopMinWidth: js.Any = js.native
      
      var onChange: js.Any = js.native
      
      var phoneMaxWidth: js.Any = js.native
      
      var tabletMaxWidth: js.Any = js.native
      
      var tabletMinWidth: js.Any = js.native
    }
  }
  
  @js.native
  object ResizeListener extends js.Object {
    
    def apply(hasOnResizeOptionsImmediate: ResizeListenerProps): Null = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var immediate: js.Any = js.native
      
      var onResize: js.Any = js.native
      
      var options: js.Any = js.native
    }
  }
  
  @js.native
  object ResizeObserver extends js.Object {
    
    def apply(hasDisableHeightDisableWidthClassNameComponentTargetOnResize: ResizeObserverProps): ReactElement | Null = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var className: js.Any = js.native
      
      var component: js.Any = js.native
      
      var disableHeight: js.Any = js.native
      
      var disableWidth: js.Any = js.native
      
      var target: js.Any = js.native
    }
  }
}
