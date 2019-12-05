package typingsSlinky.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KeyManagementServiceClient {
  import typingsSlinky.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKey
  import typingsSlinky.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyRing

  type CreateCryptoKeyCallback = js.Function2[
    /* err */ js.Error | Null, 
    /* apiResponse */ js.Tuple3[CryptoKey, js.Any, js.Any], 
    Unit
  ]
  type CreateKeyRingCallback = js.Function2[
    /* err */ js.Error | Null, 
    /* apiResponse */ js.Tuple3[KeyRing, js.Any, js.Any], 
    Unit
  ]
  type DecryptCallback = js.Function2[
    /* err */ js.Error | Null, 
    /* apiResponse */ js.Tuple3[DecryptResponse, js.Any, js.Any], 
    Unit
  ]
  type EncryptCallback = js.Function2[
    /* err */ js.Error | Null, 
    /* apiResponse */ js.Tuple3[EncryptResponse, js.Any, js.Any], 
    Unit
  ]
  type ListCryptoKeysCallback = js.Function2[
    /* err */ js.Error | Null, 
    /* apiResponse */ js.Tuple3[js.Array[CryptoKey], js.Any, js.Any], 
    Unit
  ]
  type ListKeyRingsCallback = js.Function2[
    /* err */ js.Error | Null, 
    /* apiResponse */ js.Tuple3[js.Array[KeyRing], js.Any, js.Any], 
    Unit
  ]
}
