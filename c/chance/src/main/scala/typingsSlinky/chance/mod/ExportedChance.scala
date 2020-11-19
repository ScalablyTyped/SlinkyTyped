package typingsSlinky.chance.mod

import typingsSlinky.chance.Chance.ChanceStatic
import typingsSlinky.chance.Chance.Seed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportedChance extends ChanceStatic {
  
  def Chance(): typingsSlinky.chance.Chance.Chance = js.native
  def Chance(generator: js.Function0[_]): typingsSlinky.chance.Chance.Chance = js.native
  def Chance(seed: Seed): typingsSlinky.chance.Chance.Chance = js.native
  @JSName("Chance")
  var Chance_Original: ExportedChance = js.native
}
