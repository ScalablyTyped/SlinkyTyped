package typingsSlinky.dojo.dojox.lang.oo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/oo/general.html
  *
  *
  */
@js.native
trait general extends js.Object {
  /**
    *
    */
  var after: js.Object = js.native
  /**
    *
    */
  var augment: js.Object = js.native
  /**
    *
    */
  var before: js.Object = js.native
  /**
    *
    */
  var `override`: js.Object = js.native
  /**
    *
    */
  var shuffle: js.Object = js.native
  /**
    *
    */
  var tap: js.Object = js.native
  /**
    *
    */
  var wrap: js.Object = js.native
}

object general {
  @scala.inline
  def apply(
    after: js.Object,
    augment: js.Object,
    before: js.Object,
    `override`: js.Object,
    shuffle: js.Object,
    tap: js.Object,
    wrap: js.Object
  ): general = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], augment = augment.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], shuffle = shuffle.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[general]
  }
  @scala.inline
  implicit class generalOps[Self <: general] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAugment(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("augment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBefore(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverride(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShuffle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTap(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrap(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

