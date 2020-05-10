package typingsSlinky.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeStaticDefaultsCoreThemes extends js.Object {
  /**
    * the location of all jstree themes - only used if `url` is set to `true`
    * @name $.jstree.defaults.core.themes.dir
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * a boolean indicating if connecting dots are shown
    * @name $.jstree.defaults.core.themes.dots
    */
  var dots: js.UndefOr[Boolean] = js.native
  /**
    * a boolean indicating if node ellipsis should be shown - this only works with a fixed with on the container
    * @name $.jstree.defaults.core.themes.ellipsis
    */
  var ellipsis: js.UndefOr[Boolean] = js.native
  /**
    * a boolean indicating if node icons are shown
    * @name $.jstree.defaults.core.themes.icons
    */
  var icons: js.UndefOr[Boolean] = js.native
  /**
    * the name of the theme to use (if left as `false` the default theme is used)
    * @name $.jstree.defaults.core.themes.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * a boolean specifying if a reponsive version of the theme should kick in on smaller screens (if the theme supports it).
    * Defaults to `false`.
    * @name $.jstree.defaults.core.themes.responsive
    */
  var responsive: js.UndefOr[Boolean] = js.native
  /**
    * a boolean indicating if the tree background is striped
    * @name $.jstree.defaults.core.themes.stripes
    */
  var stripes: js.UndefOr[Boolean] = js.native
  /**
    * the URL of the theme's CSS file, leave this as `false` if you have manually included the theme CSS (recommended).
    * You can set this to `true` too which will try to autoload the theme.
    * @name $.jstree.defaults.core.themes.url
    */
  var url: js.UndefOr[String] = js.native
  /**
    * a string (or boolean `false`) specifying the theme variant to use (if the theme supports variants)
    * @name $.jstree.defaults.core.themes.variant
    */
  var variant: js.UndefOr[js.Any] = js.native
}

object JSTreeStaticDefaultsCoreThemes {
  @scala.inline
  def apply(): JSTreeStaticDefaultsCoreThemes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSTreeStaticDefaultsCoreThemes]
  }
  @scala.inline
  implicit class JSTreeStaticDefaultsCoreThemesOps[Self <: JSTreeStaticDefaultsCoreThemes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withStripes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripes")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withVariant(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(js.undefined)
        ret
    }
  }
  
}

