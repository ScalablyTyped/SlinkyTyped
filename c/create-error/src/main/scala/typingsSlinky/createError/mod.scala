package typingsSlinky.createError

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("create-error", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): Error[Error[js.Error]] = js.native
  def apply[T /* <: Error[Error[js.Error]] */](Target: Error[Error[js.Error]]): T = js.native
  def apply[T /* <: Error[Error[js.Error]] */](Target: Error[Error[js.Error]], name: js.UndefOr[scala.Nothing], properties: js.Any): T = js.native
  def apply[T /* <: Error[Error[js.Error]] */](Target: Error[Error[js.Error]], name: String): T = js.native
  def apply[T /* <: Error[Error[js.Error]] */](Target: Error[Error[js.Error]], name: String, properties: js.Any): T = js.native
  def apply[T /* <: Error[Error[js.Error]] */](name: String): T = js.native
  def apply[T /* <: Error[Error[js.Error]] */](name: String, properties: js.Any): T = js.native
  
  @js.native
  trait Error[T /* <: js.Error */]
    extends typingsSlinky.std.Error
       with Instantiable0[T]
       with Instantiable1[/* message */ String, T]
       with Instantiable2[js.UndefOr[/* message */ String], /* obj */ js.Any, T]
  
  type Err = js.Error
}
