package typingsSlinky.gapiClientUrlshortener.gapi.client.urlshortener

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientUrlshortener.AnonAlt
import typingsSlinky.gapiClientUrlshortener.AnonFields
import typingsSlinky.gapiClientUrlshortener.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlResource extends js.Object {
  /** Expands a short URL or gets creation time and analytics. */
  def get(request: AnonAlt): Request_[Url] = js.native
  /** Creates a new short URL. */
  def insert(request: AnonFields): Request_[Url] = js.native
  /** Retrieves a list of URLs shortened by a user. */
  def list(request: AnonKey): Request_[UrlHistory] = js.native
}

object UrlResource {
  @scala.inline
  def apply(
    get: AnonAlt => Request_[Url],
    insert: AnonFields => Request_[Url],
    list: AnonKey => Request_[UrlHistory]
  ): UrlResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UrlResource]
  }
  @scala.inline
  implicit class UrlResourceOps[Self <: UrlResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonAlt => Request_[Url]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonFields => Request_[Url]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[UrlHistory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

