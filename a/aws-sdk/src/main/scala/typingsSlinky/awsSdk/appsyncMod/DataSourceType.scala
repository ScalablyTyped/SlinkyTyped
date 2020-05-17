package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AWS_LAMBDA
  - typingsSlinky.awsSdk.awsSdkStrings.AMAZON_DYNAMODB
  - typingsSlinky.awsSdk.awsSdkStrings.AMAZON_ELASTICSEARCH
  - typingsSlinky.awsSdk.awsSdkStrings.NONE
  - typingsSlinky.awsSdk.awsSdkStrings.HTTP
  - typingsSlinky.awsSdk.awsSdkStrings.RELATIONAL_DATABASE
  - java.lang.String
*/
trait DataSourceType extends js.Object

object DataSourceType {
  @scala.inline
  def AWS_LAMBDA: typingsSlinky.awsSdk.awsSdkStrings.AWS_LAMBDA = "AWS_LAMBDA".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWS_LAMBDA]
  @scala.inline
  def AMAZON_DYNAMODB: typingsSlinky.awsSdk.awsSdkStrings.AMAZON_DYNAMODB = "AMAZON_DYNAMODB".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AMAZON_DYNAMODB]
  @scala.inline
  def AMAZON_ELASTICSEARCH: typingsSlinky.awsSdk.awsSdkStrings.AMAZON_ELASTICSEARCH = "AMAZON_ELASTICSEARCH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AMAZON_ELASTICSEARCH]
  @scala.inline
  def NONE: typingsSlinky.awsSdk.awsSdkStrings.NONE = "NONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NONE]
  @scala.inline
  def HTTP: typingsSlinky.awsSdk.awsSdkStrings.HTTP = "HTTP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTP]
  @scala.inline
  def RELATIONAL_DATABASE: typingsSlinky.awsSdk.awsSdkStrings.RELATIONAL_DATABASE = "RELATIONAL_DATABASE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RELATIONAL_DATABASE]
  @scala.inline
  implicit def apply(value: java.lang.String): DataSourceType = value.asInstanceOf[DataSourceType]
}

