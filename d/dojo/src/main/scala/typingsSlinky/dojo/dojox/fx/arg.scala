package typingsSlinky.dojo.dojox.fx

import typingsSlinky.dojo.AnonCssClass
import typingsSlinky.dojo.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/fx/_arg.html
  *
  *
  */
@js.native
trait arg extends js.Object {
  /**
    * The odd way to document object parameters.
    *
    * @param args
    */
  def ShadowResizeArgs(args: js.Object): AnonX = js.native
  /**
    * The node and CSS class to use for style manipulations.
    *
    * @param args
    */
  def StyleArgs(args: js.Object): AnonCssClass = js.native
}

object arg {
  @scala.inline
  def apply(ShadowResizeArgs: js.Object => AnonX, StyleArgs: js.Object => AnonCssClass): arg = {
    val __obj = js.Dynamic.literal(ShadowResizeArgs = js.Any.fromFunction1(ShadowResizeArgs), StyleArgs = js.Any.fromFunction1(StyleArgs))
    __obj.asInstanceOf[arg]
  }
  @scala.inline
  implicit class argOps[Self <: arg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShadowResizeArgs(value: js.Object => AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowResizeArgs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyleArgs(value: js.Object => AnonCssClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StyleArgs")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

