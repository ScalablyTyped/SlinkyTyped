package typingsSlinky.dojo.dojox.html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/html/styles.html
  *
  *
  */
@js.native
trait styles_ extends js.Object {
  /**
    *
    */
  var entities: js.Object = js.native
  /**
    *
    */
  var `ext-dojo`: js.Object = js.native
  /**
    *
    */
  var metrics: js.Object = js.native
  /**
    * Getter/Setter
    * If passed a title, enables a that style sheet. All other
    * toggle-able style sheets are disabled.
    * If no argument is passed, returns currently enabled
    * style sheet.
    *
    * @param title               Optional
    */
  def activeStyleSheet(title: String): Unit = js.native
  /**
    * Disables the dynamic style sheet with the name passed in the
    * argument. If no arg is passed, defaults to the default style sheet.
    *
    * @param styleSheetName
    */
  def disableStyleSheet(styleSheetName: String): Unit = js.native
  /**
    * Enables the style sheet with the name passed in the
    * argument. Deafults to the default style sheet.
    *
    * @param styleSheetName
    */
  def enableStyleSheet(styleSheetName: String): Unit = js.native
  /**
    * Creates and returns a dynamically created style sheet
    * used for dynamic styles
    *
    * @param styleSheetName               OptionalThe name given the style sheet so that multiplestyle sheets can be created and referenced. Ifno argument is given, the name "default" is used.
    */
  def getDynamicStyleSheet(styleSheetName: String): js.Any = js.native
  /**
    * Returns the style sheet that was initially enabled
    * on document launch.
    * TODO, does not work.
    *
    */
  def getPreferredStyleSheet(): Unit = js.native
  /**
    * Returns a style sheet based on the argument.
    * Searches dynamic style sheets first. If no matches,
    * searches document style sheets.
    *
    * @param styleSheetName               OptionalA title or an href to a style sheet. Title can bean attribute in a tag, or a dynamic style sheetreference. Href can be the name of the file.If no argument, the assumed created dynamic stylesheet is used.
    */
  def getStyleSheet(styleSheetName: String): Unit = js.native
  /**
    * Collects all the style sheets referenced in the HTML page,
    * including any included via @import.
    *
    */
  def getStyleSheets(): js.Any = js.native
  /**
    * Searches HTML for style sheets that are "toggle-able" -
    * can be enabled and disabled. These would include sheets
    * with the title attribute, as well as the REL attribute.
    *
    */
  def getToggledStyleSheets(): js.Any = js.native
  /**
    * Creates a style and attaches it to a dynamically created stylesheet
    *
    * @param selector A fully qualified class name, as it would appear ina CSS dojo.doc. Start classes with periods, targetnodes with '#'. Large selectors can also be createdlike:"#myDiv.myClass span input"
    * @param declaration A single string that would make up a style block, notincluding the curly braces. Include semi-colons betweenstatements. Do not use JavaScript style declarationsin camel case, use as you would in a CSS dojo.doc:"color:#ffoooo;font-size:12px;margin-left:5px;"
    * @param styleSheetName               OptionalName of the dynamic style sheet this rule should beinserted into. If is not found by that name, it iscreated. If no name is passed, the name "default" isused.
    */
  def insertCssRule(selector: String, declaration: String, styleSheetName: String): String = js.native
  /**
    * Not implemented - it seems to have some merit for changing some complex
    * selectors. It's not much use for changing simple ones like "span".
    * For now, simply write a new rule which will cascade over the first.
    *
    * Modifies an existing cssRule
    *
    * @param selector
    * @param declaration
    * @param styleSheetName
    */
  def modifyCssRule(selector: js.Any, declaration: js.Any, styleSheetName: js.Any): Unit = js.native
  /**
    * Removes a cssRule base on the selector and declaration passed
    * The declaration is needed for cases of dupe selectors
    * Only removes DYNAMICALLY created cssRules. If you
    * created it with dh.insertCssRule, it can be removed.
    *
    * @param selector
    * @param declaration
    * @param styleSheetName
    */
  def removeCssRule(selector: String, declaration: String, styleSheetName: String): Unit = js.native
}

object styles_ {
  @scala.inline
  def apply(
    activeStyleSheet: String => Unit,
    disableStyleSheet: String => Unit,
    enableStyleSheet: String => Unit,
    entities: js.Object,
    `ext-dojo`: js.Object,
    getDynamicStyleSheet: String => js.Any,
    getPreferredStyleSheet: () => Unit,
    getStyleSheet: String => Unit,
    getStyleSheets: () => js.Any,
    getToggledStyleSheets: () => js.Any,
    insertCssRule: (String, String, String) => String,
    metrics: js.Object,
    modifyCssRule: (js.Any, js.Any, js.Any) => Unit,
    removeCssRule: (String, String, String) => Unit
  ): styles_ = {
    val __obj = js.Dynamic.literal(activeStyleSheet = js.Any.fromFunction1(activeStyleSheet), disableStyleSheet = js.Any.fromFunction1(disableStyleSheet), enableStyleSheet = js.Any.fromFunction1(enableStyleSheet), entities = entities.asInstanceOf[js.Any], getDynamicStyleSheet = js.Any.fromFunction1(getDynamicStyleSheet), getPreferredStyleSheet = js.Any.fromFunction0(getPreferredStyleSheet), getStyleSheet = js.Any.fromFunction1(getStyleSheet), getStyleSheets = js.Any.fromFunction0(getStyleSheets), getToggledStyleSheets = js.Any.fromFunction0(getToggledStyleSheets), insertCssRule = js.Any.fromFunction3(insertCssRule), metrics = metrics.asInstanceOf[js.Any], modifyCssRule = js.Any.fromFunction3(modifyCssRule), removeCssRule = js.Any.fromFunction3(removeCssRule))
    __obj.updateDynamic("ext-dojo")(`ext-dojo`.asInstanceOf[js.Any])
    __obj.asInstanceOf[styles_]
  }
  @scala.inline
  implicit class styles_Ops[Self <: styles_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveStyleSheet(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStyleSheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisableStyleSheet(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyleSheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableStyleSheet(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableStyleSheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEntities(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExt-dojo`(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext-dojo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDynamicStyleSheet(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDynamicStyleSheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPreferredStyleSheet(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreferredStyleSheet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStyleSheet(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyleSheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStyleSheets(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyleSheets")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetToggledStyleSheets(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToggledStyleSheets")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertCssRule(value: (String, String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertCssRule")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMetrics(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyCssRule(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyCssRule")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemoveCssRule(value: (String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCssRule")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

