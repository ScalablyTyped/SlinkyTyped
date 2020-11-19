package typingsSlinky.powerappsComponentFramework.ComponentFramework

import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the PowerApps Controls (Standard)
  */
@js.native
trait StandardControl[TInputs, TOutputs] extends js.Object {
  
  /**
    * Called when the control is to be removed from the DOM tree. Controls should use this call for cleanup.
    * i.e. cancelling any pending remote calls, removing listeners, etc.
    */
  def destroy(): Unit = js.native
  
  /**
    * It is called by the framework prior to a control receiving new data.
    * @returns an object based on nomenclature defined in manifest, expecting object[s] for property marked as "bound" or "output"
    */
  var getOutputs: js.UndefOr[js.Function0[TOutputs]] = js.native
  
  /**
    * Used to initialize the control instance. Controls can kick off remote server calls and other initialization actions here.
    * Data-set values are not initialized here, use updateView.
    * @param context The entire property bag available to control via Context Object; It contains values as set up by the customizer mapped
    * to property names defined in the manifest, as well as utility functions.
    * @param notifyOutputChanged A callback method to alert the framework that the control has new outputs ready to be retrieved asynchronously.
    * @param state A piece of data that persists in one session for a single user. Can be set at any point in a controls life cycle by calling
    * 'setControlState' in the Mode interface.
    * @param container If a control is marked control-type='standard', it will receive an empty div element within which it can render its content.
    */
  def init(context: Context[TInputs]): Unit = js.native
  def init(
    context: Context[TInputs],
    notifyOutputChanged: js.UndefOr[scala.Nothing],
    state: js.UndefOr[scala.Nothing],
    container: HTMLDivElement
  ): Unit = js.native
  def init(context: Context[TInputs], notifyOutputChanged: js.UndefOr[scala.Nothing], state: Dictionary): Unit = js.native
  def init(
    context: Context[TInputs],
    notifyOutputChanged: js.UndefOr[scala.Nothing],
    state: Dictionary,
    container: HTMLDivElement
  ): Unit = js.native
  def init(context: Context[TInputs], notifyOutputChanged: js.Function0[Unit]): Unit = js.native
  def init(
    context: Context[TInputs],
    notifyOutputChanged: js.Function0[Unit],
    state: js.UndefOr[scala.Nothing],
    container: HTMLDivElement
  ): Unit = js.native
  def init(context: Context[TInputs], notifyOutputChanged: js.Function0[Unit], state: Dictionary): Unit = js.native
  def init(
    context: Context[TInputs],
    notifyOutputChanged: js.Function0[Unit],
    state: Dictionary,
    container: HTMLDivElement
  ): Unit = js.native
  
  /**
    * Called when any value in the property bag has changed. This includes field values, data-sets, global values such as container height and width,
    * offline status, control metadata values such as label, visible, etc.
    * @param context The entire property bag available to control via Context Object; It contains values as set up by the customizer mapped to names
    * defined in the manifest, as well as utility functions
    */
  def updateView(context: Context[TInputs]): Unit = js.native
}
