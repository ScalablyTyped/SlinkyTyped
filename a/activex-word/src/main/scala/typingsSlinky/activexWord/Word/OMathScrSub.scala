package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathScrSub extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  val Parent: js.Any = js.native
  val Sub: OMath = js.native
  @JSName("Word.OMathScrSub_typekey")
  var WordDotOMathScrSub_typekey: OMathScrSub = js.native
}

object OMathScrSub {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    Sub: OMath,
    WordDotOMathScrSub_typekey: OMathScrSub
  ): OMathScrSub = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sub = Sub.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathScrSub_typekey")(WordDotOMathScrSub_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathScrSub]
  }
  @scala.inline
  implicit class OMathScrSubOps[Self <: OMathScrSub] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSub(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathScrSub_typekey(value: OMathScrSub): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathScrSub_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

