package typingsSlinky.relayDashCompiler.libCoreGraphQLIRVisitorMod

import typingsSlinky.graphql.typeDefinitionMod.GraphQLCompositeType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLOutputType
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Argument
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ArgumentDefinition
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ArgumentValue
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Directive
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Fragment
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Handle
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Literal
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.LocalArgumentDefinition
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Location
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Metadata
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Root
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ScalarFieldType
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Selection
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Variable
import typingsSlinky.relayDashCompiler.relayDashCompilerStrings.mutation
import typingsSlinky.relayDashCompiler.relayDashCompilerStrings.query
import typingsSlinky.relayDashCompiler.relayDashCompilerStrings.subscription
import typingsSlinky.typescript.typescriptMod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashCompiler.libCoreGraphQLIRMod.Argument
  - typings.relayDashCompiler.libCoreGraphQLIRMod.ClientExtension
  - typings.relayDashCompiler.libCoreGraphQLIRMod.Condition
  - typings.relayDashCompiler.libCoreGraphQLIRMod.Defer
  - typings.relayDashCompiler.libCoreGraphQLIRMod.ConnectionField
  - typings.relayDashCompiler.libCoreGraphQLIRMod.Connection
  - typings.relayDashCompiler.libCoreGraphQLIRMod.Directive
  - typings.relayDashCompiler.libCoreGraphQLIRMod.Fragment
  - typings.relayDashCompiler.libCoreGraphQLIRMod.FragmentSpread
  - typings.relayDashCompiler.libCoreGraphQLIRMod.InlineDataFragmentSpread
  - typings.relayDashCompiler.libCoreGraphQLIRMod.InlineFragment
  - typings.relayDashCompiler.libCoreGraphQLIRMod.LinkedField
  - typings.relayDashCompiler.libCoreGraphQLIRMod.Literal
  - typings.relayDashCompiler.libCoreGraphQLIRMod.LocalArgumentDefinition
  - typings.relayDashCompiler.libCoreGraphQLIRMod.ModuleImport
  - typings.relayDashCompiler.libCoreGraphQLIRMod.Request
  - typings.relayDashCompiler.libCoreGraphQLIRMod.Root
  - typings.relayDashCompiler.libCoreGraphQLIRMod.RootArgumentDefinition
  - typings.relayDashCompiler.libCoreGraphQLIRMod.ScalarField
  - typings.relayDashCompiler.libCoreGraphQLIRMod.SplitOperation
  - typings.relayDashCompiler.libCoreGraphQLIRMod.Stream
  - typings.relayDashCompiler.libCoreGraphQLIRMod.Variable
*/
trait VisitNode extends js.Object

object VisitNode {
  @scala.inline
  def ConnectionField(
    alias: String,
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.ConnectionField,
    label: String,
    loc: Location,
    name: String,
    resolver: String,
    selections: js.Array[Selection],
    `type`: GraphQLOutputType,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Directive(
    args: js.Array[Argument],
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Directive,
    loc: Location,
    name: String,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def InlineDataFragmentSpread(
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.InlineDataFragmentSpread,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def LinkedField(
    alias: String,
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.LinkedField,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: GraphQLOutputType,
    handles: js.Array[Handle] = null,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Defer(
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Defer,
    label: String,
    loc: Location,
    selections: js.Array[Selection],
    `if`: ArgumentValue = null,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Literal(
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Literal,
    loc: Location,
    value: js.Any,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def FragmentSpread(
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.FragmentSpread,
    loc: Location,
    name: String,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def InlineFragment(
    directives: js.Array[Directive],
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.InlineFragment,
    loc: Location,
    selections: js.Array[Selection],
    typeCondition: GraphQLCompositeType,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def ModuleImport(
    documentName: String,
    id: String,
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.ModuleImport,
    loc: Location,
    module: String,
    name: String,
    selections: js.Array[Selection]
  ): VisitNode = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Variable(
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Variable,
    loc: Location,
    variableName: String,
    metadata: Metadata = null,
    `type`: GraphQLInputType = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def RootArgumentDefinition(
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.RootArgumentDefinition,
    loc: Location,
    name: String,
    `type`: GraphQLInputType,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Connection(conditional: Boolean, key: String, value: TypeReferenceNode): VisitNode = {
    val __obj = js.Dynamic.literal(conditional = conditional.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def SplitOperation(
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.SplitOperation,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: GraphQLCompositeType,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def ClientExtension(
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.ClientExtension,
    loc: Location,
    selections: js.Array[Selection],
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Fragment(
    argumentDefinitions: js.Array[ArgumentDefinition],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Fragment,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: GraphQLCompositeType,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Stream(
    initialCount: ArgumentValue,
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Stream,
    label: String,
    loc: Location,
    selections: js.Array[Selection],
    `if`: ArgumentValue = null,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(initialCount = initialCount.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Argument(
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Argument,
    loc: Location,
    name: String,
    value: ArgumentValue,
    metadata: Metadata = null,
    `type`: GraphQLInputType = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def LocalArgumentDefinition(
    defaultValue: js.Any,
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.LocalArgumentDefinition,
    loc: Location,
    name: String,
    `type`: GraphQLInputType,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Request(
    fragment: Fragment,
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Request,
    loc: Location,
    name: String,
    root: Root,
    id: String = null,
    metadata: Metadata = null,
    text: String = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Root(
    argumentDefinitions: js.Array[LocalArgumentDefinition],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Root,
    loc: Location,
    name: String,
    operation: query | mutation | subscription,
    selections: Selection,
    `type`: GraphQLCompositeType,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def ScalarField(
    alias: String,
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.ScalarField,
    loc: Location,
    name: String,
    `type`: ScalarFieldType,
    handles: js.Array[Handle] = null,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Condition(
    condition: Literal | Variable,
    kind: typingsSlinky.relayDashCompiler.relayDashCompilerStrings.Condition,
    loc: Location,
    passingValue: Boolean,
    selections: js.Array[Selection],
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
}

