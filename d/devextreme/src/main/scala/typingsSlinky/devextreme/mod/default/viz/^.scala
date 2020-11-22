package typingsSlinky.devextreme.mod.default.viz

import typingsSlinky.devextreme.anon.BackgroundColor
import typingsSlinky.devextreme.anon.BaseColorSet
import typingsSlinky.devextreme.anon.FileName
import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "viz")
@js.native
object ^ extends js.Object {
  
  /**
    * [descr:viz.currentPalette()]
    */
  def currentPalette(): String = js.native
  /**
    * [descr:viz.currentPalette(paletteName)]
    */
  def currentPalette(paletteName: String): Unit = js.native
  
  /**
    * [descr:viz.currentTheme()]
    */
  def currentTheme(): String = js.native
  /**
    * [descr:viz.currentTheme(platform, colorScheme)]
    */
  def currentTheme(platform: String, colorScheme: String): Unit = js.native
  /**
    * [descr:viz.currentTheme(theme)]
    */
  def currentTheme(theme: String): Unit = js.native
  
  /**
    * [descr:viz.exportFromMarkup(markup, options)]
    */
  def exportFromMarkup(markup: String, options: BackgroundColor): Unit = js.native
  
  /**
    * [descr:viz.exportWidgets(widgetInstances)]
    */
  def exportWidgets(widgetInstances: js.Array[js.Array[DOMComponent]]): Unit = js.native
  /**
    * [descr:viz.exportWidgets(widgetInstances, options)]
    */
  def exportWidgets(widgetInstances: js.Array[js.Array[DOMComponent]], options: FileName): Unit = js.native
  
  def generateColors(palette: js.Array[String], count: Double, options: BaseColorSet): js.Array[String] = js.native
  /**
    * [descr:viz.generateColors(palette, count, options)]
    */
  @JSName("generateColors")
  def generateColors_Bright(palette: Bright, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_Carmine(palette: Carmine, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_DarkMoon(palette: `Dark Moon`, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_DarkViolet(palette: `Dark Violet`, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_GreenMist(palette: `Green Mist`, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_HarmonyLight(palette: `Harmony Light`, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_Material(palette: Material, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_Ocean(palette: Ocean, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_Office(palette: Office, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_Pastel(palette: Pastel, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_Soft(palette: Soft, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_SoftBlue(palette: `Soft Blue`, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_SoftPastel(palette: `Soft Pastel`, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_Vintage(palette: Vintage, count: Double, options: BaseColorSet): js.Array[String] = js.native
  @JSName("generateColors")
  def generateColors_Violet(palette: Violet, count: Double, options: BaseColorSet): js.Array[String] = js.native
  
  /**
    * [descr:viz.getMarkup(widgetInstances)]
    */
  def getMarkup(widgetInstances: js.Array[DOMComponent]): String = js.native
  
  /**
    * [descr:viz.getPalette(paletteName)]
    */
  def getPalette(paletteName: String): js.Any = js.native
  
  /**
    * [descr:viz.getTheme(theme)]
    */
  def getTheme(theme: String): js.Any = js.native
  
  /**
    * [descr:viz.refreshPaths()]
    */
  def refreshPaths(): Unit = js.native
  
  /**
    * [descr:viz.refreshTheme()]
    */
  def refreshTheme(): Unit = js.native
  
  /**
    * [descr:viz.registerPalette(paletteName, palette)]
    */
  def registerPalette(paletteName: String, palette: js.Any): Unit = js.native
  
  /**
    * [descr:viz.registerTheme(customTheme, baseTheme)]
    */
  def registerTheme(customTheme: js.Any, baseTheme: String): Unit = js.native
}
