package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLibraryQueryExecutable extends XInterface {
  def HasExecutableCode(name: String): Boolean = js.native
}

object XLibraryQueryExecutable {
  @scala.inline
  def apply(
    HasExecutableCode: String => Boolean,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLibraryQueryExecutable = {
    val __obj = js.Dynamic.literal(HasExecutableCode = js.Any.fromFunction1(HasExecutableCode), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLibraryQueryExecutable]
  }
  @scala.inline
  implicit class XLibraryQueryExecutableOps[Self <: XLibraryQueryExecutable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasExecutableCode(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasExecutableCode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

