package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object statisticUtilsMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdBooleans.`false`
    - typingsSlinky.antd.antdStrings.number
    - typingsSlinky.antd.antdStrings.countdown
    - js.Function2[
  / * value * / typingsSlinky.antd.statisticUtilsMod.valueType, 
  / * config * / js.UndefOr[typingsSlinky.antd.statisticUtilsMod.FormatConfig], 
  typingsSlinky.react.mod.ReactNode]
  */
  type Formatter = typingsSlinky.antd.statisticUtilsMod._Formatter | (js.Function2[
    /* value */ typingsSlinky.antd.statisticUtilsMod.valueType, 
    /* config */ js.UndefOr[typingsSlinky.antd.statisticUtilsMod.FormatConfig], 
    slinky.core.facade.ReactElement
  ])
  type countdownValueType = typingsSlinky.antd.statisticUtilsMod.valueType | java.lang.String
  type valueType = scala.Double | java.lang.String
}
