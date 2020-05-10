package typingsSlinky.grammarkdown.hostMod

import typingsSlinky.grammarkdown.grammarkdownBooleans.`false`
import typingsSlinky.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncHostOptions extends HostBaseOptions {
  var readFileSync: js.UndefOr[
    (js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      String
    ]) | `false`
  ] = js.native
  var writeFileSync: js.UndefOr[
    (js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* content */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      Unit
    ]) | `false`
  ] = js.native
}

object SyncHostOptions {
  @scala.inline
  def apply(): SyncHostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncHostOptions]
  }
  @scala.inline
  implicit class SyncHostOptionsOps[Self <: SyncHostOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadFileSync(
      value: (js.ThisFunction2[
          /* this */ scala.Nothing, 
          /* file */ String, 
          /* cancellationToken */ js.UndefOr[CancellationToken], 
          String
        ]) | `false`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFileSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadFileSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFileSync")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteFileSync(
      value: (js.ThisFunction3[
          /* this */ scala.Nothing, 
          /* file */ String, 
          /* content */ String, 
          /* cancellationToken */ js.UndefOr[CancellationToken], 
          Unit
        ]) | `false`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFileSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteFileSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFileSync")(js.undefined)
        ret
    }
  }
  
}

