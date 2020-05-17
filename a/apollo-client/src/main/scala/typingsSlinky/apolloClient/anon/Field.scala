package typingsSlinky.apolloClient.anon

import typingsSlinky.apolloUtilities.getFromASTMod.FragmentMap
import typingsSlinky.graphql.astMod.FieldNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  var field: FieldNode = js.native
  var fragmentMap: FragmentMap = js.native
}

object Field {
  @scala.inline
  def apply(field: FieldNode, fragmentMap: FragmentMap): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fragmentMap = fragmentMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: FieldNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentMap(value: FragmentMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

