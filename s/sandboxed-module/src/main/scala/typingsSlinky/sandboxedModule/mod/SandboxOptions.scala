package typingsSlinky.sandboxedModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SandboxOptions extends js.Object {
  /**
    * An object of global variables to inject into the sandboxed module.
    */
  var globals: js.UndefOr[js.Object] = js.native
  /**
    * An object of local variables to inject into the sandboxed module.
    */
  var locals: js.UndefOr[js.Object] = js.native
  /**
    * An object containing moduleIds and the values to inject for them when required by the sandboxed module.
    * This does not affect children of the sandboxed module.
    */
  var requires: js.UndefOr[js.Object] = js.native
  /**
    * If false, modules that are required by the sandboxed module will not be sandboxed. By default all modules
    * required by the sandboxedModule will be sandboxed using the same options that were used for the original
    * sandboxed module.
    */
  var singleOnly: js.UndefOr[Boolean] = js.native
  /**
    * An object of named functions which will transform the source code required with SandboxedModule.require.
    * For example, CoffeeScript & istanbul support is implemented with built-in sourceTransformer functions
    * (see #registerBuiltInSourceTransformer).
    *
    * A source transformer receives the source (as it's been transformed thus far) and must return the transformed
    * source (whether it's changed or unchanged).
    *
    * An example source transformer to change all instances of the number "3" to "5" would look like this:
    *
    * SandboxedModule.require('../fixture/baz', {
    *   sourceTransformers: {
    *     turn3sInto5s: function(source) {
    *       return source.replace(/3/g,'5');
    *     }
    *   }
    * })
    */
  var sourceTransformers: js.UndefOr[js.Object] = js.native
  /**
    * If false, the source transformers will not be run against modules required by the sandboxed module.
    * By default it will take the same value as {@link SandboxOptions.singleOnly}.
    */
  var sourceTransformersSingleOnly: js.UndefOr[Boolean] = js.native
}

object SandboxOptions {
  @scala.inline
  def apply(): SandboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SandboxOptions]
  }
  @scala.inline
  implicit class SandboxOptionsOps[Self <: SandboxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobals(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(js.undefined)
        ret
    }
    @scala.inline
    def withLocals(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(js.undefined)
        ret
    }
    @scala.inline
    def withRequires(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTransformers(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTransformers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTransformers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTransformers")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTransformersSingleOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTransformersSingleOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTransformersSingleOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTransformersSingleOnly")(js.undefined)
        ret
    }
  }
  
}

