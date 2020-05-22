package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.SearchString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Gets one project by ID. */
  def get(request: Fields): Request[Project]
  /** Retrieves a list of projects, possibly filtered. This method supports paging. */
  def list(request: SearchString): Request[ProjectsListResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(get: Fields => Request[Project], list: SearchString => Request[ProjectsListResponse]): ProjectsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ProjectsResource]
  }
}

