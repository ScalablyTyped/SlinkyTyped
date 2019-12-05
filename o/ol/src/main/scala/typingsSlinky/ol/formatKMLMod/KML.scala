package typingsSlinky.ol.formatKMLMod

import typingsSlinky.std.Document
import typingsSlinky.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KML
  extends typingsSlinky.ol.formatXMLFeatureMod.default {
  def readName(source: String): js.UndefOr[String] = js.native
  def readName(source: Document): js.UndefOr[String] = js.native
  def readName(source: Element): js.UndefOr[String] = js.native
  def readNameFromDocument(doc: org.scalajs.dom.raw.Document): js.UndefOr[String] = js.native
  def readNameFromNode(node: org.scalajs.dom.raw.Element): js.UndefOr[String] = js.native
  def readNetworkLinks(source: String): js.Array[js.Object] = js.native
  def readNetworkLinks(source: Document): js.Array[js.Object] = js.native
  def readNetworkLinks(source: Element): js.Array[js.Object] = js.native
  def readNetworkLinksFromDocument(doc: org.scalajs.dom.raw.Document): js.Array[js.Object] = js.native
  def readNetworkLinksFromNode(node: org.scalajs.dom.raw.Element): js.Array[js.Object] = js.native
  def readRegion(source: String): js.Array[js.Object] = js.native
  def readRegion(source: Document): js.Array[js.Object] = js.native
  def readRegion(source: Element): js.Array[js.Object] = js.native
  def readRegionFromDocument(doc: org.scalajs.dom.raw.Document): js.Array[js.Object] = js.native
  def readRegionFromNode(node: org.scalajs.dom.raw.Element): js.Array[js.Object] = js.native
}

