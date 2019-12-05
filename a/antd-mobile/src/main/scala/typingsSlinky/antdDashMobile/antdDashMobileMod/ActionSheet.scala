package typingsSlinky.antdDashMobile.antdDashMobileMod

import typingsSlinky.antdDashMobile.libActionDashSheetMod.ActionCallBack
import typingsSlinky.antdDashMobile.libActionDashSheetMod.ActionSheetWithOptions
import typingsSlinky.antdDashMobile.libActionDashSheetMod.ShareActionSheetWithOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile", "ActionSheet")
@js.native
object ActionSheet extends js.Object {
  def close(): Unit = js.native
  def showActionSheetWithOptions(config: ActionSheetWithOptions): Unit = js.native
  def showActionSheetWithOptions(config: ActionSheetWithOptions, callback: ActionCallBack): Unit = js.native
  def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions): Unit = js.native
  def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions, callback: ActionCallBack): Unit = js.native
}

