package typingsSlinky.googleDriveRealtimeApi.gapi.drive.realtime.databinding

import org.scalajs.dom.raw.Element
import typingsSlinky.googleDriveRealtimeApi.gapi.drive.realtime.CollaborativeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binding extends js.Object {
  // Throws gapi.drive.realtime.databinding.AlreadyBoundError If domElement has already been bound.
  // The collaborative object to bind.
  var collaborativeObject: CollaborativeObject = js.native
  // The DOM element that the collaborative object is bound to. Value must not be null.
  var domElement: Element = js.native
  // Unbinds the domElement from collaborativeObject.
  def unbind(): Unit = js.native
}

object Binding {
  @scala.inline
  def apply(collaborativeObject: CollaborativeObject, domElement: Element, unbind: () => Unit): Binding = {
    val __obj = js.Dynamic.literal(collaborativeObject = collaborativeObject.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any], unbind = js.Any.fromFunction0(unbind))
    __obj.asInstanceOf[Binding]
  }
  @scala.inline
  implicit class BindingOps[Self <: Binding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollaborativeObject(value: CollaborativeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborativeObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnbind(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbind")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

