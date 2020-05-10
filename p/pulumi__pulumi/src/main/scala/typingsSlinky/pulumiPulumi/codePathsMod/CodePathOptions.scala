package typingsSlinky.pulumiPulumi.codePathsMod

import typingsSlinky.pulumiPulumi.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodePathOptions extends js.Object {
  /**
    * Packages to explicitly exclude from the Assets for a serialized closure.  This can be used
    * when clients want to trim down the size of a closure, and they know that some package won't
    * ever actually be needed at runtime, but is still a dependency of some package that is being
    * used at runtime.
    */
  var extraExcludePackages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Extra packages to include when producing the Assets for a serialized closure.  This can be
    * useful if the packages are acquired in a way that the serialization code does not understand.
    * For example, if there was some sort of module that was pulled in based off of a computed
    * string.
    */
  var extraIncludePackages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Local file/directory paths that we always want to include when producing the Assets to be
    * included for a serialized closure.
    */
  var extraIncludePaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * The resource to log any errors we encounter against.
    */
  var logResource: js.UndefOr[Resource] = js.native
}

object CodePathOptions {
  @scala.inline
  def apply(): CodePathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodePathOptions]
  }
  @scala.inline
  implicit class CodePathOptionsOps[Self <: CodePathOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraExcludePackages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraExcludePackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraExcludePackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraExcludePackages")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraIncludePackages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraIncludePackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraIncludePackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraIncludePackages")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraIncludePaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraIncludePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraIncludePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraIncludePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withLogResource(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logResource")(js.undefined)
        ret
    }
  }
  
}

