package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[
scala.Double | typingsSlinky.arcgisJsApi.esri.Geometry_ | typingsSlinky.arcgisJsApi.esri.Graphic]
  - typingsSlinky.arcgisJsApi.esri.Geometry_
  - typingsSlinky.arcgisJsApi.esri.Collection[
typingsSlinky.arcgisJsApi.esri.Geometry_ | typingsSlinky.arcgisJsApi.esri.Graphic]
  - typingsSlinky.arcgisJsApi.esri.Graphic
  - typingsSlinky.arcgisJsApi.esri.Camera
  - typingsSlinky.arcgisJsApi.esri.Viewpoint
  - js.Any
*/
trait GoToTarget3D extends js.Object

object GoToTarget3D {
  @scala.inline
  implicit def apply(value: js.Any): GoToTarget3D = value.asInstanceOf[GoToTarget3D]
  @scala.inline
  implicit def apply(value: js.Array[Double | Geometry_ | Graphic]): GoToTarget3D = value.asInstanceOf[GoToTarget3D]
  @scala.inline
  implicit def apply(value: Camera): GoToTarget3D = value.asInstanceOf[GoToTarget3D]
  @scala.inline
  implicit def apply(value: Collection[Geometry_ | Graphic]): GoToTarget3D = value.asInstanceOf[GoToTarget3D]
  @scala.inline
  implicit def apply(value: Geometry_): GoToTarget3D = value.asInstanceOf[GoToTarget3D]
  @scala.inline
  implicit def apply(value: Graphic): GoToTarget3D = value.asInstanceOf[GoToTarget3D]
  @scala.inline
  implicit def apply(value: Viewpoint): GoToTarget3D = value.asInstanceOf[GoToTarget3D]
}

