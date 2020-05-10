package typingsSlinky.hapiVision.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The npm module used for rendering the templates. The module object must contain the compile() function
  * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverviewsoptions} > options > engines > module
  */
@js.native
trait NpmModule extends js.Object {
  /**
    * The rendering function. The required function signature depends on the compileMode settings
    */
  var compile: ServerViewCompile = js.native
  /**
    * Initializes additional engine state.The config object is the engine configuration object allowing updates to be made.
    * This is useful for engines like Nunjucks that rely on additional state for rendering. next has the signature function(err).
    */
  var prepare: js.UndefOr[
    js.Function2[
      /* config */ EngineConfigurationObject, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
      Unit
    ]
  ] = js.native
  /**
    * Registers a helper for use during template rendering.
    * The name is the name that templates should use to reference the helper and helper is the function that will be invoked when the helper is called.
    */
  var registerHelper: js.UndefOr[
    js.Function2[/* name */ String, /* helper */ js.Function1[/* repeated */ js.Any, _], Unit]
  ] = js.native
  /**
    * Registers a partial for use during template rendering.
    * The name is the partial path that templates should use to reference the partial and src is the uncompiled template string for the partial.
    */
  var registerPartial: js.UndefOr[js.Function2[/* name */ String, /* src */ String, Unit]] = js.native
}

object NpmModule {
  @scala.inline
  def apply(compile: ServerViewCompile): NpmModule = {
    val __obj = js.Dynamic.literal(compile = compile.asInstanceOf[js.Any])
    __obj.asInstanceOf[NpmModule]
  }
  @scala.inline
  implicit class NpmModuleOps[Self <: NpmModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompileFunction2(
      value: (/* template */ String, /* options */ js.Any) => js.Function2[/* context */ js.Any, /* options */ js.Any, Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCompileFunction3(value: (/* template */ String, /* options */ js.Any, /* next */ ServerViewCompileNext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCompile(value: ServerViewCompile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrepare(
      value: (/* config */ EngineConfigurationObject, /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPrepare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterHelper(value: (/* name */ String, /* helper */ js.Function1[/* repeated */ js.Any, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerHelper")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRegisterHelper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerHelper")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterPartial(value: (/* name */ String, /* src */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerPartial")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRegisterPartial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerPartial")(js.undefined)
        ret
    }
  }
  
}

