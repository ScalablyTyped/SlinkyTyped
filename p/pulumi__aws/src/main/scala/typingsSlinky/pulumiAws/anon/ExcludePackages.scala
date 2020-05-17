package typingsSlinky.pulumiAws.anon

import typingsSlinky.pulumiAws.lambdaMixinsMod.Context
import typingsSlinky.pulumiAws.serverlessFunctionMod.Handler
import typingsSlinky.pulumiAws.serverlessFunctionMod.HandlerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludePackages extends js.Object {
  /**
    * The packages relative to the program folder to not include the Lambda upload. This can be
    * used to override the default serialization logic that includes all packages referenced by
    * project.json (except @pulumi packages).  Default is `[]`.
    *
    * @deprecated Use [codePathOptions] instead.
    */
  var excludePackages: js.UndefOr[js.Array[String]] = js.native
  /**
    * @deprecated use [callbackFactory] instead.
    */
  var factoryFunc: js.UndefOr[HandlerFactory] = js.native
  /**
    * @deprecated use [callback] instead.
    */
  var func: js.UndefOr[Handler] = js.native
  /**
    * The packages relative to the program folder to include in the Lambda upload.  The version of
    * the package installed in the program folder and it's dependencies will all be included.
    * Default is `[]`.
    *
    * @deprecated Use [codePathOptions] instead.
    */
  var includePackages: js.UndefOr[js.Array[String]] = js.native
  /**
    * The paths relative to the program folder to include in the Lambda upload.  Default is `[]`.
    *
    * @deprecated Use [codePathOptions] instead.
    */
  var includePaths: js.UndefOr[js.Array[String]] = js.native
}

object ExcludePackages {
  @scala.inline
  def apply(): ExcludePackages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludePackages]
  }
  @scala.inline
  implicit class ExcludePackagesOps[Self <: ExcludePackages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludePackages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludePackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePackages")(js.undefined)
        ret
    }
    @scala.inline
    def withFactoryFunc(value: () => Handler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryFunc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFactoryFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withFunc(
      value: (js.Any, /* context */ Context, /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], Unit]) => js.Promise[js.Any] | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePackages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePackages")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePaths")(js.undefined)
        ret
    }
  }
  
}

