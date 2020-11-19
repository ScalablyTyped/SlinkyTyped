package typingsSlinky.activexLibreoffice.com_.sun.star.form.component

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.form.FormComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.script.XEventAttacherManager
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service specifies a form which is a group of {@link FormComponents} .
  *
  * A form fulfills several tasks, like storing the structure of its form components, storing the information concerning tab ordering and control
  * grouping, and last but not least, it provides the event environment for its contained elements.
  *
  * A form acts on the one hand like a container of {@link FormComponents} and on the other hand like a {@link FormComponent} . This generic construction
  * allows the definition of hierarchies of forms and their dependent subforms.
  * @see com.sun.star.form.FormControlModel
  */
@js.native
trait Form
  extends FormComponent
     with XContainer
     with XNameContainer
     with XIndexContainer
     with XEnumerationAccess
     with XEventAttacherManager
     with XTabControllerModel {
  
  def getPropertyValues(aPropertyNames: SeqEquiv[String]): SafeArray[_] = js.native
}
