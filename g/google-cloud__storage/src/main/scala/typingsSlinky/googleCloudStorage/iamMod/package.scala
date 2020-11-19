package typingsSlinky.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object iamMod {
  
  type GetPolicyCallback = js.Function3[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* acl */ js.UndefOr[typingsSlinky.googleCloudStorage.iamMod.Policy], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type GetPolicyResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.iamMod.Policy, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type SetPolicyCallback = js.Function3[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* acl */ js.UndefOr[typingsSlinky.googleCloudStorage.iamMod.Policy], 
    /* apiResponse */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  
  type SetPolicyResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.iamMod.Policy, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type TestIamPermissionsCallback = js.Function3[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* acl */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean] | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type TestIamPermissionsResponse = js.Tuple2[
    org.scalablytyped.runtime.StringDictionary[scala.Boolean], 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
