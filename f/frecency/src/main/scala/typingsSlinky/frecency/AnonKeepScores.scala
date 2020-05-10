package typingsSlinky.frecency

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeepScores[T] extends js.Object {
  var keepScores: js.UndefOr[Boolean] = js.native
  var searchQuery: T = js.native
  var searchResults: js.Array[T] = js.native
}

object AnonKeepScores {
  @scala.inline
  def apply[T](searchQuery: T, searchResults: js.Array[T]): AnonKeepScores[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeepScores[T]]
  }
  @scala.inline
  implicit class AnonKeepScoresOps[Self[t] <: AnonKeepScores[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSearchQuery(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchResults(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepScores(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepScores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepScores: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepScores")(js.undefined)
        ret
    }
  }
  
}

