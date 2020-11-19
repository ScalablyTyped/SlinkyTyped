package typingsSlinky.reactNativePhoneInput.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNative.mod.ImageRequireSource
import typingsSlinky.reactNativePhoneInput.anon.TypeofTextInput
import typingsSlinky.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactNativePhoneInput[TextComponentType /* <: ReactComponentClass[js.Object] */]
  extends Component[ReactNativePhoneInputProps[TextComponentType], js.Object, js.Any] {
  
  /**
    * Blur the phone input
    */
  def blur(): Unit = js.native
  
  /**
    * Focus the phone input
    */
  def focus(): Unit = js.native
  
  /**
    * Return country object in country picker
    */
  def getAllCountries(): CountriesListItem = js.native
  
  /**
    * Return country dial code of current phone number
    */
  def getCountryCode(): String = js.native
  
  /**
    * Return flag image
    */
  def getFlag(iso2: String): ImageRequireSource = js.native
  
  /**
    * Return country iso code of current phone number
    */
  def getISOCode(): String = js.native
  
  /**
    * Return true type of current phone number
    */
  def getNumberType(): String = js.native
  
  /**
    * Return country object with flag image
    */
  def getPickerData(): PickerData = js.native
  
  /**
    * Return current phone number
    */
  def getValue(): String = js.native
  
  /**
    * Return true if current phone number is valid
    */
  def isValidNumber(): Boolean = js.native
  
  var picker: js.UndefOr[Ref[ThisType[ReactNativePhoneInput[TypeofTextInput]]]] = js.native
  
  /**
    * Set phone input to specific country
    */
  def selectCountry(iso2: String): Unit = js.native
}
