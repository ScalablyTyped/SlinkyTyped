package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CODECOMMIT
  - typingsSlinky.awsSdk.awsSdkStrings.CODEPIPELINE
  - typingsSlinky.awsSdk.awsSdkStrings.GITHUB
  - typingsSlinky.awsSdk.awsSdkStrings.S3
  - typingsSlinky.awsSdk.awsSdkStrings.BITBUCKET
  - typingsSlinky.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE
  - typingsSlinky.awsSdk.awsSdkStrings.NO_SOURCE
  - java.lang.String
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  def CODECOMMIT: typingsSlinky.awsSdk.awsSdkStrings.CODECOMMIT = "CODECOMMIT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CODECOMMIT]
  @scala.inline
  def CODEPIPELINE: typingsSlinky.awsSdk.awsSdkStrings.CODEPIPELINE = "CODEPIPELINE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CODEPIPELINE]
  @scala.inline
  def GITHUB: typingsSlinky.awsSdk.awsSdkStrings.GITHUB = "GITHUB".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GITHUB]
  @scala.inline
  def S3: typingsSlinky.awsSdk.awsSdkStrings.S3 = "S3".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.S3]
  @scala.inline
  def BITBUCKET: typingsSlinky.awsSdk.awsSdkStrings.BITBUCKET = "BITBUCKET".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BITBUCKET]
  @scala.inline
  def GITHUB_ENTERPRISE: typingsSlinky.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE = "GITHUB_ENTERPRISE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE]
  @scala.inline
  def NO_SOURCE: typingsSlinky.awsSdk.awsSdkStrings.NO_SOURCE = "NO_SOURCE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NO_SOURCE]
  @scala.inline
  implicit def apply(value: java.lang.String): SourceType = value.asInstanceOf[SourceType]
}

