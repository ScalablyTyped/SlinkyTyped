package typingsSlinky.frecency.mod

import typingsSlinky.frecency.anon.FrecencyScore
import typingsSlinky.frecency.anon.KeepScores
import typingsSlinky.frecency.anon.SearchQuery
import typingsSlinky.frecency.anon.SearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frecency[T] extends js.Object {
  var sort: js.Function1[
    (/* arg */ KeepScores[T]) | (/* arg */ SearchResults[T]), 
    js.Array[(T with FrecencyScore) | T]
  ] = js.native
  def save(arg: SearchQuery[T]): Unit = js.native
}

object Frecency {
  @scala.inline
  def apply[T](
    save: SearchQuery[T] => Unit,
    sort: (/* arg */ KeepScores[T]) | (/* arg */ SearchResults[T]) => js.Array[(T with FrecencyScore) | T]
  ): Frecency[T] = {
    val __obj = js.Dynamic.literal(save = js.Any.fromFunction1(save), sort = js.Any.fromFunction1(sort))
    __obj.asInstanceOf[Frecency[T]]
  }
  @scala.inline
  implicit class FrecencyOps[Self[t] <: Frecency[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSave(value: SearchQuery[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSort(
      value: (/* arg */ KeepScores[T]) | (/* arg */ SearchResults[T]) => js.Array[(T with FrecencyScore) | T]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

