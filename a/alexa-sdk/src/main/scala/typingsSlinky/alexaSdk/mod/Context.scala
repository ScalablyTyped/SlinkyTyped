package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var AudioPlayer: js.UndefOr[typingsSlinky.alexaSdk.mod.AudioPlayer] = js.native
  var System: js.UndefOr[typingsSlinky.alexaSdk.mod.System] = js.native
  var awsRequestId: String = js.native
  var callbackWaitsForEmptyEventLoop: Boolean = js.native
  var functionName: String = js.native
  var functionVersion: String = js.native
  var invokeid: String = js.native
  var logGroupName: String = js.native
  var logStreamName: String = js.native
  var memoryLimitInMB: String = js.native
}

object Context {
  @scala.inline
  def apply(
    awsRequestId: String,
    callbackWaitsForEmptyEventLoop: Boolean,
    functionName: String,
    functionVersion: String,
    invokeid: String,
    logGroupName: String,
    logStreamName: String,
    memoryLimitInMB: String
  ): Context = {
    val __obj = js.Dynamic.literal(awsRequestId = awsRequestId.asInstanceOf[js.Any], callbackWaitsForEmptyEventLoop = callbackWaitsForEmptyEventLoop.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any], invokeid = invokeid.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any], logStreamName = logStreamName.asInstanceOf[js.Any], memoryLimitInMB = memoryLimitInMB.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackWaitsForEmptyEventLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackWaitsForEmptyEventLoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvokeid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemoryLimitInMB(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryLimitInMB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioPlayer(value: AudioPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioPlayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioPlayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioPlayer")(js.undefined)
        ret
    }
    @scala.inline
    def withSystem(value: System): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("System")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("System")(js.undefined)
        ret
    }
  }
  
}

