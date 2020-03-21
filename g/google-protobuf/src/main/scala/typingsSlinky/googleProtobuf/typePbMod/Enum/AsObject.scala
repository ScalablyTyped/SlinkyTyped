package typingsSlinky.googleProtobuf.typePbMod.Enum

import typingsSlinky.googleProtobuf.typePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var enumvalueList: js.Array[typingsSlinky.googleProtobuf.typePbMod.EnumValue.AsObject]
  var name: String
  var optionsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject]
  var sourceContext: js.UndefOr[typingsSlinky.googleProtobuf.sourceContextPbMod.SourceContext.AsObject] = js.undefined
  var syntax: Syntax
}

object AsObject {
  @scala.inline
  def apply(
    enumvalueList: js.Array[typingsSlinky.googleProtobuf.typePbMod.EnumValue.AsObject],
    name: String,
    optionsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject],
    syntax: Syntax,
    sourceContext: typingsSlinky.googleProtobuf.sourceContextPbMod.SourceContext.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(enumvalueList = enumvalueList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

