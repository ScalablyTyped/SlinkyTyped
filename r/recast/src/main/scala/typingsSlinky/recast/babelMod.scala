package typingsSlinky.recast

import typingsSlinky.babelParser.mod.ParserOptions
import typingsSlinky.babelTypes.mod.File_
import typingsSlinky.recast.anon.FnCall
import typingsSlinky.recast.babelOptionsMod.Overrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recast/parsers/babel", JSImport.Namespace)
@js.native
object babelMod extends js.Object {
  
  def parse(source: String): File_ = js.native
  def parse(source: String, options: Overrides): File_ = js.native
  
  val parser: BabelParser = js.native
  
  @js.native
  trait BabelParser extends js.Object {
    
    def parse(input: String): File_ = js.native
    def parse(input: String, options: ParserOptions): File_ = js.native
    @JSName("parse")
    var parse_Original: FnCall = js.native
  }
}
