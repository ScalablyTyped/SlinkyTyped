package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddIn extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Autoload: Boolean = js.native
  val Compiled: Boolean = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  var Installed: Boolean = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  @JSName("Word.AddIn_typekey")
  var WordDotAddIn_typekey: AddIn = js.native
  def Delete(): Unit = js.native
}

object AddIn {
  @scala.inline
  def apply(
    Application: Application,
    Autoload: Boolean,
    Compiled: Boolean,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Installed: Boolean,
    Name: String,
    Parent: js.Any,
    Path: String,
    WordDotAddIn_typekey: AddIn
  ): AddIn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Autoload = Autoload.asInstanceOf[js.Any], Compiled = Compiled.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Installed = Installed.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AddIn_typekey")(WordDotAddIn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIn]
  }
  @scala.inline
  implicit class AddInOps[Self <: AddIn] (val x: Self) extends AnyVal {
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
    def withAutoload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Autoload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompiled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compiled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Installed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotAddIn_typekey(value: AddIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.AddIn_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

