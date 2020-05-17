package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBlogger.anon.BlogId
import typingsSlinky.gapiClientBlogger.anon.FetchUserInfo
import typingsSlinky.gapiClientBlogger.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlogsResource extends js.Object {
  /** Gets one blog by ID. */
  def get(request: BlogId): Request[Blog] = js.native
  /** Retrieve a Blog by URL. */
  def getByUrl(request: Fields): Request[Blog] = js.native
  /** Retrieves a list of blogs, possibly filtered. */
  def listByUser(request: FetchUserInfo): Request[BlogList] = js.native
}

object BlogsResource {
  @scala.inline
  def apply(
    get: BlogId => Request[Blog],
    getByUrl: Fields => Request[Blog],
    listByUser: FetchUserInfo => Request[BlogList]
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
    def withGet(value: BlogId => Request[Blog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetByUrl(value: Fields => Request[Blog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListByUser(value: FetchUserInfo => Request[BlogList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByUser")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

