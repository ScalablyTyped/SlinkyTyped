package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonRole
  - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonKMSColonColonKey
  - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonFunction
  - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonLayerVersion
  - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonBucket
  - typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSQSColonColonQueue
  - java.lang.String
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  def AWSColonColonIAMColonColonRole: typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonRole = "AWS::IAM::Role".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonRole]
  @scala.inline
  def AWSColonColonKMSColonColonKey: typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonKMSColonColonKey = "AWS::KMS::Key".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonKMSColonColonKey]
  @scala.inline
  def AWSColonColonLambdaColonColonFunction: typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonFunction = "AWS::Lambda::Function".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonFunction]
  @scala.inline
  def AWSColonColonLambdaColonColonLayerVersion: typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonLayerVersion = "AWS::Lambda::LayerVersion".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonLayerVersion]
  @scala.inline
  def AWSColonColonS3ColonColonBucket: typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonBucket = "AWS::S3::Bucket".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonBucket]
  @scala.inline
  def AWSColonColonSQSColonColonQueue: typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSQSColonColonQueue = "AWS::SQS::Queue".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWSColonColonSQSColonColonQueue]
  @scala.inline
  implicit def apply(value: java.lang.String): ResourceType = value.asInstanceOf[ResourceType]
}

