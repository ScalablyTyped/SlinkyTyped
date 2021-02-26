package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AzureResource extends StObject
@JSImport("azdata", "AzureResource")
@js.native
object AzureResource extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AzureResource with Double] = js.native
  
  @js.native
  sealed trait AzureDevOps extends AzureResource
  /* 6 */ val AzureDevOps: typingsSlinky.azdata.mod.AzureResource.AzureDevOps with Double = js.native
  
  @js.native
  sealed trait AzureKeyVault extends AzureResource
  /* 3 */ val AzureKeyVault: typingsSlinky.azdata.mod.AzureResource.AzureKeyVault with Double = js.native
  
  @js.native
  sealed trait Graph extends AzureResource
  /* 4 */ val Graph: typingsSlinky.azdata.mod.AzureResource.Graph with Double = js.native
  
  @js.native
  sealed trait MicrosoftResourceManagement extends AzureResource
  /* 5 */ val MicrosoftResourceManagement: typingsSlinky.azdata.mod.AzureResource.MicrosoftResourceManagement with Double = js.native
  
  @js.native
  sealed trait OssRdbms extends AzureResource
  /* 2 */ val OssRdbms: typingsSlinky.azdata.mod.AzureResource.OssRdbms with Double = js.native
  
  @js.native
  sealed trait ResourceManagement extends AzureResource
  /* 0 */ val ResourceManagement: typingsSlinky.azdata.mod.AzureResource.ResourceManagement with Double = js.native
  
  @js.native
  sealed trait Sql extends AzureResource
  /* 1 */ val Sql: typingsSlinky.azdata.mod.AzureResource.Sql with Double = js.native
}
