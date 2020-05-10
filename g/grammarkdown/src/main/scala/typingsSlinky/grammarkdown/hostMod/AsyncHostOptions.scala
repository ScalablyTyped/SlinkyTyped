package typingsSlinky.grammarkdown.hostMod

import typingsSlinky.grammarkdown.grammarkdownBooleans.`false`
import typingsSlinky.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncHostOptions extends HostBaseOptions {
  var readFile: js.UndefOr[
    (js.ThisFunction2[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      js.Promise[String]
    ]) | `false`
  ] = js.native
  var writeFile: js.UndefOr[
    (js.ThisFunction3[
      /* this */ scala.Nothing, 
      /* file */ String, 
      /* content */ String, 
      /* cancellationToken */ js.UndefOr[CancellationToken], 
      js.Promise[Unit]
    ]) | `false`
  ] = js.native
}

object AsyncHostOptions {
  @scala.inline
  def apply(): AsyncHostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncHostOptions]
  }
  @scala.inline
  implicit class AsyncHostOptionsOps[Self <: AsyncHostOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadFile(
      value: (js.ThisFunction2[
          /* this */ scala.Nothing, 
          /* file */ String, 
          /* cancellationToken */ js.UndefOr[CancellationToken], 
          js.Promise[String]
        ]) | `false`
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
    def withWriteFile(
      value: (js.ThisFunction3[
          /* this */ scala.Nothing, 
          /* file */ String, 
          /* content */ String, 
          /* cancellationToken */ js.UndefOr[CancellationToken], 
          js.Promise[Unit]
        ]) | `false`
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
  }
  
}

