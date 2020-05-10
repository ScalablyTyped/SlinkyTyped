package typingsSlinky.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatter[T] extends js.Object {
  def formatEntry(word_id: Double, position: Double, `type`: String, features: js.Array[String]): T = js.native
  def formatUnknownEntry(word_id: Double, position: Double, `type`: String, features: js.Array[String]): T = js.native
}

object Formatter {
  @scala.inline
  def apply[T](
    formatEntry: (Double, Double, String, js.Array[String]) => T,
    formatUnknownEntry: (Double, Double, String, js.Array[String]) => T
  ): Formatter[T] = {
    val __obj = js.Dynamic.literal(formatEntry = js.Any.fromFunction4(formatEntry), formatUnknownEntry = js.Any.fromFunction4(formatUnknownEntry))
    __obj.asInstanceOf[Formatter[T]]
  }
  @scala.inline
  implicit class FormatterOps[Self[t] <: Formatter[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFormatEntry(value: (Double, Double, String, js.Array[String]) => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatEntry")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFormatUnknownEntry(value: (Double, Double, String, js.Array[String]) => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatUnknownEntry")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

