package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NotReviewed
  - typingsSlinky.awsSdk.awsSdkStrings.MarkedForReview
  - typingsSlinky.awsSdk.awsSdkStrings.ReviewedAppropriate
  - typingsSlinky.awsSdk.awsSdkStrings.ReviewedInappropriate
  - java.lang.String
*/
trait HITReviewStatus extends js.Object

object HITReviewStatus {
  @scala.inline
  def NotReviewed: typingsSlinky.awsSdk.awsSdkStrings.NotReviewed = "NotReviewed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NotReviewed]
  @scala.inline
  def MarkedForReview: typingsSlinky.awsSdk.awsSdkStrings.MarkedForReview = "MarkedForReview".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MarkedForReview]
  @scala.inline
  def ReviewedAppropriate: typingsSlinky.awsSdk.awsSdkStrings.ReviewedAppropriate = "ReviewedAppropriate".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ReviewedAppropriate]
  @scala.inline
  def ReviewedInappropriate: typingsSlinky.awsSdk.awsSdkStrings.ReviewedInappropriate = "ReviewedInappropriate".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ReviewedInappropriate]
  @scala.inline
  implicit def apply(value: java.lang.String): HITReviewStatus = value.asInstanceOf[HITReviewStatus]
}

