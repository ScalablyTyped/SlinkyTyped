package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathScrSubSup extends js.Object {
  var AlignScripts: Boolean = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  val Parent: js.Any = js.native
  val Sub: OMath = js.native
  val Sup: OMath = js.native
  @JSName("Word.OMathScrSubSup_typekey")
  var WordDotOMathScrSubSup_typekey: OMathScrSubSup = js.native
  def RemoveSub(): OMathFunction = js.native
  def RemoveSup(): OMathFunction = js.native
  def ToScrPre(): OMathFunction = js.native
}

object OMathScrSubSup {
  @scala.inline
  def apply(
    AlignScripts: Boolean,
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    RemoveSub: () => OMathFunction,
    RemoveSup: () => OMathFunction,
    Sub: OMath,
    Sup: OMath,
    ToScrPre: () => OMathFunction,
    WordDotOMathScrSubSup_typekey: OMathScrSubSup
  ): OMathScrSubSup = {
    val __obj = js.Dynamic.literal(AlignScripts = AlignScripts.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RemoveSub = js.Any.fromFunction0(RemoveSub), RemoveSup = js.Any.fromFunction0(RemoveSup), Sub = Sub.asInstanceOf[js.Any], Sup = Sup.asInstanceOf[js.Any], ToScrPre = js.Any.fromFunction0(ToScrPre))
    __obj.updateDynamic("Word.OMathScrSubSup_typekey")(WordDotOMathScrSubSup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathScrSubSup]
  }
  @scala.inline
  implicit class OMathScrSubSupOps[Self <: OMathScrSubSup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignScripts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlignScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withE(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveSub(value: () => OMathFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveSub")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveSup(value: () => OMathFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveSup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSub(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSup(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToScrPre(value: () => OMathFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToScrPre")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWordDotOMathScrSubSup_typekey(value: OMathScrSubSup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathScrSubSup_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

