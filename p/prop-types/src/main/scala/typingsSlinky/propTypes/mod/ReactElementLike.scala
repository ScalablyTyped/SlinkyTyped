package typingsSlinky.propTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactElementLike extends ReactNodeLike {
  var key: String | Double | Null = js.native
  var props: js.Any = js.native
  var `type`: ReactComponentLike = js.native
}

object ReactElementLike {
  @scala.inline
  def apply(props: js.Any, `type`: ReactComponentLike): ReactElementLike = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactElementLike]
  }
  @scala.inline
  implicit class ReactElementLikeOps[Self <: ReactElementLike] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeFunction2(value: (/* props */ js.Any, /* context */ js.UndefOr[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withType(value: ReactComponentLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(null)
        ret
    }
  }
  
}

