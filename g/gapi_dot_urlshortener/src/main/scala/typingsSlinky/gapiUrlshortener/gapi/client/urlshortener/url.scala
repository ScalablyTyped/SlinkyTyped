package typingsSlinky.gapiUrlshortener.gapi.client.urlshortener

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiUrlshortener.AnonFields
import typingsSlinky.gapiUrlshortener.AnonProjection
import typingsSlinky.gapiUrlshortener.AnonRequestBody
import typingsSlinky.gapiUrlshortener.GoogleApiUrlShortenerUrlResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait url extends js.Object {
  /**
    * Expands a short URL or gets creation time and analytics.
    */
  def get(`object`: AnonFields): HttpRequest[GoogleApiUrlShortenerUrlResource] = js.native
  /**
    * Creates a new short URL.
    */
  def insert(`object`: AnonRequestBody): HttpRequest[GoogleApiUrlShortenerUrlResource] = js.native
  /**
    * Retrieves a list of URLs shortened by a user.
    */
  def list(`object`: AnonProjection): HttpRequest[GoogleApiUrlShortenerUrlResource] = js.native
}

object url {
  @scala.inline
  def apply(
    get: AnonFields => HttpRequest[GoogleApiUrlShortenerUrlResource],
    insert: AnonRequestBody => HttpRequest[GoogleApiUrlShortenerUrlResource],
    list: AnonProjection => HttpRequest[GoogleApiUrlShortenerUrlResource]
  ): url = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[url]
  }
  @scala.inline
  implicit class urlOps[Self <: url] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonFields => HttpRequest[GoogleApiUrlShortenerUrlResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonRequestBody => HttpRequest[GoogleApiUrlShortenerUrlResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonProjection => HttpRequest[GoogleApiUrlShortenerUrlResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

