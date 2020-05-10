package typingsSlinky.jupyterlabApputils.tokensMod.IThemeManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a theme.
  */
@js.native
trait ITheme extends js.Object {
  /**
    * Whether the theme is light or dark. Downstream authors
    * of extensions can use this information to customize their
    * UI depending upon the current theme.
    */
  var isLight: Boolean = js.native
  /**
    * The display name of the theme.
    */
  var name: String = js.native
  /**
    * Whether the theme includes styling for the scrollbar.
    * If set to false, this theme will leave the native scrollbar untouched.
    */
  var themeScrollbars: js.UndefOr[Boolean] = js.native
  /**
    * Load the theme.
    *
    * @returns A promise that resolves when the theme has loaded.
    */
  def load(): js.Promise[Unit] = js.native
  /**
    * Unload the theme.
    *
    * @returns A promise that resolves when the theme has unloaded.
    */
  def unload(): js.Promise[Unit] = js.native
}

object ITheme {
  @scala.inline
  def apply(isLight: Boolean, load: () => js.Promise[Unit], name: String, unload: () => js.Promise[Unit]): ITheme = {
    val __obj = js.Dynamic.literal(isLight = isLight.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), name = name.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload))
    __obj.asInstanceOf[ITheme]
  }
  @scala.inline
  implicit class IThemeOps[Self <: ITheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnload(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withThemeScrollbars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeScrollbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeScrollbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeScrollbars")(js.undefined)
        ret
    }
  }
  
}

