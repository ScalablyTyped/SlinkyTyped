package typingsSlinky.angularCompiler.r3FactoryMod

import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ExternalReference
import typingsSlinky.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Class
import typingsSlinky.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.angularCompiler.r3FactoryMod.R3FactoryMetadata because Already inherited */ @js.native
trait R3DelegatedFnOrClassMetadata extends R3ConstructorFactoryMetadata {
  var delegate: Expression = js.native
  var delegateDeps: js.Array[R3DependencyMetadata] = js.native
  var delegateType: Class | Function = js.native
}

object R3DelegatedFnOrClassMetadata {
  @scala.inline
  def apply(
    delegate: Expression,
    delegateDeps: js.Array[R3DependencyMetadata],
    delegateType: Class | Function,
    injectFn: ExternalReference,
    name: String,
    `type`: Expression
  ): R3DelegatedFnOrClassMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateDeps = delegateDeps.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DelegatedFnOrClassMetadata]
  }
  @scala.inline
  implicit class R3DelegatedFnOrClassMetadataOps[Self <: R3DelegatedFnOrClassMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelegate(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelegateDeps(value: js.Array[R3DependencyMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegateDeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelegateType(value: Class | Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegateType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

