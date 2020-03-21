package typingsSlinky.relayCompiler

import typingsSlinky.relayCompiler.iRMod.Argument
import typingsSlinky.relayCompiler.iRMod.ClientExtension
import typingsSlinky.relayCompiler.iRMod.Condition
import typingsSlinky.relayCompiler.iRMod.Defer
import typingsSlinky.relayCompiler.iRMod.Directive
import typingsSlinky.relayCompiler.iRMod.Fragment
import typingsSlinky.relayCompiler.iRMod.FragmentSpread
import typingsSlinky.relayCompiler.iRMod.InlineDataFragmentSpread
import typingsSlinky.relayCompiler.iRMod.InlineFragment
import typingsSlinky.relayCompiler.iRMod.LinkedField
import typingsSlinky.relayCompiler.iRMod.Literal
import typingsSlinky.relayCompiler.iRMod.LocalArgumentDefinition
import typingsSlinky.relayCompiler.iRMod.ModuleImport
import typingsSlinky.relayCompiler.iRMod.Request
import typingsSlinky.relayCompiler.iRMod.Root
import typingsSlinky.relayCompiler.iRMod.RootArgumentDefinition
import typingsSlinky.relayCompiler.iRMod.ScalarField
import typingsSlinky.relayCompiler.iRMod.SplitOperation
import typingsSlinky.relayCompiler.iRMod.Stream
import typingsSlinky.relayCompiler.iRMod.Variable
import typingsSlinky.relayCompiler.irvisitorMod.NodeVisitorObject
import typingsSlinky.relayCompiler.irvisitorMod.VisitFn
import typingsSlinky.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientExtension extends js.Object {
  var Argument: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Argument]] = js.undefined
  var ClientExtension: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.ClientExtension]] = js.undefined
  var Condition: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Condition]] = js.undefined
  var Defer: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Defer]] = js.undefined
  var Directive: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Directive]] = js.undefined
  var Fragment: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Fragment]] = js.undefined
  var FragmentSpread: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.FragmentSpread]] = js.undefined
  var InlineDataFragmentSpread: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.InlineDataFragmentSpread]] = js.undefined
  var InlineFragment: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.InlineFragment]] = js.undefined
  var LinkedField: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.LinkedField]] = js.undefined
  var Literal: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Literal]] = js.undefined
  var LocalArgumentDefinition: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.LocalArgumentDefinition]] = js.undefined
  var ModuleImport: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.ModuleImport]] = js.undefined
  var Request: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Request]] = js.undefined
  var Root: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Root]] = js.undefined
  var RootArgumentDefinition: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.RootArgumentDefinition]] = js.undefined
  var ScalarField: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.ScalarField]] = js.undefined
  var SplitOperation: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.SplitOperation]] = js.undefined
  var Stream: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Stream]] = js.undefined
  var Variable: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Variable]] = js.undefined
}

object AnonClientExtension {
  @scala.inline
  def apply(
    Argument: NodeVisitorObject[Argument] = null,
    ClientExtension: (ClientExtension, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Condition: NodeVisitorObject[Condition] = null,
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
  ): AnonClientExtension = {
    val __obj = js.Dynamic.literal()
    if (Argument != null) __obj.updateDynamic("Argument")(Argument.asInstanceOf[js.Any])
    if (ClientExtension != null) __obj.updateDynamic("ClientExtension")(js.Any.fromFunction5(ClientExtension))
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[AnonClientExtension]
  }
}

