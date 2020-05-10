package typingsSlinky.json2md.mod.DefaultConverters

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converters
  extends /* converter */ StringDictionary[js.Any] {
  var blockquote: String | js.Array[String] = js.native
  var code: CodeInput = js.native
  var h1: String | js.Array[String] = js.native
  var h2: String | js.Array[String] = js.native
  var h3: String | js.Array[String] = js.native
  var h4: String | js.Array[String] = js.native
  var h5: String | js.Array[String] = js.native
  var h6: String | js.Array[String] = js.native
  var img: ImgInput | js.Array[ImgInput] = js.native
  var ol: js.Array[String] = js.native
  var p: String | js.Array[String] = js.native
  var table: TableInput = js.native
  var ul: js.Array[String] = js.native
}

object Converters {
  @scala.inline
  def apply(
    blockquote: String | js.Array[String],
    code: CodeInput,
    h1: String | js.Array[String],
    h2: String | js.Array[String],
    h3: String | js.Array[String],
    h4: String | js.Array[String],
    h5: String | js.Array[String],
    h6: String | js.Array[String],
    img: ImgInput | js.Array[ImgInput],
    ol: js.Array[String],
    p: String | js.Array[String],
    table: TableInput,
    ul: js.Array[String]
  ): Converters = {
    val __obj = js.Dynamic.literal(blockquote = blockquote.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
    __obj.asInstanceOf[Converters]
  }
  @scala.inline
  implicit class ConvertersOps[Self <: Converters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockquote(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockquote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: CodeInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH1(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH2(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH3(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH4(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH5(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH6(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImg(value: ImgInput | js.Array[ImgInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOl(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTable(value: TableInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUl(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

