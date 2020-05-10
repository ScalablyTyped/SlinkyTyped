package typingsSlinky.minecraftScriptingTypesShared

import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Equalssign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.EqualssignEqualssign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.ExclamationmarkEqualssign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Greaterthansign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.GreaterthansignEqualssign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Lessthansign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.LessthansignEqualssign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.LessthansignGreaterthansign
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.equals
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.not
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.other
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.parent
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.player
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.self
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinecraftFilter extends js.Object {
  var all_of: js.UndefOr[js.Array[MinecraftFilter]] = js.native
  var any_of: js.UndefOr[js.Array[MinecraftFilter]] = js.native
  var domain: js.UndefOr[String] = js.native
  var operator: js.UndefOr[
    ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | EqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign | equals | not
  ] = js.native
  var subject: js.UndefOr[other | parent | player | self | target] = js.native
  var test: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object MinecraftFilter {
  @scala.inline
  def apply(): MinecraftFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinecraftFilter]
  }
  @scala.inline
  implicit class MinecraftFilterOps[Self <: MinecraftFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll_of(value: js.Array[MinecraftFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all_of")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll_of: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all_of")(js.undefined)
        ret
    }
    @scala.inline
    def withAny_of(value: js.Array[MinecraftFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any_of")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAny_of: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any_of")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withOperator(
      value: ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | EqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign | equals | not
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: other | parent | player | self | target): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withTest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

