package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.luaparseStrings.Ampersand
import typingsSlinky.luaparse.luaparseStrings.Asterisk
import typingsSlinky.luaparse.luaparseStrings.Colon
import typingsSlinky.luaparse.luaparseStrings.Dot
import typingsSlinky.luaparse.luaparseStrings.DotDot
import typingsSlinky.luaparse.luaparseStrings.EqualssignEqualssign
import typingsSlinky.luaparse.luaparseStrings.Greaterthansign
import typingsSlinky.luaparse.luaparseStrings.GreaterthansignEqualssign
import typingsSlinky.luaparse.luaparseStrings.GreaterthansignGreaterthansign
import typingsSlinky.luaparse.luaparseStrings.Lessthansign
import typingsSlinky.luaparse.luaparseStrings.LessthansignEqualssign
import typingsSlinky.luaparse.luaparseStrings.LessthansignLessthansign
import typingsSlinky.luaparse.luaparseStrings.Numbersign
import typingsSlinky.luaparse.luaparseStrings.Percentsign
import typingsSlinky.luaparse.luaparseStrings.Plussign
import typingsSlinky.luaparse.luaparseStrings.Slash
import typingsSlinky.luaparse.luaparseStrings.SlashSlash
import typingsSlinky.luaparse.luaparseStrings.Tilde
import typingsSlinky.luaparse.luaparseStrings.TildeEqualssign
import typingsSlinky.luaparse.luaparseStrings.Verticalline
import typingsSlinky.luaparse.luaparseStrings.^
import typingsSlinky.luaparse.luaparseStrings.`-_`
import typingsSlinky.luaparse.luaparseStrings.and
import typingsSlinky.luaparse.luaparseStrings.not
import typingsSlinky.luaparse.luaparseStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.luaparse.astMod.FunctionDeclaration
  - typingsSlinky.luaparse.astMod.Identifier
  - typingsSlinky.luaparse.astMod.StringLiteral
  - typingsSlinky.luaparse.astMod.NumericLiteral
  - typingsSlinky.luaparse.astMod.BooleanLiteral
  - typingsSlinky.luaparse.astMod.NilLiteral
  - typingsSlinky.luaparse.astMod.VarargLiteral
  - typingsSlinky.luaparse.astMod.TableConstructorExpression
  - typingsSlinky.luaparse.astMod.BinaryExpression
  - typingsSlinky.luaparse.astMod.LogicalExpression
  - typingsSlinky.luaparse.astMod.UnaryExpression
  - typingsSlinky.luaparse.astMod.MemberExpression
  - typingsSlinky.luaparse.astMod.IndexExpression
  - typingsSlinky.luaparse.astMod.CallExpression
  - typingsSlinky.luaparse.astMod.TableCallExpression
  - typingsSlinky.luaparse.astMod.StringCallExpression
*/
trait Expression extends _Node
object Expression {
  
  @scala.inline
  def BinaryExpression(
    left: Expression,
    operator: Plussign | `-_` | Asterisk | Percentsign | ^ | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    right: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.BinaryExpression
  ): typingsSlinky.luaparse.astMod.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.BinaryExpression]
  }
  
  @scala.inline
  def BooleanLiteral(raw: String, `type`: typingsSlinky.luaparse.luaparseStrings.BooleanLiteral, value: Boolean): typingsSlinky.luaparse.astMod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.BooleanLiteral]
  }
  
  @scala.inline
  def CallExpression(
    arguments: js.Array[Expression],
    base: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.CallExpression
  ): typingsSlinky.luaparse.astMod.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.CallExpression]
  }
  
  @scala.inline
  def FunctionDeclaration(
    body: js.Array[Statement],
    isLocal: Boolean,
    parameters: js.Array[Identifier | VarargLiteral],
    `type`: typingsSlinky.luaparse.luaparseStrings.FunctionDeclaration
  ): typingsSlinky.luaparse.astMod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.FunctionDeclaration]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.luaparse.luaparseStrings.Identifier): typingsSlinky.luaparse.astMod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.Identifier]
  }
  
  @scala.inline
  def IndexExpression(
    base: Expression,
    index: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.IndexExpression
  ): typingsSlinky.luaparse.astMod.IndexExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.IndexExpression]
  }
  
  @scala.inline
  def LogicalExpression(
    left: Expression,
    operator: or | and,
    right: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.LogicalExpression
  ): typingsSlinky.luaparse.astMod.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.LogicalExpression]
  }
  
  @scala.inline
  def MemberExpression(
    base: Expression,
    identifier: Identifier,
    indexer: Dot | Colon,
    `type`: typingsSlinky.luaparse.luaparseStrings.MemberExpression
  ): typingsSlinky.luaparse.astMod.MemberExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.MemberExpression]
  }
  
  @scala.inline
  def NilLiteral(raw: String, `type`: typingsSlinky.luaparse.luaparseStrings.NilLiteral, value: Null): typingsSlinky.luaparse.astMod.NilLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.NilLiteral]
  }
  
  @scala.inline
  def NumericLiteral(raw: String, `type`: typingsSlinky.luaparse.luaparseStrings.NumericLiteral, value: Double): typingsSlinky.luaparse.astMod.NumericLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.NumericLiteral]
  }
  
  @scala.inline
  def StringCallExpression(
    argument: Expression,
    base: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.StringCallExpression
  ): typingsSlinky.luaparse.astMod.StringCallExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.StringCallExpression]
  }
  
  @scala.inline
  def StringLiteral(raw: String, `type`: typingsSlinky.luaparse.luaparseStrings.StringLiteral, value: String): typingsSlinky.luaparse.astMod.StringLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.StringLiteral]
  }
  
  @scala.inline
  def TableCallExpression(
    arguments: Expression,
    base: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.TableCallExpression
  ): typingsSlinky.luaparse.astMod.TableCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.TableCallExpression]
  }
  
  @scala.inline
  def TableConstructorExpression(
    fields: js.Array[TableKey | TableKeyString | TableValue],
    `type`: typingsSlinky.luaparse.luaparseStrings.TableConstructorExpression
  ): typingsSlinky.luaparse.astMod.TableConstructorExpression = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.TableConstructorExpression]
  }
  
  @scala.inline
  def UnaryExpression(
    argument: Expression,
    operator: not | `-_` | Tilde | Numbersign,
    `type`: typingsSlinky.luaparse.luaparseStrings.UnaryExpression
  ): typingsSlinky.luaparse.astMod.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.UnaryExpression]
  }
  
  @scala.inline
  def VarargLiteral(raw: String, `type`: typingsSlinky.luaparse.luaparseStrings.VarargLiteral, value: String): typingsSlinky.luaparse.astMod.VarargLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.VarargLiteral]
  }
}
