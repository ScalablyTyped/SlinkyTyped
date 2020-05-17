package typingsSlinky.dirWalkerGen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludeExtensions extends js.Object {
  /**
    * List of extensions to ignore
    * @default []
    */
  var excludeExtensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Exclude all folder that ends with any of the given strings
    * @default []
    */
  var excludeFolders: js.UndefOr[js.Array[String]] = js.native
  /**
    * (Required) List of starting folders
    */
  var folders: js.Array[String] = js.native
  /**
    * Ignores directories that start with a dot (e.g. .git, .vscode, etc)
    * @default {false}
    */
  var ignoreDotDir: js.UndefOr[Boolean] = js.native
  /**
    * List of extensions to scan (all other extensions are ignored)
    * @default []
    */
  var includeExtensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Does not show console warning when directories do not exist
    * @default {false}
    */
  var silent: js.UndefOr[Boolean] = js.native
}

object ExcludeExtensions {
  @scala.inline
  def apply(folders: js.Array[String]): ExcludeExtensions = {
    val __obj = js.Dynamic.literal(folders = folders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeExtensions]
  }
  @scala.inline
  implicit class ExcludeExtensionsOps[Self <: ExcludeExtensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFolders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeFolders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFolders")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDotDir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDotDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDotDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDotDir")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
  }
  
}

