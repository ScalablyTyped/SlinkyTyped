package typingsSlinky.googleapis.mod.booksV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Books API
  *
  * Searches for books and manages your Google Books library.
  *
  * @example
  * const {google} = require('googleapis');
  * const books = google.books('v1');
  *
  * @namespace books
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Books
  */
@JSImport("googleapis", "books_v1.Books")
@js.native
class Books protected ()
  extends typingsSlinky.googleapis.booksV1Mod.booksV1.Books {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

