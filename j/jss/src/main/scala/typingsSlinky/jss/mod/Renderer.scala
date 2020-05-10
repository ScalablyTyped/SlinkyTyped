package typingsSlinky.jss.mod

import org.scalajs.dom.raw.CSSRule
import org.scalajs.dom.raw.CSSRuleList
import org.scalajs.dom.raw.CSSStyleRule
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jss.jssBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  def attach(): Unit = js.native
  def deleteRule(cssRule: CSSRule): Boolean = js.native
  def deploy(sheet: StyleSheet[String | Double | js.Symbol]): Unit = js.native
  def detach(): Unit = js.native
  def getPropertyValue(cssRule: CSSStyleRule, prop: String): String = js.native
  def getPropertyValue(cssRule: HTMLElement, prop: String): String = js.native
  def getRules(): CSSRuleList | Unit = js.native
  def indexOf(cssRule: CSSRule): Double = js.native
  def insertRule(rule: Rule): `false` | CSSRule = js.native
  def removeProperty(cssRule: CSSStyleRule, prop: String): Unit = js.native
  def removeProperty(cssRule: HTMLElement, prop: String): Unit = js.native
  def replaceRule(cssRule: CSSRule, rule: Rule): `false` | CSSRule = js.native
  def setProperty(cssRule: CSSStyleRule, prop: String, value: JssValue): Boolean = js.native
  def setProperty(cssRule: HTMLElement, prop: String, value: JssValue): Boolean = js.native
  def setSelector(cssRule: CSSStyleRule, selectorText: String): Boolean = js.native
}

