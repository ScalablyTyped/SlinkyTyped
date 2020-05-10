package typingsSlinky.broccoliNodeApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCommon[T /* <: NodeInfo */] extends js.Object {
  /**
    The node's feature set, indicating the API version
    */
  var __broccoliFeatures__ : FeatureSet = js.native
  /**
    A function to be called by the Builder, taking the Builder's feature set as
    an argument and returning a `NodeInfo` object
    */
  def __broccoliGetInfo__(builderFeatures: FeatureSet): T = js.native
}

object NodeCommon {
  @scala.inline
  def apply[T](__broccoliFeatures__ : FeatureSet, __broccoliGetInfo__ : FeatureSet => T): NodeCommon[T] = {
    val __obj = js.Dynamic.literal(__broccoliFeatures__ = __broccoliFeatures__.asInstanceOf[js.Any], __broccoliGetInfo__ = js.Any.fromFunction1(__broccoliGetInfo__))
    __obj.asInstanceOf[NodeCommon[T]]
  }
  @scala.inline
  implicit class NodeCommonOps[Self[t] <: NodeCommon[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with__broccoliFeatures__(value: FeatureSet): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__broccoliFeatures__")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__broccoliGetInfo__(value: FeatureSet => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__broccoliGetInfo__")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

