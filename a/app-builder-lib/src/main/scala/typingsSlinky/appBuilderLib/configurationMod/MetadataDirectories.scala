package typingsSlinky.appBuilderLib.configurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataDirectories extends js.Object {
  /**
    * The application directory (containing the application package.json), defaults to `app`, `www` or working directory.
    */
  val app: js.UndefOr[String | Null] = js.native
  /**
    * The path to build resources.
    *
    * Please note — build resources is not packed into the app. If you need to use some files, e.g. as tray icon, please include required files explicitly: `"files": ["**\/ *", "build/icon.*"]`
    * @default build
    */
  val buildResources: js.UndefOr[String | Null] = js.native
  /**
    * The output directory. [File macros](/file-patterns#file-macros) are supported.
    * @default dist
    */
  val output: js.UndefOr[String | Null] = js.native
}

object MetadataDirectories {
  @scala.inline
  def apply(): MetadataDirectories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataDirectories]
  }
  @scala.inline
  implicit class MetadataDirectoriesOps[Self <: MetadataDirectories] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(js.undefined)
        ret
    }
    @scala.inline
    def withAppNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(null)
        ret
    }
    @scala.inline
    def withBuildResources(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildResources")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildResourcesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildResources")(null)
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(null)
        ret
    }
  }
  
}

