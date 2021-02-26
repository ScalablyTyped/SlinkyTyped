package typingsSlinky.mockAwsS3.mod

import typingsSlinky.awsSdk.credentialsMod.CredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mock-aws-s3", "Credentials")
@js.native
class Credentials protected ()
  extends typingsSlinky.awsSdk.mod.Credentials {
  /**
    * Creates a Credentials object with a given set of credential information as an options hash.
    *
    * @param {object} options - An option hash containing a set of credential information.
    */
  def this(options: CredentialsOptions) = this()
  /**
    * Creates a Credentials object with a given set of credential information as positional arguments.
    *          *
    * @param {string} accessKeyId - The AWS access key ID.
    * @param {string} secretAccessKey - The AWS secret access key.
    * @param {string} sessionToken - The optional AWS session token.
    */
  def this(accessKeyId: String, secretAccessKey: String) = this()
  def this(accessKeyId: String, secretAccessKey: String, sessionToken: String) = this()
}
/* static members */
object Credentials {
  
  @JSImport("mock-aws-s3", "Credentials")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mock-aws-s3", "Credentials.expiryWindow")
  @js.native
  def expiryWindow: Double = js.native
  @scala.inline
  def expiryWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expiryWindow")(x.asInstanceOf[js.Any])
}
