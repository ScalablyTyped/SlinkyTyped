package typingsSlinky.atGoogleDashCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atGoogleDashCloudPubsub.atGoogleDashCloudPubsubStrings.etag
import typingsSlinky.atGoogleDashCloudPubsub.buildProtoIamMod.google.iam.v1.IPolicy
import typingsSlinky.atGoogleDashCloudPubsub.buildProtoIamMod.google.iam.v1.ITestIamPermissionsResponse
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcIamMod.GetPolicyCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcIamMod.GetPolicyResponse
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcIamMod.IamPermissionsMap
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcIamMod.Policy
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcIamMod.SetPolicyCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcIamMod.SetPolicyResponse
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcIamMod.TestIamPermissionsCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcIamMod.TestIamPermissionsResponse
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.Omit
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.RequestCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.RequestConfig
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.ResourceCallback
import typingsSlinky.googleDashGax.buildSrcGaxMod.CallOptions
import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/iam", JSImport.Namespace)
@js.native
object buildSrcIamMod extends js.Object {
  @js.native
  class IAM protected () extends js.Object {
    def this(pubsub: PubSub, id: String) = this()
    var Promise: js.UndefOr[PromiseConstructor] = js.native
    var id: String = js.native
    var pubsub: PubSub = js.native
    @JSName("request")
    var request_Original: Fn_Callback = js.native
    def getPolicy(): js.Promise[GetPolicyResponse] = js.native
    def getPolicy(callback: GetPolicyCallback): Unit = js.native
    def getPolicy(gaxOpts: CallOptions): js.Promise[GetPolicyResponse] = js.native
    def getPolicy(gaxOpts: CallOptions, callback: GetPolicyCallback): Unit = js.native
    def request[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
    def setPolicy(policy: Policy): js.Promise[SetPolicyResponse] = js.native
    def setPolicy(policy: Policy, callback: SetPolicyCallback): Unit = js.native
    def setPolicy(policy: Policy, gaxOpts: CallOptions): js.Promise[SetPolicyResponse] = js.native
    def setPolicy(policy: Policy, gaxOpts: CallOptions, callback: SetPolicyCallback): Unit = js.native
    def testPermissions(permissions: String): js.Promise[TestIamPermissionsResponse] = js.native
    def testPermissions(permissions: String, callback: TestIamPermissionsCallback): Unit = js.native
    def testPermissions(permissions: String, gaxOpts: CallOptions): js.Promise[TestIamPermissionsResponse] = js.native
    def testPermissions(permissions: String, gaxOpts: CallOptions, callback: TestIamPermissionsCallback): Unit = js.native
    def testPermissions(permissions: js.Array[String]): js.Promise[TestIamPermissionsResponse] = js.native
    def testPermissions(permissions: js.Array[String], callback: TestIamPermissionsCallback): Unit = js.native
    def testPermissions(permissions: js.Array[String], gaxOpts: CallOptions): js.Promise[TestIamPermissionsResponse] = js.native
    def testPermissions(permissions: js.Array[String], gaxOpts: CallOptions, callback: TestIamPermissionsCallback): Unit = js.native
  }
  
  type GetPolicyCallback = RequestCallback[Policy, Unit]
  type GetPolicyResponse = js.Array[Policy]
  type IamPermissionsMap = StringDictionary[Boolean]
  type Policy = Anon_Etag with (Omit[IPolicy, etag])
  type SetPolicyCallback = RequestCallback[Policy, Unit]
  type SetPolicyResponse = js.Array[Policy]
  type TestIamPermissionsCallback = ResourceCallback[IamPermissionsMap, ITestIamPermissionsResponse]
  type TestIamPermissionsResponse = js.Tuple2[IamPermissionsMap, ITestIamPermissionsResponse]
}

