package typingsSlinky.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Helper
// see https://github.com/nuysoft/Mock/wiki/Helper
@js.native
trait MockjsRandomHelper extends js.Object {
  // Random.capitalize
  def capitalize(word: S): S = js.native
  // Random.lower
  def lower(str: S): S = js.native
  // Random.pick
  def pick(arr: js.Array[_]): js.Any = js.native
  // Random.shuffle
  def shuffle(arr: js.Array[_]): js.Array[_] = js.native
  // Random.upper
  def upper(str: S): S = js.native
}

object MockjsRandomHelper {
  @scala.inline
  def apply(
    capitalize: S => S,
    lower: S => S,
    pick: js.Array[_] => js.Any,
    shuffle: js.Array[_] => js.Array[_],
    upper: S => S
  ): MockjsRandomHelper = {
    val __obj = js.Dynamic.literal(capitalize = js.Any.fromFunction1(capitalize), lower = js.Any.fromFunction1(lower), pick = js.Any.fromFunction1(pick), shuffle = js.Any.fromFunction1(shuffle), upper = js.Any.fromFunction1(upper))
    __obj.asInstanceOf[MockjsRandomHelper]
  }
  @scala.inline
  implicit class MockjsRandomHelperOps[Self <: MockjsRandomHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapitalize(value: S => S): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capitalize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLower(value: S => S): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPick(value: js.Array[_] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShuffle(value: js.Array[_] => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpper(value: S => S): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upper")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

