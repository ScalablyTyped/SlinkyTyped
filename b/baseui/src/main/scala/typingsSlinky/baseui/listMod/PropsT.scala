package typingsSlinky.baseui.listMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsT extends js.Object {
  var artwork: js.UndefOr[TagMod[Any]] = js.native
  var artworkSize: js.UndefOr[ArtworkSizesT] = js.native
  var children: TagMod[Any] = js.native
  var endEnhancer: js.UndefOr[TagMod[Any]] = js.native
  var overrides: js.UndefOr[OverridesT] = js.native
  var sublist: js.UndefOr[Boolean] = js.native
}

object PropsT {
  @scala.inline
  def apply(): PropsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsT]
  }
  @scala.inline
  implicit class PropsTOps[Self <: PropsT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtworkReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtwork(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artwork")(js.undefined)
        ret
    }
    @scala.inline
    def withArtworkSize(value: ArtworkSizesT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artworkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtworkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artworkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withEndEnhancerReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEnhancer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndEnhancer(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEnhancer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: OverridesT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withSublist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSublist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublist")(js.undefined)
        ret
    }
  }
  
}

