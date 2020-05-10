package typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsCollection extends js.Object {
  // Gets a single setting by ID.
  def get(id: String): Setting = js.native
}

object SettingsCollection {
  @scala.inline
  def apply(get: String => Setting): SettingsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[SettingsCollection]
  }
  @scala.inline
  implicit class SettingsCollectionOps[Self <: SettingsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: String => Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

