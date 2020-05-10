package typingsSlinky.phonon.Phonon_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononNavigatorOptions extends js.Object {
  var animatePages: js.UndefOr[Boolean] = js.native
  var defaultPage: js.UndefOr[String] = js.native
  var defaultTemplateExtension: js.UndefOr[String] = js.native
  var enableBrowserBackButton: js.UndefOr[Boolean] = js.native
  var hashPrefix: js.UndefOr[String] = js.native
  var templateRootDirectory: js.UndefOr[String] = js.native
  var useHash: js.UndefOr[Boolean] = js.native
}

object PhononNavigatorOptions {
  @scala.inline
  def apply(): PhononNavigatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhononNavigatorOptions]
  }
  @scala.inline
  implicit class PhononNavigatorOptionsOps[Self <: PhononNavigatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimatePages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatePages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimatePages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatePages")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPage")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTemplateExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTemplateExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTemplateExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTemplateExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBrowserBackButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBrowserBackButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableBrowserBackButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBrowserBackButton")(js.undefined)
        ret
    }
    @scala.inline
    def withHashPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateRootDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateRootDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateRootDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateRootDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHash")(js.undefined)
        ret
    }
  }
  
}

