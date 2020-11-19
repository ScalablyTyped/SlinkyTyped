package typingsSlinky.ol.kmlMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KML
  extends typingsSlinky.ol.xmlfeatureMod.default {
  
  def readName(source: String): String = js.native
  def readName(source: Document): String = js.native
  def readName(source: Element): String = js.native
  
  def readNameFromDocument(doc: Document): String = js.native
  
  def readNameFromNode(node: Element): String = js.native
  
  def readNetworkLinks(source: String): js.Array[js.Object] = js.native
  def readNetworkLinks(source: Document): js.Array[js.Object] = js.native
  def readNetworkLinks(source: Element): js.Array[js.Object] = js.native
  
  def readNetworkLinksFromDocument(doc: Document): js.Array[js.Object] = js.native
  
  def readNetworkLinksFromNode(node: Element): js.Array[js.Object] = js.native
  
  def readRegion(source: String): js.Array[js.Object] = js.native
  def readRegion(source: Document): js.Array[js.Object] = js.native
  def readRegion(source: Element): js.Array[js.Object] = js.native
  
  def readRegionFromDocument(doc: Document): js.Array[js.Object] = js.native
  
  def readRegionFromNode(node: Element): js.Array[js.Object] = js.native
}
