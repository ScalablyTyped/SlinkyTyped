package typingsSlinky.antdMobileRn.mod

import typingsSlinky.reactNative.mod.ActionSheetIOSOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionSheet {
  
  @JSImport("antd-mobile-rn", "ActionSheet.close")
  @js.native
  def close(): Unit = js.native
  
  @JSImport("antd-mobile-rn", "ActionSheet.showActionSheetWithOptions")
  @js.native
  def showActionSheetWithOptions(config: ActionSheetIOSOptions, callback: js.Function1[/* index */ Double, Unit]): Unit = js.native
  
  @JSImport("antd-mobile-rn", "ActionSheet.showShareActionSheetWithOptions")
  @js.native
  def showShareActionSheetWithOptions(config: js.Any): Unit = js.native
  @JSImport("antd-mobile-rn", "ActionSheet.showShareActionSheetWithOptions")
  @js.native
  def showShareActionSheetWithOptions(
    config: js.Any,
    failureCallback: js.UndefOr[scala.Nothing],
    successCallback: js.Function2[/* arg0 */ Boolean, /* activityType */ js.UndefOr[String], Unit]
  ): Unit = js.native
  @JSImport("antd-mobile-rn", "ActionSheet.showShareActionSheetWithOptions")
  @js.native
  def showShareActionSheetWithOptions(config: js.Any, failureCallback: js.Function1[/* arg0 */ js.Any, Unit]): Unit = js.native
  @JSImport("antd-mobile-rn", "ActionSheet.showShareActionSheetWithOptions")
  @js.native
  def showShareActionSheetWithOptions(
    config: js.Any,
    failureCallback: js.Function1[/* arg0 */ js.Any, Unit],
    successCallback: js.Function2[/* arg0 */ Boolean, /* activityType */ js.UndefOr[String], Unit]
  ): Unit = js.native
}
