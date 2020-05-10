package typingsSlinky.sandboxedModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SandboxedModule extends js.Object {
  /**
    * A getter returning the sandboxedModule.module.exports object.
    */
  var exports: js.Any = js.native
  /**
    * The full path to the module.
    */
  var filename: String = js.native
  /**
    * See {@link SandboxOptions.globals}
    */
  var globals: js.Object = js.native
  /**
    * See {@link SandboxOptions.locals}
    */
  var locals: js.Object = js.native
  /**
    * The underlaying node.js Module instance.
    */
  var module: String = js.native
  /**
    * See {@link SandboxOptions.requires}
    */
  var required: js.Object = js.native
  /**
    * See {@link SandboxOptions.sourceTransformers}.
    */
  var sourceTransformers: js.Object = js.native
}

object SandboxedModule {
  @scala.inline
  def apply(
    exports: js.Any,
    filename: String,
    globals: js.Object,
    locals: js.Object,
    module: String,
    required: js.Object,
    sourceTransformers: js.Object
  ): SandboxedModule = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], locals = locals.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], sourceTransformers = sourceTransformers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SandboxedModule]
  }
  @scala.inline
  implicit class SandboxedModuleOps[Self <: SandboxedModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExports(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobals(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocals(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceTransformers(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTransformers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

