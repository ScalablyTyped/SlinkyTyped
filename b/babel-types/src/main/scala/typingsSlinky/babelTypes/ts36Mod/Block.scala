package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.BlockStatement
import typingsSlinky.babelTypes.babelTypesStrings.Program
import typingsSlinky.babelTypes.babelTypesStrings.module
import typingsSlinky.babelTypes.babelTypesStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.ts36Mod.BlockStatement_
  - typingsSlinky.babelTypes.ts36Mod.Program_
*/
trait Block extends StObject
object Block {
  
  @scala.inline
  def BlockStatement_(body: js.Array[Statement], end: Double, loc: SourceLocation, start: Double, `type`: BlockStatement): typingsSlinky.babelTypes.ts36Mod.BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.BlockStatement_]
  }
  
  @scala.inline
  def Program_(
    body: js.Array[Statement | ModuleDeclaration],
    end: Double,
    loc: SourceLocation,
    sourceType: script | module,
    start: Double,
    `type`: Program
  ): typingsSlinky.babelTypes.ts36Mod.Program_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.Program_]
  }
}
