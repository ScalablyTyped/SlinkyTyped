package typingsSlinky.ebml.mod

import typingsSlinky.ebml.ebmlStrings.Informational
import typingsSlinky.ebml.ebmlStrings.`1 - bzlibComma`
import typingsSlinky.ebml.ebmlStrings.`2 - lzo1x`
import typingsSlinky.ebml.ebmlStrings.informational_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EBMLTagSchemaBase extends EBMLTagSchema {
  var cppname: js.UndefOr[String] = js.native
  var del: js.UndefOr[(js.Tuple2[`1 - bzlibComma`, `2 - lzo1x`]) | (`1 - bzlibComma`) | (`2 - lzo1x`)] = js.native
  var description: String = js.native
  var divx: js.UndefOr[Boolean] = js.native
  var i: js.UndefOr[String] = js.native
  var level: Double = js.native
  var mandatory: js.UndefOr[Boolean] = js.native
  var maxver: js.UndefOr[String] = js.native
  var minver: js.UndefOr[Double] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var recursive: js.UndefOr[Boolean] = js.native
  var strong: js.UndefOr[informational_ | Informational] = js.native
  var `type`: TagType = js.native
  var webm: js.UndefOr[Boolean] = js.native
}

object EBMLTagSchemaBase {
  @scala.inline
  def apply(description: String, level: Double, name: String, `type`: TagType): EBMLTagSchemaBase = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLTagSchemaBase]
  }
  @scala.inline
  implicit class EBMLTagSchemaBaseOps[Self <: EBMLTagSchemaBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TagType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCppname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cppname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCppname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cppname")(js.undefined)
        ret
    }
    @scala.inline
    def withDel(value: (js.Tuple2[`1 - bzlibComma`, `2 - lzo1x`]) | (`1 - bzlibComma`) | (`2 - lzo1x`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(js.undefined)
        ret
    }
    @scala.inline
    def withDivx(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divx")(js.undefined)
        ret
    }
    @scala.inline
    def withI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(js.undefined)
        ret
    }
    @scala.inline
    def withMandatory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMandatory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatory")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxver")(js.undefined)
        ret
    }
    @scala.inline
    def withMinver(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minver")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(js.undefined)
        ret
    }
    @scala.inline
    def withStrong(value: informational_ | Informational): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(js.undefined)
        ret
    }
    @scala.inline
    def withWebm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webm")(js.undefined)
        ret
    }
  }
  
}

