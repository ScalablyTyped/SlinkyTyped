package typingsSlinky.googleCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcIamMod {
  type GetPolicyCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.RequestCallback[typingsSlinky.googleCloudPubsub.srcIamMod.Policy, scala.Unit]
  type GetPolicyResponse = js.Array[typingsSlinky.googleCloudPubsub.srcIamMod.Policy]
  type IamPermissionsMap = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type SetPolicyCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.RequestCallback[typingsSlinky.googleCloudPubsub.srcIamMod.Policy, scala.Unit]
  type SetPolicyResponse = js.Array[typingsSlinky.googleCloudPubsub.srcIamMod.Policy]
  type TestIamPermissionsCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.ResourceCallback[
    typingsSlinky.googleCloudPubsub.srcIamMod.IamPermissionsMap, 
    typingsSlinky.googleCloudPubsub.iamMod.google.iam.v1.ITestIamPermissionsResponse
  ]
  type TestIamPermissionsResponse = js.Tuple2[
    typingsSlinky.googleCloudPubsub.srcIamMod.IamPermissionsMap, 
    typingsSlinky.googleCloudPubsub.iamMod.google.iam.v1.ITestIamPermissionsResponse
  ]
}
