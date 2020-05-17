package typingsSlinky.linq.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Length[TOther] extends /* x */ NumberDictionary[TOther] {
  var length: Double = js.native
}

object Length {
  @scala.inline
  def apply[TOther](length: Double): Length[TOther] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length[TOther]]
  }
  @scala.inline
  implicit class LengthOps[Self[tother] <: Length[tother], TOther] (val x: Self[TOther]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TOther] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TOther]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TOther] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TOther] with Other]
    @scala.inline
    def withLength(value: Double): Self[TOther] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

