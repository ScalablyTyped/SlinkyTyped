package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codebuildCloudwatchStateMod {
  type CodeBuildCloudWatchStateHandler = typingsSlinky.awsLambda.eventbridgeMod.EventBridgeHandler[
    typingsSlinky.awsLambda.awsLambdaStrings.`CodeBuild Build State Change`, 
    typingsSlinky.awsLambda.codebuildCloudwatchStateMod.CodeBuildStateEventDetail, 
    scala.Unit
  ]
}
