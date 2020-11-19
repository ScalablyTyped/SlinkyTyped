package typingsSlinky.relayCompiler.irvisitorMod

import typingsSlinky.relayCompiler.iRMod.Argument
import typingsSlinky.relayCompiler.iRMod.ArgumentDefinition
import typingsSlinky.relayCompiler.iRMod.ArgumentValue
import typingsSlinky.relayCompiler.iRMod.Directive
import typingsSlinky.relayCompiler.iRMod.Fragment
import typingsSlinky.relayCompiler.iRMod.Literal
import typingsSlinky.relayCompiler.iRMod.LocalArgumentDefinition
import typingsSlinky.relayCompiler.iRMod.Location
import typingsSlinky.relayCompiler.iRMod.Root
import typingsSlinky.relayCompiler.iRMod.Selection
import typingsSlinky.relayCompiler.iRMod.Variable
import typingsSlinky.relayCompiler.relayCompilerStrings.mutation
import typingsSlinky.relayCompiler.relayCompilerStrings.query
import typingsSlinky.relayCompiler.relayCompilerStrings.subscription
import typingsSlinky.relayCompiler.schemaMod.CompositeTypeID
import typingsSlinky.relayCompiler.schemaMod.InputTypeID
import typingsSlinky.relayCompiler.schemaMod.LinkedFieldTypeID
import typingsSlinky.relayCompiler.schemaMod.ScalarFieldTypeID
import typingsSlinky.relayCompiler.schemaMod.TypeID
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.Argument
  - typingsSlinky.relayCompiler.iRMod.ClientExtension
  - typingsSlinky.relayCompiler.iRMod.Condition
  - typingsSlinky.relayCompiler.iRMod.Defer
  - typingsSlinky.relayCompiler.iRMod.Directive
  - typingsSlinky.relayCompiler.iRMod.Fragment
  - typingsSlinky.relayCompiler.iRMod.FragmentSpread
  - typingsSlinky.relayCompiler.iRMod.InlineDataFragmentSpread
  - typingsSlinky.relayCompiler.iRMod.InlineFragment
  - typingsSlinky.relayCompiler.iRMod.LinkedField
  - typingsSlinky.relayCompiler.iRMod.Literal
  - typingsSlinky.relayCompiler.iRMod.LocalArgumentDefinition
  - typingsSlinky.relayCompiler.iRMod.ModuleImport
  - typingsSlinky.relayCompiler.iRMod.Request
  - typingsSlinky.relayCompiler.iRMod.Root
  - typingsSlinky.relayCompiler.iRMod.RootArgumentDefinition
  - typingsSlinky.relayCompiler.iRMod.ScalarField
  - typingsSlinky.relayCompiler.iRMod.SplitOperation
  - typingsSlinky.relayCompiler.iRMod.Stream
  - typingsSlinky.relayCompiler.iRMod.Variable
*/
trait VisitNode extends js.Object
object VisitNode {
  
  @scala.inline
  def Fragment(
    argumentDefinitions: js.Array[ArgumentDefinition],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Fragment,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: CompositeTypeID
  ): VisitNode = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def ScalarField(
    alias: String,
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.ScalarField,
    loc: Location,
    name: String,
    `type`: ScalarFieldTypeID
  ): VisitNode = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def InlineFragment(
    directives: js.Array[Directive],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.InlineFragment,
    loc: Location,
    selections: js.Array[Selection],
    typeCondition: CompositeTypeID
  ): VisitNode = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def Argument(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Argument,
    loc: Location,
    name: String,
    value: ArgumentValue
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def RootArgumentDefinition(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.RootArgumentDefinition,
    loc: Location,
    name: String,
    `type`: InputTypeID
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def Request(
    fragment: Fragment,
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Request,
    loc: Location,
    name: String,
    root: Root
  ): VisitNode = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def InlineDataFragmentSpread(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.InlineDataFragmentSpread,
    loc: Location,
    name: String,
    selections: js.Array[Selection]
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def FragmentSpread(
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.FragmentSpread,
    loc: Location,
    name: String
  ): VisitNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def SplitOperation(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.SplitOperation,
    loc: Location,
    name: String,
    parentSources: Set[String],
    selections: js.Array[Selection],
    `type`: TypeID
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentSources = parentSources.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def Directive(
    args: js.Array[Argument],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Directive,
    loc: Location,
    name: String
  ): VisitNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def ClientExtension(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.ClientExtension,
    loc: Location,
    selections: js.Array[Selection]
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
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
  ): VisitNode = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def LocalArgumentDefinition(
    defaultValue: js.Any,
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.LocalArgumentDefinition,
    loc: Location,
    name: String,
    `type`: InputTypeID
  ): VisitNode = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def Defer(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Defer,
    label: String,
    loc: Location,
    selections: js.Array[Selection]
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
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
  ): VisitNode = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def Stream(
    initialCount: ArgumentValue,
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Stream,
    label: String,
    loc: Location,
    selections: js.Array[Selection]
  ): VisitNode = {
    val __obj = js.Dynamic.literal(initialCount = initialCount.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def Literal(kind: typingsSlinky.relayCompiler.relayCompilerStrings.Literal, loc: Location, value: js.Any): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
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
  ): VisitNode = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def Variable(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Variable,
    loc: Location,
    variableName: String
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  
  @scala.inline
  def Condition(
    condition: Literal | Variable,
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Condition,
    loc: Location,
    passingValue: Boolean,
    selections: js.Array[Selection]
  ): VisitNode = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
}
