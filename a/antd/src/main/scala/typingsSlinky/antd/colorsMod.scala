package typingsSlinky.antd

import typingsSlinky.antd.antdStrings.blue
import typingsSlinky.antd.antdStrings.cyan
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.error
import typingsSlinky.antd.antdStrings.geekblue
import typingsSlinky.antd.antdStrings.gold
import typingsSlinky.antd.antdStrings.green
import typingsSlinky.antd.antdStrings.lime
import typingsSlinky.antd.antdStrings.magenta
import typingsSlinky.antd.antdStrings.orange
import typingsSlinky.antd.antdStrings.pink
import typingsSlinky.antd.antdStrings.processing
import typingsSlinky.antd.antdStrings.purple
import typingsSlinky.antd.antdStrings.red
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.antd.antdStrings.volcano
import typingsSlinky.antd.antdStrings.warning
import typingsSlinky.antd.antdStrings.yellow
import typingsSlinky.antd.typeMod.ElementOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/_util/colors", JSImport.Namespace)
@js.native
object colorsMod extends js.Object {
  val PresetColorTypes: js.Tuple13[pink, red, yellow, orange, cyan, green, blue, purple, geekblue, magenta, volcano, gold, lime] = js.native
  val PresetStatusColorTypes: js.Tuple5[success, processing, error, default, warning] = js.native
  type PresetColorType = ElementOf[
    js.Tuple13[pink, red, yellow, orange, cyan, green, blue, purple, geekblue, magenta, volcano, gold, lime]
  ]
  type PresetStatusColorType = ElementOf[js.Tuple5[success, processing, error, default, warning]]
}

