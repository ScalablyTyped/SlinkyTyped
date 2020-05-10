package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.MobileCarrier
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.MobileCarriersListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileCarriersCollection extends js.Object {
  // Gets one mobile carrier by ID.
  def get(profileId: String, id: String): MobileCarrier = js.native
  // Retrieves a list of mobile carriers.
  def list(profileId: String): MobileCarriersListResponse = js.native
}

object MobileCarriersCollection {
  @scala.inline
  def apply(get: (String, String) => MobileCarrier, list: String => MobileCarriersListResponse): MobileCarriersCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MobileCarriersCollection]
  }
  @scala.inline
  implicit class MobileCarriersCollectionOps[Self <: MobileCarriersCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (String, String) => MobileCarrier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: String => MobileCarriersListResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

