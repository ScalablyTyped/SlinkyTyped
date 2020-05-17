package typingsSlinky.gun.mod.Gun

import typingsSlinky.gun.anon.Bucket
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * options['module name'] allows you to pass options to a 3rd party module.
  * Their project README will likely list the exposed options
  * https://github.com/amark/gun/wiki/Modules
  */
/* Inlined std.Partial<{  file  :string,   web  :any,   s3  :{  key  :any,   secret  :any,   bucket  :any},   peers  :std.Record<string, {}>,   radisk  :boolean,   localStorage  :boolean, uuid (): string, [key: string] : any}> */
@js.native
trait ConstructorOptions extends js.Object {
  var file: js.UndefOr[String] = js.native
  var localStorage: js.UndefOr[Boolean] = js.native
  var peers: js.UndefOr[Record[String, js.Object]] = js.native
  var radisk: js.UndefOr[Boolean] = js.native
  var s3: js.UndefOr[Bucket] = js.native
  var uuid: js.UndefOr[js.Function0[String]] = js.native
  var web: js.UndefOr[js.Any] = js.native
}

object ConstructorOptions {
  @scala.inline
  def apply(): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptions]
  }
  @scala.inline
  implicit class ConstructorOptionsOps[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withPeers(value: Record[String, js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peers")(js.undefined)
        ret
    }
    @scala.inline
    def withRadisk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radisk")(js.undefined)
        ret
    }
    @scala.inline
    def withS3(value: Bucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(js.undefined)
        ret
    }
    @scala.inline
    def withUuid(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
    @scala.inline
    def withWeb(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(js.undefined)
        ret
    }
  }
  
}

