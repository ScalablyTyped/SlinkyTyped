package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.BlockStatement
import typingsSlinky.babelTypes.babelTypesStrings.Program
import typingsSlinky.babelTypes.babelTypesStrings.TSModuleBlock
import typingsSlinky.babelTypes.babelTypesStrings.module
import typingsSlinky.babelTypes.babelTypesStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.BlockStatement_
  - typingsSlinky.babelTypes.indexTs37Mod.Program_
  - typingsSlinky.babelTypes.indexTs37Mod.TSModuleBlock_
*/
trait Block extends _Node
object Block {
  
  @scala.inline
  def BlockStatement_(body: js.Array[Statement], directives: js.Array[Directive_], `type`: BlockStatement): Block = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  def Program_(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceFile: String,
    sourceType: script | module,
    `type`: Program
  ): Block = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  def TSModuleBlock_(body: js.Array[Statement], `type`: TSModuleBlock): Block = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}
