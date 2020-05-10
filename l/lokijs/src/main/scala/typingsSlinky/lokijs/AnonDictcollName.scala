package typingsSlinky.lokijs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.lokijs.lokijsStrings.destructured
import typingsSlinky.lokijs.lokijsStrings.normal
import typingsSlinky.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictcollName
  extends /* collName */ StringDictionary[js.Any | AnonInflate] {
  var retainDirtyFlags: js.UndefOr[Boolean] = js.native
  var serializationMethod: js.UndefOr[normal | pretty | destructured | Null] = js.native
  var throttledSaves: js.UndefOr[Boolean] = js.native
}

object AnonDictcollName {
  @scala.inline
  def apply(): AnonDictcollName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDictcollName]
  }
  @scala.inline
  implicit class AnonDictcollNameOps[Self <: AnonDictcollName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetainDirtyFlags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainDirtyFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainDirtyFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainDirtyFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializationMethod(value: normal | pretty | destructured): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializationMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializationMethodNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializationMethod")(null)
        ret
    }
    @scala.inline
    def withThrottledSaves(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttledSaves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottledSaves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttledSaves")(js.undefined)
        ret
    }
  }
  
}

