package typingsSlinky.eslint.mod.Rule

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportDescriptorOptionsBase extends js.Object {
  var data: js.UndefOr[StringDictionary[String]] = js.native
  var fix: js.UndefOr[
    Null | (js.Function1[/* fixer */ RuleFixer, Null | Fix | IterableIterator[Fix] | js.Array[Fix]])
  ] = js.native
}

object ReportDescriptorOptionsBase {
  @scala.inline
  def apply(): ReportDescriptorOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportDescriptorOptionsBase]
  }
  @scala.inline
  implicit class ReportDescriptorOptionsBaseOps[Self <: ReportDescriptorOptionsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withFix(value: /* fixer */ RuleFixer => Null | Fix | IterableIterator[Fix] | js.Array[Fix]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(js.undefined)
        ret
    }
    @scala.inline
    def withFixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(null)
        ret
    }
  }
  
}

