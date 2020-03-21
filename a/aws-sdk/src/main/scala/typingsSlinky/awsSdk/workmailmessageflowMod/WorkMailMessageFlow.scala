package typingsSlinky.awsSdk.workmailmessageflowMod

import typingsSlinky.awsSdk.configMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkMailMessageFlow extends Service {
  @JSName("config")
  var config_WorkMailMessageFlow: ConfigBase with ClientConfiguration = js.native
  /**
    * Retrieves the raw content of an in-transit email message, in MIME format. 
    */
  def getRawMessageContent(): Request[GetRawMessageContentResponse, AWSError] = js.native
  def getRawMessageContent(callback: js.Function2[/* err */ AWSError, /* data */ GetRawMessageContentResponse, Unit]): Request[GetRawMessageContentResponse, AWSError] = js.native
  /**
    * Retrieves the raw content of an in-transit email message, in MIME format. 
    */
  def getRawMessageContent(params: GetRawMessageContentRequest): Request[GetRawMessageContentResponse, AWSError] = js.native
  def getRawMessageContent(
    params: GetRawMessageContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRawMessageContentResponse, Unit]
  ): Request[GetRawMessageContentResponse, AWSError] = js.native
}

