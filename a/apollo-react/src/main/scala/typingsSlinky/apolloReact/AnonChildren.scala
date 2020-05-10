package typingsSlinky.apolloReact

import typingsSlinky.react.mod.Requireable
import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildren extends js.Object {
  var children: Validator[_] = js.native
  var client: Validator[_] = js.native
  var immutable: Requireable[_] = js.native
  var store: Requireable[_] = js.native
}

object AnonChildren {
  @scala.inline
  def apply(children: Validator[_], client: Validator[_], immutable: Requireable[_], store: Requireable[_]): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], immutable = immutable.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
  @scala.inline
  implicit class AnonChildrenOps[Self <: AnonChildren] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: Validator[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient(value: Validator[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImmutable(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

