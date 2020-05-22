package typingsSlinky.devextreme.mod.default.viz

import typingsSlinky.devextreme.anon.BackgroundColor
import typingsSlinky.devextreme.anon.BaseColorSet
import typingsSlinky.devextreme.anon.FileName
import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
import typingsSlinky.devextreme.devextremeStrings.Default
import typingsSlinky.devextreme.devextremeStrings.Material
import typingsSlinky.devextreme.devextremeStrings.Ocean
import typingsSlinky.devextreme.devextremeStrings.Office
import typingsSlinky.devextreme.devextremeStrings.Pastel
import typingsSlinky.devextreme.devextremeStrings.Soft
import typingsSlinky.devextreme.devextremeStrings.Vintage
import typingsSlinky.devextreme.devextremeStrings.Violet
import typingsSlinky.devextreme.devextremeStrings.`Dark Moon`
import typingsSlinky.devextreme.devextremeStrings.`Dark Violet`
import typingsSlinky.devextreme.devextremeStrings.`Green Mist`
import typingsSlinky.devextreme.devextremeStrings.`Harmony Light`
import typingsSlinky.devextreme.devextremeStrings.`Soft Blue`
import typingsSlinky.devextreme.devextremeStrings.`Soft Pastel`
import typingsSlinky.devextreme.mod.DevExpress.DOMComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "viz")
@js.native
object ^ extends js.Object {
  /** @name viz.currentPalette() */
  def currentPalette(): String = js.native
  /** @name viz.currentPalette(paletteName) */
  def currentPalette(paletteName: String): Unit = js.native
  /** @name viz.currentTheme() */
  def currentTheme(): String = js.native
  /** @name viz.currentTheme(platform, colorScheme) */
  def currentTheme(platform: String, colorScheme: String): Unit = js.native
  /** @name viz.currentTheme(theme) */
  def currentTheme(theme: String): Unit = js.native
  /** @name viz.exportFromMarkup(markup, options) */
  def exportFromMarkup(markup: String, options: BackgroundColor): Unit = js.native
  /** @name viz.exportWidgets(widgetInstances) */
  def exportWidgets(widgetInstances: js.Array[js.Array[DOMComponent]]): Unit = js.native
  /** @name viz.exportWidgets(widgetInstances, options) */
  def exportWidgets(widgetInstances: js.Array[js.Array[DOMComponent]], options: FileName): Unit = js.native
  /** @name viz.generateColors(palette, count, options) */
  def generateColors(
    palette: Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office | js.Array[String],
    count: Double,
    options: BaseColorSet
  ): js.Array[String] = js.native
  /** @name viz.getMarkup(widgetInstances) */
  def getMarkup(widgetInstances: js.Array[DOMComponent]): String = js.native
  /** @name viz.getPalette(paletteName) */
  def getPalette(paletteName: String): js.Any = js.native
  /** @name viz.getTheme(theme) */
  def getTheme(theme: String): js.Any = js.native
  /** @name viz.refreshPaths() */
  def refreshPaths(): Unit = js.native
  /** @name viz.refreshTheme() */
  def refreshTheme(): Unit = js.native
  /** @name viz.registerPalette(paletteName, palette) */
  def registerPalette(paletteName: String, palette: js.Any): Unit = js.native
  /** @name viz.registerTheme(customTheme, baseTheme) */
  def registerTheme(customTheme: js.Any, baseTheme: String): Unit = js.native
}

