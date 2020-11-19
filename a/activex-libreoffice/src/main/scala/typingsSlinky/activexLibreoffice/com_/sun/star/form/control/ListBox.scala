package typingsSlinky.activexLibreoffice.com_.sun.star.form.control

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlListBox
import typingsSlinky.activexLibreoffice.com_.sun.star.form.XBoundControl
import typingsSlinky.activexLibreoffice.com_.sun.star.form.XChangeBroadcaster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a list box control which can (but not necessarily has to) be bound to a database field.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.ListBox} service.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
@js.native
trait ListBox
  extends UnoControlListBox
     with XBoundControl
     with XChangeBroadcaster
