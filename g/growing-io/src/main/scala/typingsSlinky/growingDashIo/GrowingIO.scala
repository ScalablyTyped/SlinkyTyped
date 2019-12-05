package typingsSlinky.growingDashIo

import typingsSlinky.growingDashIo.growingDashIoStrings.appDOTset
import typingsSlinky.growingDashIo.growingDashIoStrings.clearUserId
import typingsSlinky.growingDashIo.growingDashIoStrings.config
import typingsSlinky.growingDashIo.growingDashIoStrings.evarDOTset
import typingsSlinky.growingDashIo.growingDashIoStrings.init
import typingsSlinky.growingDashIo.growingDashIoStrings.pageDOTset
import typingsSlinky.growingDashIo.growingDashIoStrings.peopleDOTset
import typingsSlinky.growingDashIo.growingDashIoStrings.sendPage
import typingsSlinky.growingDashIo.growingDashIoStrings.setUserId
import typingsSlinky.growingDashIo.growingDashIoStrings.track
import typingsSlinky.growingDashIo.growingDashIoStrings.visitDOTset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrowingIO extends js.Object {
  /** app.set: 对于应用级变量，也就是 1.x 版本中的 CS2 - CS10, people.set: 用户级变量, page.set: 页面级变量 visit.set: 访问用户级变量, evar.set: 转化变量 */
  def apply(action: appDOTset, key: String, value: String): Unit = js.native
  /** app.set: 对于应用级变量，也就是 1.x 版本中的 CS2 - CS10, people.set: 用户级变量, page.set: 页面级变量 visit.set: 访问用户级变量, evar.set: 转化变量 */
  def apply(action: appDOTset, variables: GIOObjectVariables): Unit = js.native
  /** clearUserId: 清空用户信息, sendPage: 上报页面数据 */
  def apply(action: clearUserId): Unit = js.native
  /** 配置 */
  def apply(action: config, options: GIOConfigOptions): Unit = js.native
  def apply(action: evarDOTset, key: String, value: String): Unit = js.native
  def apply(action: evarDOTset, variables: GIOObjectVariables): Unit = js.native
  /** 初始化 */
  def apply(action: init, projectId: String): Unit = js.native
  def apply(action: init, projectId: String, options: GIOInitOptions): Unit = js.native
  def apply(action: pageDOTset, key: String, value: String): Unit = js.native
  def apply(action: pageDOTset, variables: GIOObjectVariables): Unit = js.native
  def apply(action: peopleDOTset, key: String, value: String): Unit = js.native
  def apply(action: peopleDOTset, variables: GIOObjectVariables): Unit = js.native
  def apply(action: sendPage): Unit = js.native
  /** 设置用户登录id */
  def apply(action: setUserId, userId: String): Unit = js.native
  /** 自定义埋点 */
  def apply(action: track, eventId: String): Unit = js.native
  def apply(action: track, eventId: String, numberOrVariables: Double): Unit = js.native
  def apply(action: track, eventId: String, numberOrVariables: GIOObjectVariables): Unit = js.native
  /** 自定义埋点 */
  def apply(action: track, eventId: String, number: Double, eventLevelVariables: GIOObjectVariables): Unit = js.native
  def apply(action: visitDOTset, key: String, value: String): Unit = js.native
  def apply(action: visitDOTset, variables: GIOObjectVariables): Unit = js.native
}

