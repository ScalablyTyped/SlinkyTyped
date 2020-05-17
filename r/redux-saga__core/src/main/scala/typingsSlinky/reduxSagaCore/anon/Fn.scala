package typingsSlinky.reduxSagaCore.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in Name ]: (this : Ctx, args : ...any): void}
  */ typingsSlinky.reduxSagaCore.reduxSagaCoreStrings.Fn with TopLevel[js.Any] */, Name /* <: String */] extends js.Object {
  var context: Ctx = js.native
  var fn: Name = js.native
}

object Fn {
  @scala.inline
  def apply[Ctx, Name](context: Ctx, fn: Name): Fn[Ctx, Name] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fn[Ctx, Name]]
  }
  @scala.inline
  implicit class FnOps[Self[ctx, name] <: Fn[ctx, name], Ctx, Name] (val x: Self[Ctx, Name]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ctx, Name] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ctx, Name]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Ctx, Name]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Ctx, Name]) with Other]
    @scala.inline
    def withContext(value: Ctx): Self[Ctx, Name] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFn(value: Name): Self[Ctx, Name] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

