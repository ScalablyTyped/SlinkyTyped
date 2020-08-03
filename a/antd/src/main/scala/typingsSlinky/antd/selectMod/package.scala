package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selectMod {
  type OptionType = typingsSlinky.rcSelect.optionMod.OptionFC
  type RawValue = java.lang.String | scala.Double
  type SelectValue = typingsSlinky.antd.selectMod.RawValue | (js.Array[
    typingsSlinky.antd.selectMod.LabeledValue | typingsSlinky.antd.selectMod.RawValue
  ]) | typingsSlinky.antd.selectMod.LabeledValue
}
