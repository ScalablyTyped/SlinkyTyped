package typingsSlinky.openui5.global.sap.ui.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.Binding")
@js.native
abstract class Binding protected ()
  extends typingsSlinky.openui5.sap.ui.model.Binding {
  /**
    * Constructor for Binding class.
    * @param oModel the model
    * @param sPath the path
    * @param oContext the context object
    * @param mParameters undefined
    */
  def this(
    oModel: typingsSlinky.openui5.sap.ui.model.Model,
    sPath: String,
    oContext: typingsSlinky.openui5.sap.ui.model.Context
  ) = this()
  def this(
    oModel: typingsSlinky.openui5.sap.ui.model.Model,
    sPath: String,
    oContext: typingsSlinky.openui5.sap.ui.model.Context,
    mParameters: js.Any
  ) = this()
}

