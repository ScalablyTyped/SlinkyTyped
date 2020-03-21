package typingsSlinky.bugsnagJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonMod {
  type BeforeSend = js.Function1[/* report */ typingsSlinky.bugsnagJs.reportMod.default, scala.Boolean | scala.Unit]
  type BeforeSession = js.Function1[/* client */ typingsSlinky.bugsnagJs.clientMod.Client, scala.Unit]
}
