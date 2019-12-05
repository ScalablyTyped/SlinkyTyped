package typingsSlinky.ol.formatWFSMod

import org.scalajs.dom.raw.Node
import typingsSlinky.std.Document
import typingsSlinky.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WFS
  extends typingsSlinky.ol.formatXMLFeatureMod.default {
  def getFeatureType(): js.UndefOr[js.Array[String] | String] = js.native
  def readFeatureCollectionMetadata(source: String): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readFeatureCollectionMetadata(source: js.Object): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readFeatureCollectionMetadata(source: Document): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readFeatureCollectionMetadata(source: Element): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readFeatureCollectionMetadataFromDocument(doc: org.scalajs.dom.raw.Document): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readFeatureCollectionMetadataFromNode(node: org.scalajs.dom.raw.Element): js.UndefOr[FeatureCollectionMetadata] = js.native
  def readTransactionResponse(source: String): js.UndefOr[TransactionResponse] = js.native
  def readTransactionResponse(source: js.Object): js.UndefOr[TransactionResponse] = js.native
  def readTransactionResponse(source: Document): js.UndefOr[TransactionResponse] = js.native
  def readTransactionResponse(source: Element): js.UndefOr[TransactionResponse] = js.native
  def readTransactionResponseFromDocument(doc: org.scalajs.dom.raw.Document): js.UndefOr[TransactionResponse] = js.native
  def readTransactionResponseFromNode(node: org.scalajs.dom.raw.Element): js.UndefOr[TransactionResponse] = js.native
  def setFeatureType(): Unit = js.native
  def setFeatureType(featureType: String): Unit = js.native
  def setFeatureType(featureType: js.Array[String]): Unit = js.native
  def writeGetFeature(options: WriteGetFeatureOptions): Node = js.native
  def writeTransaction(
    inserts: js.Array[typingsSlinky.ol.featureMod.default],
    updates: js.Array[typingsSlinky.ol.featureMod.default],
    deletes: js.Array[typingsSlinky.ol.featureMod.default],
    options: WriteTransactionOptions
  ): Node = js.native
}

