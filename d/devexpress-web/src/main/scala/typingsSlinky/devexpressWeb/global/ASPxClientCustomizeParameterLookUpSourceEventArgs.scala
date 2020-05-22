package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeParameterLookUpSource and ASPxClientWebDocumentViewer.CustomizeParameterLookUpSource events.
  */
@JSGlobal("ASPxClientCustomizeParameterLookUpSourceEventArgs")
@js.native
class ASPxClientCustomizeParameterLookUpSourceEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientCustomizeParameterLookUpSourceEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCustomizeParameterLookUpSourceEventArgs class with the specified settings.
    * @param parameter An IParameterDescriptor object that stores information about a parameter. This value is assigned to the ASPxClientCustomizeParameterLookUpSourceEventArgs.parameter property.
    * @param items An array of IDisplayedValue objects that stores information about look-up parameter values. This value is assigned to the ASPxClientCustomizeParameterLookUpSourceEventArgs.items property.
    */
  def this(
    parameter: typingsSlinky.devexpressWeb.ASPxDesignerElementParameterDescriptor,
    items: js.Array[typingsSlinky.devexpressWeb.ASPxDesignerElementEditorItem]
  ) = this()
  /**
    * Specifies the data source that provides look-up values for the parameter editor.
    */
  /* CompleteClass */
  override var dataSource: js.Any = js.native
  /**
    * Provides access to the collection of look-up parameter values.
    */
  /* CompleteClass */
  override var items: js.Array[typingsSlinky.devexpressWeb.ASPxDesignerElementEditorItem] = js.native
  /**
    * Provides access to an object that stores information about a parameter.
    */
  /* CompleteClass */
  override var parameter: typingsSlinky.devexpressWeb.ASPxDesignerElementParameterDescriptor = js.native
}

