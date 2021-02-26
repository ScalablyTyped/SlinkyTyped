package typingsSlinky.antd.mod

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.antd.countdownMod.default
import typingsSlinky.antd.statisticStatisticMod.StatisticComponent
import typingsSlinky.antd.statisticStatisticMod.StatisticProps
import typingsSlinky.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Statistic extends Shortcut {
  
  @JSImport("antd", "Statistic")
  @js.native
  val ^ : FC[StatisticProps] with StatisticComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "Statistic.Countdown")
  @js.native
  class Countdown () extends default
  
  type _To = FC[StatisticProps] with StatisticComponent
  
  /* This means you don't have to write `^`, but can instead just say `Statistic.foo` */
  override def _to: FC[StatisticProps] with StatisticComponent = ^
}
