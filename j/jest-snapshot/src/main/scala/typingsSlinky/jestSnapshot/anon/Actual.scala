package typingsSlinky.jestSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actual extends js.Object {
  var actual: String = js.native
  var count: Double = js.native
  var expected: String | Null = js.native
  var key: String = js.native
  var pass: Boolean = js.native
}

object Actual {
  @scala.inline
  def apply(actual: String, count: Double, key: String, pass: Boolean): Actual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actual]
  }
  @scala.inline
  implicit class ActualOps[Self <: Actual] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActual(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpectedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(null)
        ret
    }
  }
  
}

