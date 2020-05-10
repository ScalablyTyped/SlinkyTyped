package typingsSlinky.googleProtobuf.apiPbMod.Method

import typingsSlinky.googleProtobuf.typePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var name: String = js.native
  var optionsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject] = js.native
  var requestStreaming: Boolean = js.native
  var requestTypeUrl: String = js.native
  var responseStreaming: Boolean = js.native
  var responseTypeUrl: String = js.native
  var syntax: Syntax = js.native
}

object AsObject {
  @scala.inline
  def apply(
    name: String,
    optionsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject],
    requestStreaming: Boolean,
    requestTypeUrl: String,
    responseStreaming: Boolean,
    responseTypeUrl: String,
    syntax: Syntax
  ): AsObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], requestStreaming = requestStreaming.asInstanceOf[js.Any], requestTypeUrl = requestTypeUrl.asInstanceOf[js.Any], responseStreaming = responseStreaming.asInstanceOf[js.Any], responseTypeUrl = responseTypeUrl.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRequestStreaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStreaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestTypeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTypeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseStreaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStreaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseTypeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTypeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyntax(value: Syntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

