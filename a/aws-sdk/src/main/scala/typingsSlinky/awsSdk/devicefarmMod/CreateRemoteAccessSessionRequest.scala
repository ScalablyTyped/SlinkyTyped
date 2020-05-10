package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRemoteAccessSessionRequest extends js.Object {
  /**
    * Unique identifier for the client. If you want access to multiple devices on the same client, you should pass the same clientId value in each call to CreateRemoteAccessSession. This identifier is required only if remoteDebugEnabled is set to true. Remote debugging is no longer supported.
    */
  var clientId: js.UndefOr[ClientId] = js.native
  /**
    * The configuration information for the remote access session request.
    */
  var configuration: js.UndefOr[CreateRemoteAccessSessionConfiguration] = js.native
  /**
    * The ARN of the device for which you want to create a remote access session.
    */
  var deviceArn: AmazonResourceName = js.native
  /**
    * The Amazon Resource Name (ARN) of the device instance for which you want to create a remote access session.
    */
  var instanceArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The interaction mode of the remote access session. Valid values are:   INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You cannot run XCUITest framework-based tests in this mode.   NO_VIDEO: You are connected to the device, but cannot interact with it or view the screen. This mode has the fastest test execution speed. You can run XCUITest framework-based tests in this mode.   VIDEO_ONLY: You can view the screen, but cannot touch or rotate it. You can run XCUITest framework-based tests and watch the screen in this mode.  
    */
  var interactionMode: js.UndefOr[InteractionMode] = js.native
  /**
    * The name of the remote access session to create.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
    */
  var projectArn: AmazonResourceName = js.native
  /**
    * Set to true if you want to access devices remotely for debugging in your remote access session. Remote debugging is no longer supported.
    */
  var remoteDebugEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) for the app to be recorded in the remote access session.
    */
  var remoteRecordAppArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * Set to true to enable remote recording for the remote access session.
    */
  var remoteRecordEnabled: js.UndefOr[Boolean] = js.native
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information on how Device Farm modifies your uploads during tests, see Do you modify my app? 
    */
  var skipAppResign: js.UndefOr[Boolean] = js.native
  /**
    * Ignored. The public key of the ssh key pair you want to use for connecting to remote devices in your remote debugging session. This key is required only if remoteDebugEnabled is set to true. Remote debugging is no longer supported.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.native
}

object CreateRemoteAccessSessionRequest {
  @scala.inline
  def apply(deviceArn: AmazonResourceName, projectArn: AmazonResourceName): CreateRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(deviceArn = deviceArn.asInstanceOf[js.Any], projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRemoteAccessSessionRequest]
  }
  @scala.inline
  implicit class CreateRemoteAccessSessionRequestOps[Self <: CreateRemoteAccessSessionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectArn")(value.asInstanceOf[js.Any])
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
    def withConfiguration(value: CreateRemoteAccessSessionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
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
    def withSkipAppResign(value: Boolean): Self = {
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
    def withSshPublicKey(value: SshPublicKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshPublicKey")(js.undefined)
        ret
    }
  }
  
}

