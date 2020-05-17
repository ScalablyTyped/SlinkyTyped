package typingsSlinky.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Appid extends js.Object {
  var `app-id`: String = js.native
  var `channel-name`: String = js.native
  var `max-store`: String = js.native
  var `min-background-duration`: String = js.native
  var `update-api`: String = js.native
  var `update-method`: String = js.native
}

object Appid {
  @scala.inline
  def apply(
    `app-id`: String,
    `channel-name`: String,
    `max-store`: String,
    `min-background-duration`: String,
    `update-api`: String,
    `update-method`: String
  ): Appid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app-id")(`app-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("channel-name")(`channel-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("max-store")(`max-store`.asInstanceOf[js.Any])
    __obj.updateDynamic("min-background-duration")(`min-background-duration`.asInstanceOf[js.Any])
    __obj.updateDynamic("update-api")(`update-api`.asInstanceOf[js.Any])
    __obj.updateDynamic("update-method")(`update-method`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appid]
  }
  @scala.inline
  implicit class AppidOps[Self <: Appid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withApp-id`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withChannel-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMax-store`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMin-background-duration`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-background-duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withUpdate-api`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update-api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withUpdate-method`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update-method")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

