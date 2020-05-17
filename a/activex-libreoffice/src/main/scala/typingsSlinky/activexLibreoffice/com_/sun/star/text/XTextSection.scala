package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provide special data of a {@link TextSection} .
  * @see TextSection
  */
@js.native
trait XTextSection extends XTextContent {
  /** @returns all text sections that are children of this text section (recursive). */
  val ChildSections: SafeArray[XTextSection] = js.native
  /** If the object is a child section, then this method returns the parent text section. */
  val ParentSection: XTextSection = js.native
  /** @returns all text sections that are children of this text section (recursive). */
  def getChildSections(): SafeArray[XTextSection] = js.native
  /** If the object is a child section, then this method returns the parent text section. */
  def getParentSection(): XTextSection = js.native
}

object XTextSection {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    ChildSections: SafeArray[XTextSection],
    ParentSection: XTextSection,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getChildSections: () => SafeArray[XTextSection],
    getParentSection: () => XTextSection,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XTextSection = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], ChildSections = ChildSections.asInstanceOf[js.Any], ParentSection = ParentSection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getChildSections = js.Any.fromFunction0(getChildSections), getParentSection = js.Any.fromFunction0(getParentSection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XTextSection]
  }
  @scala.inline
  implicit class XTextSectionOps[Self <: XTextSection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildSections(value: SafeArray[XTextSection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChildSections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentSection(value: XTextSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetChildSections(value: () => SafeArray[XTextSection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildSections")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentSection(value: () => XTextSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentSection")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

