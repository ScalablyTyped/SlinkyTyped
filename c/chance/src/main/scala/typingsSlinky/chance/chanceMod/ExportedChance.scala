package typingsSlinky.chance.chanceMod

import typingsSlinky.chance.Chance.ChanceStatic
import typingsSlinky.chance.Chance.Seed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportedChance extends ChanceStatic {
  @JSName("Chance")
  var Chance_Original: ExportedChance = js.native
  def Chance(): typingsSlinky.chance.Chance.Chance = js.native
  def Chance(generator: js.Function0[_]): typingsSlinky.chance.Chance.Chance = js.native
  def Chance(seed: Seed): typingsSlinky.chance.Chance.Chance = js.native
}

