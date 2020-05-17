package typingsSlinky.materialUiCore.transitionsMod

import typingsSlinky.materialUiCore.anon.PartialDuration
import typingsSlinky.materialUiCore.anon.PartialEasing
import typingsSlinky.materialUiCore.anon.Partialdurationnumberstri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionsOptions extends js.Object {
  var create: js.UndefOr[
    js.Function2[
      /* props */ String | js.Array[String], 
      /* options */ js.UndefOr[Partialdurationnumberstri], 
      String
    ]
  ] = js.native
  var duration: js.UndefOr[PartialDuration] = js.native
  var easing: js.UndefOr[PartialEasing] = js.native
  var getAutoHeightDuration: js.UndefOr[js.Function1[/* height */ Double, Double]] = js.native
}

object TransitionsOptions {
  @scala.inline
  def apply(): TransitionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionsOptions]
  }
  @scala.inline
  implicit class TransitionsOptionsOps[Self <: TransitionsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(
      value: (/* props */ String | js.Array[String], /* options */ js.UndefOr[Partialdurationnumberstri]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: PartialDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: PartialEasing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoHeightDuration(value: /* height */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoHeightDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAutoHeightDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoHeightDuration")(js.undefined)
        ret
    }
  }
  
}

