package typingsSlinky.activexLibreoffice.com_.sun.star.form.control

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlEdit
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XPatternField
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XSpinField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.XBoundControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a control for inputting text complying to a given pattern, and which can (but not necessarily has to) be bound to a database field.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.PatternField} service.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  */
@js.native
trait PatternField
  extends UnoControlEdit
     with XSpinField
     with XPatternField
     with XBoundControl
