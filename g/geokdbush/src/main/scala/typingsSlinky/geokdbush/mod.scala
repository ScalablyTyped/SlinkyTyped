package typingsSlinky.geokdbush

import typingsSlinky.kdbush.mod.KDBush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geokdbush", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def around[T](index: KDBush[T], longitude: Double, latitude: Double): js.Array[T] = js.native
  def around[T](
    index: KDBush[T],
    longitude: Double,
    latitude: Double,
    maxResults: js.UndefOr[scala.Nothing],
    maxDistance: js.UndefOr[scala.Nothing],
    filterFn: js.Any
  ): js.Array[T] = js.native
  def around[T](
    index: KDBush[T],
    longitude: Double,
    latitude: Double,
    maxResults: js.UndefOr[scala.Nothing],
    maxDistance: Double
  ): js.Array[T] = js.native
  def around[T](
    index: KDBush[T],
    longitude: Double,
    latitude: Double,
    maxResults: js.UndefOr[scala.Nothing],
    maxDistance: Double,
    filterFn: js.Any
  ): js.Array[T] = js.native
  def around[T](index: KDBush[T], longitude: Double, latitude: Double, maxResults: Double): js.Array[T] = js.native
  def around[T](
    index: KDBush[T],
    longitude: Double,
    latitude: Double,
    maxResults: Double,
    maxDistance: js.UndefOr[scala.Nothing],
    filterFn: js.Any
  ): js.Array[T] = js.native
  def around[T](index: KDBush[T], longitude: Double, latitude: Double, maxResults: Double, maxDistance: Double): js.Array[T] = js.native
  def around[T](
    index: KDBush[T],
    longitude: Double,
    latitude: Double,
    maxResults: Double,
    maxDistance: Double,
    filterFn: js.Any
  ): js.Array[T] = js.native
  
  def distance(longitude1: Double, latitude1: Double, longitude2: Double, latitude2: Double): Double = js.native
}
