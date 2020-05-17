package typingsSlinky.aureliaDependencyInjection.anon

import typingsSlinky.aureliaDependencyInjection.mod.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inject[TArgs /* <: Args[TBase] */, TBase] extends js.Object {
  var inject: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]
  ] = js.native
}

object Inject {
  @scala.inline
  def apply[TArgs, TBase](): Inject[TArgs, TBase] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inject[TArgs, TBase]]
  }
  @scala.inline
  implicit class InjectOps[Self[targs, tbase] <: Inject[targs, tbase], TArgs, TBase] (val x: Self[TArgs, TBase]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TArgs, TBase] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TArgs, TBase]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TArgs, TBase]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TArgs, TBase]) with Other]
    @scala.inline
    def withInject(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
        ]
    ): Self[TArgs, TBase] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInject: Self[TArgs, TBase] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(js.undefined)
        ret
    }
  }
  
}

