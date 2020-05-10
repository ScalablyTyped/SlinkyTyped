package typingsSlinky.frecency.mod

import typingsSlinky.frecency.AnonFrecencyScore
import typingsSlinky.frecency.AnonKeepScores
import typingsSlinky.frecency.AnonSearchQuery
import typingsSlinky.frecency.AnonSearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frecency[T] extends js.Object {
  var sort: js.Function1[
    (/* arg */ AnonKeepScores[T]) | (/* arg */ AnonSearchResults[T]), 
    js.Array[(T with AnonFrecencyScore) | T]
  ] = js.native
  def save(arg: AnonSearchQuery[T]): Unit = js.native
}

object Frecency {
  @scala.inline
  def apply[T](
    save: AnonSearchQuery[T] => Unit,
    sort: (/* arg */ AnonKeepScores[T]) | (/* arg */ AnonSearchResults[T]) => js.Array[(T with AnonFrecencyScore) | T]
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
    def withSave(value: AnonSearchQuery[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSort(
      value: (/* arg */ AnonKeepScores[T]) | (/* arg */ AnonSearchResults[T]) => js.Array[(T with AnonFrecencyScore) | T]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

