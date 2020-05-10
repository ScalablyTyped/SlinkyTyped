package typingsSlinky.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionsMixin extends js.Object {
  var addRegion: js.Any = js.native
  var addRegions: js.Any = js.native
  var detachChildView: js.Any = js.native
  var emptyRegions: js.Any = js.native
  var getChildView: js.Any = js.native
  var getRegion: js.Any = js.native
  var getRegions: js.Any = js.native
  var hasRegion: js.Any = js.native
  var regionClass: js.Any = js.native
  var removeRegion: js.Any = js.native
  var removeRegions: js.Any = js.native
  var showChildView: js.Any = js.native
}

object RegionsMixin {
  @scala.inline
  def apply(
    addRegion: js.Any,
    addRegions: js.Any,
    detachChildView: js.Any,
    emptyRegions: js.Any,
    getChildView: js.Any,
    getRegion: js.Any,
    getRegions: js.Any,
    hasRegion: js.Any,
    regionClass: js.Any,
    removeRegion: js.Any,
    removeRegions: js.Any,
    showChildView: js.Any
  ): RegionsMixin = {
    val __obj = js.Dynamic.literal(addRegion = addRegion.asInstanceOf[js.Any], addRegions = addRegions.asInstanceOf[js.Any], detachChildView = detachChildView.asInstanceOf[js.Any], emptyRegions = emptyRegions.asInstanceOf[js.Any], getChildView = getChildView.asInstanceOf[js.Any], getRegion = getRegion.asInstanceOf[js.Any], getRegions = getRegions.asInstanceOf[js.Any], hasRegion = hasRegion.asInstanceOf[js.Any], regionClass = regionClass.asInstanceOf[js.Any], removeRegion = removeRegion.asInstanceOf[js.Any], removeRegions = removeRegions.asInstanceOf[js.Any], showChildView = showChildView.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionsMixin]
  }
  @scala.inline
  implicit class RegionsMixinOps[Self <: RegionsMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRegion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddRegions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetachChildView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachChildView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyRegions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetChildView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRegion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRegions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasRegion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegionClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRegion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRegions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowChildView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showChildView")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

