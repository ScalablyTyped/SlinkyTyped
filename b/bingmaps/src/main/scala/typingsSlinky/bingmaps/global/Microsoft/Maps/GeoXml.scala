package typingsSlinky.bingmaps.global.Microsoft.Maps

import org.scalajs.dom.raw.Blob
import typingsSlinky.bingmaps.Microsoft.Maps.IGeoXmlDataSet
import typingsSlinky.bingmaps.Microsoft.Maps.IGeoXmlReadOptions
import typingsSlinky.bingmaps.Microsoft.Maps.IGeoXmlWriteOptions
import typingsSlinky.bingmaps.Microsoft.Maps.IPrimitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeoXml {
  
  @JSGlobal("Microsoft.Maps.GeoXml.read")
  @js.native
  def read(xml: String, options: IGeoXmlReadOptions): IGeoXmlDataSet = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.read")
  @js.native
  def read(xml: js.typedarray.ArrayBuffer, options: IGeoXmlReadOptions): IGeoXmlDataSet = js.native
  
  @JSGlobal("Microsoft.Maps.GeoXml.readFromUrl")
  @js.native
  def readFromUrl(
    urlString: String,
    options: IGeoXmlReadOptions,
    callback: js.Function1[/* data */ IGeoXmlDataSet, Unit]
  ): Unit = js.native
  
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive]): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(
    shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive],
    options: IGeoXmlWriteOptions
  ): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: IGeoXmlDataSet): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: IGeoXmlDataSet, options: IGeoXmlWriteOptions): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: IPrimitive): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: IPrimitive, options: IGeoXmlWriteOptions): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Layer): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Layer, options: IGeoXmlWriteOptions): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Map): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Map, options: IGeoXmlWriteOptions): String = js.native
  
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive]): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive],
    compressFormat: js.UndefOr[scala.Nothing],
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive],
    compressFormat: typingsSlinky.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat
  ): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive],
    compressFormat: typingsSlinky.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: IGeoXmlDataSet): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: IGeoXmlDataSet, compressFormat: js.UndefOr[scala.Nothing], options: IGeoXmlWriteOptions): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: IGeoXmlDataSet,
    compressFormat: typingsSlinky.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat
  ): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: IGeoXmlDataSet,
    compressFormat: typingsSlinky.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: IPrimitive): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: IPrimitive, compressFormat: js.UndefOr[scala.Nothing], options: IGeoXmlWriteOptions): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: IPrimitive, compressFormat: typingsSlinky.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: IPrimitive,
    compressFormat: typingsSlinky.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Layer): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: typingsSlinky.bingmaps.Microsoft.Maps.Layer,
    compressFormat: js.UndefOr[scala.Nothing],
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: typingsSlinky.bingmaps.Microsoft.Maps.Layer,
    compressFormat: typingsSlinky.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat
  ): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: typingsSlinky.bingmaps.Microsoft.Maps.Layer,
    compressFormat: typingsSlinky.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Map): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: typingsSlinky.bingmaps.Microsoft.Maps.Map,
    compressFormat: js.UndefOr[scala.Nothing],
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: typingsSlinky.bingmaps.Microsoft.Maps.Map,
    compressFormat: typingsSlinky.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat
  ): String | js.typedarray.ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: typingsSlinky.bingmaps.Microsoft.Maps.Map,
    compressFormat: typingsSlinky.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = js.native
}
