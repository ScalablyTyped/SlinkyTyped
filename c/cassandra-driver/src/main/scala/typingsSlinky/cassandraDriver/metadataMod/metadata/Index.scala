package typingsSlinky.cassandraDriver.metadataMod.metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  var kind: IndexKind = js.native
  var name: String = js.native
  var options: js.Object = js.native
  var target: String = js.native
  def isCompositesKind(): Boolean = js.native
  def isCustomKind(): Boolean = js.native
  def isKeysKind(): Boolean = js.native
}

object Index {
  @scala.inline
  def apply(
    isCompositesKind: () => Boolean,
    isCustomKind: () => Boolean,
    isKeysKind: () => Boolean,
    kind: IndexKind,
    name: String,
    options: js.Object,
    target: String
  ): Index = {
    val __obj = js.Dynamic.literal(isCompositesKind = js.Any.fromFunction0(isCompositesKind), isCustomKind = js.Any.fromFunction0(isCustomKind), isKeysKind = js.Any.fromFunction0(isKeysKind), kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCompositesKind(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompositesKind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCustomKind(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomKind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsKeysKind(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKeysKind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKind(value: IndexKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

