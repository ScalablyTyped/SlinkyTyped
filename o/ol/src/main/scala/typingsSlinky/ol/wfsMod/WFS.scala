package typingsSlinky.ol.wfsMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WFS
  extends typingsSlinky.ol.xmlfeatureMod.default {
  
  def getFeatureType(): js.Array[String] | String = js.native
  
  def readFeatureCollectionMetadata(source: String): FeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadata(source: js.Object): FeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadata(source: Document): FeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadata(source: Element): FeatureCollectionMetadata = js.native
  
  def readFeatureCollectionMetadataFromDocument(doc: Document): FeatureCollectionMetadata = js.native
  
  def readFeatureCollectionMetadataFromNode(node: Element): FeatureCollectionMetadata = js.native
  
  def readTransactionResponse(source: String): TransactionResponse = js.native
  def readTransactionResponse(source: js.Object): TransactionResponse = js.native
  def readTransactionResponse(source: Document): TransactionResponse = js.native
  def readTransactionResponse(source: Element): TransactionResponse = js.native
  
  def readTransactionResponseFromDocument(doc: Document): TransactionResponse = js.native
  
  def readTransactionResponseFromNode(node: Element): TransactionResponse = js.native
  
  def setFeatureType(): Unit = js.native
  def setFeatureType(featureType: String): Unit = js.native
  def setFeatureType(featureType: js.Array[String]): Unit = js.native
  
  def writeGetFeature(options: WriteGetFeatureOptions): Node = js.native
  
  def writeTransaction(
    inserts: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
    updates: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
    deletes: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
    options: WriteTransactionOptions
  ): Node = js.native
}
