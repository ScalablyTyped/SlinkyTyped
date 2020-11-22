package typingsSlinky.cfnResponse.mod

import typingsSlinky.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceEvent
import typingsSlinky.awsLambda.handlerMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cfn-response", "send")
@js.native
object send extends js.Object {
  
  def apply(event: CloudFormationCustomResourceEvent, context: Context, responseStatus: ResponseStatus): Unit = js.native
  def apply(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.UndefOr[scala.Nothing],
    physicalResourceId: js.UndefOr[scala.Nothing],
    noEcho: Boolean
  ): Unit = js.native
  def apply(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.UndefOr[scala.Nothing],
    physicalResourceId: String
  ): Unit = js.native
  def apply(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.UndefOr[scala.Nothing],
    physicalResourceId: String,
    noEcho: Boolean
  ): Unit = js.native
  def apply(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object
  ): Unit = js.native
  def apply(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: js.UndefOr[scala.Nothing],
    noEcho: Boolean
  ): Unit = js.native
  def apply(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: String
  ): Unit = js.native
  def apply(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: String,
    noEcho: Boolean
  ): Unit = js.native
}
