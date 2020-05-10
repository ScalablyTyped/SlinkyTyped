package typingsSlinky.bookshelf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionCreateOptions
  extends CollectionAddOptions
     with ModelOptions
     with SaveOptions

object CollectionCreateOptions {
  @scala.inline
  def apply(): CollectionCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionCreateOptions]
  }
}

