package typingsSlinky.openui5.global.sap.m

import typingsSlinky.openui5.sap.ui.core.Control
import typingsSlinky.openui5.sap.ui.core.RenderManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BackgroundHelper {
  
  /**
    * Adds CSS classes and styles to the given RenderManager, depending on the given configuration for
    * background color and background image.To be called by control renderers supporting the global
    * themable background image within their root tag, before they call writeClasses() and writeStyles().
    * @param rm the RenderManager
    * @param sBgColor a configured custom background color for the control, if any
    * @param sBgImgUrl the configured custom background image for the control, if any
    */
  @JSGlobal("sap.m.BackgroundHelper.addBackgroundColorStyles")
  @js.native
  def addBackgroundColorStyles(rm: RenderManager): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.addBackgroundColorStyles")
  @js.native
  def addBackgroundColorStyles(rm: RenderManager, sBgColor: js.UndefOr[scala.Nothing], sBgImgUrl: js.Any): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.addBackgroundColorStyles")
  @js.native
  def addBackgroundColorStyles(rm: RenderManager, sBgColor: String): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.addBackgroundColorStyles")
  @js.native
  def addBackgroundColorStyles(rm: RenderManager, sBgColor: String, sBgImgUrl: js.Any): Unit = js.native
  
  /**
    * Renders an HTML tag into the given RenderManager which carries the background image which is either
    * configured and given or coming from the current theme.Should be called right after the opening root
    * tag has been completed, so this is the first child element inside the control.
    * @param rm the RenderManager
    * @param oControl the control within which the tag will be rendered; its ID will be used to generate
    * the element ID
    * @param vCssClass a css class or an array of css classes to add to the element
    * @param sBgImgUrl the image of a configured background image; if this is not given, the theme
    * background will be used and also the other settings are ignored.
    * @param bRepeat whether the background image should be repeated/tiled (or stretched)
    * @param fOpacity the background image opacity, if any
    */
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(rm: js.Any, oControl: Control, vCssClass: String): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: Control,
    vCssClass: String,
    sBgImgUrl: js.UndefOr[scala.Nothing],
    bRepeat: js.UndefOr[scala.Nothing],
    fOpacity: Double
  ): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: Control,
    vCssClass: String,
    sBgImgUrl: js.UndefOr[scala.Nothing],
    bRepeat: Boolean
  ): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: Control,
    vCssClass: String,
    sBgImgUrl: js.UndefOr[scala.Nothing],
    bRepeat: Boolean,
    fOpacity: Double
  ): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(rm: js.Any, oControl: Control, vCssClass: String, sBgImgUrl: js.Any): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: Control,
    vCssClass: String,
    sBgImgUrl: js.Any,
    bRepeat: js.UndefOr[scala.Nothing],
    fOpacity: Double
  ): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(rm: js.Any, oControl: Control, vCssClass: String, sBgImgUrl: js.Any, bRepeat: Boolean): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: Control,
    vCssClass: String,
    sBgImgUrl: js.Any,
    bRepeat: Boolean,
    fOpacity: Double
  ): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(rm: js.Any, oControl: Control, vCssClass: js.Array[String]): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: Control,
    vCssClass: js.Array[String],
    sBgImgUrl: js.UndefOr[scala.Nothing],
    bRepeat: js.UndefOr[scala.Nothing],
    fOpacity: Double
  ): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: Control,
    vCssClass: js.Array[String],
    sBgImgUrl: js.UndefOr[scala.Nothing],
    bRepeat: Boolean
  ): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: Control,
    vCssClass: js.Array[String],
    sBgImgUrl: js.UndefOr[scala.Nothing],
    bRepeat: Boolean,
    fOpacity: Double
  ): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(rm: js.Any, oControl: Control, vCssClass: js.Array[String], sBgImgUrl: js.Any): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: Control,
    vCssClass: js.Array[String],
    sBgImgUrl: js.Any,
    bRepeat: js.UndefOr[scala.Nothing],
    fOpacity: Double
  ): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(rm: js.Any, oControl: Control, vCssClass: js.Array[String], sBgImgUrl: js.Any, bRepeat: Boolean): Unit = js.native
  @JSGlobal("sap.m.BackgroundHelper.renderBackgroundImageTag")
  @js.native
  def renderBackgroundImageTag(
    rm: js.Any,
    oControl: Control,
    vCssClass: js.Array[String],
    sBgImgUrl: js.Any,
    bRepeat: Boolean,
    fOpacity: Double
  ): Unit = js.native
}
