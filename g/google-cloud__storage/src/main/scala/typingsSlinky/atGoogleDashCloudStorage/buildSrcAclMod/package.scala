package typingsSlinky.atGoogleDashCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcAclMod {
  import typingsSlinky.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata

  type AddAclCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* acl */ js.UndefOr[AccessControlObject | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type AddAclResponse = js.Tuple2[AccessControlObject, Metadata]
  type GetAclCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* acl */ js.UndefOr[AccessControlObject | js.Array[AccessControlObject] | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetAclResponse = js.Tuple2[AccessControlObject | js.Array[AccessControlObject], Metadata]
  type RemoveAclCallback = js.Function2[/* err */ js.Error | Null, /* apiResponse */ js.UndefOr[Metadata], Unit]
  type RemoveAclResponse = js.Array[Metadata]
  type UpdateAclCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* acl */ js.UndefOr[AccessControlObject | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type UpdateAclResponse = js.Tuple2[AccessControlObject, Metadata]
}
