package typingsSlinky.angularCompiler.r3PipeCompilerMod

import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.r3FactoryMod.R3DependencyMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3PipeMetadata extends js.Object {
  /**
    * Dependencies of the pipe's constructor.
    */
  var deps: js.Array[R3DependencyMetadata] | Null
  /**
    * Name of the pipe type.
    */
  var name: String
  /**
    * Name of the pipe.
    */
  var pipeName: String
  /**
    * Whether the pipe is marked as pure.
    */
  var pure: Boolean
  /**
    * An expression representing a reference to the pipe itself.
    */
  var `type`: Expression
  /**
    * Number of generic type parameters of the type itself.
    */
  var typeArgumentCount: Double
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipeName(value: String): Self = this.set("pipeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPure(value: Boolean): Self = this.set("pure", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Expression): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeArgumentCount(value: Double): Self = this.set("typeArgumentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeps(value: js.Array[R3DependencyMetadata]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsNull: Self = this.set("deps", null)
  }
  
}

