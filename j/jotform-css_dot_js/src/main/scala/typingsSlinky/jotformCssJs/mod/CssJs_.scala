package typingsSlinky.jotformCssJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssJs_ extends js.Object {
  
  def applyNamespacing(parsedCss: String, prefix: String): CssJs_ = js.native
  /**
    * Given css string or objectArray, parses it and then for every selector,
    * prepends this.cssPreviewNamespace to prevent css collision issues
    * @returns object in which this css prepended
    */
  def applyNamespacing(parsedCss: CssJs_, prefix: String): CssJs_ = js.native
  
  /**
    * Filter outs rule objects whose type param equal to DELETED
    * @param rules array of rules
    */
  def compactRules(rules: js.Array[String]): js.Array[String] = js.native
  
  /**
    * Compresses given cssObjectArray and tries to minimize selector redundence
    */
  def compressCSS(cssObject: CssJs_): CssJs_ = js.native
  
  /**
    * @returns diff css object contains changed values in css1 in regards to css2, false if same
    */
  def cssDiff(css1: CssJs_, css2: CssJs_): Boolean = js.native
  
  /**
    * deletes cssObjects having given selector, and returns new array
    */
  def deleteBySelector(cssObject: CssJs_, selector: String): CssJs_ = js.native
  
  /**
    * Finds styles that have given selector, compress them and returns them
    */
  def findBySelector(cssObject: CssJs_, selector: String): CssJs_ = js.native
  def findBySelector(cssObject: CssJs_, selector: String, contains: Boolean): CssJs_ = js.native
  
  /**
    * returns the rule having given directive
    */
  def findCorrespondingRule(rules: String, directive: String): String | Boolean = js.native
  def findCorrespondingRule(rules: String, directive: String, value: String): String | Boolean = js.native
  
  /**
    * Computes string for ace editor using this.css or given cssBase optional parameter
    */
  def getCSSForEditor(parsedCss: CssJs_): String = js.native
  def getCSSForEditor(parsedCss: CssJs_, depth: Double): String = js.native
  
  /**
    * Given rules array, returns visually formatted css string to be used inside editor
    */
  def getCSSOfRules(rules: String): String = js.native
  
  /**
    * inserts new css objects into a bigger css object with same selectors grouped together
    * @param cssObject array of bigger css object to be pushed into
    * @param minimalObject single css object
    * @param reverse reverse [optional] default is false, if given, cssObject will be reversly traversed
    * resulting more priority in minimalObject's styles
    */
  def intelligentCSSPush(cssObject: CssJs_, minimalObject: CssJs_): Unit = js.native
  def intelligentCSSPush(cssObject: CssJs_, minimalObject: CssJs_, reverse: Boolean): Unit = js.native
  
  /**
    * @param cssObject target css object array
    * @param newArray source array that will be pushed into cssObject parameter
    * @param reverse [optional], if given true, first parameter will be traversed on reversed order
    * effectively giving priority to the styles in newArray
    */
  def intelligentMerge(cssObject: CssJs_, newArray: CssJs_): Unit = js.native
  def intelligentMerge(cssObject: CssJs_, newArray: CssJs_, reverse: Boolean): Unit = js.native
  
  /**
    * Parses given css string, and returns css object
    * keys as selectors and values are css rules
    * eliminates all css comments before parsing
    * @param css string to be parsed
    * @returns css object
    */
  def parseCSS(css: String): CssJs_ = js.native
  
  /**
    * parses given string containing css directives
    * @param rules, css directive string eg color:white; font-size:18px;
    * @returns an array of objects containing ruleName:ruleValue pairs
    */
  def parseRules(rules: String): js.Array[_] = js.native
  
  /**
    * @param css the original css string to be stripped out of comments
    * @returns cleaned CSS containing no css comments
    */
  def stripComments(css: String): String = js.native
}
