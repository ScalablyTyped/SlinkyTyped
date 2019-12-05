package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service

import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML document.
  */
@js.native
trait Document extends js.Object {
  def addContent(content: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content): typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Document = js.native
  def addContent(
    index: Integer,
    content: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content
  ): typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Document = js.native
  def cloneContent(): js.Array[typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content] = js.native
  def detachRootElement(): Element = js.native
  def getAllContent(): js.Array[typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content] = js.native
  def getContent(index: Integer): typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content = js.native
  def getContentSize(): Integer = js.native
  def getDescendants(): js.Array[typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content] = js.native
  def getDocType(): DocType = js.native
  def getRootElement(): Element = js.native
  def hasRootElement(): Boolean = js.native
  def removeContent(): js.Array[typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content] = js.native
  def removeContent(content: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content): Boolean = js.native
  def removeContent(index: Integer): typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content = js.native
  def setDocType(docType: DocType): typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Document = js.native
  def setRootElement(element: Element): typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Document = js.native
}

