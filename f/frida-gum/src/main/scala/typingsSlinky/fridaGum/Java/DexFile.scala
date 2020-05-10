package typingsSlinky.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DexFile extends js.Object {
  /**
    * Determines available class names.
    */
  def getClassNames(): js.Array[String] = js.native
  /**
    * Loads the contained classes into the VM.
    */
  def load(): Unit = js.native
}

object DexFile {
  @scala.inline
  def apply(getClassNames: () => js.Array[String], load: () => Unit): DexFile = {
    val __obj = js.Dynamic.literal(getClassNames = js.Any.fromFunction0(getClassNames), load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[DexFile]
  }
  @scala.inline
  implicit class DexFileOps[Self <: DexFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetClassNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

