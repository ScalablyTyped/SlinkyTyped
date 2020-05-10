package typingsSlinky.sanctuary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckTypes extends js.Object {
  var checkTypes: Boolean = js.native
  var env: js.Array[_] = js.native
}

object AnonCheckTypes {
  @scala.inline
  def apply(checkTypes: Boolean, env: js.Array[_]): AnonCheckTypes = {
    val __obj = js.Dynamic.literal(checkTypes = checkTypes.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckTypes]
  }
  @scala.inline
  implicit class AnonCheckTypesOps[Self <: AnonCheckTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

