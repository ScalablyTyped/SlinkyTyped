package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object codepipelineMod {
  
  type ArtifactLocation = typingsSlinky.awsLambda.codepipelineMod.S3ArtifactStore
  
  type CodePipelineHandler = typingsSlinky.awsLambda.handlerMod.Handler[typingsSlinky.awsLambda.codepipelineMod.CodePipelineEvent, scala.Unit]
}
