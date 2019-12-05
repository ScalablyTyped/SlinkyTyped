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
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitFn
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Argument extends js.Object {
  var Argument: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Argument]] = js.undefined
  var ClientExtension: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ClientExtension]] = js.undefined
  var Condition: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Condition]] = js.undefined
  var Connection: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Connection]] = js.undefined
  var ConnectionField: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ConnectionField]] = js.undefined
  var Defer: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Defer]] = js.undefined
  var Directive: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Directive]] = js.undefined
  var Fragment: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Fragment]] = js.undefined
  var FragmentSpread: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.FragmentSpread]] = js.undefined
  var InlineFragment: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.InlineFragment]] = js.undefined
  var LinkedField: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.LinkedField]] = js.undefined
  var Literal: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Literal]] = js.undefined
  var LocalArgumentDefinition: js.UndefOr[
    VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.LocalArgumentDefinition]
  ] = js.undefined
  var ModuleImport: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ModuleImport]] = js.undefined
  var Request: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Request]] = js.undefined
  var Root: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Root]] = js.undefined
  var RootArgumentDefinition: js.UndefOr[
    VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.RootArgumentDefinition]
  ] = js.undefined
  var ScalarField: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.ScalarField]] = js.undefined
  var SplitOperation: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.SplitOperation]] = js.undefined
  var Stream: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Stream]] = js.undefined
  var Variable: js.UndefOr[VisitFn[typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Variable]] = js.undefined
}

object Anon_Argument {
  @scala.inline
  def apply(
    Argument: (Argument, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    ClientExtension: (ClientExtension, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Condition: (Condition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Connection: (Connection, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    ConnectionField: (ConnectionField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Defer: (Defer, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Directive: (Directive, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Fragment: (Fragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    FragmentSpread: (FragmentSpread, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    InlineFragment: (InlineFragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    LinkedField: (LinkedField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Literal: (Literal, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    LocalArgumentDefinition: (LocalArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    ModuleImport: (ModuleImport, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Request: (Request, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Root: (Root, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    RootArgumentDefinition: (RootArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    ScalarField: (ScalarField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    SplitOperation: (SplitOperation, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Stream: (Stream, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Variable: (Variable, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null
  ): Anon_Argument = {
    val __obj = js.Dynamic.literal()
    if (Argument != null) __obj.updateDynamic("Argument")(js.Any.fromFunction5(Argument))
    if (ClientExtension != null) __obj.updateDynamic("ClientExtension")(js.Any.fromFunction5(ClientExtension))
    if (Condition != null) __obj.updateDynamic("Condition")(js.Any.fromFunction5(Condition))
    if (Connection != null) __obj.updateDynamic("Connection")(js.Any.fromFunction5(Connection))
    if (ConnectionField != null) __obj.updateDynamic("ConnectionField")(js.Any.fromFunction5(ConnectionField))
    if (Defer != null) __obj.updateDynamic("Defer")(js.Any.fromFunction5(Defer))
    if (Directive != null) __obj.updateDynamic("Directive")(js.Any.fromFunction5(Directive))
    if (Fragment != null) __obj.updateDynamic("Fragment")(js.Any.fromFunction5(Fragment))
    if (FragmentSpread != null) __obj.updateDynamic("FragmentSpread")(js.Any.fromFunction5(FragmentSpread))
    if (InlineFragment != null) __obj.updateDynamic("InlineFragment")(js.Any.fromFunction5(InlineFragment))
    if (LinkedField != null) __obj.updateDynamic("LinkedField")(js.Any.fromFunction5(LinkedField))
    if (Literal != null) __obj.updateDynamic("Literal")(js.Any.fromFunction5(Literal))
    if (LocalArgumentDefinition != null) __obj.updateDynamic("LocalArgumentDefinition")(js.Any.fromFunction5(LocalArgumentDefinition))
    if (ModuleImport != null) __obj.updateDynamic("ModuleImport")(js.Any.fromFunction5(ModuleImport))
    if (Request != null) __obj.updateDynamic("Request")(js.Any.fromFunction5(Request))
    if (Root != null) __obj.updateDynamic("Root")(js.Any.fromFunction5(Root))
    if (RootArgumentDefinition != null) __obj.updateDynamic("RootArgumentDefinition")(js.Any.fromFunction5(RootArgumentDefinition))
    if (ScalarField != null) __obj.updateDynamic("ScalarField")(js.Any.fromFunction5(ScalarField))
    if (SplitOperation != null) __obj.updateDynamic("SplitOperation")(js.Any.fromFunction5(SplitOperation))
    if (Stream != null) __obj.updateDynamic("Stream")(js.Any.fromFunction5(Stream))
    if (Variable != null) __obj.updateDynamic("Variable")(js.Any.fromFunction5(Variable))
    __obj.asInstanceOf[Anon_Argument]
  }
}

