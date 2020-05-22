package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.CustomizeParameterEditors and ASPxClientReportDesigner.CustomizeParameterEditors events.
  */
@JSGlobal("ASPxClientCustomizeParameterEditorsEventArgs")
@js.native
class ASPxClientCustomizeParameterEditorsEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientCustomizeParameterEditorsEventArgs {
  /**
    * For internal use. Initializes a new instance of the ASPxClientCustomizeParameterEditorsEventArgs class with the specified settings.
    * @param parameter An IParameterDescriptor object.
    * @param info An ISerializationInfo object.
    */
  def this(
    parameter: typingsSlinky.devexpressWeb.ASPxDesignerElementParameterDescriptor,
    info: typingsSlinky.devexpressWeb.ASPxDesignerElementSerializationInfo
  ) = this()
  /**
    * Provides access to an object that stores information required to serialize a parameter editor.
    */
  /* CompleteClass */
  override var info: typingsSlinky.devexpressWeb.ASPxDesignerElementSerializationInfo = js.native
  /**
    * Provides access to an object that stores information about a parameter.
    */
  /* CompleteClass */
  override var parameter: typingsSlinky.devexpressWeb.ASPxDesignerElementParameterDescriptor = js.native
}

