package typingsSlinky.moji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moji extends js.Object {
  def convert(beforeType: Mojisyu, afterType: Mojisyu): Moji = js.native
  def filter(`type`: Mojisyu): Moji = js.native
  def reject(`type`: Mojisyu): Moji = js.native
  def trim(): Moji = js.native
}

object Moji {
  @scala.inline
  def apply(
    convert: (Mojisyu, Mojisyu) => Moji,
    filter: Mojisyu => Moji,
    reject: Mojisyu => Moji,
    trim: () => Moji
  ): Moji = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction2(convert), filter = js.Any.fromFunction1(filter), reject = js.Any.fromFunction1(reject), trim = js.Any.fromFunction0(trim))
    __obj.asInstanceOf[Moji]
  }
  @scala.inline
  implicit class MojiOps[Self <: Moji] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvert(value: (Mojisyu, Mojisyu) => Moji): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFilter(value: Mojisyu => Moji): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReject(value: Mojisyu => Moji): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrim(value: () => Moji): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

