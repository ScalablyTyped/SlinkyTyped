package typingsSlinky.googleProtobuf.typePbMod.Enum

import typingsSlinky.googleProtobuf.typePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var enumvalueList: js.Array[typingsSlinky.googleProtobuf.typePbMod.EnumValue.AsObject] = js.native
  var name: String = js.native
  var optionsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject] = js.native
  var sourceContext: js.UndefOr[typingsSlinky.googleProtobuf.sourceContextPbMod.SourceContext.AsObject] = js.native
  var syntax: Syntax = js.native
}

object AsObject {
  @scala.inline
  def apply(
    enumvalueList: js.Array[typingsSlinky.googleProtobuf.typePbMod.EnumValue.AsObject],
    name: String,
    optionsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject],
    syntax: Syntax
  ): AsObject = {
    val __obj = js.Dynamic.literal(enumvalueList = enumvalueList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumvalueList(value: js.Array[typingsSlinky.googleProtobuf.typePbMod.EnumValue.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumvalueList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsList(value: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyntax(value: Syntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceContext(value: typingsSlinky.googleProtobuf.sourceContextPbMod.SourceContext.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceContext")(js.undefined)
        ret
    }
  }
  
}

