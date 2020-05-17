package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SUM
  - typingsSlinky.awsSdk.awsSdkStrings.MAX
  - typingsSlinky.awsSdk.awsSdkStrings.AVG
  - java.lang.String
*/
trait Statistic extends js.Object

object Statistic {
  @scala.inline
  def SUM: typingsSlinky.awsSdk.awsSdkStrings.SUM = "SUM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUM]
  @scala.inline
  def MAX: typingsSlinky.awsSdk.awsSdkStrings.MAX = "MAX".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MAX]
  @scala.inline
  def AVG: typingsSlinky.awsSdk.awsSdkStrings.AVG = "AVG".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AVG]
  @scala.inline
  implicit def apply(value: String): Statistic = value.asInstanceOf[Statistic]
}

