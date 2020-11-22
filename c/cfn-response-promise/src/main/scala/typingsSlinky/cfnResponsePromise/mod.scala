package typingsSlinky.cfnResponsePromise

import typingsSlinky.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceEvent
import typingsSlinky.awsLambda.handlerMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cfn-response-promise", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val FAILED: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.FAILED = js.native
  
  val SUCCESS: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS = js.native
  
  @JSName("send")
  def send_FAILED(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.FAILED
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_FAILED(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: js.UndefOr[scala.Nothing],
    physicalResourceId: js.UndefOr[scala.Nothing],
    noEcho: Boolean
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_FAILED(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: js.UndefOr[scala.Nothing],
    physicalResourceId: String
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_FAILED(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: js.UndefOr[scala.Nothing],
    physicalResourceId: String,
    noEcho: Boolean
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_FAILED(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: js.Object
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_FAILED(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: js.Object,
    physicalResourceId: js.UndefOr[scala.Nothing],
    noEcho: Boolean
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_FAILED(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: js.Object,
    physicalResourceId: String
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_FAILED(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.FAILED,
    responseData: js.Object,
    physicalResourceId: String,
    noEcho: Boolean
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_SUCCESS(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_SUCCESS(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS,
    responseData: js.UndefOr[scala.Nothing],
    physicalResourceId: js.UndefOr[scala.Nothing],
    noEcho: Boolean
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_SUCCESS(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS,
    responseData: js.UndefOr[scala.Nothing],
    physicalResourceId: String
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_SUCCESS(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS,
    responseData: js.UndefOr[scala.Nothing],
    physicalResourceId: String,
    noEcho: Boolean
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_SUCCESS(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS,
    responseData: js.Object
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_SUCCESS(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS,
    responseData: js.Object,
    physicalResourceId: js.UndefOr[scala.Nothing],
    noEcho: Boolean
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_SUCCESS(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS,
    responseData: js.Object,
    physicalResourceId: String
  ): js.Promise[Unit] = js.native
  @JSName("send")
  def send_SUCCESS(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: typingsSlinky.cfnResponsePromise.cfnResponsePromiseStrings.SUCCESS,
    responseData: js.Object,
    physicalResourceId: String,
    noEcho: Boolean
  ): js.Promise[Unit] = js.native
}
