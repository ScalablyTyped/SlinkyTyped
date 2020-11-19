package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object s3BatchMod {
  
  type S3BatchCallback = typingsSlinky.awsLambda.handlerMod.Callback[typingsSlinky.awsLambda.s3BatchMod.S3BatchResult]
  
  type S3BatchHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.s3BatchMod.S3BatchEvent, 
    typingsSlinky.awsLambda.s3BatchMod.S3BatchResult
  ]
}
