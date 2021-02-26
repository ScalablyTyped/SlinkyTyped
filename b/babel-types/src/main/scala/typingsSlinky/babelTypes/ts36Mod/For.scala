package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.ForInStatement
import typingsSlinky.babelTypes.babelTypesStrings.ForOfStatement
import typingsSlinky.babelTypes.babelTypesStrings.ForStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.ts36Mod.ForInStatement_
  - typingsSlinky.babelTypes.ts36Mod.ForStatement_
  - typingsSlinky.babelTypes.ts36Mod.ForOfStatement_
*/
trait For extends StObject
object For {
  
  @scala.inline
  def ForInStatement_(
    body: Statement,
    end: Double,
    left: VariableDeclaration_ | LVal,
    loc: SourceLocation,
    right: Expression,
    start: Double,
    `type`: ForInStatement
  ): typingsSlinky.babelTypes.ts36Mod.ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ForInStatement_]
  }
  
  @scala.inline
  def ForOfStatement_(
    body: Statement,
    end: Double,
    left: VariableDeclaration_ | LVal,
    loc: SourceLocation,
    right: Expression,
    start: Double,
    `type`: ForOfStatement
  ): typingsSlinky.babelTypes.ts36Mod.ForOfStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ForOfStatement_]
  }
  
  @scala.inline
  def ForStatement_(
    body: Statement,
    end: Double,
    init: VariableDeclaration_ | Expression,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: ForStatement,
    update: Expression
  ): typingsSlinky.babelTypes.ts36Mod.ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ForStatement_]
  }
}
