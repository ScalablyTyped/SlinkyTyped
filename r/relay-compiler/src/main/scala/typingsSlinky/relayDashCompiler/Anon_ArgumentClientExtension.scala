package typingsSlinky.relayDashCompiler

import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Argument
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ClientExtension
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Condition
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Connection
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ConnectionField
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Defer
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Directive
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Fragment
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.FragmentSpread
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.InlineDataFragmentSpread
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.InlineFragment
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.LinkedField
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Literal
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.LocalArgumentDefinition
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ModuleImport
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Request
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Root
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.RootArgumentDefinition
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ScalarField
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.SplitOperation
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Stream
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Variable
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRVisitorMod.NodeVisitorObject
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitFn
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentClientExtension extends js.Object {
  var Argument: js.UndefOr[NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Argument]] = js.undefined
  var ClientExtension: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ClientExtension]] = js.undefined
  var Condition: js.UndefOr[NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Condition]] = js.undefined
  var Connection: js.UndefOr[
    NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Connection]
  ] = js.undefined
  var ConnectionField: js.UndefOr[
    NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ConnectionField]
  ] = js.undefined
  var Defer: js.UndefOr[NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Defer]] = js.undefined
  var Directive: js.UndefOr[NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Directive]] = js.undefined
  var Fragment: js.UndefOr[NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Fragment]] = js.undefined
  var FragmentSpread: js.UndefOr[
    NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.FragmentSpread]
  ] = js.undefined
  var InlineDataFragmentSpread: js.UndefOr[
    NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.InlineDataFragmentSpread]
  ] = js.undefined
  var InlineFragment: js.UndefOr[
    NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.InlineFragment]
  ] = js.undefined
  var LinkedField: js.UndefOr[
    NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.LinkedField]
  ] = js.undefined
  var Literal: js.UndefOr[NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Literal]] = js.undefined
  var LocalArgumentDefinition: js.UndefOr[
    NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.LocalArgumentDefinition]
  ] = js.undefined
  var ModuleImport: js.UndefOr[
    NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ModuleImport]
  ] = js.undefined
  var Request: js.UndefOr[NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Request]] = js.undefined
  var Root: js.UndefOr[NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Root]] = js.undefined
  var RootArgumentDefinition: js.UndefOr[
    NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.RootArgumentDefinition]
  ] = js.undefined
  var ScalarField: js.UndefOr[
    NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ScalarField]
  ] = js.undefined
  var SplitOperation: js.UndefOr[
    NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.SplitOperation]
  ] = js.undefined
  var Stream: js.UndefOr[NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Stream]] = js.undefined
  var Variable: js.UndefOr[NodeVisitorObject[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Variable]] = js.undefined
}

object Anon_ArgumentClientExtension {
  @scala.inline
  def apply(
    Argument: NodeVisitorObject[Argument] = null,
    ClientExtension: (ClientExtension, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Condition: NodeVisitorObject[Condition] = null,
    Connection: NodeVisitorObject[Connection] = null,
    ConnectionField: NodeVisitorObject[ConnectionField] = null,
    Defer: NodeVisitorObject[Defer] = null,
    Directive: NodeVisitorObject[Directive] = null,
    Fragment: NodeVisitorObject[Fragment] = null,
    FragmentSpread: NodeVisitorObject[FragmentSpread] = null,
    InlineDataFragmentSpread: NodeVisitorObject[InlineDataFragmentSpread] = null,
    InlineFragment: NodeVisitorObject[InlineFragment] = null,
    LinkedField: NodeVisitorObject[LinkedField] = null,
    Literal: NodeVisitorObject[Literal] = null,
    LocalArgumentDefinition: NodeVisitorObject[LocalArgumentDefinition] = null,
    ModuleImport: NodeVisitorObject[ModuleImport] = null,
    Request: NodeVisitorObject[Request] = null,
    Root: NodeVisitorObject[Root] = null,
    RootArgumentDefinition: NodeVisitorObject[RootArgumentDefinition] = null,
    ScalarField: NodeVisitorObject[ScalarField] = null,
    SplitOperation: NodeVisitorObject[SplitOperation] = null,
    Stream: NodeVisitorObject[Stream] = null,
    Variable: NodeVisitorObject[Variable] = null
  ): Anon_ArgumentClientExtension = {
    val __obj = js.Dynamic.literal()
    if (Argument != null) __obj.updateDynamic("Argument")(Argument.asInstanceOf[js.Any])
    if (ClientExtension != null) __obj.updateDynamic("ClientExtension")(js.Any.fromFunction5(ClientExtension))
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    if (Connection != null) __obj.updateDynamic("Connection")(Connection.asInstanceOf[js.Any])
    if (ConnectionField != null) __obj.updateDynamic("ConnectionField")(ConnectionField.asInstanceOf[js.Any])
    if (Defer != null) __obj.updateDynamic("Defer")(Defer.asInstanceOf[js.Any])
    if (Directive != null) __obj.updateDynamic("Directive")(Directive.asInstanceOf[js.Any])
    if (Fragment != null) __obj.updateDynamic("Fragment")(Fragment.asInstanceOf[js.Any])
    if (FragmentSpread != null) __obj.updateDynamic("FragmentSpread")(FragmentSpread.asInstanceOf[js.Any])
    if (InlineDataFragmentSpread != null) __obj.updateDynamic("InlineDataFragmentSpread")(InlineDataFragmentSpread.asInstanceOf[js.Any])
    if (InlineFragment != null) __obj.updateDynamic("InlineFragment")(InlineFragment.asInstanceOf[js.Any])
    if (LinkedField != null) __obj.updateDynamic("LinkedField")(LinkedField.asInstanceOf[js.Any])
    if (Literal != null) __obj.updateDynamic("Literal")(Literal.asInstanceOf[js.Any])
    if (LocalArgumentDefinition != null) __obj.updateDynamic("LocalArgumentDefinition")(LocalArgumentDefinition.asInstanceOf[js.Any])
    if (ModuleImport != null) __obj.updateDynamic("ModuleImport")(ModuleImport.asInstanceOf[js.Any])
    if (Request != null) __obj.updateDynamic("Request")(Request.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (RootArgumentDefinition != null) __obj.updateDynamic("RootArgumentDefinition")(RootArgumentDefinition.asInstanceOf[js.Any])
    if (ScalarField != null) __obj.updateDynamic("ScalarField")(ScalarField.asInstanceOf[js.Any])
    if (SplitOperation != null) __obj.updateDynamic("SplitOperation")(SplitOperation.asInstanceOf[js.Any])
    if (Stream != null) __obj.updateDynamic("Stream")(Stream.asInstanceOf[js.Any])
    if (Variable != null) __obj.updateDynamic("Variable")(Variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgumentClientExtension]
  }
}

