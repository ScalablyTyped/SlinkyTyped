package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBlogger.AnonBlogId
import typingsSlinky.gapiClientBlogger.AnonFetchUserInfo
import typingsSlinky.gapiClientBlogger.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlogsResource extends js.Object {
  /** Gets one blog by ID. */
  def get(request: AnonBlogId): Request_[Blog] = js.native
  /** Retrieve a Blog by URL. */
  def getByUrl(request: AnonFields): Request_[Blog] = js.native
  /** Retrieves a list of blogs, possibly filtered. */
  def listByUser(request: AnonFetchUserInfo): Request_[BlogList] = js.native
}

object BlogsResource {
  @scala.inline
  def apply(
    get: AnonBlogId => Request_[Blog],
    getByUrl: AnonFields => Request_[Blog],
    listByUser: AnonFetchUserInfo => Request_[BlogList]
  ): BlogsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getByUrl = js.Any.fromFunction1(getByUrl), listByUser = js.Any.fromFunction1(listByUser))
    __obj.asInstanceOf[BlogsResource]
  }
  @scala.inline
  implicit class BlogsResourceOps[Self <: BlogsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonBlogId => Request_[Blog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetByUrl(value: AnonFields => Request_[Blog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListByUser(value: AnonFetchUserInfo => Request_[BlogList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByUser")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

