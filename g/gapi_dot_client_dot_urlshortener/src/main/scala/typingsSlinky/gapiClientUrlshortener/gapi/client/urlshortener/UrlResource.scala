package typingsSlinky.gapiClientUrlshortener.gapi.client.urlshortener

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientUrlshortener.anon.Alt
import typingsSlinky.gapiClientUrlshortener.anon.Fields
import typingsSlinky.gapiClientUrlshortener.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlResource extends js.Object {
  /** Expands a short URL or gets creation time and analytics. */
  def get(request: Alt): Request[Url] = js.native
  /** Creates a new short URL. */
  def insert(request: Fields): Request[Url] = js.native
  /** Retrieves a list of URLs shortened by a user. */
  def list(request: Key): Request[UrlHistory] = js.native
}

object UrlResource {
  @scala.inline
  def apply(get: Alt => Request[Url], insert: Fields => Request[Url], list: Key => Request[UrlHistory]): UrlResource = {
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
    def withGet(value: Alt => Request[Url]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Fields => Request[Url]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[UrlHistory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

