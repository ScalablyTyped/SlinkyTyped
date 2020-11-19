package typingsSlinky.relayCompiler.anon

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Argument extends js.Object {
  
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
object Argument {
  
  @scala.inline
  def apply(): Argument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Argument]
  }
  
  @scala.inline
  implicit class ArgumentOps[Self <: Argument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgument(
      value: (typingsSlinky.relayCompiler.iRMod.Argument, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Argument", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteArgument: Self = this.set("Argument", js.undefined)
    
    @scala.inline
    def setClientExtension(
      value: (typingsSlinky.relayCompiler.iRMod.ClientExtension, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("ClientExtension", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteClientExtension: Self = this.set("ClientExtension", js.undefined)
    
    @scala.inline
    def setCondition(
      value: (Condition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Condition", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
    
    @scala.inline
    def setDefer(
      value: (Defer, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Defer", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteDefer: Self = this.set("Defer", js.undefined)
    
    @scala.inline
    def setDirective(
      value: (Directive, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Directive", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteDirective: Self = this.set("Directive", js.undefined)
    
    @scala.inline
    def setFragment(
      value: (Fragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Fragment", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteFragment: Self = this.set("Fragment", js.undefined)
    
    @scala.inline
    def setFragmentSpread(
      value: (FragmentSpread, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("FragmentSpread", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteFragmentSpread: Self = this.set("FragmentSpread", js.undefined)
    
    @scala.inline
    def setInlineFragment(
      value: (InlineFragment, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("InlineFragment", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteInlineFragment: Self = this.set("InlineFragment", js.undefined)
    
    @scala.inline
    def setLinkedField(
      value: (LinkedField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("LinkedField", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteLinkedField: Self = this.set("LinkedField", js.undefined)
    
    @scala.inline
    def setLiteral(
      value: (Literal, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Literal", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteLiteral: Self = this.set("Literal", js.undefined)
    
    @scala.inline
    def setLocalArgumentDefinition(
      value: (LocalArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("LocalArgumentDefinition", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteLocalArgumentDefinition: Self = this.set("LocalArgumentDefinition", js.undefined)
    
    @scala.inline
    def setModuleImport(
      value: (ModuleImport, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("ModuleImport", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteModuleImport: Self = this.set("ModuleImport", js.undefined)
    
    @scala.inline
    def setRequest(
      value: (Request, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Request", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteRequest: Self = this.set("Request", js.undefined)
    
    @scala.inline
    def setRoot(
      value: (Root, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Root", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    
    @scala.inline
    def setRootArgumentDefinition(
      value: (RootArgumentDefinition, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("RootArgumentDefinition", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteRootArgumentDefinition: Self = this.set("RootArgumentDefinition", js.undefined)
    
    @scala.inline
    def setScalarField(
      value: (ScalarField, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("ScalarField", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteScalarField: Self = this.set("ScalarField", js.undefined)
    
    @scala.inline
    def setSplitOperation(
      value: (SplitOperation, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("SplitOperation", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteSplitOperation: Self = this.set("SplitOperation", js.undefined)
    
    @scala.inline
    def setStream(
      value: (Stream, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Stream", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteStream: Self = this.set("Stream", js.undefined)
    
    @scala.inline
    def setVariable(
      value: (Variable, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
    // These correspond to array indices in `path`.
    js.Any
    ): Self = this.set("Variable", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteVariable: Self = this.set("Variable", js.undefined)
  }
}
