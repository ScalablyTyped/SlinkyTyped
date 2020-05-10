package typingsSlinky.apostrophe.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Pass in custom modules as first argument
// second argument is additional custom options e.g. restApi exposed by apostrophe-headless
@js.native
trait AposConstructor[M, O] extends js.Object {
  var afterInit: js.UndefOr[js.Function0[Unit]] = js.native
  var afterListen: js.UndefOr[js.Function0[Unit]] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var initFailed: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
  var modules: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
    */ typingsSlinky.apostrophe.apostropheStrings.AposConstructor with TopLevel[js.Any] = js.native
  var prefix: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var rootDir: js.UndefOr[String] = js.native
  var shortName: String = js.native
}

object AposConstructor {
  @scala.inline
  def apply[M, O](
    modules: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
    */ typingsSlinky.apostrophe.apostropheStrings.AposConstructor with TopLevel[js.Any],
    shortName: String
  ): AposConstructor[M, O] = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AposConstructor[M, O]]
  }
  @scala.inline
  implicit class AposConstructorOps[Self[m, o] <: AposConstructor[m, o], M, O] (val x: Self[M, O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M, O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M, O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[M, O]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[M, O]) with Other]
    @scala.inline
    def withModules(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O}
      */ typingsSlinky.apostrophe.apostropheStrings.AposConstructor with TopLevel[js.Any]
    ): Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortName(value: String): Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterInit(value: () => Unit): Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterInit: Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterListen(value: () => Unit): Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterListen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterListen: Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterListen")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withInitFailed(value: /* error */ js.Any => Unit): Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFailed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitFailed: Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDir(value: String): Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDir: Self[M, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(js.undefined)
        ret
    }
  }
  
}

