package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteAccessSession extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the remote access session.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The billing method of the remote access session. Possible values include METERED or UNMETERED. For more information about metered devices, see AWS Device Farm terminology.
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.native
  /**
    * Unique identifier of your client for the remote access session. Only returned if remote debugging is enabled for the remote access session. Remote debugging is no longer supported.
    */
  var clientId: js.UndefOr[ClientId] = js.native
  /**
    * The date and time the remote access session was created.
    */
  var created: js.UndefOr[js.Date] = js.native
  /**
    * The device (phone or tablet) used in the remote access session.
    */
  var device: js.UndefOr[Device] = js.native
  /**
    * The number of minutes a device is used in a remote access session (including setup and teardown minutes).
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.native
  /**
    * Unique device identifier for the remote device. Only returned if remote debugging is enabled for the remote access session. Remote debugging is no longer supported.
    */
  var deviceUdid: js.UndefOr[String] = js.native
  /**
    * The endpoint for the remote access sesssion.
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * IP address of the EC2 host where you need to connect to remotely debug devices. Only returned if remote debugging is enabled for the remote access session. Remote debugging is no longer supported.
    */
  var hostAddress: js.UndefOr[HostAddress] = js.native
  /**
    * The ARN of the instance.
    */
  var instanceArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The interaction mode of the remote access session. Valid values are:   INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You cannot run XCUITest framework-based tests in this mode.   NO_VIDEO: You are connected to the device, but cannot interact with it or view the screen. This mode has the fastest test execution speed. You can run XCUITest framework-based tests in this mode.   VIDEO_ONLY: You can view the screen, but cannot touch or rotate it. You can run XCUITest framework-based tests and watch the screen in this mode.  
    */
  var interactionMode: js.UndefOr[InteractionMode] = js.native
  /**
    * A message about the remote access session.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * The name of the remote access session.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * This flag is set to true if remote debugging is enabled for the remote access session. Remote debugging is no longer supported.
    */
  var remoteDebugEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The ARN for the app to be recorded in the remote access session.
    */
  var remoteRecordAppArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * This flag is set to true if remote recording is enabled for the remote access session.
    */
  var remoteRecordEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The result of the remote access session. Can be any of the following:   PENDING.   PASSED.   WARNED.   FAILED.   SKIPPED.   ERRORED.   STOPPED.  
    */
  var result: js.UndefOr[ExecutionResult] = js.native
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.native
  /**
    * The date and time the remote access session was started.
    */
  var started: js.UndefOr[js.Date] = js.native
  /**
    * The status of the remote access session. Can be any of the following:   PENDING.   PENDING_CONCURRENCY.   PENDING_DEVICE.   PROCESSING.   SCHEDULING.   PREPARING.   RUNNING.   COMPLETED.   STOPPING.  
    */
  var status: js.UndefOr[ExecutionStatus] = js.native
  /**
    * The date and time the remote access session was stopped.
    */
  var stopped: js.UndefOr[js.Date] = js.native
}

object RemoteAccessSession {
  @scala.inline
  def apply(): RemoteAccessSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAccessSession]
  }
  @scala.inline
  implicit class RemoteAccessSessionOps[Self <: RemoteAccessSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingMethod(value: BillingMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: ClientId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: Device): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceMinutes(value: DeviceMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceUdid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceUdid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceUdid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceUdid")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withHostAddress(value: HostAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractionMode(value: InteractionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteDebugEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteDebugEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteDebugEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteDebugEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteRecordAppArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteRecordAppArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteRecordAppArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteRecordAppArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteRecordEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteRecordEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteRecordEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteRecordEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: ExecutionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipAppResign(value: SkipAppResign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAppResign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipAppResign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAppResign")(js.undefined)
        ret
    }
    @scala.inline
    def withStarted(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStopped(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(js.undefined)
        ret
    }
  }
  
}

