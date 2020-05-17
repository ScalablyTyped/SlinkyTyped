package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `23`[K] extends js.Object {
  var row: K = js.native
}

object `23` {
  @scala.inline
  def apply[K](row: K): `23`[K] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`[K]]
  }
  @scala.inline
  implicit class `23Ops`[Self[k] <: `23`[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withRow(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

