package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.Document
import typingsSlinky.cesium.anon.Canvas
import typingsSlinky.cesium.anon.ClampToGroundEllipsoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "KmlDataSource")
@js.native
class KmlDataSource () extends DataSource {
  def this(options: typingsSlinky.cesium.anon.Camera) = this()
  
  def load(data: String): js.Promise[KmlDataSource] = js.native
  def load(data: String, options: ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Blob): js.Promise[KmlDataSource] = js.native
  def load(data: Blob, options: ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Document): js.Promise[KmlDataSource] = js.native
  def load(data: Document, options: ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  def load(data: Resource): js.Promise[KmlDataSource] = js.native
  def load(data: Resource, options: ClampToGroundEllipsoid): js.Promise[KmlDataSource] = js.native
  
  var refreshEvent: Event[js.Array[_]] = js.native
  
  var unsupportedNodeEvent: Event[js.Array[_]] = js.native
}
object KmlDataSource {
  
  @JSImport("cesium", "KmlDataSource.load")
  @js.native
  def load(data: String): js.Promise[KmlDataSource] = js.native
  @JSImport("cesium", "KmlDataSource.load")
  @js.native
  def load(data: String, options: Canvas): js.Promise[KmlDataSource] = js.native
  @JSImport("cesium", "KmlDataSource.load")
  @js.native
  def load(data: Blob): js.Promise[KmlDataSource] = js.native
  @JSImport("cesium", "KmlDataSource.load")
  @js.native
  def load(data: Blob, options: Canvas): js.Promise[KmlDataSource] = js.native
  @JSImport("cesium", "KmlDataSource.load")
  @js.native
  def load(data: Document): js.Promise[KmlDataSource] = js.native
  @JSImport("cesium", "KmlDataSource.load")
  @js.native
  def load(data: Document, options: Canvas): js.Promise[KmlDataSource] = js.native
  /* static member */
  @JSImport("cesium", "KmlDataSource.load")
  @js.native
  def load(data: Resource): js.Promise[KmlDataSource] = js.native
  @JSImport("cesium", "KmlDataSource.load")
  @js.native
  def load(data: Resource, options: Canvas): js.Promise[KmlDataSource] = js.native
}
