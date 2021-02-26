package typingsSlinky.recast

import typingsSlinky.babelTypes.mod.File_
import typingsSlinky.recast.babelMod.BabelParser
import typingsSlinky.recast.babelOptionsMod.Overrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babylonMod {
  
  @JSImport("recast/parsers/babylon", "parse")
  @js.native
  def parse(source: String): File_ = js.native
  @JSImport("recast/parsers/babylon", "parse")
  @js.native
  def parse(source: String, options: Overrides): File_ = js.native
  
  @JSImport("recast/parsers/babylon", "parser")
  @js.native
  val parser: BabelParser = js.native
}
