package typingsSlinky.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomMixin extends js.Object {
  var appendChildren: js.Any = js.native
  var beforeEl: js.Any = js.native
  var createBuffer: js.Any = js.native
  var detachContents: js.Any = js.native
  var detachEl: js.Any = js.native
  var findEls: js.Any = js.native
  var removeEl: js.Any = js.native
  var replaceEl: js.Any = js.native
  var setInnerContent: js.Any = js.native
}

object DomMixin {
  @scala.inline
  def apply(
    appendChildren: js.Any,
    beforeEl: js.Any,
    createBuffer: js.Any,
    detachContents: js.Any,
    detachEl: js.Any,
    findEls: js.Any,
    removeEl: js.Any,
    replaceEl: js.Any,
    setInnerContent: js.Any
  ): DomMixin = {
    val __obj = js.Dynamic.literal(appendChildren = appendChildren.asInstanceOf[js.Any], beforeEl = beforeEl.asInstanceOf[js.Any], createBuffer = createBuffer.asInstanceOf[js.Any], detachContents = detachContents.asInstanceOf[js.Any], detachEl = detachEl.asInstanceOf[js.Any], findEls = findEls.asInstanceOf[js.Any], removeEl = removeEl.asInstanceOf[js.Any], replaceEl = replaceEl.asInstanceOf[js.Any], setInnerContent = setInnerContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomMixin]
  }
  @scala.inline
  implicit class DomMixinOps[Self <: DomMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendChildren(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateBuffer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetachContents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetachEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindEls(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findEls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetInnerContent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInnerContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

