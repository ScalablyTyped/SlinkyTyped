package typingsSlinky.activexLibreoffice.com_.sun.star.container

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the generic interface for supporting the replacement of named elements.
  * @see XContainer
  */
@js.native
trait XNameReplace extends XNameAccess {
  /** replaces the element with the specified name with the given element. */
  def replaceByName(aName: String, aElement: js.Any): Unit = js.native
}

object XNameReplace {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    replaceByName: (String, js.Any) => Unit
  ): XNameReplace = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByName = js.Any.fromFunction2(replaceByName))
    __obj.asInstanceOf[XNameReplace]
  }
  @scala.inline
  implicit class XNameReplaceOps[Self <: XNameReplace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplaceByName(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceByName")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

