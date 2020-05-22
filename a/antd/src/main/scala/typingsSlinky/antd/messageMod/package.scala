package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object messageMod {
  type ConfigContent = slinky.core.TagMod[scala.Any] | java.lang.String
  type ConfigDuration = scala.Double | js.Function0[scala.Unit]
  type ConfigOnClose = js.Function0[scala.Unit]
  type JointContent = typingsSlinky.antd.messageMod.ConfigContent | typingsSlinky.antd.messageMod.ArgsProps
  type ThenableArgument = js.Function1[/* val */ js.Any, scala.Unit]
}
