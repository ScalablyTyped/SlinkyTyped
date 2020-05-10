package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An individual file within a script project. A file is a third-party source
  * code created by one or more developers. It can be a server-side JS code,
  * HTML, or a configuration file. Each script project can contain multiple
  * files.
  */
@js.native
trait SchemaFile extends js.Object {
  /**
    * Creation date timestamp. This read-only field is only visible to users
    * who have WRITER permission for the script project.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The defined set of functions in the script file, if any.
    */
  var functionSet: js.UndefOr[SchemaGoogleAppsScriptTypeFunctionSet] = js.native
  /**
    * The user who modified the file most recently. This read-only field is
    * only visible to users who have WRITER permission for the script project.
    */
  var lastModifyUser: js.UndefOr[SchemaGoogleAppsScriptTypeUser] = js.native
  /**
    * The name of the file. The file extension is not part of the file name,
    * which can be identified from the type field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The file content.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The type of the file.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Last modified date timestamp. This read-only field is only visible to
    * users who have WRITER permission for the script project.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaFile {
  @scala.inline
  def apply(): SchemaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFile]
  }
  @scala.inline
  implicit class SchemaFileOps[Self <: SchemaFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionSet(value: SchemaGoogleAppsScriptTypeFunctionSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionSet")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifyUser(value: SchemaGoogleAppsScriptTypeUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifyUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifyUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifyUser")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

