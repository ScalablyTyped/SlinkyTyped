package typingsSlinky.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisRestApi.arcgisRestApiStrings.esriGeometryPoint
  - typingsSlinky.arcgisRestApi.arcgisRestApiStrings.esriGeometryMultipoint
  - typingsSlinky.arcgisRestApi.arcgisRestApiStrings.esriGeometryPolyline
  - typingsSlinky.arcgisRestApi.arcgisRestApiStrings.esriGeometryPolygon
  - typingsSlinky.arcgisRestApi.arcgisRestApiStrings.esriGeometryEnvelope
*/
trait esriGeometryType extends js.Object

object esriGeometryType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def esriGeometryEnvelope: typingsSlinky.arcgisRestApi.arcgisRestApiStrings.esriGeometryEnvelope = this.cast("esriGeometryEnvelope")
  @scala.inline
  def esriGeometryMultipoint: typingsSlinky.arcgisRestApi.arcgisRestApiStrings.esriGeometryMultipoint = this.cast("esriGeometryMultipoint")
  @scala.inline
  def esriGeometryPoint: typingsSlinky.arcgisRestApi.arcgisRestApiStrings.esriGeometryPoint = this.cast("esriGeometryPoint")
  @scala.inline
  def esriGeometryPolygon: typingsSlinky.arcgisRestApi.arcgisRestApiStrings.esriGeometryPolygon = this.cast("esriGeometryPolygon")
  @scala.inline
  def esriGeometryPolyline: typingsSlinky.arcgisRestApi.arcgisRestApiStrings.esriGeometryPolyline = this.cast("esriGeometryPolyline")
}

