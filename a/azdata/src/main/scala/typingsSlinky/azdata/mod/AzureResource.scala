package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AzureResource extends js.Object
@JSImport("azdata", "AzureResource")
@js.native
object AzureResource extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AzureResource with Double] = js.native
  
  @js.native
  sealed trait ResourceManagement extends AzureResource
  /* 0 */ @js.native
  object ResourceManagement extends TopLevel[ResourceManagement with Double]
  
  @js.native
  sealed trait Sql extends AzureResource
  /* 1 */ @js.native
  object Sql extends TopLevel[Sql with Double]
}
