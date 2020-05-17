package typingsSlinky.relayCompiler.anon

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
import typingsSlinky.relayCompiler.irvisitorMod.NodeVisitor
import typingsSlinky.relayCompiler.irvisitorMod.NodeVisitorObject
import typingsSlinky.relayCompiler.irvisitorMod.VisitFn
import typingsSlinky.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientExtension extends NodeVisitor {
  var Argument: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Argument]] = js.native
  var ClientExtension: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.ClientExtension]] = js.native
  var Condition: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Condition]] = js.native
  var Defer: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Defer]] = js.native
  var Directive: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Directive]] = js.native
  var Fragment: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Fragment]] = js.native
  var FragmentSpread: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.FragmentSpread]] = js.native
  var InlineDataFragmentSpread: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.InlineDataFragmentSpread]] = js.native
  var InlineFragment: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.InlineFragment]] = js.native
  var LinkedField: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.LinkedField]] = js.native
  var Literal: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Literal]] = js.native
  var LocalArgumentDefinition: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.LocalArgumentDefinition]] = js.native
  var ModuleImport: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.ModuleImport]] = js.native
  var Request: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Request]] = js.native
  var Root: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Root]] = js.native
  var RootArgumentDefinition: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.RootArgumentDefinition]] = js.native
  var ScalarField: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.ScalarField]] = js.native
  var SplitOperation: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.SplitOperation]] = js.native
  var Stream: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Stream]] = js.native
  var Variable: js.UndefOr[NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Variable]] = js.native
}

object ClientExtension {
  @scala.inline
  def apply(): ClientExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientExtension]
  }
  @scala.inline
  implicit class ClientExtensionOps[Self <: ClientExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentFunction5(
      value: (typingsSlinky.relayCompiler.iRMod.Argument, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Argument")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withArgument(value: NodeVisitorObject[typingsSlinky.relayCompiler.iRMod.Argument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Argument")(js.undefined)
        ret
    }
    @scala.inline
    def withClientExtension(
      value: (typingsSlinky.relayCompiler.iRMod.ClientExtension, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientExtension")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutClientExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionFunction5(
      value: (Condition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withCondition(value: NodeVisitorObject[Condition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferFunction5(
      value: (Defer, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Defer")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withDefer(value: NodeVisitorObject[Defer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Defer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Defer")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectiveFunction5(
      value: (Directive, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directive")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withDirective(value: NodeVisitorObject[Directive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directive")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentFunction5(
      value: (Fragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fragment")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withFragment(value: NodeVisitorObject[Fragment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fragment")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentSpreadFunction5(
      value: (FragmentSpread, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentSpread")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withFragmentSpread(value: NodeVisitorObject[FragmentSpread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentSpread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentSpread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentSpread")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineDataFragmentSpreadFunction5(
      value: (InlineDataFragmentSpread, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlineDataFragmentSpread")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withInlineDataFragmentSpread(value: NodeVisitorObject[InlineDataFragmentSpread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlineDataFragmentSpread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineDataFragmentSpread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlineDataFragmentSpread")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineFragmentFunction5(
      value: (InlineFragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlineFragment")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withInlineFragment(value: NodeVisitorObject[InlineFragment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlineFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlineFragment")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedFieldFunction5(
      value: (LinkedField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkedField")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withLinkedField(value: NodeVisitorObject[LinkedField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkedField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkedField")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteralFunction5(
      value: (Literal, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Literal")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withLiteral(value: NodeVisitorObject[Literal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Literal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiteral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Literal")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalArgumentDefinitionFunction5(
      value: (LocalArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalArgumentDefinition")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withLocalArgumentDefinition(value: NodeVisitorObject[LocalArgumentDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalArgumentDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalArgumentDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalArgumentDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleImportFunction5(
      value: (ModuleImport, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModuleImport")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withModuleImport(value: NodeVisitorObject[ModuleImport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModuleImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModuleImport")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestFunction5(
      value: (Request, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Request")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withRequest(value: NodeVisitorObject[Request]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Request")(js.undefined)
        ret
    }
    @scala.inline
    def withRootFunction5(
      value: (Root, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Root")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withRoot(value: NodeVisitorObject[Root]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootArgumentDefinitionFunction5(
      value: (RootArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootArgumentDefinition")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withRootArgumentDefinition(value: NodeVisitorObject[RootArgumentDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootArgumentDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootArgumentDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootArgumentDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withScalarFieldFunction5(
      value: (ScalarField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalarField")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withScalarField(value: NodeVisitorObject[ScalarField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalarField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalarField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalarField")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitOperationFunction5(
      value: (SplitOperation, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitOperation")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSplitOperation(value: NodeVisitorObject[SplitOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamFunction5(
      value: (Stream, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stream")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withStream(value: NodeVisitorObject[Stream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stream")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableFunction5(
      value: (Variable, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variable")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withVariable(value: NodeVisitorObject[Variable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variable")(js.undefined)
        ret
    }
  }
  
}

