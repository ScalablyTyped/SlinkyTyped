package typingsSlinky.gatsbyImage.withIEPolyfillMod

import typingsSlinky.gatsbyImage.gatsbyImageStrings.`scale-down`
import typingsSlinky.gatsbyImage.gatsbyImageStrings.contain
import typingsSlinky.gatsbyImage.gatsbyImageStrings.cover
import typingsSlinky.gatsbyImage.gatsbyImageStrings.fill
import typingsSlinky.gatsbyImage.gatsbyImageStrings.none
import typingsSlinky.gatsbyImage.mod.GatsbyImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbyImageWithIEPolyfillProps extends GatsbyImageProps {
  var objectFit: js.UndefOr[fill | contain | cover | none | `scale-down`] = js.native
  var objectPosition: js.UndefOr[String] = js.native
}

object GatsbyImageWithIEPolyfillProps {
  @scala.inline
  def apply(): GatsbyImageWithIEPolyfillProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatsbyImageWithIEPolyfillProps]
  }
  @scala.inline
  implicit class GatsbyImageWithIEPolyfillPropsOps[Self <: GatsbyImageWithIEPolyfillProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectFit(value: fill | contain | cover | none | `scale-down`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectFit")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectPosition")(js.undefined)
        ret
    }
  }
  
}

