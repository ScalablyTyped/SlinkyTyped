package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeManager extends js.Object {
  // Managing Enabled Themes
  /** Returns an Array of strings all the active theme names. */
  def getActiveThemeNames(): js.UndefOr[js.Array[String]] = js.native
  /** Returns an Array of all the active themes. */
  def getActiveThemes(): js.UndefOr[js.Array[Package]] = js.native
  // Managing Enabled Themes
  /** Get the enabled theme names from the config. */
  def getEnabledThemeNames(): js.Array[String] = js.native
  // Accessing Loaded Themes
  /** Returns an Array of strings of all the loaded theme names. */
  def getLoadedThemeNames(): js.UndefOr[js.Array[String]] = js.native
  /** Returns an Array of all the loaded themes. */
  def getLoadedThemes(): js.UndefOr[js.Array[Package]] = js.native
  // Event Subscription
  /**
    *  Invoke callback when style sheet changes associated with updating the
    *  list of active themes have completed.
    */
  def onDidChangeActiveThemes(callback: js.Function0[Unit]): Disposable = js.native
}

object ThemeManager {
  @scala.inline
  def apply(
    getActiveThemeNames: () => js.UndefOr[js.Array[String]],
    getActiveThemes: () => js.UndefOr[js.Array[Package]],
    getEnabledThemeNames: () => js.Array[String],
    getLoadedThemeNames: () => js.UndefOr[js.Array[String]],
    getLoadedThemes: () => js.UndefOr[js.Array[Package]],
    onDidChangeActiveThemes: js.Function0[Unit] => Disposable
  ): ThemeManager = {
    val __obj = js.Dynamic.literal(getActiveThemeNames = js.Any.fromFunction0(getActiveThemeNames), getActiveThemes = js.Any.fromFunction0(getActiveThemes), getEnabledThemeNames = js.Any.fromFunction0(getEnabledThemeNames), getLoadedThemeNames = js.Any.fromFunction0(getLoadedThemeNames), getLoadedThemes = js.Any.fromFunction0(getLoadedThemes), onDidChangeActiveThemes = js.Any.fromFunction1(onDidChangeActiveThemes))
    __obj.asInstanceOf[ThemeManager]
  }
  @scala.inline
  implicit class ThemeManagerOps[Self <: ThemeManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetActiveThemeNames(value: () => js.UndefOr[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveThemeNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetActiveThemes(value: () => js.UndefOr[js.Array[Package]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveThemes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnabledThemeNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnabledThemeNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLoadedThemeNames(value: () => js.UndefOr[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoadedThemeNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLoadedThemes(value: () => js.UndefOr[js.Array[Package]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoadedThemes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDidChangeActiveThemes(value: js.Function0[Unit] => Disposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidChangeActiveThemes")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

