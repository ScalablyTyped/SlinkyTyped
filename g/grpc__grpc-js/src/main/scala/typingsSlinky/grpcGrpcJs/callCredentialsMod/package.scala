package typingsSlinky.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object callCredentialsMod {
  
  type CallMetadataGenerator = js.Function2[
    /* options */ typingsSlinky.grpcGrpcJs.callCredentialsMod.CallMetadataOptions, 
    /* cb */ js.Function2[
      /* err */ js.Error | scala.Null, 
      /* metadata */ js.UndefOr[typingsSlinky.grpcGrpcJs.metadataMod.Metadata], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
