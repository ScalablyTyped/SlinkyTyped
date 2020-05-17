package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootNodeNameString extends js.Object {
  var rootNodeName: String = js.native
}

object RootNodeNameString {
  @scala.inline
  def apply(rootNodeName: String): RootNodeNameString = {
    val __obj = js.Dynamic.literal(rootNodeName = rootNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootNodeNameString]
  }
  @scala.inline
  implicit class RootNodeNameStringOps[Self <: RootNodeNameString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRootNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNodeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

