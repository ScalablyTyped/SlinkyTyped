package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConnectionType
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ConnectionTypesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionTypesCollection extends js.Object {
  // Gets one connection type by ID.
  def get(profileId: String, id: String): ConnectionType = js.native
  // Retrieves a list of connection types.
  def list(profileId: String): ConnectionTypesListResponse = js.native
}

object ConnectionTypesCollection {
  @scala.inline
  def apply(get: (String, String) => ConnectionType, list: String => ConnectionTypesListResponse): ConnectionTypesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ConnectionTypesCollection]
  }
  @scala.inline
  implicit class ConnectionTypesCollectionOps[Self <: ConnectionTypesCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (String, String) => ConnectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: String => ConnectionTypesListResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

