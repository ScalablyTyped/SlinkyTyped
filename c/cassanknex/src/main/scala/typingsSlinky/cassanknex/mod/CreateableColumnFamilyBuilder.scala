package typingsSlinky.cassanknex.mod

import typingsSlinky.cassanknex.cassanknexStrings.asc
import typingsSlinky.cassanknex.cassanknexStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateableColumnFamilyBuilder[T] extends StObject {
  
  def withCaching(): this.type = js.native
  
  @JSName("withClusteringOrderBy")
  def withClusteringOrderBy_asc[K /* <: /* keyof T */ String */](value: K, direction: asc): this.type = js.native
  @JSName("withClusteringOrderBy")
  def withClusteringOrderBy_desc[K /* <: /* keyof T */ String */](value: K, direction: desc): this.type = js.native
  
  def withCompaction(): this.type = js.native
  
  def withCompression(): this.type = js.native
}
