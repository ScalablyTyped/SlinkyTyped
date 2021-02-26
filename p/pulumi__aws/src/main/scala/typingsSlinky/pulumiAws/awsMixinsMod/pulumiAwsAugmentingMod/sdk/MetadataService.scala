package typingsSlinky.pulumiAws.awsMixinsMod.pulumiAwsAugmentingMod.sdk

import typingsSlinky.awsSdk.metadataServiceMod.MetadataServiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "sdk.MetadataService")
@js.native
/**
  * Creates a new MetadataService object with a given set of options.
  */
class MetadataService ()
  extends typingsSlinky.awsSdk.mod.MetadataService {
  def this(options: MetadataServiceOptions) = this()
}
/* static members */
object MetadataService {
  
  @JSImport("@pulumi/aws", "sdk.MetadataService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 169.254.169.254
    */
  @JSImport("@pulumi/aws", "sdk.MetadataService.host")
  @js.native
  def host: String = js.native
  @scala.inline
  def host_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("host")(x.asInstanceOf[js.Any])
}
