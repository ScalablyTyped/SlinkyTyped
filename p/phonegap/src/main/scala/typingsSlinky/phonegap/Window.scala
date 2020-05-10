package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var requestFileSystem: js.Any = js.native
  def openDatabase(
    database_name: String,
    database_version: String,
    database_displayname: String,
    database_size: Double
  ): Database = js.native
}

object Window {
  @scala.inline
  def apply(openDatabase: (String, String, String, Double) => Database, requestFileSystem: js.Any): Window = {
    val __obj = js.Dynamic.literal(openDatabase = js.Any.fromFunction4(openDatabase), requestFileSystem = requestFileSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenDatabase(value: (String, String, String, Double) => Database): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDatabase")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRequestFileSystem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFileSystem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

