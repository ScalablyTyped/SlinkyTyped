package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parent[K] extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var key: js.UndefOr[K] = js.native
  var parent: js.UndefOr[org.scalajs.dom.raw.Element] = js.native
}

object Parent {
  @scala.inline
  def apply[K](): Parent[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parent[K]]
  }
  @scala.inline
  implicit class ParentOps[Self[k] <: Parent[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withIndex(value: Double): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: org.scalajs.dom.raw.Element): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

