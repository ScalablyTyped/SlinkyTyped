package typingsSlinky.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MylibraryResource extends js.Object {
  var annotations: AnnotationsResource = js.native
  var bookshelves: BookshelvesResource = js.native
  var readingpositions: ReadingpositionsResource = js.native
}

object MylibraryResource {
  @scala.inline
  def apply(
    annotations: AnnotationsResource,
    bookshelves: BookshelvesResource,
    readingpositions: ReadingpositionsResource
  ): MylibraryResource = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], bookshelves = bookshelves.asInstanceOf[js.Any], readingpositions = readingpositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MylibraryResource]
  }
  @scala.inline
  implicit class MylibraryResourceOps[Self <: MylibraryResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: AnnotationsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBookshelves(value: BookshelvesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookshelves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadingpositions(value: ReadingpositionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readingpositions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

