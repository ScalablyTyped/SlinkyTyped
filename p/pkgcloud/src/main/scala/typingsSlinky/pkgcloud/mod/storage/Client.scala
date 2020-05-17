package typingsSlinky.pkgcloud.mod.storage

import typingsSlinky.node.processMod.global.NodeJS.ReadStream
import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import typingsSlinky.pkgcloud.mod.ClientError
import typingsSlinky.pkgcloud.mod.ProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var config: ProviderOptions = js.native
  var protocol: String = js.native
  var provider: String = js.native
  def createContainer(options: js.Any, callback: js.Function2[/* err */ ClientError, /* container */ Container, _]): Unit = js.native
  def destroyContainer(containerName: String, callback: js.Function1[/* err */ ClientError, _]): Unit = js.native
  def download(options: StorageDownloadOptions): ReadStream = js.native
  def getContainer(containerName: String, callback: js.Function2[/* err */ ClientError, /* container */ Container, _]): Unit = js.native
  def getContainers(callback: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], _]): Unit = js.native
  def getFile(
    containerName: String,
    file: String,
    callback: js.Function2[/* err */ ClientError, /* file */ File, _]
  ): Unit = js.native
  def getFiles(
    containerName: String,
    callback: js.Function2[/* err */ ClientError, /* files */ js.Array[File], _]
  ): Unit = js.native
  // Logs
  def on(
    eventName: String,
    callback: js.Function2[/* message */ String, /* object */ js.UndefOr[js.Any], _]
  ): Unit = js.native
  def removeFile(containerName: String, file: String, callback: js.Function1[/* err */ ClientError, _]): Unit = js.native
  def upload(options: StorageUploadOptions): WriteStream = js.native
}

object Client {
  @scala.inline
  def apply(
    config: ProviderOptions,
    createContainer: (js.Any, js.Function2[/* err */ ClientError, /* container */ Container, _]) => Unit,
    destroyContainer: (String, js.Function1[/* err */ ClientError, _]) => Unit,
    download: StorageDownloadOptions => ReadStream,
    getContainer: (String, js.Function2[/* err */ ClientError, /* container */ Container, _]) => Unit,
    getContainers: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], _] => Unit,
    getFile: (String, String, js.Function2[/* err */ ClientError, /* file */ File, _]) => Unit,
    getFiles: (String, js.Function2[/* err */ ClientError, /* files */ js.Array[File], _]) => Unit,
    on: (String, js.Function2[/* message */ String, /* object */ js.UndefOr[js.Any], _]) => Unit,
    protocol: String,
    provider: String,
    removeFile: (String, String, js.Function1[/* err */ ClientError, _]) => Unit,
    upload: StorageUploadOptions => WriteStream
  ): Client = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], createContainer = js.Any.fromFunction2(createContainer), destroyContainer = js.Any.fromFunction2(destroyContainer), download = js.Any.fromFunction1(download), getContainer = js.Any.fromFunction2(getContainer), getContainers = js.Any.fromFunction1(getContainers), getFile = js.Any.fromFunction3(getFile), getFiles = js.Any.fromFunction2(getFiles), on = js.Any.fromFunction2(on), protocol = protocol.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], removeFile = js.Any.fromFunction3(removeFile), upload = js.Any.fromFunction1(upload))
    __obj.asInstanceOf[Client]
  }
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: ProviderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateContainer(value: (js.Any, js.Function2[/* err */ ClientError, /* container */ Container, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createContainer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDestroyContainer(value: (String, js.Function1[/* err */ ClientError, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyContainer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDownload(value: StorageDownloadOptions => ReadStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetContainer(value: (String, js.Function2[/* err */ ClientError, /* container */ Container, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetContainers(value: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFile(value: (String, String, js.Function2[/* err */ ClientError, /* file */ File, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetFiles(value: (String, js.Function2[/* err */ ClientError, /* files */ js.Array[File], _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFiles")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function2[/* message */ String, /* object */ js.UndefOr[js.Any], _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveFile(value: (String, String, js.Function1[/* err */ ClientError, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpload(value: StorageUploadOptions => WriteStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

