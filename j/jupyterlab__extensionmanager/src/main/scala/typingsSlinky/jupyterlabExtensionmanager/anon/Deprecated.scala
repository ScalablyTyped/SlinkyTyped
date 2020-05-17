package typingsSlinky.jupyterlabExtensionmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deprecated extends js.Object {
  /**
    * The deprecation warnings message of this version.
    */
  var deprecated: js.UndefOr[String] = js.native
  /**
    * A short description of the package.
    */
  var description: String = js.native
  /**
    * The package name.
    */
  var name: String = js.native
  /**
    * The version string for this version.
    */
  var version: String = js.native
}

object Deprecated {
  @scala.inline
  def apply(description: String, name: String, version: String): Deprecated = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deprecated]
  }
  @scala.inline
  implicit class DeprecatedOps[Self <: Deprecated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
  }
  
}

