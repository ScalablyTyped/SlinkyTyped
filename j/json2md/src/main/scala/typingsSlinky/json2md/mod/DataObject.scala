package typingsSlinky.json2md.mod

import typingsSlinky.json2md.mod.DefaultConverters.CodeInput
import typingsSlinky.json2md.mod.DefaultConverters.ImgInput
import typingsSlinky.json2md.mod.DefaultConverters.TableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ TConverter in keyof json2md.json2md.DefaultConverters.Converters ]:? json2md.json2md.DefaultConverters.Converters[TConverter]} */
@js.native
trait DataObject extends js.Object {
  var blockquote: js.UndefOr[String | js.Array[String]] = js.native
  var code: js.UndefOr[CodeInput] = js.native
  var h1: js.UndefOr[String | js.Array[String]] = js.native
  var h2: js.UndefOr[String | js.Array[String]] = js.native
  var h3: js.UndefOr[String | js.Array[String]] = js.native
  var h4: js.UndefOr[String | js.Array[String]] = js.native
  var h5: js.UndefOr[String | js.Array[String]] = js.native
  var h6: js.UndefOr[String | js.Array[String]] = js.native
  var img: js.UndefOr[ImgInput | js.Array[ImgInput]] = js.native
  var ol: js.UndefOr[js.Array[String]] = js.native
  var p: js.UndefOr[String | js.Array[String]] = js.native
  var table: js.UndefOr[TableInput] = js.native
  var ul: js.UndefOr[js.Array[String]] = js.native
}

object DataObject {
  @scala.inline
  def apply(): DataObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataObject]
  }
  @scala.inline
  implicit class DataObjectOps[Self <: DataObject] (val x: Self) extends AnyVal {
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
    def withoutBlockquote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockquote")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: CodeInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withH1(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h1")(js.undefined)
        ret
    }
    @scala.inline
    def withH2(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h2")(js.undefined)
        ret
    }
    @scala.inline
    def withH3(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h3")(js.undefined)
        ret
    }
    @scala.inline
    def withH4(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h4")(js.undefined)
        ret
    }
    @scala.inline
    def withH5(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h5")(js.undefined)
        ret
    }
    @scala.inline
    def withH6(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h6")(js.undefined)
        ret
    }
    @scala.inline
    def withImg(value: ImgInput | js.Array[ImgInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(js.undefined)
        ret
    }
    @scala.inline
    def withOl(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ol")(js.undefined)
        ret
    }
    @scala.inline
    def withP(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: TableInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withUl(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul")(js.undefined)
        ret
    }
  }
  
}

