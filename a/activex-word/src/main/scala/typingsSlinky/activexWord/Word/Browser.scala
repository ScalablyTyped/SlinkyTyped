package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var Target: WdBrowseTarget = js.native
  @JSName("Word.Browser_typekey")
  var WordDotBrowser_typekey: Browser = js.native
  def Next(): Unit = js.native
  def Previous(): Unit = js.native
}

object Browser {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Next: () => Unit,
    Parent: js.Any,
    Previous: () => Unit,
    Target: WdBrowseTarget,
    WordDotBrowser_typekey: Browser
  ): Browser = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Next = js.Any.fromFunction0(Next), Parent = Parent.asInstanceOf[js.Any], Previous = js.Any.fromFunction0(Previous), Target = Target.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Browser_typekey")(WordDotBrowser_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  @scala.inline
  implicit class BrowserOps[Self <: Browser] (val x: Self) extends AnyVal {
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
    def withNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Previous")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarget(value: WdBrowseTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotBrowser_typekey(value: Browser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Browser_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

