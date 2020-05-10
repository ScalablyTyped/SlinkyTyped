package typingsSlinky.nodeSsh.mod

import typingsSlinky.ssh2Streams.mod.TransferOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDirectoryOptions extends js.Object {
  var concurrency: js.UndefOr[Double] = js.native
  var recursive: js.UndefOr[Boolean] = js.native
  var sftp: js.UndefOr[SFTP] = js.native
  var sftpOptions: js.UndefOr[TransferOptions] = js.native
  var tick: js.UndefOr[
    js.Function3[
      /* localPath */ String, 
      /* remotePath */ String, 
      /* error */ js.UndefOr[js.Error | Null], 
      Unit
    ]
  ] = js.native
  var validate: js.UndefOr[js.Function1[/* localPath */ String, Boolean]] = js.native
}

object PutDirectoryOptions {
  @scala.inline
  def apply(): PutDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutDirectoryOptions]
  }
  @scala.inline
  implicit class PutDirectoryOptionsOps[Self <: PutDirectoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(js.undefined)
        ret
    }
    @scala.inline
    def withSftp(value: SFTP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sftp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSftp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sftp")(js.undefined)
        ret
    }
    @scala.inline
    def withSftpOptions(value: TransferOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sftpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSftpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sftpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTick(
      value: (/* localPath */ String, /* remotePath */ String, /* error */ js.UndefOr[js.Error | Null]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: /* localPath */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

