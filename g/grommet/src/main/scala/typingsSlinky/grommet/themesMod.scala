package typingsSlinky.grommet

import typingsSlinky.grommet.themesBaseMod.ThemeType
import typingsSlinky.grommet.utilsMod.DeepReadonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/themes", JSImport.Namespace)
@js.native
object themesMod extends js.Object {
  val base: DeepReadonly[ThemeType] = js.native
  val dark: ThemeType = js.native
  val grommet: ThemeType = js.native
  def generate(): DeepReadonly[ThemeType] = js.native
  def generate(baseSpacing: Double): DeepReadonly[ThemeType] = js.native
  def generate(baseSpacing: Double, scale: Double): DeepReadonly[ThemeType] = js.native
}

