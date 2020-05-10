package typingsSlinky.pinyin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 是否启用多音字模式，默认关闭。
    * 关闭多音字模式时，返回每个汉字第一个匹配的拼音。
    * 启用多音字模式时，返回多音字的所有拼音列表。
    */
  var heteronym: js.UndefOr[Boolean] = js.native
  /**
    * 是否启用分词模式，默认关闭。
    * 中文分词有助于极大的降低多音字问题。但性能会极大的下降，内存也会使用更多。
    */
  var segment: js.UndefOr[Boolean] = js.native
  /**
    * 设置拼音风格，默认风格是 {@link STYLE_TONE}
    * @see {@link STYLE_NORMAL}
    * @see {@link STYLE_TONE}
    * @see {@link STYLE_TONE2}
    * @see {@link STYLE_TO3NE}
    * @see {@link STYLE_INITIALS}
    * @see {@link STYLE_FIRST_LETTER}
    */
  var style: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeteronym(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heteronym")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeteronym: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heteronym")(js.undefined)
        ret
    }
    @scala.inline
    def withSegment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

