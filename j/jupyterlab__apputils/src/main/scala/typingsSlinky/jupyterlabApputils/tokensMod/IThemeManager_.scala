package typingsSlinky.jupyterlabApputils.tokensMod

import typingsSlinky.jupyterlabApputils.tokensMod.IThemeManager.ITheme
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemeManager_ extends js.Object {
  /**
    * Get the name of the current theme.
    */
  val theme: String | Null = js.native
  /**
    * A signal fired when the application theme changes.
    */
  val themeChanged: ISignal[this.type, IChangedArgs[String, String]] = js.native
  /**
    * The names of the registered themes.
    */
  val themes: js.Array[String] = js.native
  /**
    * Test whether a given theme is light.
    */
  def isLight(name: String): Boolean = js.native
  /**
    * Load a theme CSS file by path.
    *
    * @param path - The path of the file to load.
    */
  def loadCSS(path: String): js.Promise[Unit] = js.native
  /**
    * Register a theme with the theme manager.
    *
    * @param theme - The theme to register.
    *
    * @returns A disposable that can be used to unregister the theme.
    */
  def register(theme: ITheme): IDisposable = js.native
  /**
    * Set the current theme.
    */
  def setTheme(name: String): js.Promise[Unit] = js.native
  /**
    * Test whether a given theme styles scrollbars,
    * and if the user has scrollbar styling enabled.
    */
  def themeScrollbars(name: String): Boolean = js.native
}

object IThemeManager_ {
  @scala.inline
  def apply(
    isLight: String => Boolean,
    loadCSS: String => js.Promise[Unit],
    register: ITheme => IDisposable,
    setTheme: String => js.Promise[Unit],
    themeChanged: ISignal[IThemeManager_, IChangedArgs[String, String]],
    themeScrollbars: String => Boolean,
    themes: js.Array[String]
  ): IThemeManager_ = {
    val __obj = js.Dynamic.literal(isLight = js.Any.fromFunction1(isLight), loadCSS = js.Any.fromFunction1(loadCSS), register = js.Any.fromFunction1(register), setTheme = js.Any.fromFunction1(setTheme), themeChanged = themeChanged.asInstanceOf[js.Any], themeScrollbars = js.Any.fromFunction1(themeScrollbars), themes = themes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeManager_]
  }
  @scala.inline
  implicit class IThemeManager_Ops[Self <: IThemeManager_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLight(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadCSS(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadCSS")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegister(value: ITheme => IDisposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTheme(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTheme")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThemeChanged(value: ISignal[IThemeManager_, IChangedArgs[String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeScrollbars(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeScrollbars")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThemes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(null)
        ret
    }
  }
  
}

