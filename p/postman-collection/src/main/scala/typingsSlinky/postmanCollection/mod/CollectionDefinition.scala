package typingsSlinky.postmanCollection.mod

import typingsSlinky.postmanCollection.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionDefinition extends ItemGroupDefinition {
  var info: js.UndefOr[AnonId] = js.native
  var variable: js.UndefOr[js.Array[VariableDefinition]] = js.native
}

object CollectionDefinition {
  @scala.inline
  def apply(): CollectionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionDefinition]
  }
  @scala.inline
  implicit class CollectionDefinitionOps[Self <: CollectionDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withVariable(value: js.Array[VariableDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(js.undefined)
        ret
    }
  }
  
}

