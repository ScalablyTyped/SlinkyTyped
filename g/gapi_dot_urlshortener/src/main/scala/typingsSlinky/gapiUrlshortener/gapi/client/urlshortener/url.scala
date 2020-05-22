package typingsSlinky.gapiUrlshortener.gapi.client.urlshortener

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiUrlshortener.GoogleApiUrlShortenerUrlResource
import typingsSlinky.gapiUrlshortener.anon.Fields
import typingsSlinky.gapiUrlshortener.anon.Projection
import typingsSlinky.gapiUrlshortener.anon.RequestBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait url extends js.Object {
  /**
    * Expands a short URL or gets creation time and analytics.
    */
  def get(`object`: Fields): HttpRequest[GoogleApiUrlShortenerUrlResource]
  /**
    * Creates a new short URL.
    */
  def insert(`object`: RequestBody): HttpRequest[GoogleApiUrlShortenerUrlResource]
  /**
    * Retrieves a list of URLs shortened by a user.
    */
  def list(`object`: Projection): HttpRequest[GoogleApiUrlShortenerUrlResource]
}

object url {
  @scala.inline
  def apply(
    get: Fields => HttpRequest[GoogleApiUrlShortenerUrlResource],
    insert: RequestBody => HttpRequest[GoogleApiUrlShortenerUrlResource],
    list: Projection => HttpRequest[GoogleApiUrlShortenerUrlResource]
  ): url = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[url]
  }
}

