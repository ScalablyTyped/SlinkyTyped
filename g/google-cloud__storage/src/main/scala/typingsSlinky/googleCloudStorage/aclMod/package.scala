package typingsSlinky.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aclMod {
  type AddAclCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* acl */ js.UndefOr[typingsSlinky.googleCloudStorage.aclMod.AccessControlObject | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type AddAclResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.aclMod.AccessControlObject, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type GetAclCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* acl */ js.UndefOr[
      typingsSlinky.googleCloudStorage.aclMod.AccessControlObject | js.Array[typingsSlinky.googleCloudStorage.aclMod.AccessControlObject] | scala.Null
    ], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetAclResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.aclMod.AccessControlObject | js.Array[typingsSlinky.googleCloudStorage.aclMod.AccessControlObject], 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type RemoveAclCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type RemoveAclResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  type UpdateAclCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* acl */ js.UndefOr[typingsSlinky.googleCloudStorage.aclMod.AccessControlObject | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type UpdateAclResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.aclMod.AccessControlObject, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
