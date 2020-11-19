package typingsSlinky.antdMobileRn

import typingsSlinky.reactNative.mod.ActionSheetIOSOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn/lib/action-sheet/index.native", JSImport.Namespace)
@js.native
object actionSheetIndexNativeMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def close(): Unit = js.native
    
    def showActionSheetWithOptions(config: ActionSheetIOSOptions, callback: js.Function1[/* index */ Double, Unit]): Unit = js.native
    
    def showShareActionSheetWithOptions(config: js.Any): Unit = js.native
    def showShareActionSheetWithOptions(
      config: js.Any,
      failureCallback: js.UndefOr[scala.Nothing],
      successCallback: js.Function2[/* arg0 */ Boolean, /* activityType */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def showShareActionSheetWithOptions(config: js.Any, failureCallback: js.Function1[/* arg0 */ js.Any, Unit]): Unit = js.native
    def showShareActionSheetWithOptions(
      config: js.Any,
      failureCallback: js.Function1[/* arg0 */ js.Any, Unit],
      successCallback: js.Function2[/* arg0 */ Boolean, /* activityType */ js.UndefOr[String], Unit]
    ): Unit = js.native
  }
}
