package typingsSlinky.relayCompiler.iRMod

import typingsSlinky.relayCompiler.relayCompilerStrings.mutation
import typingsSlinky.relayCompiler.relayCompilerStrings.query
import typingsSlinky.relayCompiler.relayCompilerStrings.subscription
import typingsSlinky.relayCompiler.schemaMod.CompositeTypeID
import typingsSlinky.relayCompiler.schemaMod.LinkedFieldTypeID
import typingsSlinky.relayCompiler.schemaMod.TypeID
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.ClientExtension
  - typingsSlinky.relayCompiler.iRMod.Condition
  - typingsSlinky.relayCompiler.iRMod.Defer
  - typingsSlinky.relayCompiler.iRMod.Fragment
  - typingsSlinky.relayCompiler.iRMod.InlineDataFragmentSpread
  - typingsSlinky.relayCompiler.iRMod.InlineFragment
  - typingsSlinky.relayCompiler.iRMod.LinkedField
  - typingsSlinky.relayCompiler.iRMod.ModuleImport
  - typingsSlinky.relayCompiler.iRMod.Root
  - typingsSlinky.relayCompiler.iRMod.SplitOperation
  - typingsSlinky.relayCompiler.iRMod.Stream
*/
trait Node extends js.Object
object Node {
  
  @scala.inline
  def Fragment(
    argumentDefinitions: js.Array[ArgumentDefinition],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Fragment,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: CompositeTypeID
  ): Node = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def InlineFragment(
    directives: js.Array[Directive],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.InlineFragment,
    loc: Location,
    selections: js.Array[Selection],
    typeCondition: CompositeTypeID
  ): Node = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def InlineDataFragmentSpread(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.InlineDataFragmentSpread,
    loc: Location,
    name: String,
    selections: js.Array[Selection]
  ): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def SplitOperation(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.SplitOperation,
    loc: Location,
    name: String,
    parentSources: Set[String],
    selections: js.Array[Selection],
    `type`: TypeID
  ): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentSources = parentSources.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ClientExtension(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.ClientExtension,
    loc: Location,
    selections: js.Array[Selection]
  ): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ModuleImport(
    documentName: String,
    id: String,
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.ModuleImport,
    loc: Location,
    module: String,
    name: String,
    selections: js.Array[Selection]
  ): Node = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def Defer(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Defer,
    label: String,
    loc: Location,
    selections: js.Array[Selection]
  ): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def Root(
    argumentDefinitions: js.Array[LocalArgumentDefinition],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Root,
    loc: Location,
    name: String,
    operation: query | mutation | subscription,
    selections: Selection,
    `type`: CompositeTypeID
  ): Node = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def Stream(
    initialCount: ArgumentValue,
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Stream,
    label: String,
    loc: Location,
    selections: js.Array[Selection]
  ): Node = {
    val __obj = js.Dynamic.literal(initialCount = initialCount.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def LinkedField(
    alias: String,
    args: js.Array[Argument],
    connection: Boolean,
    directives: js.Array[Directive],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.LinkedField,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: LinkedFieldTypeID
  ): Node = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def Condition(
    condition: Literal | Variable,
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Condition,
    loc: Location,
    passingValue: Boolean,
    selections: js.Array[Selection]
  ): Node = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}
