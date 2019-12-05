package typingsSlinky.bugsnagDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesCommonMod {
  import typingsSlinky.bugsnagDashJs.typesClientMod.Client
  import typingsSlinky.bugsnagDashJs.typesReportMod.default

  type BeforeSend = js.Function1[/* report */ default, Boolean | Unit]
  type BeforeSession = js.Function1[/* client */ Client, Unit]
}
