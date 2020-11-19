package typingsSlinky.fineUploader.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object s3 {
  
  type BucketFunction = js.Function1[
    /* id */ scala.Double, 
    typingsSlinky.fineUploader.coreMod.PromiseOptions | java.lang.String
  ]
  
  type HostFunction = js.Function1[
    /* id */ scala.Double, 
    typingsSlinky.fineUploader.coreMod.PromiseOptions | java.lang.String
  ]
  
  type KeyFunction = js.Function1[
    /* id */ scala.Double, 
    typingsSlinky.fineUploader.coreMod.PromiseOptions | java.lang.String
  ]
  
  type OnCredentialsExpired = js.Function0[typingsSlinky.fineUploader.coreMod.PromiseOptions]
  
  type S3CustomHeaderFunction = js.Function1[/* id */ scala.Double, scala.Unit]
}
