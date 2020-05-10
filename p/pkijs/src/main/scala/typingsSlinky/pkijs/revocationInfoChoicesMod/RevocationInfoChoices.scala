package typingsSlinky.pkijs.revocationInfoChoicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevocationInfoChoices extends js.Object {
  var crls: js.Array[typingsSlinky.pkijs.certificateRevocationListMod.default] = js.native
  var otherRevocationInfos: js.Array[typingsSlinky.pkijs.otherRevocationInfoFormatMod.default] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object RevocationInfoChoices {
  @scala.inline
  def apply(
    crls: js.Array[typingsSlinky.pkijs.certificateRevocationListMod.default],
    fromSchema: js.Any => Unit,
    otherRevocationInfos: js.Array[typingsSlinky.pkijs.otherRevocationInfoFormatMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RevocationInfoChoices = {
    val __obj = js.Dynamic.literal(crls = crls.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), otherRevocationInfos = otherRevocationInfos.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[RevocationInfoChoices]
  }
  @scala.inline
  implicit class RevocationInfoChoicesOps[Self <: RevocationInfoChoices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrls(value: js.Array[typingsSlinky.pkijs.certificateRevocationListMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOtherRevocationInfos(value: js.Array[typingsSlinky.pkijs.otherRevocationInfoFormatMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherRevocationInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

