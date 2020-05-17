package typingsSlinky.activexLibreoffice.com_.sun.star.xml.input

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Capsule around an XML element. */
@js.native
trait XElement extends XInterface {
  /**
    * Gets the attributes of this element.
    * @returns attributes of this element
    */
  val Attributes: XAttributes = js.native
  /**
    * Gets the local name of this element.
    * @returns local name of this element
    */
  val LocalName: String = js.native
  /**
    * Gets the parent context.
    * @returns parent context
    */
  val Parent: XElement = js.native
  /**
    * Gets the namespace uid of this element.
    * @returns namespace uid of this element
    */
  val Uid: Double = js.native
  /**
    * Called upon retrieval of characters.
    * @param chars characters
    */
  def characters(chars: String): Unit = js.native
  /** Receives notification of element closing. */
  def endElement(): Unit = js.native
  /**
    * Gets the attributes of this element.
    * @returns attributes of this element
    */
  def getAttributes(): XAttributes = js.native
  /**
    * Gets the local name of this element.
    * @returns local name of this element
    */
  def getLocalName(): String = js.native
  /**
    * Gets the parent context.
    * @returns parent context
    */
  def getParent(): XElement = js.native
  /**
    * Gets the namespace uid of this element.
    * @returns namespace uid of this element
    */
  def getUid(): Double = js.native
  /**
    * Receives notification of white space that can be ignored.
    * @param whitespace white space characters
    */
  def ignorableWhitespace(whitespace: String): Unit = js.native
  /**
    * Receives notification of a processing instruction.
    * @param target target
    * @param data data
    */
  def processingInstruction(target: String, data: String): Unit = js.native
  /**
    * Called upon each occurring child element.
    * @param uid namespace uid of element
    * @param localName local name of element
    * @param xAttributes attributes of element
    * @returns child import context
    */
  def startChildElement(uid: Double, localName: String, xAttributes: XAttributes): XElement = js.native
}

object XElement {
  @scala.inline
  def apply(
    Attributes: XAttributes,
    LocalName: String,
    Parent: XElement,
    Uid: Double,
    acquire: () => Unit,
    characters: String => Unit,
    endElement: () => Unit,
    getAttributes: () => XAttributes,
    getLocalName: () => String,
    getParent: () => XElement,
    getUid: () => Double,
    ignorableWhitespace: String => Unit,
    processingInstruction: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    startChildElement: (Double, String, XAttributes) => XElement
  ): XElement = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Uid = Uid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), endElement = js.Any.fromFunction0(endElement), getAttributes = js.Any.fromFunction0(getAttributes), getLocalName = js.Any.fromFunction0(getLocalName), getParent = js.Any.fromFunction0(getParent), getUid = js.Any.fromFunction0(getUid), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startChildElement = js.Any.fromFunction3(startChildElement))
    __obj.asInstanceOf[XElement]
  }
  @scala.inline
  implicit class XElementOps[Self <: XElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: XAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: XElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacters(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndElement(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttributes(value: () => XAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLocalName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParent(value: () => XElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUid(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIgnorableWhitespace(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorableWhitespace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProcessingInstruction(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingInstruction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStartChildElement(value: (Double, String, XAttributes) => XElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startChildElement")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

