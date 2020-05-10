package typingsSlinky.nodeJsonDb.jsonDBConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonDBConfig extends js.Object {
  var filename: String = js.native
  var humanReadable: Boolean = js.native
  var saveOnPush: Boolean = js.native
  var separator: String = js.native
}

object JsonDBConfig {
  @scala.inline
  def apply(filename: String, humanReadable: Boolean, saveOnPush: Boolean, separator: String): JsonDBConfig = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], humanReadable = humanReadable.asInstanceOf[js.Any], saveOnPush = saveOnPush.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDBConfig]
  }
  @scala.inline
  implicit class JsonDBConfigOps[Self <: JsonDBConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHumanReadable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("humanReadable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveOnPush(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveOnPush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

