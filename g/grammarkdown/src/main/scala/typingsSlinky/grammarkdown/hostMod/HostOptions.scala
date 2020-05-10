package typingsSlinky.grammarkdown.hostMod

import typingsSlinky.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostOptions extends HostBaseOptions {
  var readFile: js.UndefOr[
    js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      js.Promise[String]
    ]
  ] = js.native
  var readFileSync: js.UndefOr[
    js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      String
    ]
  ] = js.native
  var writeFile: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* content */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      js.Promise[Unit]
    ]
  ] = js.native
  var writeFileSync: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* content */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      Unit
    ]
  ] = js.native
}

object HostOptions {
  @scala.inline
  def apply(): HostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostOptions]
  }
  @scala.inline
  implicit class HostOptionsOps[Self <: HostOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadFile(
      value: js.ThisFunction2[
          /* this */ scala.Nothing, 
          /* file */ String, 
          /* cancellationToken */ js.UndefOr[CancellationToken], 
          js.Promise[String]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.undefined)
        ret
    }
    @scala.inline
    def withReadFileSync(
      value: js.ThisFunction2[
          /* this */ scala.Nothing, 
          /* file */ String, 
          /* cancellationToken */ js.UndefOr[CancellationToken], 
          String
        ]
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
    def withWriteFile(
      value: js.ThisFunction3[
          /* this */ scala.Nothing, 
          /* file */ String, 
          /* content */ String, 
          /* cancellationToken */ js.UndefOr[CancellationToken], 
          js.Promise[Unit]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFile")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteFileSync(
      value: js.ThisFunction3[
          /* this */ scala.Nothing, 
          /* file */ String, 
          /* content */ String, 
          /* cancellationToken */ js.UndefOr[CancellationToken], 
          Unit
        ]
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

