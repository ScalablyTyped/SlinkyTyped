package typingsSlinky.ckeditor.CKEDITOR

import typingsSlinky.ckeditor.CKEDITOR.filter.allowedContentRules
import typingsSlinky.ckeditor.CKEDITOR.filter.contentRule
import typingsSlinky.ckeditor.CKEDITOR.filter.disallowedContentRules
import typingsSlinky.ckeditor.CKEDITOR.filter.transformation
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.element
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.fragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait filter_ extends js.Object {
  val allowedContent: js.Array[allowedContentRules] = js.native
  val customConfig: Boolean = js.native
  val disabled: Boolean = js.native
  val disallowedContent: js.Array[_] = js.native
  val editor: typingsSlinky.ckeditor.CKEDITOR.editor = js.native
  val elementCallbacks: js.Array[js.Function1[/* element */ element, Double]] = js.native
  val id: Double = js.native
  def addContentForms(forms: js.Array[_]): Unit = js.native
  def addElementCallback(callback: js.Function1[/* element */ element, Double]): Unit = js.native
  def addFeature(feature: feature): Boolean = js.native
  def addTransformations(transformations: js.Array[js.Array[String | transformation]]): Unit = js.native
  def allow(newRules: allowedContentRules): Boolean = js.native
  def allow(newRules: allowedContentRules, featureName: String): Boolean = js.native
  def allow(newRules: allowedContentRules, featureName: String, overrideCustom: Boolean): Boolean = js.native
  def applyTo(fragment: element): Boolean = js.native
  def applyTo(fragment: element, toHtml: Boolean): Boolean = js.native
  def applyTo(fragment: element, toHtml: Boolean, transformOnly: Boolean): Boolean = js.native
  def applyTo(fragment: element, toHtml: Boolean, transformOnly: Boolean, enterMode: Double): Boolean = js.native
  def applyTo(fragment: fragment): Boolean = js.native
  def applyTo(fragment: fragment, toHtml: Boolean): Boolean = js.native
  def applyTo(fragment: fragment, toHtml: Boolean, transformOnly: Boolean): Boolean = js.native
  def applyTo(fragment: fragment, toHtml: Boolean, transformOnly: Boolean, enterMode: Double): Boolean = js.native
  def check(test: contentRule): Boolean = js.native
  def check(test: contentRule, applyTransformations: Boolean): Boolean = js.native
  def check(test: contentRule, applyTransformations: Boolean, strictCheck: Boolean): Boolean = js.native
  def checkFeature(feature: feature): Boolean = js.native
  def destroy(): Unit = js.native
  def disable(): Unit = js.native
  def disallow(newRules: disallowedContentRules): Unit = js.native
  def getAllowedEnterMode(defaultMode: Double): Double = js.native
  def getAllowedEnterMode(defaultMode: Double, reverse: Boolean): Double = js.native
}

