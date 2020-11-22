package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.enumsMod.Region
import typingsSlinky.pulumiAws.outputMod.config.AssumeRole
import typingsSlinky.pulumiAws.outputMod.config.Endpoints
import typingsSlinky.pulumiAws.outputMod.config.IgnoreTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/config", JSImport.Namespace)
@js.native
object configMod extends js.Object {
  
  var accessKey: js.UndefOr[String] = js.native
  
  var allowedAccountIds: js.UndefOr[js.Array[String]] = js.native
  
  var assumeRole: js.UndefOr[AssumeRole] = js.native
  
  var endpoints: js.UndefOr[js.Array[Endpoints]] = js.native
  
  var forbiddenAccountIds: js.UndefOr[js.Array[String]] = js.native
  
  var ignoreTags: js.UndefOr[IgnoreTags] = js.native
  
  var insecure: js.UndefOr[Boolean] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var profile: js.UndefOr[String] = js.native
  
  var region: js.UndefOr[Region] = js.native
  
  def requireRegion(): Region = js.native
  
  var s3ForcePathStyle: js.UndefOr[Boolean] = js.native
  
  var secretKey: js.UndefOr[String] = js.native
  
  var sharedCredentialsFile: js.UndefOr[String] = js.native
  
  var skipCredentialsValidation: js.UndefOr[Boolean] = js.native
  
  var skipGetEc2Platforms: js.UndefOr[Boolean] = js.native
  
  var skipMetadataApiCheck: js.UndefOr[Boolean] = js.native
  
  var skipRegionValidation: js.UndefOr[Boolean] = js.native
  
  var skipRequestingAccountId: js.UndefOr[Boolean] = js.native
  
  var token: js.UndefOr[String] = js.native
}
