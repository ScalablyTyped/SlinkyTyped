package typingsSlinky.angularCompiler.r3FactoryMod

import typingsSlinky.angularCompiler.angularCompilerStrings.invalid
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ExternalReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3ConstructorFactoryMetadata extends R3FactoryMetadata {
  /**
    * Regardless of whether `fnOrClass` is a constructor function or a user-defined factory, it
    * may have 0 or more parameters, which will be injected according to the `R3DependencyMetadata`
    * for those parameters. If this is `null`, then the type's constructor is nonexistent and will
    * be inherited from `fnOrClass` which is interpreted as the current type. If this is `'invalid'`,
    * then one or more of the parameters wasn't resolvable and any attempt to use these deps will
    * result in a runtime error.
    */
  var deps: js.Array[R3DependencyMetadata] | invalid | Null = js.native
  /**
    * An expression for the function which will be used to inject dependencies. The API of this
    * function could be different, and other options control how it will be invoked.
    */
  var injectFn: ExternalReference = js.native
  /**
    * String name of the type being generated (used to name the factory function).
    */
  var name: String = js.native
  /**
    * An expression representing the function (or constructor) which will instantiate the requested
    * type.
    *
    * This could be a reference to a constructor type, or to a user-defined factory function. The
    * `useNew` property determines whether it will be called as a constructor or not.
    */
  var `type`: Expression = js.native
}

object R3ConstructorFactoryMetadata {
  @scala.inline
  def apply(injectFn: ExternalReference, name: String, `type`: Expression): R3ConstructorFactoryMetadata = {
    val __obj = js.Dynamic.literal(injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ConstructorFactoryMetadata]
  }
  @scala.inline
  implicit class R3ConstructorFactoryMetadataOps[Self <: R3ConstructorFactoryMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInjectFn(value: ExternalReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(null)
        ret
    }
  }
  
}

