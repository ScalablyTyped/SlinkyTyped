package typingsSlinky.reactMosaicComponent.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicUpdate[T /* <: MosaicKey */] extends js.Object {
  var path: MosaicPath = js.native
  var spec: MosaicUpdateSpec[T] = js.native
}

object MosaicUpdate {
  @scala.inline
  def apply[T](path: MosaicPath, spec: MosaicUpdateSpec[T]): MosaicUpdate[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicUpdate[T]]
  }
  @scala.inline
  implicit class MosaicUpdateOps[Self[t] <: MosaicUpdate[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPath(value: MosaicPath): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecFunction1(value: MosaicNode[T] => MosaicNode[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpec(value: MosaicUpdateSpec[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

