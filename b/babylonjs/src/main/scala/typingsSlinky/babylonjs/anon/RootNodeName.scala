package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootNodeName extends js.Object {
  var componentProperty: String = js.native
  var rootNodeName: String = js.native
  var states: js.Array[String] = js.native
}

object RootNodeName {
  @scala.inline
  def apply(componentProperty: String, rootNodeName: String, states: js.Array[String]): RootNodeName = {
    val __obj = js.Dynamic.literal(componentProperty = componentProperty.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootNodeName]
  }
  @scala.inline
  implicit class RootNodeNameOps[Self <: RootNodeName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

