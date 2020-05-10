package typingsSlinky.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML attribute.
  *
  *     // Reads the first and last name of each person and adds a new attribute with the full name.
  *     var xml = '<roster>'
  *         + '<person first="John" last="Doe"/>'
  *         + '<person first="Mary" last="Smith"/>'
  *         + '</roster>';
  *     var document = XmlService.parse(xml);
  *     var people = document.getRootElement().getChildren('person');
  *     for (var i = 0; i < people.length; i++) {
  *       var person = people[i];
  *       var firstName = person.getAttribute('first').getValue();
  *       var lastName = person.getAttribute('last').getValue();
  *       person.setAttribute('full', firstName + ' ' + lastName);
  *     }
  *     xml = XmlService.getPrettyFormat().format(document);
  *     Logger.log(xml);
  */
@js.native
trait Attribute extends js.Object {
  def getName(): String = js.native
  def getNamespace(): Namespace = js.native
  def getValue(): String = js.native
  def setName(name: String): Attribute = js.native
  def setNamespace(namespace: Namespace): Attribute = js.native
  def setValue(value: String): Attribute = js.native
}

object Attribute {
  @scala.inline
  def apply(
    getName: () => String,
    getNamespace: () => Namespace,
    getValue: () => String,
    setName: String => Attribute,
    setNamespace: Namespace => Attribute,
    setValue: String => Attribute
  ): Attribute = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), getNamespace = js.Any.fromFunction0(getNamespace), getValue = js.Any.fromFunction0(getValue), setName = js.Any.fromFunction1(setName), setNamespace = js.Any.fromFunction1(setNamespace), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[Attribute]
  }
  @scala.inline
  implicit class AttributeOps[Self <: Attribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNamespace(value: () => Namespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamespace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetName(value: String => Attribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNamespace(value: Namespace => Attribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNamespace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: String => Attribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

