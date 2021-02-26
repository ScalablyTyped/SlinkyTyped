package typingsSlinky.luaparse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object astMod {
  
  type BreakStatement = typingsSlinky.luaparse.astMod.Base[typingsSlinky.luaparse.luaparseStrings.BreakStatement]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.luaparse.astMod.Statement
    - typingsSlinky.luaparse.astMod.Expression
    - typingsSlinky.luaparse.astMod.IfClause
    - typingsSlinky.luaparse.astMod.ElseifClause
    - typingsSlinky.luaparse.astMod.ElseClause
    - typingsSlinky.luaparse.astMod.Chunk
    - typingsSlinky.luaparse.astMod.TableKey
    - typingsSlinky.luaparse.astMod.TableKeyString
    - typingsSlinky.luaparse.astMod.TableValue
    - typingsSlinky.luaparse.astMod.Comment
  */
  type Node = typingsSlinky.luaparse.astMod._Node | typingsSlinky.luaparse.astMod.BreakStatement
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.luaparse.astMod.LabelStatement
    - typingsSlinky.luaparse.astMod.BreakStatement
    - typingsSlinky.luaparse.astMod.GotoStatement
    - typingsSlinky.luaparse.astMod.ReturnStatement
    - typingsSlinky.luaparse.astMod.IfStatement
    - typingsSlinky.luaparse.astMod.WhileStatement
    - typingsSlinky.luaparse.astMod.DoStatement
    - typingsSlinky.luaparse.astMod.RepeatStatement
    - typingsSlinky.luaparse.astMod.LocalStatement
    - typingsSlinky.luaparse.astMod.AssignmentStatement
    - typingsSlinky.luaparse.astMod.CallStatement
    - typingsSlinky.luaparse.astMod.FunctionDeclaration
    - typingsSlinky.luaparse.astMod.ForNumericStatement
    - typingsSlinky.luaparse.astMod.ForGenericStatement
  */
  type Statement = typingsSlinky.luaparse.astMod._Statement | typingsSlinky.luaparse.astMod.BreakStatement
}
