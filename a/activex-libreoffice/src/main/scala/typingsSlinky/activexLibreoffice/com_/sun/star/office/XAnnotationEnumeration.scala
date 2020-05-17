package typingsSlinky.activexLibreoffice.com_.sun.star.office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An enumeration for a set of annotations. */
@js.native
trait XAnnotationEnumeration extends js.Object {
  /** tests whether this enumeration contains more elements. */
  def hasMoreElements(): Boolean = js.native
  /**
    * @returns the next element of this enumeration.
    * @throws NoSuchElementException if no more elements exist.
    */
  def nextElement(): XAnnotation = js.native
}

object XAnnotationEnumeration {
  @scala.inline
  def apply(hasMoreElements: () => Boolean, nextElement: () => XAnnotation): XAnnotationEnumeration = {
    val __obj = js.Dynamic.literal(hasMoreElements = js.Any.fromFunction0(hasMoreElements), nextElement = js.Any.fromFunction0(nextElement))
    __obj.asInstanceOf[XAnnotationEnumeration]
  }
  @scala.inline
  implicit class XAnnotationEnumerationOps[Self <: XAnnotationEnumeration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasMoreElements(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreElements")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextElement(value: () => XAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextElement")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

