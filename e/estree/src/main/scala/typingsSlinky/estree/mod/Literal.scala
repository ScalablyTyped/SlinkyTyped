package typingsSlinky.estree.mod

import typingsSlinky.estree.anon.Flags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.SimpleLiteral
  - typingsSlinky.estree.mod.RegExpLiteral
*/
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.estree.mod.Node because Already inherited */ trait Literal extends Expression
object Literal {
  
  @scala.inline
  def RegExpLiteral(regex: Flags, `type`: typingsSlinky.estree.estreeStrings.Literal): typingsSlinky.estree.mod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.RegExpLiteral]
  }
  
  @scala.inline
  def SimpleLiteral(`type`: typingsSlinky.estree.estreeStrings.Literal): typingsSlinky.estree.mod.SimpleLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.SimpleLiteral]
  }
}
