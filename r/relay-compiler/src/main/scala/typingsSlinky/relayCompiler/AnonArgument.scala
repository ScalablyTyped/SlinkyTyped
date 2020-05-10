package typingsSlinky.relayCompiler

import typingsSlinky.relayCompiler.iRMod.Argument
import typingsSlinky.relayCompiler.iRMod.ClientExtension
import typingsSlinky.relayCompiler.iRMod.Condition
import typingsSlinky.relayCompiler.iRMod.Defer
import typingsSlinky.relayCompiler.iRMod.Directive
import typingsSlinky.relayCompiler.iRMod.Fragment
import typingsSlinky.relayCompiler.iRMod.FragmentSpread
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
import typingsSlinky.relayCompiler.irvisitorMod.VisitFn
import typingsSlinky.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArgument extends js.Object {
  var Argument: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.Argument]] = js.native
  var ClientExtension: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.ClientExtension]] = js.native
  var Condition: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.Condition]] = js.native
  var Defer: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.Defer]] = js.native
  var Directive: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.Directive]] = js.native
  var Fragment: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.Fragment]] = js.native
  var FragmentSpread: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.FragmentSpread]] = js.native
  var InlineFragment: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.InlineFragment]] = js.native
  var LinkedField: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.LinkedField]] = js.native
  var Literal: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.Literal]] = js.native
  var LocalArgumentDefinition: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.LocalArgumentDefinition]] = js.native
  var ModuleImport: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.ModuleImport]] = js.native
  var Request: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.Request]] = js.native
  var Root: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.Root]] = js.native
  var RootArgumentDefinition: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.RootArgumentDefinition]] = js.native
  var ScalarField: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.ScalarField]] = js.native
  var SplitOperation: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.SplitOperation]] = js.native
  var Stream: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.Stream]] = js.native
  var Variable: js.UndefOr[VisitFn[typingsSlinky.relayCompiler.iRMod.Variable]] = js.native
}

object AnonArgument {
  @scala.inline
  def apply(): AnonArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonArgument]
  }
  @scala.inline
  implicit class AnonArgumentOps[Self <: AnonArgument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgument(
      value: (Argument, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Argument")(js.Any.fromFunction5(value))
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
      value: (ClientExtension, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
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
    def withCondition(
      value: (Condition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(js.undefined)
        ret
    }
    @scala.inline
    def withDefer(
      value: (Defer, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Defer")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutDefer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Defer")(js.undefined)
        ret
    }
    @scala.inline
    def withDirective(
      value: (Directive, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directive")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutDirective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directive")(js.undefined)
        ret
    }
    @scala.inline
    def withFragment(
      value: (Fragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fragment")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fragment")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentSpread(
      value: (FragmentSpread, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentSpread")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutFragmentSpread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentSpread")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineFragment(
      value: (InlineFragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlineFragment")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutInlineFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlineFragment")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedField(
      value: (LinkedField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkedField")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutLinkedField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkedField")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteral(
      value: (Literal, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Literal")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutLiteral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Literal")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalArgumentDefinition(
      value: (LocalArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalArgumentDefinition")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutLocalArgumentDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalArgumentDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleImport(
      value: (ModuleImport, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModuleImport")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutModuleImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModuleImport")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(
      value: (Request, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Request")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Request")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(
      value: (Root, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Root")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootArgumentDefinition(
      value: (RootArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootArgumentDefinition")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutRootArgumentDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootArgumentDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withScalarField(
      value: (ScalarField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalarField")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutScalarField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalarField")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitOperation(
      value: (SplitOperation, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitOperation")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutSplitOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(
      value: (Stream, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stream")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stream")(js.undefined)
        ret
    }
    @scala.inline
    def withVariable(
      value: (Variable, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variable")(js.Any.fromFunction5(value))
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

