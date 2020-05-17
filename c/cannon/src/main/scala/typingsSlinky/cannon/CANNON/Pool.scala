package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pool extends js.Object {
  var objects: js.Array[_] = js.native
  var `type`: js.Array[_] = js.native
  def constructObject(): js.Any = js.native
  def get(): js.Any = js.native
  def release(): js.Any = js.native
}

object Pool {
  @scala.inline
  def apply(
    constructObject: () => js.Any,
    get: () => js.Any,
    objects: js.Array[_],
    release: () => js.Any,
    `type`: js.Array[_]
  ): Pool = {
    val __obj = js.Dynamic.literal(constructObject = js.Any.fromFunction0(constructObject), get = js.Any.fromFunction0(get), objects = objects.asInstanceOf[js.Any], release = js.Any.fromFunction0(release))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pool]
  }
  @scala.inline
  implicit class PoolOps[Self <: Pool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstructObject(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObjects(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

