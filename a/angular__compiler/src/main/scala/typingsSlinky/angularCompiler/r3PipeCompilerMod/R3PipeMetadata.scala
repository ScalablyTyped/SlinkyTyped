package typingsSlinky.angularCompiler.r3PipeCompilerMod

import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.r3FactoryMod.R3DependencyMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3PipeMetadata extends js.Object {
  /**
    * Dependencies of the pipe's constructor.
    */
  var deps: js.Array[R3DependencyMetadata] | Null = js.native
  /**
    * Name of the pipe type.
    */
  var name: String = js.native
  /**
    * Name of the pipe.
    */
  var pipeName: String = js.native
  /**
    * Whether the pipe is marked as pure.
    */
  var pure: Boolean = js.native
  /**
    * An expression representing a reference to the pipe itself.
    */
  var `type`: Expression = js.native
  /**
    * Number of generic type parameters of the type itself.
    */
  var typeArgumentCount: Double = js.native
}

object R3PipeMetadata {
  @scala.inline
  def apply(name: String, pipeName: String, pure: Boolean, `type`: Expression, typeArgumentCount: Double): R3PipeMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pipeName = pipeName.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3PipeMetadata]
  }
  @scala.inline
  implicit class R3PipeMetadataOps[Self <: R3PipeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeArgumentCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeArgumentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeps(value: js.Array[R3DependencyMetadata]): Self = {
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

