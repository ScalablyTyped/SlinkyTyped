package typingsSlinky.classValidator.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseContainerOptions extends js.Object {
  /**
    * If set to true, then default container will be used in the case if given container haven't returned anything.
    */
  var fallback: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, then default container will be used in the case if given container thrown an exception.
    */
  var fallbackOnErrors: js.UndefOr[Boolean] = js.native
}

object UseContainerOptions {
  @scala.inline
  def apply(): UseContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseContainerOptions]
  }
  @scala.inline
  implicit class UseContainerOptionsOps[Self <: UseContainerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackOnErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackOnErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackOnErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackOnErrors")(js.undefined)
        ret
    }
  }
  
}

