package typingsSlinky.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupOptions extends IObjectOptions {
  /**
  	 * Indicates if click, mouseover, mouseout events & hoverCursor should also check for subtargets
  	 * @type Boolean
  	 */
  var subTargetCheck: js.UndefOr[Boolean] = js.native
  /**
  	 * setOnGroup is a method used for TextBox that is no more used since 2.0.0 The behavior is still
  	 * available setting this boolean to true.
  	 * @type Boolean
  	 * @since 2.0.0
  	 * @default
  	 */
  var useSetOnGroup: js.UndefOr[Boolean] = js.native
}

object IGroupOptions {
  @scala.inline
  def apply(): IGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupOptions]
  }
  @scala.inline
  implicit class IGroupOptionsOps[Self <: IGroupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubTargetCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTargetCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubTargetCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTargetCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSetOnGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSetOnGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSetOnGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSetOnGroup")(js.undefined)
        ret
    }
  }
  
}

