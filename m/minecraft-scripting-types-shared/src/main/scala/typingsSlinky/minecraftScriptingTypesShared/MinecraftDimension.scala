package typingsSlinky.minecraftScriptingTypesShared

import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.`the end`
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.nether
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.overworld
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: move this stuff somewhere else
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.overworld
  - typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.nether
  - typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.`the end`
*/
trait MinecraftDimension extends js.Object

object MinecraftDimension {
  @scala.inline
  def End: `the end` = this.cast("the end")
  @scala.inline
  def Nether: nether = this.cast("nether")
  @scala.inline
  def Overworld: overworld = this.cast("overworld")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

