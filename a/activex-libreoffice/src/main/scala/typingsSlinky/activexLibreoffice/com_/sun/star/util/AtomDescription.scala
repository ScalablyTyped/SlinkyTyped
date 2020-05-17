package typingsSlinky.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains a string and the corresponding registered atom .
  * @see com.sun.star.util.XAtomServer
  */
@js.native
trait AtomDescription extends js.Object {
  /** the atom itself */
  var atom: Double = js.native
  /** the string it stands for */
  var description: String = js.native
}

object AtomDescription {
  @scala.inline
  def apply(atom: Double, description: String): AtomDescription = {
    val __obj = js.Dynamic.literal(atom = atom.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomDescription]
  }
  @scala.inline
  implicit class AtomDescriptionOps[Self <: AtomDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

