package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResult[T /* <: js.Object */] extends UpdateMetadata {
  var `new`: js.UndefOr[Document[T]] = js.native
  var old: js.UndefOr[Document[T]] = js.native
}

object UpdateResult {
  @scala.inline
  def apply[T](_id: String, _key: String, _oldRev: String, _rev: String): UpdateResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _oldRev = _oldRev.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResult[T]]
  }
  @scala.inline
  implicit class UpdateResultOps[Self[t] <: UpdateResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNew(value: Document[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new")(js.undefined)
        ret
    }
    @scala.inline
    def withOld(value: Document[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("old")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOld: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("old")(js.undefined)
        ret
    }
  }
  
}

