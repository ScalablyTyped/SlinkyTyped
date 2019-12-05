package typingsSlinky.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsProductMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProductActionEnum extends js.Object

@JSImport("react-native-google-analytics-bridge/dist/models/Product", "ProductActionEnum")
@js.native
object ProductActionEnum extends js.Object {
  @js.native
  sealed trait Add extends ProductActionEnum
  
  @js.native
  sealed trait Checkout extends ProductActionEnum
  
  @js.native
  sealed trait CheckoutOption extends ProductActionEnum
  
  @js.native
  sealed trait Click extends ProductActionEnum
  
  @js.native
  sealed trait Detail extends ProductActionEnum
  
  @js.native
  sealed trait Purchase extends ProductActionEnum
  
  @js.native
  sealed trait Refund extends ProductActionEnum
  
  @js.native
  sealed trait Remove extends ProductActionEnum
  
  /* 3 */ val Add: typingsSlinky.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsProductMod.ProductActionEnum.Add with Double = js.native
  /* 5 */ val Checkout: typingsSlinky.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsProductMod.ProductActionEnum.Checkout with Double = js.native
  /* 6 */ val CheckoutOption: typingsSlinky.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsProductMod.ProductActionEnum.CheckoutOption with Double = js.native
  /* 2 */ val Click: typingsSlinky.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsProductMod.ProductActionEnum.Click with Double = js.native
  /* 1 */ val Detail: typingsSlinky.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsProductMod.ProductActionEnum.Detail with Double = js.native
  /* 7 */ val Purchase: typingsSlinky.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsProductMod.ProductActionEnum.Purchase with Double = js.native
  /* 8 */ val Refund: typingsSlinky.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsProductMod.ProductActionEnum.Refund with Double = js.native
  /* 4 */ val Remove: typingsSlinky.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsProductMod.ProductActionEnum.Remove with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProductActionEnum with Double] = js.native
}

